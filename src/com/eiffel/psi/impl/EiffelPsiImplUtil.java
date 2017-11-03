package com.eiffel.psi.impl;

import com.eiffel.psi.*;
import com.intellij.lang.ASTNode;
import com.intellij.psi.PsiElement;
import com.intellij.psi.tree.TokenSet;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class EiffelPsiImplUtil {
    @Nullable
    public static String getName(EiffelClassDeclaration classDeclaration) {
        if (classDeclaration.getStub() != null) return classDeclaration.getStub().getName();
        EiffelClassHeader classHeader = classDeclaration.getClassHeader();
        EiffelClassName className = classHeader.getClassName();
        return EiffelClassUtil.formalizeName(className.getText());
    }

    @NotNull
    public static PsiElement setName(EiffelClassDeclaration classDeclaration, String newName) {
        ASTNode classHeaderNode = classDeclaration.getNode().findChildByType(EiffelTypes.CLASS_HEADER);
        if (classHeaderNode == null) return classDeclaration;
        ASTNode classNameNode = classHeaderNode.findChildByType(EiffelTypes.CLASS_NAME);
        if (classNameNode == null) return classDeclaration;
        EiffelClassDeclaration newClassDeclaration = EiffelElementFactory.createClassDeclaration(classDeclaration.getProject(), newName);
        ASTNode newClassHeaderNode = newClassDeclaration.getNode().findChildByType(EiffelTypes.CLASS_HEADER);
        if (newClassHeaderNode == null) return classDeclaration;
        ASTNode newClassNameNode = newClassHeaderNode.findChildByType(EiffelTypes.CLASS_NAME);
        if (newClassNameNode == null) return classDeclaration;
        classHeaderNode.replaceChild(classNameNode, newClassNameNode);
        return classDeclaration;
    }

    @Nullable
    public static PsiElement getNameIdentifier(EiffelClassDeclaration classDeclaration) {
        ASTNode classHeader = classDeclaration.getNode().findChildByType(EiffelTypes.CLASS_HEADER);
        if (classHeader == null) return null;
        ASTNode className = classHeader.findChildByType(EiffelTypes.CLASS_NAME);
        if (className == null) return null;
        return className.getPsi();
    }

    @NotNull
    public static List<EiffelFeatureDeclaration> getFeatureDeclarations(EiffelClassDeclaration classDeclaration) {
        ASTNode features = classDeclaration.getNode().findChildByType(EiffelTypes.FEATURES);
        if (features == null) return Collections.emptyList();
        List<EiffelFeatureDeclaration> result = new ArrayList<>();
        ASTNode[] featureClauses = features.getChildren(TokenSet.create(EiffelTypes.FEATURE_CLAUSE));
        for (ASTNode featureClause : featureClauses) {
            ASTNode[] featureDeclarations = featureClause.getChildren(TokenSet.create(EiffelTypes.FEATURE_DECLARATION));
            for (ASTNode featureDeclaration : featureDeclarations) {
                result.add(featureDeclaration.getPsi(EiffelFeatureDeclaration.class));
            }
        }
        return result;
    }

    @NotNull
    public static List<String> getFeatureNames(EiffelClassDeclaration classDeclaration) {
        List<String> result = new ArrayList<>();
        for (EiffelFeatureDeclaration declaration : classDeclaration.getFeatureDeclarations()) {
            for (EiffelNewFeature newFeature : declaration.getNewFeatureList()) {
                result.add(newFeature.getFeatureName().getText());
            }
        }
        return result;
    }
}
