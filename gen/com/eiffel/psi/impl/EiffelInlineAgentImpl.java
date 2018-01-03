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

public class EiffelInlineAgentImpl extends ASTWrapperPsiElement implements EiffelInlineAgent {

  public EiffelInlineAgentImpl(ASTNode node) {
    super(node);
  }

  public void accept(@NotNull EiffelVisitor visitor) {
    visitor.visitInlineAgent(this);
  }

  public void accept(@NotNull PsiElementVisitor visitor) {
    if (visitor instanceof EiffelVisitor) accept((EiffelVisitor)visitor);
    else super.accept(visitor);
  }

  @Override
  @Nullable
  public EiffelAgentActuals getAgentActuals() {
    return PsiTreeUtil.getChildOfType(this, EiffelAgentActuals.class);
  }

  @Override
  @Nullable
  public EiffelAttribute getAttribute() {
    return PsiTreeUtil.getChildOfType(this, EiffelAttribute.class);
  }

  @Override
  @Nullable
  public EiffelCompound getCompound() {
    return PsiTreeUtil.getChildOfType(this, EiffelCompound.class);
  }

  @Override
  @Nullable
  public EiffelDeferred getDeferred() {
    return PsiTreeUtil.getChildOfType(this, EiffelDeferred.class);
  }

  @Override
  @Nullable
  public EiffelExt getExt() {
    return PsiTreeUtil.getChildOfType(this, EiffelExt.class);
  }

  @Override
  @Nullable
  public EiffelFormalArguments getFormalArguments() {
    return PsiTreeUtil.getChildOfType(this, EiffelFormalArguments.class);
  }

  @Override
  @Nullable
  public EiffelLocalDeclarations getLocalDeclarations() {
    return PsiTreeUtil.getChildOfType(this, EiffelLocalDeclarations.class);
  }

  @Override
  @Nullable
  public EiffelOnce getOnce() {
    return PsiTreeUtil.getChildOfType(this, EiffelOnce.class);
  }

  @Override
  @Nullable
  public EiffelPostcondition getPostcondition() {
    return PsiTreeUtil.getChildOfType(this, EiffelPostcondition.class);
  }

  @Override
  @Nullable
  public EiffelPrecondition getPrecondition() {
    return PsiTreeUtil.getChildOfType(this, EiffelPrecondition.class);
  }

  @Override
  @Nullable
  public EiffelRescue getRescue() {
    return PsiTreeUtil.getChildOfType(this, EiffelRescue.class);
  }

  @Override
  @Nullable
  public EiffelType getType() {
    return PsiTreeUtil.getChildOfType(this, EiffelType.class);
  }

}
