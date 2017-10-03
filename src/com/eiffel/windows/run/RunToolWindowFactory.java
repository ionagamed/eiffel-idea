package com.eiffel.windows.run;

import com.intellij.execution.dashboard.RunDashboardToolWindowFactory;
import com.intellij.openapi.project.Project;
import com.intellij.openapi.wm.ToolWindow;
import com.intellij.openapi.wm.ToolWindowFactory;
import com.intellij.ui.content.ContentFactory;
import org.jetbrains.annotations.NotNull;

import javax.swing.*;

public class RunToolWindowFactory implements ToolWindowFactory {
    private JTextPane consoleOutput;
    private JPanel toolWindowContent;

    private static JTextPane consoleOutputSink;
    private static String consoleOutputSinkBuffer;
    public static void appendConsoleOutput(String s) {
        consoleOutputSinkBuffer += s;
        consoleOutputSink.setText("<font face='Source Code Pro' size='4'>" + consoleOutputSinkBuffer + "</font>");
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
