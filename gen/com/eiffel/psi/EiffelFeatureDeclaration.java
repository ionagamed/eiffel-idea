// This is a generated file. Not intended for manual editing.
package com.eiffel.psi;

import java.util.List;
import org.jetbrains.annotations.*;
import com.intellij.psi.PsiElement;

public interface EiffelFeatureDeclaration extends PsiElement {

  @Nullable
  EiffelFeatureName getFeatureName();

  @Nullable
  EiffelFeatureValue getFeatureValue();

  @Nullable
  EiffelFormalArguments getFormalArguments();

  @NotNull
  List<EiffelNewFeature> getNewFeatureList();

  @Nullable
  EiffelType getType();

  @NotNull
  List<EiffelEntityIdentifier> getLocalEntityIdentifiers();

  @Nullable
  EiffelEntityIdentifier getLocalEntityIdentifier(String name);

  @NotNull
  List<EiffelEntityIdentifier> getFormalArgumentIdentifiers();

  @Nullable
  EiffelEntityIdentifier getFormalArgumentIdentifier(String name);

  @Nullable
  String getCommentDoc();

}
