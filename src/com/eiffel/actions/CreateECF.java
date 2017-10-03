package com.eiffel.actions;

import com.intellij.openapi.actionSystem.AnActionEvent;
import com.intellij.openapi.application.Result;
import com.intellij.openapi.application.WriteAction;
import com.intellij.openapi.command.WriteCommandAction;
import com.intellij.openapi.project.Project;
import com.intellij.openapi.vfs.VirtualFile;
import org.jetbrains.annotations.NotNull;

import java.io.IOException;

public class CreateECF extends com.intellij.openapi.actionSystem.AnAction {
    private boolean overwrite = false;

    public CreateECF() {
        super();
    }

    public CreateECF(boolean overwrite) {
        super();
        this.overwrite = overwrite;
    }

    @Override
    public void update(AnActionEvent e) {
        e.getPresentation().setEnabled(true);
    }

    @Override
    public void actionPerformed(AnActionEvent e) {

        WriteAction action = new WriteAction() {
            @Override
            protected void run(@NotNull Result result) throws Throwable {
                Project project = e.getProject();
                String ecfFilename = project.getName() + "-gobo.ecf";
                if (overwrite || project.getBaseDir().findChild(ecfFilename) == null) {
                    VirtualFile ecfFile = project.getBaseDir().findOrCreateChildData(this.getClass(), ecfFilename);
                    ecfFile.setBinaryContent(
                            premadeECF
                                    .replace("$project_name$", project.getName())
                                    .replace("$root_class$", "APPLICATION")
                                    .replace("$root_feature$", "make")
                                    .getBytes()
                    );
                }
            }
        };
        action.execute();
    }

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
