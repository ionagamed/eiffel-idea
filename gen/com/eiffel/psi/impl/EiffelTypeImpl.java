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

public class EiffelTypeImpl extends ASTWrapperPsiElement implements EiffelType {

  public EiffelTypeImpl(ASTNode node) {
    super(node);
  }

  public void accept(@NotNull EiffelVisitor visitor) {
    visitor.visitType(this);
  }

  public void accept(@NotNull PsiElementVisitor visitor) {
    if (visitor instanceof EiffelVisitor) accept((EiffelVisitor)visitor);
    else super.accept(visitor);
  }

  @Override
  @Nullable
  public EiffelActualGenerics getActualGenerics() {
    return PsiTreeUtil.getChildOfType(this, EiffelActualGenerics.class);
  }

  @Override
  @Nullable
  public EiffelAttachmentMark getAttachmentMark() {
    return PsiTreeUtil.getChildOfType(this, EiffelAttachmentMark.class);
  }

  @Override
  @Nullable
  public EiffelClassName getClassName() {
    return PsiTreeUtil.getChildOfType(this, EiffelClassName.class);
  }

  @Override
  @Nullable
  public EiffelExpression getExpression() {
    return PsiTreeUtil.getChildOfType(this, EiffelExpression.class);
  }

  @Override
  @Nullable
  public EiffelFormalGenericName getFormalGenericName() {
    return PsiTreeUtil.getChildOfType(this, EiffelFormalGenericName.class);
  }

  @Override
  @Nullable
  public EiffelTupleType getTupleType() {
    return PsiTreeUtil.getChildOfType(this, EiffelTupleType.class);
  }

}
