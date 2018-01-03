// This is a generated file. Not intended for manual editing.
package com.eiffel.psi.impl;

import java.util.List;
import org.jetbrains.annotations.*;
import com.intellij.lang.ASTNode;
import com.intellij.psi.PsiElement;
import com.intellij.psi.PsiElementVisitor;
import com.intellij.psi.util.PsiTreeUtil;
import static com.eiffel.psi.EiffelTypes.*;
import com.intellij.extapi.psi.StubBasedPsiElementBase;
import com.eiffel.psi.stubs.EiffelClassDeclarationStub;
import com.eiffel.psi.*;
import java.util.Map;
import java.util.Set;
import com.intellij.psi.stubs.IStubElementType;
import com.intellij.psi.tree.IElementType;

public class EiffelClassDeclarationImpl extends StubBasedPsiElementBase<EiffelClassDeclarationStub> implements EiffelClassDeclaration {

  public EiffelClassDeclarationImpl(EiffelClassDeclarationStub stub, IStubElementType type) {
    super(stub, type);
  }

  public EiffelClassDeclarationImpl(ASTNode node) {
    super(node);
  }

  public EiffelClassDeclarationImpl(EiffelClassDeclarationStub stub, IElementType type, ASTNode node) {
    super(stub, type, node);
  }

  public void accept(@NotNull EiffelVisitor visitor) {
    visitor.visitClassDeclaration(this);
  }

  public void accept(@NotNull PsiElementVisitor visitor) {
    if (visitor instanceof EiffelVisitor) accept((EiffelVisitor)visitor);
    else super.accept(visitor);
  }

  @Override
  @NotNull
  public EiffelClassHeader getClassHeader() {
    return notNullChild(PsiTreeUtil.getChildOfType(this, EiffelClassHeader.class));
  }

  @Override
  @Nullable
  public EiffelConverters getConverters() {
    return PsiTreeUtil.getChildOfType(this, EiffelConverters.class);
  }

  @Override
  @Nullable
  public EiffelCreators getCreators() {
    return PsiTreeUtil.getChildOfType(this, EiffelCreators.class);
  }

  @Override
  @Nullable
  public EiffelFeatures getFeatures() {
    return PsiTreeUtil.getChildOfType(this, EiffelFeatures.class);
  }

  @Override
  @Nullable
  public EiffelFormalGenerics getFormalGenerics() {
    return PsiTreeUtil.getChildOfType(this, EiffelFormalGenerics.class);
  }

  @Override
  @Nullable
  public EiffelInheritance getInheritance() {
    return PsiTreeUtil.getChildOfType(this, EiffelInheritance.class);
  }

  @Override
  @Nullable
  public EiffelInvariant getInvariant() {
    return PsiTreeUtil.getChildOfType(this, EiffelInvariant.class);
  }

  @Override
  @NotNull
  public List<EiffelNotes> getNotesList() {
    return PsiTreeUtil.getChildrenOfTypeAsList(this, EiffelNotes.class);
  }

  @Override
  @Nullable
  public EiffelObsolete getObsolete() {
    return PsiTreeUtil.getChildOfType(this, EiffelObsolete.class);
  }

  @Nullable
  public String getName() {
    return EiffelPsiImplUtil.getName(this);
  }

  @NotNull
  public PsiElement setName(String newName) {
    return EiffelPsiImplUtil.setName(this, newName);
  }

  @Nullable
  public PsiElement getNameIdentifier() {
    return EiffelPsiImplUtil.getNameIdentifier(this);
  }

  @NotNull
  public List<EiffelFeatureDeclaration> getFeatureDeclarations() {
    return EiffelPsiImplUtil.getFeatureDeclarations(this);
  }

  @NotNull
  public List<EiffelNewFeature> getNewFeatures() {
    return EiffelPsiImplUtil.getNewFeatures(this);
  }

  @NotNull
  public List<String> getFeatureNames() {
    return EiffelPsiImplUtil.getFeatureNames(this);
  }

  @NotNull
  public List<EiffelNewFeature> getAllNewFeatures() {
    return EiffelPsiImplUtil.getAllNewFeatures(this);
  }

  @NotNull
  public List<EiffelNewFeature> getAllNewFeaturesInContext(String context) {
    return EiffelPsiImplUtil.getAllNewFeaturesInContext(this, context);
  }

  @NotNull
  public Set<String> getDirectParentNames() {
    return EiffelPsiImplUtil.getDirectParentNames(this);
  }

  @NotNull
  public List<EiffelClassDeclaration> getDirectParents() {
    return EiffelPsiImplUtil.getDirectParents(this);
  }

  @NotNull
  public Set<String> getParentNames() {
    return EiffelPsiImplUtil.getParentNames(this);
  }

  @NotNull
  public List<EiffelClassDeclaration> getParents() {
    return EiffelPsiImplUtil.getParents(this);
  }

  @NotNull
  public Map<String, Integer> getParentNamesWithDepth() {
    return EiffelPsiImplUtil.getParentNamesWithDepth(this);
  }

  @NotNull
  public Map<EiffelClassDeclaration, Integer> getParentsWithDepth() {
    return EiffelPsiImplUtil.getParentsWithDepth(this);
  }

  @NotNull
  public Map<EiffelNewFeature, Integer> getAllNewFeaturesInContextWithDepth(String context) {
    return EiffelPsiImplUtil.getAllNewFeaturesInContextWithDepth(this, context);
  }

  @NotNull
  public List<EiffelNewFeature> getAllNewFeaturesSubset(Set<String> names) {
    return EiffelPsiImplUtil.getAllNewFeaturesSubset(this, names);
  }

  @NotNull
  public List<EiffelNewFeature> getCreationProcedures() {
    return EiffelPsiImplUtil.getCreationProcedures(this);
  }

  @Nullable
  public EiffelNewFeature getNewFeature(String featureName) {
    return EiffelPsiImplUtil.getNewFeature(this, featureName);
  }

}
