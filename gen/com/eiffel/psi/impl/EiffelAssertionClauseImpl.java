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

public class EiffelAssertionClauseImpl extends ASTWrapperPsiElement implements EiffelAssertionClause {

  public EiffelAssertionClauseImpl(ASTNode node) {
    super(node);
  }

  public void accept(@NotNull EiffelVisitor visitor) {
    visitor.visitAssertionClause(this);
  }

  public void accept(@NotNull PsiElementVisitor visitor) {
    if (visitor instanceof EiffelVisitor) accept((EiffelVisitor)visitor);
    else super.accept(visitor);
  }

  @Override
  @Nullable
  public EiffelBasicExpression getBasicExpression() {
    return PsiTreeUtil.getChildOfType(this, EiffelBasicExpression.class);
  }

  @Override
  @Nullable
  public EiffelBooleanLoop getBooleanLoop() {
    return PsiTreeUtil.getChildOfType(this, EiffelBooleanLoop.class);
  }

  @Override
  @Nullable
  public EiffelComment getComment() {
    return PsiTreeUtil.getChildOfType(this, EiffelComment.class);
  }

  @Override
  @Nullable
  public EiffelTag getTag() {
    return PsiTreeUtil.getChildOfType(this, EiffelTag.class);
  }

}
