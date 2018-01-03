// This is a generated file. Not intended for manual editing.
package com.eiffel.psi.impl;

import java.util.List;
import org.jetbrains.annotations.*;
import com.intellij.lang.ASTNode;
import com.intellij.psi.PsiElement;
import com.intellij.psi.PsiElementVisitor;
import com.intellij.psi.util.PsiTreeUtil;
import static com.eiffel.psi.EiffelTypes.*;
import com.intellij.extapi.psi.ASTWrapperPsiElement;
import com.eiffel.psi.*;

public class EiffelFeatureDeclarationImpl extends ASTWrapperPsiElement implements EiffelFeatureDeclaration {

  public EiffelFeatureDeclarationImpl(ASTNode node) {
    super(node);
  }

  public void accept(@NotNull EiffelVisitor visitor) {
    visitor.visitFeatureDeclaration(this);
  }

  public void accept(@NotNull PsiElementVisitor visitor) {
    if (visitor instanceof EiffelVisitor) accept((EiffelVisitor)visitor);
    else super.accept(visitor);
  }

  @Override
  @Nullable
  public EiffelFeatureName getFeatureName() {
    return PsiTreeUtil.getChildOfType(this, EiffelFeatureName.class);
  }

  @Override
  @Nullable
  public EiffelFeatureValue getFeatureValue() {
    return PsiTreeUtil.getChildOfType(this, EiffelFeatureValue.class);
  }

  @Override
  @Nullable
  public EiffelFormalArguments getFormalArguments() {
    return PsiTreeUtil.getChildOfType(this, EiffelFormalArguments.class);
  }

  @Override
  @NotNull
  public List<EiffelNewFeature> getNewFeatureList() {
    return PsiTreeUtil.getChildrenOfTypeAsList(this, EiffelNewFeature.class);
  }

  @Override
  @Nullable
  public EiffelType getType() {
    return PsiTreeUtil.getChildOfType(this, EiffelType.class);
  }

  @NotNull
  public List<EiffelEntityIdentifier> getLocalEntityIdentifiers() {
    return EiffelPsiImplUtil.getLocalEntityIdentifiers(this);
  }

  @Nullable
  public EiffelEntityIdentifier getLocalEntityIdentifier(String name) {
    return EiffelPsiImplUtil.getLocalEntityIdentifier(this, name);
  }

  @NotNull
  public List<EiffelEntityIdentifier> getFormalArgumentIdentifiers() {
    return EiffelPsiImplUtil.getFormalArgumentIdentifiers(this);
  }

  @Nullable
  public EiffelEntityIdentifier getFormalArgumentIdentifier(String name) {
    return EiffelPsiImplUtil.getFormalArgumentIdentifier(this, name);
  }

  @Nullable
  public String getCommentDoc() {
    return EiffelPsiImplUtil.getCommentDoc(this);
  }

}
