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

public class EiffelMultiBranchImpl extends ASTWrapperPsiElement implements EiffelMultiBranch {

  public EiffelMultiBranchImpl(ASTNode node) {
    super(node);
  }

  public void accept(@NotNull EiffelVisitor visitor) {
    visitor.visitMultiBranch(this);
  }

  public void accept(@NotNull PsiElementVisitor visitor) {
    if (visitor instanceof EiffelVisitor) accept((EiffelVisitor)visitor);
    else super.accept(visitor);
  }

  @Override
  @Nullable
  public EiffelCompound getCompound() {
    return PsiTreeUtil.getChildOfType(this, EiffelCompound.class);
  }

  @Override
  @NotNull
  public EiffelExpression getExpression() {
    return notNullChild(PsiTreeUtil.getChildOfType(this, EiffelExpression.class));
  }

  @Override
  @NotNull
  public List<EiffelWhenPart> getWhenPartList() {
    return PsiTreeUtil.getChildrenOfTypeAsList(this, EiffelWhenPart.class);
  }

}
