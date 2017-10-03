package com.eiffel.windows.run;

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
                            RunToolWindowFactory.appendConsoleOutput(line + "<br>");
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
                            RunToolWindowFactory.appendConsoleOutput("<font style='color: red'>" + line + "</font><br>");
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
}
