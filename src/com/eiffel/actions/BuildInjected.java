package com.eiffel.actions;

import com.eiffel.windows.run.RunInToolWindowPerformer;
import com.eiffel.windows.run.RunToolWindowFactory;
import com.intellij.execution.dashboard.RunDashboardToolWindowFactory;
import com.intellij.openapi.actionSystem.AnAction;
import com.intellij.openapi.actionSystem.AnActionEvent;
import com.intellij.openapi.actionSystem.CommonDataKeys;
import com.intellij.openapi.application.Result;
import com.intellij.openapi.application.WriteAction;
import com.intellij.openapi.vfs.VirtualFile;
import com.intellij.openapi.wm.ToolWindowFactory;
import com.intellij.openapi.wm.impl.ToolWindowImpl;
import org.jetbrains.annotations.NotNull;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.Map;

public class BuildInjected extends AnAction {
    @Override
    public void update(AnActionEvent e) {
        e.getPresentation().setEnabled(true);
    }

    @Override
    public void actionPerformed(AnActionEvent e) {
        WriteAction action = new WriteAction() {
            @Override
            protected void run(@NotNull Result result) throws Throwable {
                VirtualFile baseDir = e.getProject().getBaseDir();
                if (baseDir.findChild("build") == null) {
                    baseDir.createChildDirectory(this.getClass(), "build");
                }

                Map<String, String> env = new HashMap<>();
                env.put("GOBO", "/Users/ionagamed/Downloads/gobo");
                RunInToolWindowPerformer.run(
                        e.getProject().getBaseDir().findChild("build").getPath(),
                        env,
                        "gec",
                        "../src/" + e.getProject().getName() + "-gobo.ecf"
                );
            }
        };
        action.execute();
    }
}
