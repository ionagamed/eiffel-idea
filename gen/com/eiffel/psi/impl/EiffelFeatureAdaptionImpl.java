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

public class EiffelFeatureAdaptionImpl extends ASTWrapperPsiElement implements EiffelFeatureAdaption {

  public EiffelFeatureAdaptionImpl(ASTNode node) {
    super(node);
  }

  public void accept(@NotNull EiffelVisitor visitor) {
    visitor.visitFeatureAdaption(this);
  }

  public void accept(@NotNull PsiElementVisitor visitor) {
    if (visitor instanceof EiffelVisitor) accept((EiffelVisitor)visitor);
    else super.accept(visitor);
  }

  @Override
  @Nullable
  public EiffelNewExports getNewExports() {
    return PsiTreeUtil.getChildOfType(this, EiffelNewExports.class);
  }

  @Override
  @Nullable
  public EiffelRedefine getRedefine() {
    return PsiTreeUtil.getChildOfType(this, EiffelRedefine.class);
  }

  @Override
  @NotNull
  public List<EiffelRenamePair> getRenamePairList() {
    return PsiTreeUtil.getChildrenOfTypeAsList(this, EiffelRenamePair.class);
  }

  @Override
  @Nullable
  public EiffelSelect getSelect() {
    return PsiTreeUtil.getChildOfType(this, EiffelSelect.class);
  }

  @Override
  @Nullable
  public EiffelUndefine getUndefine() {
    return PsiTreeUtil.getChildOfType(this, EiffelUndefine.class);
  }

}
