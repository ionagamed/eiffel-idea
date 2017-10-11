package com.eiffel;

import com.intellij.openapi.actionSystem.IdeActions;
import com.intellij.openapi.editor.actionSystem.EditorActionHandler;
import com.intellij.openapi.editor.actionSystem.EditorActionManager;

import java.net.URL;
import java.net.URLClassLoader;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class EditorRoutines {
    public static void initialize() {
        final EditorActionManager eam = EditorActionManager.getInstance();
        final EditorActionHandler action = eam.getActionHandler(IdeActions.ACTION_EDITOR_ENTER);
//        eam.setActionHandler(IdeActions.ACTION_EDITOR_ENTER, new EnterPressedHandler(action));
//        eam.setActionHandler(IdeActions.ACTION_EDITOR_ENTER, action);
    }
}
