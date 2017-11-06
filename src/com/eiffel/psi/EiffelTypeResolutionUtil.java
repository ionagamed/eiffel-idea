package com.eiffel.psi;

import com.intellij.lang.ASTNode;
import com.intellij.openapi.project.Project;
import com.intellij.psi.PsiElement;
import com.intellij.psi.tree.TokenSet;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

import java.util.Stack;

import static com.eiffel.psi.EiffelTypes.*;

public class EiffelTypeResolutionUtil {
    @Nullable
    public static String getTypeString(Project project, @NotNull PsiElement element) {
        return getTypeString(project, element, false);
    }

    @Nullable
    public static String getTypeString(Project project, @NotNull PsiElement element, boolean resolveUp) {
        if (gotoParentTokens.contains(element.getNode().getElementType())) {
            return getTypeString(project, element.getParent(), resolveUp);
        }
        if (resolveUp) {
            if (!(element instanceof EiffelObjectCall)) {
                return null;
            }
            return getTypeStringForObjectCall(project, (EiffelObjectCall) element);
        }
        return null;
    }

    @Nullable
    private static String getTypeStringForObjectCall(Project project, @NotNull EiffelObjectCall objectCall) {
        EiffelClassDeclaration currentClassDeclaration = EiffelClassUtil.findClassDeclaration(objectCall);
        if (currentClassDeclaration == null) return null;

        Stack<ASTNode> processingStack = new Stack<>();
        ASTNode currentNode = objectCall.getNode().getTreeParent();
        while (currentNode != null && traversableCallTokens.contains(currentNode.getElementType())) {
            if (currentNode.getElementType().equals(EiffelTypes.OBJECT_CALL)) {
                processingStack.push(currentNode);
            }
            currentNode = currentNode.getTreeParent();
        }

        String currentClass = currentClassDeclaration.getName();
        while (!processingStack.empty()) {
            ASTNode current = processingStack.pop();
            ASTNode currentUnqualifiedCall = current.findChildByType(EiffelTypes.UNQUALIFIED_CALL);
            if (currentUnqualifiedCall == null) return null;
            ASTNode currentFeatureName = currentUnqualifiedCall.findChildByType(EiffelTypes.FEATURE_NAME);
            if (currentFeatureName == null) return null;
            currentClass = EiffelClassUtil.findFeatureReturnType(project, currentClass, currentFeatureName.getText());
            if (currentClass == null) return null;
        }

        return currentClass;
    }

    private static final TokenSet gotoParentTokens = TokenSet.create(
            IDENTIFIER,
            FEATURE_NAME,
            UNQUALIFIED_CALL
    );
    private static final TokenSet traversableCallTokens = TokenSet.create(
            UNQUALIFIED_CALL,
            OBJECT_CALL
    );
}
