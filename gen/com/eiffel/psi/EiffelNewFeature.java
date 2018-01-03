// This is a generated file. Not intended for manual editing.
package com.eiffel.psi;

import java.util.List;
import org.jetbrains.annotations.*;
import com.intellij.psi.PsiElement;
import com.intellij.psi.StubBasedPsiElement;
import com.eiffel.psi.stubs.EiffelNewFeatureStub;
import java.util.Set;

public interface EiffelNewFeature extends EiffelTypedElement, StubBasedPsiElement<EiffelNewFeatureStub> {

  @Nullable
  EiffelAliasName getAliasName();

  @NotNull
  EiffelFeatureName getFeatureName();

  @NotNull
  String getName();

  @Nullable
  String getTypeString();

  @Nullable
  String getSerializedFormalArguments();

  @Nullable
  EiffelFeatureDeclaration getFeatureDeclaration();

  @Nullable
  EiffelFeatureClause getFeatureClause();

  @NotNull
  Set<String> getClientNames();

  boolean isAccessibleBy(String context);

  @Nullable
  String getCommentDoc();

}
