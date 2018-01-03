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

public class EiffelLoopImpl extends ASTWrapperPsiElement implements EiffelLoop {

  public EiffelLoopImpl(ASTNode node) {
    super(node);
  }

  public void accept(@NotNull EiffelVisitor visitor) {
    visitor.visitLoop(this);
  }

  public void accept(@NotNull PsiElementVisitor visitor) {
    if (visitor instanceof EiffelVisitor) accept((EiffelVisitor)visitor);
    else super.accept(visitor);
  }

  @Override
  @Nullable
  public EiffelExitCondition getExitCondition() {
    return PsiTreeUtil.getChildOfType(this, EiffelExitCondition.class);
  }

  @Override
  @Nullable
  public EiffelInitialization getInitialization() {
    return PsiTreeUtil.getChildOfType(this, EiffelInitialization.class);
  }

  @Override
  @Nullable
  public EiffelInvariant getInvariant() {
    return PsiTreeUtil.getChildOfType(this, EiffelInvariant.class);
  }

  @Override
  @Nullable
  public EiffelIteration getIteration() {
    return PsiTreeUtil.getChildOfType(this, EiffelIteration.class);
  }

  @Override
  @NotNull
  public EiffelLoopBody getLoopBody() {
    return notNullChild(PsiTreeUtil.getChildOfType(this, EiffelLoopBody.class));
  }

  @Override
  @Nullable
  public EiffelVariant getVariant() {
    return PsiTreeUtil.getChildOfType(this, EiffelVariant.class);
  }

}
