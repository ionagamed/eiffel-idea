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

public class EiffelCastingCallImpl extends ASTWrapperPsiElement implements EiffelCastingCall {

  public EiffelCastingCallImpl(ASTNode node) {
    super(node);
  }

  public void accept(@NotNull EiffelVisitor visitor) {
    visitor.visitCastingCall(this);
  }

  public void accept(@NotNull PsiElementVisitor visitor) {
    if (visitor instanceof EiffelVisitor) accept((EiffelVisitor)visitor);
    else super.accept(visitor);
  }

  @Override
  @NotNull
  public EiffelActuals getActuals() {
    return notNullChild(PsiTreeUtil.getChildOfType(this, EiffelActuals.class));
  }

  @Override
  @NotNull
  public EiffelType getType() {
    return notNullChild(PsiTreeUtil.getChildOfType(this, EiffelType.class));
  }

}
