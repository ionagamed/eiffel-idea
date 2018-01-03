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

public class EiffelObjectCallImpl extends ASTWrapperPsiElement implements EiffelObjectCall {

  public EiffelObjectCallImpl(ASTNode node) {
    super(node);
  }

  public void accept(@NotNull EiffelVisitor visitor) {
    visitor.visitObjectCall(this);
  }

  public void accept(@NotNull PsiElementVisitor visitor) {
    if (visitor instanceof EiffelVisitor) accept((EiffelVisitor)visitor);
    else super.accept(visitor);
  }

  @Override
  @Nullable
  public EiffelActualList getActualList() {
    return PsiTreeUtil.getChildOfType(this, EiffelActualList.class);
  }

  @Override
  @NotNull
  public List<EiffelCastingCall> getCastingCallList() {
    return PsiTreeUtil.getChildrenOfTypeAsList(this, EiffelCastingCall.class);
  }

  @Override
  @Nullable
  public EiffelLocal getLocal() {
    return PsiTreeUtil.getChildOfType(this, EiffelLocal.class);
  }

  @Override
  @NotNull
  public List<EiffelNonObjectCall> getNonObjectCallList() {
    return PsiTreeUtil.getChildrenOfTypeAsList(this, EiffelNonObjectCall.class);
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
  public EiffelParenthesized getParenthesized() {
    return PsiTreeUtil.getChildOfType(this, EiffelParenthesized.class);
  }

  @Override
  @Nullable
  public EiffelReadOnly getReadOnly() {
    return PsiTreeUtil.getChildOfType(this, EiffelReadOnly.class);
  }

  @Override
  @Nullable
  public EiffelUnqualifiedCall getUnqualifiedCall() {
    return PsiTreeUtil.getChildOfType(this, EiffelUnqualifiedCall.class);
  }

}
