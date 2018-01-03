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
import com.eiffel.psi.stubs.EiffelNewFeatureStub;
import com.eiffel.psi.*;
import java.util.Set;
import com.intellij.psi.stubs.IStubElementType;
import com.intellij.psi.tree.IElementType;

public class EiffelNewFeatureImpl extends StubBasedPsiElementBase<EiffelNewFeatureStub> implements EiffelNewFeature {

  public EiffelNewFeatureImpl(EiffelNewFeatureStub stub, IStubElementType type) {
    super(stub, type);
  }

  public EiffelNewFeatureImpl(ASTNode node) {
    super(node);
  }

  public EiffelNewFeatureImpl(EiffelNewFeatureStub stub, IElementType type, ASTNode node) {
    super(stub, type, node);
  }

  public void accept(@NotNull EiffelVisitor visitor) {
    visitor.visitNewFeature(this);
  }

  public void accept(@NotNull PsiElementVisitor visitor) {
    if (visitor instanceof EiffelVisitor) accept((EiffelVisitor)visitor);
    else super.accept(visitor);
  }

  @Override
  @Nullable
  public EiffelAliasName getAliasName() {
    return PsiTreeUtil.getChildOfType(this, EiffelAliasName.class);
  }

  @Override
  @NotNull
  public EiffelFeatureName getFeatureName() {
    return notNullChild(PsiTreeUtil.getChildOfType(this, EiffelFeatureName.class));
  }

  @NotNull
  public String getName() {
    return EiffelPsiImplUtil.getName(this);
  }

  @Nullable
  public String getTypeString() {
    return EiffelPsiImplUtil.getTypeString(this);
  }

  @Nullable
  public String getSerializedFormalArguments() {
    return EiffelPsiImplUtil.getSerializedFormalArguments(this);
  }

  @Nullable
  public EiffelFeatureDeclaration getFeatureDeclaration() {
    return EiffelPsiImplUtil.getFeatureDeclaration(this);
  }

  @Nullable
  public EiffelFeatureClause getFeatureClause() {
    return EiffelPsiImplUtil.getFeatureClause(this);
  }

  @NotNull
  public Set<String> getClientNames() {
    return EiffelPsiImplUtil.getClientNames(this);
  }

  public boolean isAccessibleBy(String context) {
    return EiffelPsiImplUtil.isAccessibleBy(this, context);
  }

  @Nullable
  public String getCommentDoc() {
    return EiffelPsiImplUtil.getCommentDoc(this);
  }

}
