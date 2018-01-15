package com.eiffel.psi.impl;

import com.eiffel.psi.*;
import com.eiffel.util.StreamUtil;
import com.intellij.lang.ASTNode;
import com.intellij.openapi.project.Project;
import com.intellij.psi.PsiElement;
import com.intellij.psi.tree.TokenSet;
import com.intellij.util.containers.ContainerUtil;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

import java.util.*;
import java.util.concurrent.LinkedBlockingQueue;

public class EiffelPsiImplUtil {

    //region Class Declaration methods
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

    @Nullable
    public static EiffelFeature getNewFeature(EiffelClassDeclaration classDeclaration, String featureName) {
        for (EiffelFeature newFeature : classDeclaration.getAllNewFeatures()) {
            if (newFeature.getFinalName().equals(featureName)) {
                return newFeature;
            }
        }
        return null;
    }

    @NotNull
    public static List<EiffelFeature> getNewFeatures(EiffelClassDeclaration classDeclaration) {
        if (classDeclaration.getStub() != null) return classDeclaration.getStub().getNewFeatures();
        List<EiffelFeature> newFeatures = new ArrayList<>();
        for (EiffelFeatureDeclaration featureDeclaration : classDeclaration.getFeatureDeclarations()) {
            newFeatures.addAll(featureDeclaration.getNewFeatureList());
        }
        return newFeatures;
    }

    @NotNull
    public static List<EiffelFeature> getAllNewFeatures(EiffelClassDeclaration classDeclaration) {
        List<EiffelFeature> result = new ArrayList<>();
        result.addAll(classDeclaration.getNewFeatures());
        for (EiffelClassDeclaration parent : classDeclaration.getParents()) {
            result.addAll(parent.getNewFeatures());
        }
        return result;
    }

    @NotNull
    public static List<EiffelFeature> getAllNewFeaturesSubset(EiffelClassDeclaration classDeclaration, Set<String> names) {
        List<EiffelFeature> result = new ArrayList<>();
        for (EiffelFeature newFeature : classDeclaration.getNewFeatures()) {
            if (names.contains(newFeature.getFinalName())) {
                result.add(newFeature);
            }
        }
        for (EiffelClassDeclaration parent : classDeclaration.getParents()) {
            for (EiffelFeature newFeature : parent.getNewFeatures()) {
                if (names.contains(newFeature.getFinalName())) {
                    result.add(newFeature);
                }
            }
        }
        return result;
    }

    @NotNull
    public static List<EiffelFeature> getAllNewFeaturesInContext(EiffelClassDeclaration classDeclaration, String context) {
        return ContainerUtil.mapNotNull(classDeclaration.getAllNewFeatures(),
                (EiffelFeature f) -> {
                    if (f.isAccessibleBy(context)) {
                        return f;
                    } else {
                        return null;
                    }
                }
        );
    }

    @NotNull
    public static Map<EiffelFeature, Integer> getAllNewFeaturesInContextWithDepth(EiffelClassDeclaration classDeclaration, String context) {
        Map<EiffelFeature, Integer> result = new HashMap<>();
        Set<String> alreadyPut = new HashSet<>(); // used to add nearest feature in inheritance tree
        for (EiffelFeature newFeature : classDeclaration.getNewFeatures()) {
            if (newFeature.isAccessibleBy(context)) {
                result.put(newFeature, 0);
                alreadyPut.add(newFeature.getFinalName());
            }
        }
        Map<EiffelClassDeclaration, Integer> parents = classDeclaration.getParentsWithDepth();
        for (EiffelClassDeclaration parent : parents.keySet()) {
            for (EiffelFeature newFeature : parent.getNewFeatures()) {
                if (newFeature.isAccessibleBy(context) && !alreadyPut.contains(newFeature.getFinalName())) {
                    result.put(newFeature, parents.get(parent));
                    alreadyPut.add(newFeature.getFinalName());
                }
            }
        }
        return result;
    }

    @NotNull
    public static List<String> getFeatureNames(EiffelClassDeclaration classDeclaration) {
        List<String> result = new ArrayList<>();
        for (EiffelFeature newFeature : classDeclaration.getNewFeatures()) {
            result.add(newFeature.getFinalName());
        }
        return result;
    }

    @NotNull
    public static List<EiffelClassDeclaration> getDirectParents(EiffelClassDeclaration classDeclaration) {
        List<EiffelClassDeclaration> result = new ArrayList<>();
        for (String parentName : classDeclaration.getDirectParentNames()) {
            EiffelClassDeclaration cd = EiffelClassUtil.findClassDeclaration(classDeclaration.getProject(), parentName);
            if (cd != null)
                result.add(cd);
        }
        return result;
    }

