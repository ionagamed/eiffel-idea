package com.eiffel.windows.run;

import org.jetbrains.annotations.Nullable;

import java.io.BufferedReader;
import java.io.File;
import java.io.IOException;
import java.io.InputStreamReader;
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
                            RunToolWindowFactory.appendConsoleOutput(lineConstructor(line, -1, null));
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
                            RunToolWindowFactory.appendConsoleOutput(lineConstructor(line, -1, null));
                        }
                    } catch (IOException ex) {
                        System.err.println(ex.toString());
                    }
                }
            }.run();
        } catch (Exception e) {
            System.err.println(e.toString());
        }
    }

    /**
     * Codes:
     * 1 - normal
     * -1 - error
     */
    public static final String NORMAL_COLOR = "#A9B7C6";
    public static final String COMMENT_COLOR = "#8C8C8C";
    public static final String ERROR_COLOR = "#FF6B68";

    public static String lineConstructor (String line, int code, @Nullable String container) {
        String color;
        if (container == null)
            container = "span";
        switch (code) {
            default:
            case 1:
                color = NORMAL_COLOR;
                break;
            case 2:
                color = COMMENT_COLOR;
                break;
            case -1:
                color = ERROR_COLOR;
                break;
        }
        return "<"+container+" style='color: "+color+"; font-family: Melno, monospace; white-space: nowrap; font-size: 11px !important;'>"+line+"</"+container+"><br>";
    }
}
