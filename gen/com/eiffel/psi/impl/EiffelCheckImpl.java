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

public class EiffelCheckImpl extends ASTWrapperPsiElement implements EiffelCheck {

  public EiffelCheckImpl(ASTNode node) {
    super(node);
  }

  public void accept(@NotNull EiffelVisitor visitor) {
    visitor.visitCheck(this);
  }

  public void accept(@NotNull PsiElementVisitor visitor) {
    if (visitor instanceof EiffelVisitor) accept((EiffelVisitor)visitor);
    else super.accept(visitor);
  }

  @Override
  @NotNull
  public List<EiffelAssertionClause> getAssertionClauseList() {
    return PsiTreeUtil.getChildrenOfTypeAsList(this, EiffelAssertionClause.class);
  }

  @Override
  @Nullable
  public EiffelCompound getCompound() {
    return PsiTreeUtil.getChildOfType(this, EiffelCompound.class);
  }

  @Override
  @Nullable
  public EiffelNotes getNotes() {
    return PsiTreeUtil.getChildOfType(this, EiffelNotes.class);
  }

}
