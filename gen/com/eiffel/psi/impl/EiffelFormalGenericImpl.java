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

public class EiffelFormalGenericImpl extends ASTWrapperPsiElement implements EiffelFormalGeneric {

  public EiffelFormalGenericImpl(ASTNode node) {
    super(node);
  }

  public void accept(@NotNull EiffelVisitor visitor) {
    visitor.visitFormalGeneric(this);
  }

  public void accept(@NotNull PsiElementVisitor visitor) {
    if (visitor instanceof EiffelVisitor) accept((EiffelVisitor)visitor);
    else super.accept(visitor);
  }

  @Override
  @Nullable
  public EiffelConstrainingTypes getConstrainingTypes() {
    return PsiTreeUtil.getChildOfType(this, EiffelConstrainingTypes.class);
  }

  @Override
  @Nullable
  public EiffelConstraintCreators getConstraintCreators() {
    return PsiTreeUtil.getChildOfType(this, EiffelConstraintCreators.class);
  }

  @Override
  @NotNull
  public EiffelFormalGenericName getFormalGenericName() {
    return notNullChild(PsiTreeUtil.getChildOfType(this, EiffelFormalGenericName.class));
  }

}
