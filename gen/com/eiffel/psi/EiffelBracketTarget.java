// This is a generated file. Not intended for manual editing.
package com.eiffel.psi;

import java.util.List;
import org.jetbrains.annotations.*;
import com.intellij.psi.PsiElement;

public interface EiffelBracketTarget extends PsiElement {

  @NotNull
  List<EiffelCastingCall> getCastingCallList();

  @Nullable
  EiffelLocal getLocal();

  @Nullable
  EiffelManifestConstant getManifestConstant();

  @Nullable
  EiffelManifestTuple getManifestTuple();

  @NotNull
  List<EiffelNonObjectCall> getNonObjectCallList();

  @Nullable
  EiffelNonObjectParenthesizedCall getNonObjectParenthesizedCall();

  @Nullable
  EiffelObjectCall getObjectCall();

  @Nullable
  EiffelOnceString getOnceString();

  @Nullable
  EiffelParenthesized getParenthesized();

  @Nullable
  EiffelReadOnly getReadOnly();

  @Nullable
  EiffelUnqualifiedCall getUnqualifiedCall();

}
