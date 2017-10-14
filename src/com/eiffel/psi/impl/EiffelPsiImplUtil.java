package com.eiffel.psi.impl;

import com.eiffel.psi.EiffelClassDeclaration;
import com.eiffel.psi.EiffelTypes;
import com.intellij.lang.ASTNode;

public class EiffelPsiImplUtil {
    public static String getClassName(EiffelClassDeclaration classDeclaration) {
        ASTNode classHeaderNode = classDeclaration.getNode().findChildByType(EiffelTypes.CLASS_HEADER);
        if (classHeaderNode == null) return null;
        ASTNode classNameNode = classHeaderNode.findChildByType(EiffelTypes.CLASS_NAME);
        if (classNameNode == null) return null;
        return classNameNode.getText();
    }
}
