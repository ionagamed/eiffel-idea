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

public class EiffelWhenPartImpl extends ASTWrapperPsiElement implements EiffelWhenPart {

  public EiffelWhenPartImpl(ASTNode node) {
    super(node);
  }

  public void accept(@NotNull EiffelVisitor visitor) {
    visitor.visitWhenPart(this);
  }

  public void accept(@NotNull PsiElementVisitor visitor) {
    if (visitor instanceof EiffelVisitor) accept((EiffelVisitor)visitor);
    else super.accept(visitor);
  }

  @Override
  @NotNull
  public List<EiffelChoice> getChoiceList() {
    return PsiTreeUtil.getChildrenOfTypeAsList(this, EiffelChoice.class);
  }

  @Override
  @NotNull
  public EiffelCompound getCompound() {
    return notNullChild(PsiTreeUtil.getChildOfType(this, EiffelCompound.class));
  }

}
