package com.eiffel;

import com.intellij.openapi.editor.actionSystem.EditorActionManager;
import com.intellij.openapi.editor.actionSystem.TypedAction;

public class EditorRoutines {
    public static void initialize() {
        final EditorActionManager eam = EditorActionManager.getInstance();
        final TypedAction action = eam.getTypedAction();
        //action.setupHandler(new EiffelTypedActionHandler(action.getHandler()));


//        eam.setActionHandler(IdeActions.ACTION_EDITOR_ENTER, new EnterPressedHandler(action));
//        eam.setActionHandler(IdeActions.ACTION_EDITOR_ENTER, action);
    }
}
