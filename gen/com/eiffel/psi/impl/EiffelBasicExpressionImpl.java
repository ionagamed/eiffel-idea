// This is a generated file. Not intended for manual editing.
package com.eiffel.psi.impl;

import java.util.List;
import org.jetbrains.annotations.*;
import com.intellij.lang.ASTNode;
import com.intellij.psi.PsiElement;
import com.intellij.psi.PsiElementVisitor;
import com.intellij.psi.util.PsiTreeUtil;
import static com.eiffel.psi.EiffelTypes.*;
import com.eiffel.psi.*;

public class EiffelBasicExpressionImpl extends EiffelExpressionImpl implements EiffelBasicExpression {

  public EiffelBasicExpressionImpl(ASTNode node) {
    super(node);
  }

  public void accept(@NotNull EiffelVisitor visitor) {
    visitor.visitBasicExpression(this);
  }

  public void accept(@NotNull PsiElementVisitor visitor) {
    if (visitor instanceof EiffelVisitor) accept((EiffelVisitor)visitor);
    else super.accept(visitor);
  }

  @Override
  @Nullable
  public EiffelArrayLiteral getArrayLiteral() {
    return PsiTreeUtil.getChildOfType(this, EiffelArrayLiteral.class);
  }

  @Override
  @Nullable
  public EiffelBooleanLoop getBooleanLoop() {
    return PsiTreeUtil.getChildOfType(this, EiffelBooleanLoop.class);
  }

  @Override
  @Nullable
  public EiffelBracketExpression getBracketExpression() {
    return PsiTreeUtil.getChildOfType(this, EiffelBracketExpression.class);
  }

  @Override
  @Nullable
  public EiffelCastingCall getCastingCall() {
    return PsiTreeUtil.getChildOfType(this, EiffelCastingCall.class);
  }

  @Override
  @Nullable
  public EiffelCreationExpression getCreationExpression() {
    return PsiTreeUtil.getChildOfType(this, EiffelCreationExpression.class);
  }

  @Override
  @Nullable
  public EiffelExpression getExpression() {
    return PsiTreeUtil.getChildOfType(this, EiffelExpression.class);
  }

  @Override
  @Nullable
  public EiffelLocal getLocal() {
    return PsiTreeUtil.getChildOfType(this, EiffelLocal.class);
  }

  @Override
  @Nullable
  public EiffelManifestConstant getManifestConstant() {
    return PsiTreeUtil.getChildOfType(this, EiffelManifestConstant.class);
  }

  @Override
  @Nullable
  public EiffelManifestTuple getManifestTuple() {
    return PsiTreeUtil.getChildOfType(this, EiffelManifestTuple.class);
  }

  @Override
  @Nullable
  public EiffelNonObjectCall getNonObjectCall() {
    return PsiTreeUtil.getChildOfType(this, EiffelNonObjectCall.class);
  }

  @Override
  @Nullable
  public EiffelNonObjectParenthesizedCall getNonObjectParenthesizedCall() {
    return PsiTreeUtil.getChildOfType(this, EiffelNonObjectParenthesizedCall.class);
  }

  @Override
  @Nullable
  public EiffelObjectCall getObjectCall() {
    return PsiTreeUtil.getChildOfType(this, EiffelObjectCall.class);
  }

  @Override
  @Nullable
  public EiffelObjectTest getObjectTest() {
    return PsiTreeUtil.getChildOfType(this, EiffelObjectTest.class);
  }

  @Override
  @Nullable
  public EiffelOld getOld() {
    return PsiTreeUtil.getChildOfType(this, EiffelOld.class);
  }

  @Override
  @Nullable
  public EiffelParenthesized getParenthesized() {
    return PsiTreeUtil.getChildOfType(this, EiffelParenthesized.class);
  }

  @Override
  @Nullable
  public EiffelPrecursor getPrecursor() {
    return PsiTreeUtil.getChildOfType(this, EiffelPrecursor.class);
  }

  @Override
  @Nullable
  public EiffelReadOnly getReadOnly() {
    return PsiTreeUtil.getChildOfType(this, EiffelReadOnly.class);
  }

}
