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

public class EiffelFeatureValueImpl extends ASTWrapperPsiElement implements EiffelFeatureValue {

  public EiffelFeatureValueImpl(ASTNode node) {
    super(node);
  }

  public void accept(@NotNull EiffelVisitor visitor) {
    visitor.visitFeatureValue(this);
  }

  public void accept(@NotNull PsiElementVisitor visitor) {
    if (visitor instanceof EiffelVisitor) accept((EiffelVisitor)visitor);
    else super.accept(visitor);
  }

  @Override
  @Nullable
  public EiffelAttribute getAttribute() {
    return PsiTreeUtil.getChildOfType(this, EiffelAttribute.class);
  }

  @Override
  @Nullable
  public EiffelCompound getCompound() {
    return PsiTreeUtil.getChildOfType(this, EiffelCompound.class);
  }

  @Override
  @Nullable
  public EiffelDeferred getDeferred() {
    return PsiTreeUtil.getChildOfType(this, EiffelDeferred.class);
  }

  @Override
  @Nullable
  public EiffelExplicitValue getExplicitValue() {
    return PsiTreeUtil.getChildOfType(this, EiffelExplicitValue.class);
  }

  @Override
  @Nullable
  public EiffelExt getExt() {
    return PsiTreeUtil.getChildOfType(this, EiffelExt.class);
  }

  @Override
  @Nullable
  public EiffelHeaderComment getHeaderComment() {
    return PsiTreeUtil.getChildOfType(this, EiffelHeaderComment.class);
  }

  @Override
  @Nullable
  public EiffelLocalDeclarations getLocalDeclarations() {
    return PsiTreeUtil.getChildOfType(this, EiffelLocalDeclarations.class);
  }

  @Override
  @Nullable
  public EiffelNotes getNotes() {
    return PsiTreeUtil.getChildOfType(this, EiffelNotes.class);
  }

  @Override
  @Nullable
  public EiffelObsolete getObsolete() {
    return PsiTreeUtil.getChildOfType(this, EiffelObsolete.class);
  }

  @Override
  @Nullable
  public EiffelOnce getOnce() {
    return PsiTreeUtil.getChildOfType(this, EiffelOnce.class);
  }

  @Override
  @Nullable
  public EiffelPostcondition getPostcondition() {
    return PsiTreeUtil.getChildOfType(this, EiffelPostcondition.class);
  }

  @Override
  @Nullable
  public EiffelPrecondition getPrecondition() {
    return PsiTreeUtil.getChildOfType(this, EiffelPrecondition.class);
  }

  @Override
  @Nullable
  public EiffelRescue getRescue() {
    return PsiTreeUtil.getChildOfType(this, EiffelRescue.class);
  }

}
