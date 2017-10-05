package com.eiffel.windows.run;

import com.intellij.openapi.project.Project;
import com.intellij.openapi.wm.ToolWindow;
import com.intellij.openapi.wm.ToolWindowFactory;
import com.intellij.ui.content.ContentFactory;
import org.jetbrains.annotations.NotNull;

import javax.swing.*;

public class RunToolWindowFactory implements ToolWindowFactory {
    private JPanel toolWindowContent;
    private JTextPane consoleOutput;
    private JTextField consoleInput;

    private static JTextPane consoleOutputSink;
    private static String consoleOutputSinkBuffer;
    public static void appendConsoleOutput(String s) {
        consoleOutputSinkBuffer += s;
        consoleOutputSink.setText(RunInToolWindowPerformer.lineConstructor(consoleOutputSinkBuffer, 2, null));
    }

    @Override
    public void createToolWindowContent(@NotNull Project project, @NotNull ToolWindow toolWindow) {
        consoleOutputSinkBuffer = "";
        consoleOutputSink = consoleOutput;
        toolWindow.getContentManager().addContent(
                ContentFactory.SERVICE.getInstance().createContent(toolWindowContent, "", false)
        );
    }
}
