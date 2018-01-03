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

public class EiffelVariableImpl extends ASTWrapperPsiElement implements EiffelVariable {

  public EiffelVariableImpl(ASTNode node) {
    super(node);
  }

  public void accept(@NotNull EiffelVisitor visitor) {
    visitor.visitVariable(this);
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
  public EiffelLocal getLocal() {
    return PsiTreeUtil.getChildOfType(this, EiffelLocal.class);
  }

}
