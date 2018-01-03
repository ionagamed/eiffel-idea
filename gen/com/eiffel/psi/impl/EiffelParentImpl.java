// This is a generated file. Not intended for manual editing.
package com.eiffel.psi.impl;

import java.util.List;
import org.jetbrains.annotations.*;
import com.intellij.lang.ASTNode;
import com.intellij.psi.PsiElement;
import com.intellij.psi.PsiElementVisitor;
import com.intellij.psi.util.PsiTreeUtil;
import static com.eiffel.psi.EiffelTypes.*;
import com.intellij.extapi.psi.StubBasedPsiElementBase;
import com.eiffel.psi.stubs.EiffelParentStub;
import com.eiffel.psi.*;
import com.intellij.psi.stubs.IStubElementType;
import com.intellij.psi.tree.IElementType;

public class EiffelParentImpl extends StubBasedPsiElementBase<EiffelParentStub> implements EiffelParent {

  public EiffelParentImpl(EiffelParentStub stub, IStubElementType type) {
    super(stub, type);
  }

  public EiffelParentImpl(ASTNode node) {
    super(node);
  }

  public EiffelParentImpl(EiffelParentStub stub, IElementType type, ASTNode node) {
    super(stub, type, node);
  }

  public void accept(@NotNull EiffelVisitor visitor) {
    visitor.visitParent(this);
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
  @NotNull
  public EiffelClassName getClassName() {
    return notNullChild(PsiTreeUtil.getChildOfType(this, EiffelClassName.class));
  }

  @Override
  @Nullable
  public EiffelFeatureAdaption getFeatureAdaption() {
    return PsiTreeUtil.getChildOfType(this, EiffelFeatureAdaption.class);
  }

}
