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

public class EiffelChoiceImpl extends ASTWrapperPsiElement implements EiffelChoice {

  public EiffelChoiceImpl(ASTNode node) {
    super(node);
  }

  public void accept(@NotNull EiffelVisitor visitor) {
    visitor.visitChoice(this);
  }

  public void accept(@NotNull PsiElementVisitor visitor) {
    if (visitor instanceof EiffelVisitor) accept((EiffelVisitor)visitor);
    else super.accept(visitor);
  }

  @Override
  @Nullable
  public EiffelConstantInterval getConstantInterval() {
    return PsiTreeUtil.getChildOfType(this, EiffelConstantInterval.class);
  }

  @Override
  @Nullable
  public EiffelExpression getExpression() {
    return PsiTreeUtil.getChildOfType(this, EiffelExpression.class);
  }

  @Override
  @Nullable
  public EiffelTypeInterval getTypeInterval() {
    return PsiTreeUtil.getChildOfType(this, EiffelTypeInterval.class);
  }

}
