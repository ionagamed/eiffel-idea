package com.eiffel.psi.impl;

import com.eiffel.psi.*;
import com.intellij.lang.ASTNode;
import com.intellij.psi.PsiElement;
import com.intellij.psi.tree.TokenSet;
import com.intellij.util.containers.ContainerUtil;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

import java.util.*;
import java.util.concurrent.LinkedBlockingQueue;

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
    public static List<EiffelNewFeature> getNewFeatures(EiffelClassDeclaration classDeclaration) {
        List<EiffelNewFeature> newFeatures = new ArrayList<>();
        for (EiffelFeatureDeclaration featureDeclaration : classDeclaration.getFeatureDeclarations()) {
            newFeatures.addAll(featureDeclaration.getNewFeatureList());
        }
        return newFeatures;
    }

    @NotNull
    public static List<EiffelNewFeature> getAllNewFeatures(EiffelClassDeclaration classDeclaration) {
        List<EiffelNewFeature> result = new ArrayList<>();
        result.addAll(classDeclaration.getNewFeatures());
        for (EiffelClassDeclaration parent : classDeclaration.getParents()) {
            result.addAll(parent.getNewFeatures());
        }
        return result;
    }

    @NotNull
    public static List<EiffelNewFeature> getAllNewFeatures(EiffelClassDeclaration classDeclaration, String context) {
        return ContainerUtil.mapNotNull(classDeclaration.getAllNewFeatures(),
                (EiffelNewFeature f) -> {
                    if (f.isAccessibleBy(context)) {
                        return f;
                    } else {
                        return null;
                    }
                }
        );
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

    @NotNull
    public static List<EiffelClassDeclaration> getDirectParents(EiffelClassDeclaration classDeclaration) {
        // TODO: refactor to use getDirectParentNames
        List<EiffelClassDeclaration> result = new ArrayList<>();
        if (classDeclaration.getName() != null && !classDeclaration.getName().equals("ANY"))
            result.add(EiffelClassUtil.findClassDeclaration(classDeclaration.getProject(), "ANY"));

        EiffelInheritance inheritance = classDeclaration.getInheritance();
        if (inheritance == null) return result;
        for (EiffelParent parent : inheritance.getParentList()) {
            result.add(EiffelClassUtil.findClassDeclaration(classDeclaration.getProject(), parent.getClassName().getText()));
        }

        return result;
    }

    @NotNull
    public static Set<String> getDirectParentNames(EiffelClassDeclaration classDeclaration) {
        Set<String> result = new HashSet<>();
        if (classDeclaration.getName() != null && !classDeclaration.getName().equals("ANY")) result.add("ANY");

        EiffelInheritance inheritance = classDeclaration.getInheritance();
        if (inheritance == null) return result;
        for (EiffelParent parent : inheritance.getParentList()) {
            result.add(parent.getClassName().getText());
        }

        return result;
    }

    @NotNull
    public static List<EiffelClassDeclaration> getParents(EiffelClassDeclaration classDeclaration) {
        return ContainerUtil.mapNotNull(classDeclaration.getParentNames(),
                (String s) -> EiffelClassUtil.findClassDeclaration(classDeclaration.getProject(), s)
        );
    }

    @NotNull
    public static Set<String> getParentNames(EiffelClassDeclaration classDeclaration) {
        Set<String> result = new HashSet<>();
        Queue<EiffelClassDeclaration> processingQueue = new LinkedBlockingQueue<>();
        processingQueue.add(classDeclaration);
        boolean first = true;
        while (!processingQueue.isEmpty()) {
            EiffelClassDeclaration current = processingQueue.remove();
            if (!first) {
                result.add(current.getName());
            }
            processingQueue.addAll(current.getDirectParents());
            first = false;
        }
        return result;
    }

    @NotNull
    public static String getName(EiffelNewFeature newFeature) {
        return newFeature.getFeatureName().getText();
    }

    @Nullable
    public static String getReturnTypeString(EiffelNewFeature newFeature) {
        if (newFeature.getParent() instanceof EiffelFeatureDeclaration) {
            EiffelFeatureDeclaration featureDeclaration = (EiffelFeatureDeclaration) newFeature.getParent();
            EiffelType type = featureDeclaration.getType();
            if (type == null) return null;
            EiffelClassName className = type.getClassName();
            if (className != null) {
                return EiffelClassUtil.formalizeName(className.getText());
            }
        }
        return null;
    }

    @Nullable
    public static String getSerializedFormalArguments(EiffelNewFeature newFeature) {
        EiffelFeatureDeclaration featureDeclaration = newFeature.getFeatureDeclaration();
        if (featureDeclaration == null) return null;
        EiffelFormalArguments arguments = featureDeclaration.getFormalArguments();
        if (arguments != null) {
            return EiffelClassUtil.formalizeName(arguments.getText());
        }
        return null;
    }

    @Nullable
    public static EiffelFeatureDeclaration getFeatureDeclaration(EiffelNewFeature newFeature) {
        if (newFeature.getParent() instanceof EiffelFeatureDeclaration) {
            return (EiffelFeatureDeclaration) newFeature.getParent();
        }
        return null;
    }

    @Nullable
    public static EiffelFeatureClause getFeatureClause(EiffelNewFeature newFeature) {
        EiffelFeatureDeclaration featureDeclaration = newFeature.getFeatureDeclaration();
        if (featureDeclaration == null) return null;
        if (featureDeclaration.getParent() instanceof EiffelFeatureClause) {
            return (EiffelFeatureClause) featureDeclaration.getParent();
        }
        return null;
    }

    @NotNull
    public static Set<String> getClientNames(EiffelNewFeature newFeature) {
        Set<String> result = new HashSet<>();
        EiffelFeatureClause featureClause = newFeature.getFeatureClause();
        if (featureClause == null) return result;
        EiffelClients clients = featureClause.getClients();
        if (clients == null) return result;
        for (EiffelClassName className : clients.getClassNameList()) {
            result.add(className.getText());
        }
        return result;
    }

    public static boolean isAccessibleBy(EiffelNewFeature newFeature, String context) {
        Set<String> clients = newFeature.getClientNames();
        return clients.size() == 0 || clients.contains("ALL") || clients.contains(context);
    }
}
