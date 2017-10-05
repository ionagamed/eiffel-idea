package com.eiffel.windows.run;

import com.eiffel.actions.BuildInjected;
import com.intellij.openapi.project.Project;
import com.intellij.openapi.project.ProjectManager;
import org.jetbrains.annotations.Nullable;

import java.io.BufferedReader;
import java.io.File;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class RunInToolWindowPerformer {
    public static void run(String workDir, Map<String, String> environment, String ...args) {
        ProcessBuilder processBuilder = new ProcessBuilder(args);
        processBuilder.directory(new File(workDir));
        processBuilder.environment().putAll(environment);
        try {
            Process process = processBuilder.start();
            new Thread() {
                @Override
                public void run() {
                    BufferedReader reader = new BufferedReader(new InputStreamReader(process.getInputStream()));
                    String line;
                    try {
                        while ((line = reader.readLine()) != null) {
                            for (String l : line.split("\n"))
                                RunToolWindowFactory.appendConsoleOutput(l, 1, true);
                        }
                    } catch (IOException ex) {
                        System.err.println(ex.toString());
                    }
                }
            }.run();
            new Thread() {
                @Override
                public void run() {
                    BufferedReader reader = new BufferedReader(new InputStreamReader(process.getErrorStream()));
                    String line;
                    try {
                        while ((line = reader.readLine()) != null) {
                            for (String l : line.split("\n")) {
                                //System.out.println(l);
                                RunToolWindowFactory.appendConsoleOutput(l, -1, true);
                            }

                        }
                    } catch (IOException ex) {
                        System.err.println(ex.toString());
                    }
                }
            }.run();
            System.out.println(Arrays.deepToString(args));
            if (args.length > 1) {
                RunToolWindowFactory.appendConsoleOutput("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~", 0, true);
                RunToolWindowFactory.appendConsoleOutput("", 0, true);
                RunToolWindowFactory.appendConsoleOutput("Compiled successfully", 3, true);
                RunToolWindowFactory.appendConsoleOutput("", 0, true);
                RunToolWindowFactory.appendConsoleOutput("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~", 0, true);
                RunToolWindowFactory.appendConsoleOutput("<br><br><br><br><br>", 0, false);
            }
        } catch (Exception e) {
            System.err.println(e.toString());
        }

    }

    /**
     * Codes:
     * 1 - normal
     * -1 - error
     */
    public static final String SUCCESS_COLOR = "#629755";
    public static final String NORMAL_COLOR = "#A9B7C6";
    public static final String COMMENT_COLOR = "#8C8C8C";
    public static final String WARNING_COLOR = "#CC7832";
    public static final String ERROR_COLOR = "#FF6B68";

    public static String lineConstructor (String line, int code, @Nullable String container) {
        String color;
        if (container == null)
            container = "pre";
        switch (code) {
            default:
            case 1:
                color = NORMAL_COLOR;
                break;
            case 2:
                color = COMMENT_COLOR;
                break;
            case 3:
                color = SUCCESS_COLOR;
                line = "<span background: #5E5339'>"+line+"</span>";
                break;
            case -1:
                int i = line.indexOf("warning");
                if (i > -1) {
                    color = NORMAL_COLOR;
                    String filename = line.substring(0, i);
                    line = line
                            .replace(filename,"<strong style='font-weight: bold;'>"+filename+"</strong>")
                            .replaceAll("warning[s]?", "<span style='color: "+WARNING_COLOR+"; background: #5E5339'>warning</span>");
                } else
                    color = ERROR_COLOR;
                line = line                    //eiffel-pluggin-test21.c:3675:17
                        .replaceAll("(->|\\^~)", "<span style='color: "+COMMENT_COLOR+"; font-weight: bold;'>$1</span>");
                break;
        }
        //System.out.println(line);
        return "<" + container + " style='color: " + color + "; font: normal 10px Source Code Pro, monospace; margin: 0; padding: 0;><div style='height: 10px;'>" + line + "</div></" + container + ">";
    }
}
