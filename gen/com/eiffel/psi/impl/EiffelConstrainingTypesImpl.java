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

public class EiffelConstrainingTypesImpl extends ASTWrapperPsiElement implements EiffelConstrainingTypes {

  public EiffelConstrainingTypesImpl(ASTNode node) {
    super(node);
  }

  public void accept(@NotNull EiffelVisitor visitor) {
    visitor.visitConstrainingTypes(this);
  }

  public void accept(@NotNull PsiElementVisitor visitor) {
    if (visitor instanceof EiffelVisitor) accept((EiffelVisitor)visitor);
    else super.accept(visitor);
  }

  @Override
  @Nullable
  public EiffelMultipleConstraint getMultipleConstraint() {
    return PsiTreeUtil.getChildOfType(this, EiffelMultipleConstraint.class);
  }

  @Override
  @NotNull
  public List<EiffelRenamePair> getRenamePairList() {
    return PsiTreeUtil.getChildrenOfTypeAsList(this, EiffelRenamePair.class);
  }

  @Override
  @Nullable
  public EiffelType getType() {
    return PsiTreeUtil.getChildOfType(this, EiffelType.class);
  }

}
