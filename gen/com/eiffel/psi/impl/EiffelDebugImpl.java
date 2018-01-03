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

public class EiffelDebugImpl extends ASTWrapperPsiElement implements EiffelDebug {

  public EiffelDebugImpl(ASTNode node) {
    super(node);
  }

  public void accept(@NotNull EiffelVisitor visitor) {
    visitor.visitDebug(this);
  }

  public void accept(@NotNull PsiElementVisitor visitor) {
    if (visitor instanceof EiffelVisitor) accept((EiffelVisitor)visitor);
    else super.accept(visitor);
  }

  @Override
  @NotNull
  public EiffelCompound getCompound() {
    return notNullChild(PsiTreeUtil.getChildOfType(this, EiffelCompound.class));
  }

  @Override
  @NotNull
  public List<EiffelManifestString> getManifestStringList() {
    return PsiTreeUtil.getChildrenOfTypeAsList(this, EiffelManifestString.class);
  }

}
