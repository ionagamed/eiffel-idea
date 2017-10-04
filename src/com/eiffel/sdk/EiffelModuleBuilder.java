package com.eiffel.sdk;

import com.eiffel.sdk.EiffelModuleType;
import com.eiffel.sdk.EiffelModuleWizardStep;
import com.intellij.ide.util.projectWizard.ModuleBuilder;
import com.intellij.ide.util.projectWizard.ModuleBuilderListener;
import com.intellij.ide.util.projectWizard.ModuleWizardStep;
import com.intellij.ide.util.projectWizard.WizardContext;
import com.intellij.openapi.Disposable;
import com.intellij.openapi.application.Result;
import com.intellij.openapi.application.WriteAction;
import com.intellij.openapi.command.WriteCommandAction;
import com.intellij.openapi.module.Module;
import com.intellij.openapi.module.ModuleManager;
import com.intellij.openapi.module.ModuleType;
import com.intellij.openapi.options.ConfigurationException;
import com.intellij.openapi.projectRoots.Sdk;
import com.intellij.openapi.roots.ModifiableRootModel;
import com.intellij.openapi.roots.ModuleRootManager;
import com.intellij.openapi.vfs.VirtualFile;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

import java.io.IOException;
import java.util.Arrays;


public class EiffelModuleBuilder extends ModuleBuilder implements ModuleBuilderListener {
    public EiffelModuleBuilder() {
        super();
        addListener(this);
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

    @Override
    public void setupRootModel(ModifiableRootModel model) throws ConfigurationException {
        model.addContentEntry(model.getProject().getBaseDir());
        VirtualFile rootClass = createRootClass(model.getProject().getBaseDir());
        if (rootClass != null) model.addContentEntry(rootClass);
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
    public void moduleCreated(@NotNull Module module) {
        VirtualFile[] roots = ModuleRootManager.getInstance(module).getSourceRoots();
        System.out.println(Arrays.deepToString(roots));
    }
}