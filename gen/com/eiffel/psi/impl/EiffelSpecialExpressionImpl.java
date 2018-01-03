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

public class EiffelSpecialExpressionImpl extends EiffelExpressionImpl implements EiffelSpecialExpression {

  public EiffelSpecialExpressionImpl(ASTNode node) {
    super(node);
  }

  public void accept(@NotNull EiffelVisitor visitor) {
    visitor.visitSpecialExpression(this);
  }

  public void accept(@NotNull PsiElementVisitor visitor) {
    if (visitor instanceof EiffelVisitor) accept((EiffelVisitor)visitor);
    else super.accept(visitor);
  }

  @Override
  @Nullable
  public EiffelAddress getAddress() {
    return PsiTreeUtil.getChildOfType(this, EiffelAddress.class);
  }

  @Override
  @Nullable
  public EiffelAgent getAgent() {
    return PsiTreeUtil.getChildOfType(this, EiffelAgent.class);
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
  public EiffelObjectTest getObjectTest() {
    return PsiTreeUtil.getChildOfType(this, EiffelObjectTest.class);
  }

  @Override
  @Nullable
  public EiffelOnceString getOnceString() {
    return PsiTreeUtil.getChildOfType(this, EiffelOnceString.class);
  }

}
