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
            return getTypeStringForTailObjectCall(project, (EiffelObjectCall) element);
        } else {
            if (element instanceof EiffelExpression) {
                return getTypeStringForExpression(project, (EiffelExpression) element);
            }
            if (element instanceof EiffelVariable) {
                return getTypeStringForVariable(project, (EiffelVariable) element);
            }
        }
        return null;
    }

    @Nullable
    private static String getTypeStringForVariable(Project project, EiffelVariable variable) {
        if (variable.getText().toLowerCase().equals("Current")) {
            return null; // i don't really know how to manage these situations well
        } else {
            EiffelClassDeclaration context = EiffelClassUtil.findClassDeclaration(variable);
            if (context == null) return null;
            EiffelNewFeature feature = context.getNewFeature(variable.getText());
            if (feature == null) return null;
            return feature.getTypeString();
        }
    }

    @Nullable
    private static String getTypeStringForExpression(Project project, EiffelExpression expr) {
        if (expr instanceof EiffelBasicExpression) {
            /*
                array_literal
                object_test
                creation_expression
                call
                manifest_constant
                parenthesized
                local
                read_only
                boolean_loop
                precursor
                manifest_tuple
                old
                bracket_expression
             */
            EiffelBasicExpression bExpr = (EiffelBasicExpression) expr;
            if (bExpr.getObjectTest() != null) return "BOOLEAN";
            if (bExpr.getCall() != null) return getTypeStringForCall(project, bExpr.getCall());
            if (bExpr.getManifestConstant() != null) return getTypeStringForLiteral(project, bExpr.getManifestConstant());
        }
        return null;
    }

    @Nullable
    private static String getTypeStringForCall(Project project, @NotNull EiffelCall call) {
        if (call instanceof EiffelObjectCall) {
            EiffelClassDeclaration context = EiffelClassUtil.findClassDeclaration(call);
            if (context == null) return null;
            String contextTypeString = context.getName();
            PsiElement current = call;
            while (current.getLastChild() instanceof EiffelObjectCall) {
                EiffelClassDeclaration contextClass = EiffelClassUtil.findClassDeclaration(project, contextTypeString);
                PsiElement unqualifiedCall = current.getFirstChild();
                if (unqualifiedCall instanceof EiffelUnqualifiedCall && contextClass != null) {
                    EiffelNewFeature feature = contextClass.getNewFeature(unqualifiedCall.getText());
                    if (feature != null) {
                        contextTypeString = feature.getTypeString();
                    }
                }
                current = current.getLastChild();
            }
            EiffelClassDeclaration contextClass = EiffelClassUtil.findClassDeclaration(project, contextTypeString);
            PsiElement unqualifiedCall = current.getFirstChild();
            if (unqualifiedCall instanceof EiffelUnqualifiedCall && contextClass != null) {
                EiffelNewFeature feature = contextClass.getNewFeature(unqualifiedCall.getText());
                if (feature != null) {
                    contextTypeString = feature.getTypeString();
                }
            }
            return contextTypeString;
        }
        return null;
    }

    @NotNull
    private static String getTypeStringForLiteral(Project project, @NotNull EiffelManifestConstant literal) {
        // manifest_constant goes directly into tokens, therefore using ASTNode here
        ASTNode literalNode = literal.getNode();
        // last child node is supposed to be the value, except for some rare cases, which are non standard-compliant
        ASTNode lastChildNode = literalNode.getLastChildNode();
        if (lastChildNode.getElementType().equals(EiffelTypes.INTEGER_LITERAL)) return "INTEGER_32";
        if (lastChildNode.getElementType().equals(EiffelTypes.REAL_LITERAL)) return "REAL_32";
        if (lastChildNode.getElementType().equals(EiffelTypes.STRING_LITERAL)) return "STRING_8";
        if (lastChildNode.getElementType().equals(EiffelTypes.CHARACTER_LITERAL)) return "CHARACTER_8";
        if (TokenSet.create(EiffelTypes.TRUE_KEYWORD, EiffelTypes.FALSE_KEYWORD).contains(lastChildNode.getElementType()))
            return "BOOLEAN";
        return "ANY";
    }

    @Nullable
    private static String getTypeStringForTailObjectCall(Project project, @NotNull EiffelObjectCall objectCall) {
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
            if (currentClass == null) {
                EiffelFeatureDeclaration featureDeclaration = EiffelClassUtil.findFeatureDeclaration(currentUnqualifiedCall.getPsi());
                if (featureDeclaration == null) return null;
                EiffelEntity identifier = featureDeclaration.getLocal(currentFeatureName.getText());
                if (identifier != null) {
                    currentClass = identifier.getTypeString();
                    if (currentClass == null) return null;
                } else {
                    identifier = featureDeclaration.getArgument(currentFeatureName.getText());
                    if (identifier == null) return null;
                    currentClass = identifier.getTypeString();
                    if (currentClass == null) return null;
                }
            }
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
