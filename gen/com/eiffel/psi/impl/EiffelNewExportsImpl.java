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

public class EiffelNewExportsImpl extends ASTWrapperPsiElement implements EiffelNewExports {

  public EiffelNewExportsImpl(ASTNode node) {
    super(node);
  }

  public void accept(@NotNull EiffelVisitor visitor) {
    visitor.visitNewExports(this);
  }

  public void accept(@NotNull PsiElementVisitor visitor) {
    if (visitor instanceof EiffelVisitor) accept((EiffelVisitor)visitor);
    else super.accept(visitor);
  }

  @Override
  @NotNull
  public List<EiffelClients> getClientsList() {
    return PsiTreeUtil.getChildrenOfTypeAsList(this, EiffelClients.class);
  }

  @Override
  @NotNull
  public List<EiffelFeatureList> getFeatureListList() {
    return PsiTreeUtil.getChildrenOfTypeAsList(this, EiffelFeatureList.class);
  }

  @Override
  @NotNull
  public List<EiffelHeaderComment> getHeaderCommentList() {
    return PsiTreeUtil.getChildrenOfTypeAsList(this, EiffelHeaderComment.class);
  }

}
