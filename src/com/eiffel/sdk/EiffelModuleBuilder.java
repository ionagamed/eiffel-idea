package com.eiffel.sdk;

import com.eiffel.sdk.EiffelModuleType;
import com.eiffel.sdk.EiffelModuleWizardStep;
import com.intellij.execution.impl.ModuleRunConfigurationManager;
import com.intellij.ide.util.projectWizard.*;
import com.intellij.openapi.Disposable;
import com.intellij.openapi.application.Result;
import com.intellij.openapi.application.WriteAction;
import com.intellij.openapi.command.WriteCommandAction;
import com.intellij.openapi.module.Module;
import com.intellij.openapi.module.ModuleManager;
import com.intellij.openapi.module.ModuleType;
import com.intellij.openapi.options.ConfigurationException;
import com.intellij.openapi.projectRoots.Sdk;
import com.intellij.openapi.projectRoots.SdkType;
import com.intellij.openapi.projectRoots.SdkTypeId;
import com.intellij.openapi.roots.*;
import com.intellij.openapi.roots.impl.SdkFinder;
import com.intellij.openapi.roots.libraries.Library;
import com.intellij.openapi.roots.ui.configuration.ModulesProvider;
import com.intellij.openapi.vfs.VirtualFile;
import com.intellij.project.model.JpsSdkManager;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

import javax.swing.*;
import java.io.IOException;
import java.util.Arrays;


public class EiffelModuleBuilder extends ModuleBuilder implements ModuleBuilderListener {
    public EiffelModuleBuilder() {
        super();
        addListener(this);
    }

    private VirtualFile createRootClass(VirtualFile root) {
        try {
            VirtualFile c = root.createChildData(EiffelModuleBuilder.class, "application.e");
            WriteAction action = new WriteAction() {
                @Override
                protected void run(@NotNull Result result) throws Throwable {
                    c.setBinaryContent(rootClass.getBytes());
                }
            };
            action.execute();

            return c;
        } catch (IOException ignored) {
            return null;
        }
    }

    private VirtualFile createSourceRoot(VirtualFile projectRoot) {
        try {
            return projectRoot.createChildDirectory(EiffelModuleBuilder.class, "src");
        } catch (IOException ignored) {
            return null;
        }
    }

    private VirtualFile createECF(String projectName, VirtualFile sourceRoot) {
        try {
            VirtualFile ecf = sourceRoot.createChildData(EiffelModuleBuilder.class, projectName + "-gobo.ecf");
            WriteAction action = new WriteAction() {
                @Override
                protected void run(@NotNull Result result) throws Throwable {
                    ecf.setBinaryContent(
                            premadeECF
                                    .replace("$project_name$", projectName)
                                    .replace("$root_class$", "APPLICATION")
                                    .replace("$root_feature$", "make")
                                    .getBytes()
                    );
                }
            };
            action.execute();

            return ecf;
        } catch (IOException ignored) {
            return null;
        }
    }

    @Override
    public void setupRootModel(ModifiableRootModel model) throws ConfigurationException {
        VirtualFile projectRoot = model.getProject().getBaseDir();
        model.addContentEntry(projectRoot);
        model.inheritSdk();

        VirtualFile sourceRoot = createSourceRoot(projectRoot);
        if (sourceRoot == null) throw new ConfigurationException("Can't create src directory");
        ContentEntry sourceRootEntry = doAddContentEntry(model);
        if (sourceRootEntry == null) throw new ConfigurationException("Can't create src entry");
        sourceRootEntry.addSourceFolder(sourceRoot, false);

        VirtualFile rootClass = createRootClass(sourceRoot);
        if (rootClass == null) throw new ConfigurationException("Can't create root class");

        VirtualFile ecf = createECF(model.getProject().getName(), sourceRoot);
        if (ecf == null) throw new ConfigurationException("Can't create ECF file");

//        Library.ModifiableModel libraryModel = model.getModuleLibraryTable().getModifiableModel().createLibrary()
    }

    @Override
    public ModuleType getModuleType() {
        return EiffelModuleType.getInstance();
    }

    @Nullable
    @Override
    public ModuleWizardStep getCustomOptionsStep(WizardContext context, Disposable parentDisposable) {
        return new EiffelModuleWizardStep();
    }

    @Override
    public ModuleWizardStep[] createWizardSteps(@NotNull WizardContext wizardContext, @NotNull ModulesProvider modulesProvider) {
        return new ModuleWizardStep[] {
                new ProjectJdkStep(wizardContext)
        };
    }

    @Override
    public void moduleCreated(@NotNull Module module) {
        VirtualFile[] roots = ModuleRootManager.getInstance(module).getSourceRoots();
        System.out.println(Arrays.deepToString(roots));
    }

    private final String rootClass =
            "class\n" +
                    "    APPLICATION\n\n" +
                    "create\n" +
                    "    make\n\n" +
                    "feature {NONE}\n\n" +
                    "    make\n" +
                    "    do\n" +
                    "        io.put_string(\"Hello, world!\")\n" +
                    "    end\n\n" +
                    "end\n";

    private final String premadeECF = "<?xml version=\"1.0\" encoding=\"ISO-8859-1\"?>\n" +
            "<system xmlns=\"http://www.eiffel.com/developers/xml/configuration-1-16-0\" xmlns:xsi=\"http://www.w3.org/2001/XMLSchema-instance\" xsi:schemaLocation=\"http://www.eiffel.com/developers/xml/configuration-1-16-0 http://www.eiffel.com/developers/xml/configuration-1-16-0.xsd\" name=\"$project_name$\" uuid=\"22CEAFF2-B731-4905-802E-15EB9B78219B\">\n" +
            "<target name=\"$project_name$\">\n" +
            "<root class=\"$root_class$\" feature=\"$root_feature$\"/>\n" +
            "<file_rule>\n" +
            "<exclude>/CVS$</exclude>\n" +
            "<exclude>/EIFGENs$</exclude>\n" +
            "<exclude>/\\.git$</exclude>\n" +
            "<exclude>/\\.svn$</exclude>\n" +
            "</file_rule>\n" +
            "<option warning=\"true\">\n" +
            "<assertions precondition=\"true\" postcondition=\"true\" check=\"true\" invariant=\"true\" loop=\"true\" supplier_precondition=\"true\"/>\n" +
            "</option>\n" +
            "<setting name=\"console_application\" value=\"true\"/>\n" +
            "<precompile name=\"base_pre\" location=\"$ISE_PRECOMP\\base-scoop-safe.ecf\"/>\n" +
            "<library name=\"base\" location=\"$GOBO/library/free_elks/library.ecf\"/>\n" +
            "<cluster name=\"$project_name$\" location=\".\\\" recursive=\"true\"/>\n" +
            "</target>\n" +
            "</system>";
}