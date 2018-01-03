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

public class EiffelInstructionImpl extends ASTWrapperPsiElement implements EiffelInstruction {

  public EiffelInstructionImpl(ASTNode node) {
    super(node);
  }

  public void accept(@NotNull EiffelVisitor visitor) {
    visitor.visitInstruction(this);
  }

  public void accept(@NotNull PsiElementVisitor visitor) {
    if (visitor instanceof EiffelVisitor) accept((EiffelVisitor)visitor);
    else super.accept(visitor);
  }

  @Override
  @Nullable
  public EiffelAssignerCall getAssignerCall() {
    return PsiTreeUtil.getChildOfType(this, EiffelAssignerCall.class);
  }

  @Override
  @Nullable
  public EiffelAssignment getAssignment() {
    return PsiTreeUtil.getChildOfType(this, EiffelAssignment.class);
  }

  @Override
  @Nullable
  public EiffelCastingCall getCastingCall() {
    return PsiTreeUtil.getChildOfType(this, EiffelCastingCall.class);
  }

  @Override
  @Nullable
  public EiffelCheck getCheck() {
    return PsiTreeUtil.getChildOfType(this, EiffelCheck.class);
  }

  @Override
  @Nullable
  public EiffelConditional getConditional() {
    return PsiTreeUtil.getChildOfType(this, EiffelConditional.class);
  }

  @Override
  @Nullable
  public EiffelCreationInstruction getCreationInstruction() {
    return PsiTreeUtil.getChildOfType(this, EiffelCreationInstruction.class);
  }

  @Override
  @Nullable
  public EiffelDebug getDebug() {
    return PsiTreeUtil.getChildOfType(this, EiffelDebug.class);
  }

  @Override
  @Nullable
  public EiffelLoop getLoop() {
    return PsiTreeUtil.getChildOfType(this, EiffelLoop.class);
  }

  @Override
  @Nullable
  public EiffelMultiBranch getMultiBranch() {
    return PsiTreeUtil.getChildOfType(this, EiffelMultiBranch.class);
  }

  @Override
  @Nullable
  public EiffelNonObjectCall getNonObjectCall() {
    return PsiTreeUtil.getChildOfType(this, EiffelNonObjectCall.class);
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
  public EiffelPrecursor getPrecursor() {
    return PsiTreeUtil.getChildOfType(this, EiffelPrecursor.class);
  }

  @Override
  @Nullable
  public EiffelRetry getRetry() {
    return PsiTreeUtil.getChildOfType(this, EiffelRetry.class);
  }

}
