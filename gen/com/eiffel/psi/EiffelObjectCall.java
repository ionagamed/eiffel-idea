// This is a generated file. Not intended for manual editing.
package com.eiffel.psi;

import java.util.List;
import org.jetbrains.annotations.*;
import com.intellij.psi.PsiElement;

public interface EiffelObjectCall extends PsiElement {

  @Nullable
  EiffelActualList getActualList();

  @NotNull
  List<EiffelCastingCall> getCastingCallList();

  @Nullable
  EiffelLocal getLocal();

  @NotNull
  List<EiffelNonObjectCall> getNonObjectCallList();

  @Nullable
  EiffelNonObjectParenthesizedCall getNonObjectParenthesizedCall();

  @Nullable
  EiffelObjectCall getObjectCall();

  @Nullable
  EiffelParenthesized getParenthesized();

  @Nullable
  EiffelReadOnly getReadOnly();

  @Nullable
  EiffelUnqualifiedCall getUnqualifiedCall();

}
