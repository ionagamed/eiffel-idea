package com.eiffel.windows.run;

import com.intellij.openapi.project.Project;
import com.intellij.openapi.wm.ToolWindow;
import com.intellij.openapi.wm.ToolWindowFactory;
import com.intellij.ui.content.ContentFactory;
import org.jetbrains.annotations.NotNull;

import javax.swing.*;
import java.awt.event.InputMethodEvent;
import java.awt.event.InputMethodListener;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;

public class RunToolWindowFactory implements ToolWindowFactory {
    private JPanel toolWindowContent;
    private JTextPane consoleOutput;
    private JTextField consoleInput;

    private static JTextPane consoleOutputSink;
    private static String consoleOutputSinkBuffer;

    public RunToolWindowFactory() {
        consoleInput.addKeyListener(new KeyAdapter() {
            @Override
            public void keyTyped(KeyEvent e) {
                super.keyTyped(e);
                if(e.getKeyCode() == KeyEvent.VK_ENTER) {
                    appendConsoleOutput(consoleInput.getText(), 1, true);
                    consoleInput.setText("");
                }

            }
        });
    }

    public static void appendConsoleOutput(String s, int code, boolean format) {
        if (format)
            s = RunInToolWindowPerformer.lineConstructor(s, code, "pre");
        consoleOutputSinkBuffer += s;
        consoleOutputSink.setText(consoleOutputSinkBuffer);
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