    @NotNull
    public static Set<String> getDirectParentNames(EiffelClassDeclaration classDeclaration) {
        if (classDeclaration.getStub() != null) {
            Set<String> tmp = classDeclaration.getStub().getDirectParentNames();
            if (classDeclaration.getName() != null && !classDeclaration.getName().equals("ANY")) tmp.add("ANY");
            return tmp;
        }
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

    public static boolean hasAncestor(EiffelClassDeclaration child, EiffelClassDeclaration candidate) {
        return child.getParents().contains(candidate);
    }

    public static boolean isAncestorOf(EiffelClassDeclaration ancestor, EiffelClassDeclaration candidiate) {
        return candidiate.getParents().contains(ancestor);
    }

    @NotNull
    public static Map<EiffelClassDeclaration, Integer> getParentsWithDepth(EiffelClassDeclaration classDeclaration) {
        Map<EiffelClassDeclaration, Integer> result = new HashMap<>();
        Map<String, Integer> parentNames = classDeclaration.getParentNamesWithDepth();
        for (String s : parentNames.keySet()) {
            result.put(EiffelClassUtil.findClassDeclaration(classDeclaration.getProject(), s), parentNames.get(s));
        }
        return result;
    }

    @NotNull
    public static Set<String> getParentNames(EiffelClassDeclaration classDeclaration) {
        return classDeclaration.getParentNamesWithDepth().keySet();
    }

    @NotNull
    public static Map<String, Integer> getParentNamesWithDepth(EiffelClassDeclaration classDeclaration) {
        Map<String, Integer> result = new HashMap<>();
        Queue<EiffelClassDeclaration> processingQueue = new LinkedBlockingQueue<>();
        Queue<Integer> depths = new LinkedBlockingQueue<>();
        processingQueue.add(classDeclaration);
        depths.add(0);
        boolean first = true;
        while (!processingQueue.isEmpty()) {
            EiffelClassDeclaration current = processingQueue.remove();
            int currentDepth = depths.remove();
            if (!first) {
                result.put(current.getName(), currentDepth);
            }
            processingQueue.addAll(current.getDirectParents());
            for (int i = 0; i < current.getDirectParents().size(); i++) {
                depths.add(currentDepth + 1);
            }
            first = false;
        }
        return result;
    }

    @NotNull
    public static List<EiffelFeature> getCreationProcedures(EiffelClassDeclaration classDeclaration) {
        List<EiffelFeature> result = new ArrayList<>();
        EiffelCreators creators = classDeclaration.getCreators();
        if (creators == null) return result;
        Set<String> filter = new HashSet<>();
        for (EiffelFeatureName newFeature : creators.getFeatureNameList()) {
            filter.add(newFeature.getText());
        }
        return classDeclaration.getAllNewFeaturesSubset(filter);
    }
    //endregion

    //region New Feature methods

    @NotNull
    public static String getFinalName(EiffelFeature newFeature) {
        return newFeature.getOriginalName();
    }

    @NotNull
    public static String getOriginalName(EiffelNewFeature newFeature) {
        return newFeature.getFeatureName().getText();
    }

    @NotNull
    public static List<EiffelEntity> getArguments(EiffelNewFeature newFeature) {
        return newFeature.getFeatureDeclaration().getArguments();
    }

    /**
     * Convenience method. Returns a formalized version of getFormalArguments().getText()
     * !! not to be mistaken with getArguments(). getArguments returns a list of identifiers,
     * while getFormalArguments returns another psi element.
     * <p>
     * Mainly used for completion
     *
     * @return serialized formals
     */
    @Nullable
    public static String getSerializedArguments(EiffelNewFeature newFeature) {
        if (newFeature.getStub() != null) return newFeature.getStub().getSerializedFormalArguments();
        return newFeature.getFeatureDeclaration().getSerializedArguments();
    }

    @NotNull
    public static List<EiffelEntity> getLocals(EiffelNewFeature newFeature) {
        return newFeature.getFeatureDeclaration().getLocals();
    }

    public static boolean isAccessibleBy(EiffelFeature newFeature, String context) {
        Set<String> clients = newFeature.getClientNames();
        return clients.size() == 0 || clients.contains("ALL") || clients.contains(context);
    }

    @NotNull
    public static Set<String> getClientNames(EiffelNewFeature newFeature) {
        if (newFeature.getStub() != null) return newFeature.getStub().getClientNames();
        Set<String> result = new HashSet<>();
        EiffelFeatureClause featureClause = newFeature.getFeatureClause();
        if (featureClause == null) return result;
        EiffelClients clients = featureClause.getClients();
        if (clients == null) return result;
        EiffelClientSpecifier clientSpecifier = clients.getClientSpecifier();
        if (clientSpecifier == null) return result;
        ASTNode firstChildNode = clientSpecifier.getFirstChild().getNode();
        if (firstChildNode.getElementType().equals(EiffelTypes.NONE_KEYWORD)) result.add("NONE");
        if (firstChildNode.getElementType().equals(EiffelTypes.ALL_KEYWORD)) result.add("ALL");
        for (EiffelClassName className : clientSpecifier.getClassNameList()) {
            result.add(className.getText());
        }
        return result;
    }

    @Nullable
    public static EiffelType getType(EiffelNewFeature newFeature) {
        EiffelFeatureDeclaration fd = newFeature.getFeatureDeclaration();
        return fd.getType();
    }

    @Nullable
    public static String getTypeString(EiffelNewFeature newFeature) {
        if (newFeature.getStub() != null) return newFeature.getStub().getTypeString();
        EiffelType type = newFeature.getType();
        if (type == null) return null;
        EiffelClassName className = type.getClassName();
        if (className == null) return null; // TODO
        return className.getText();
    }

    @NotNull
    public static EiffelFeatureDeclaration getFeatureDeclaration(EiffelFeature newFeature) {
//        if (newFeature.getStub() != null) return newFeature.getStub().getFeatureDeclarationStub().getPsi();
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

    @Nullable
    public static String getCommentDoc(EiffelNewFeature newFeature) {
        ASTNode fdNode = newFeature.getFeatureDeclaration().getNode();
        ASTNode commentNode = fdNode.findChildByType(EiffelTypes.COMMENT);
        if (commentNode != null) return commentNode.getText();
        return null;
    }
    //endregion

    //region Feature Declaration methods
    @NotNull
    public static List<EiffelEntity> getArguments(EiffelFeatureDeclaration fd) {
        EiffelFormalArguments formalArguments = fd.getFormalArguments();
        if (formalArguments == null) return Collections.emptyList();
        return formalArguments.getEntityDeclarationList().getEntityList();
    }

    @Nullable
    public static String getSerializedArguments(EiffelFeatureDeclaration fd) {
        if (fd == null) return null;
        EiffelFormalArguments arguments = fd.getFormalArguments();
        if (arguments != null) {
            return EiffelClassUtil.formalizeName(arguments.getText());
        }
        return null;
    }

    @Nullable
    public static EiffelEntity getArgument(EiffelFeatureDeclaration fd, String name) {
        for (EiffelEntity entity : fd.getArguments()) {
            if (entity.getName().equals(name)) {
                return entity;
            }
        }
        return null;
    }

    @NotNull
    public static List<EiffelEntity> getLocals(EiffelFeatureDeclaration fd) {
        EiffelFeatureValue featureValue = fd.getFeatureValue();
        if (featureValue == null) return Collections.emptyList();
        EiffelLocalDeclarations locals = featureValue.getLocalDeclarations();
        if (locals == null) return Collections.emptyList();

        return locals.getEntityDeclarationList().getEntityList();
    }

    @Nullable
    public static EiffelEntity getLocal(EiffelFeatureDeclaration fd, String name) {
        for (EiffelEntity entity : fd.getLocals()) {
            if (entity.getName().equals(name)) {
                return entity;
            }
        }
        return null;
    }
    //endregion

    //region Entity methods
    @NotNull
    public static String getName(EiffelEntity entity) {
        return entity.getText();
    }

    @Nullable
    public static String getTypeString(EiffelEntity entity) {
        EiffelType type = entity.getType();
        return type == null ? null : type.getUngenerified();
    }

    @Nullable
    public static EiffelType getType(EiffelEntity entity) {
        PsiElement parent = entity.getParent();
        if (parent instanceof EiffelEntityDeclarationGroup) {
            EiffelEntityDeclarationGroup group = (EiffelEntityDeclarationGroup) parent;
            return group.getType();
        }
        return null;
    }
    //endregion

    //region Entity List methods
    @NotNull
    public static List<EiffelEntity> getEntityList(EiffelEntityDeclarationList edl) {
        List<EiffelEntity> result = new ArrayList<>();
        for (EiffelEntityDeclarationGroup group : edl.getEntityDeclarationGroupList()) {
            result.addAll(group.getEntityList());
        }
        return result;
    }
    //endregion

    //region Type methods
    @Nullable
    public static String getString(EiffelType type) {
        return type.getText();
    }

    public static boolean conformsTo(EiffelType source, EiffelType destination) {
        final Project project = source.getProject();

        EiffelActualGenerics destinationGenerics = destination.getActualGenerics();
        EiffelActualGenerics sourceGenerics = source.getActualGenerics();

        if (source.getClassName() == null || destination.getClassName() == null) {
            return true; // TODO: implement non-class types, e.g. tuples
        }
        EiffelClassDeclaration sourceDeclaration = EiffelClassUtil.findClassDeclaration(project, source.getClassName().getText());
        EiffelClassDeclaration destinationDeclaration =
                EiffelClassUtil.findClassDeclaration(project, destination.getClassName().getText());

        if (destinationGenerics == null && sourceGenerics == null) {
            if (sourceDeclaration == null || destinationDeclaration == null) return true;
            return sourceDeclaration.hasAncestor(destinationDeclaration);
        } else if (destinationGenerics == null || sourceGenerics == null) {
            return false;
        } else {
            List<EiffelType> dstTypeList = destinationGenerics.getTypeList();
            List<EiffelType> srcTypeList = sourceGenerics.getTypeList();
            if (dstTypeList.size() != srcTypeList.size()) return false;

            return StreamUtil.zipIntoPairs(srcTypeList.stream(), dstTypeList.stream()).allMatch(
                    p -> p.getKey().conformsTo(p.getValue())
            );
        }
    }

    @Nullable
    public static String getUngenerified(EiffelType type) {
        EiffelClassName className = type.getClassName();
        if (className == null) return null;
        return EiffelClassUtil.formalizeName(className.getText());
    }
    //endregion
}
