// This is a generated file. Not intended for manual editing.
package com.eiffel.psi;

import java.util.List;
import org.jetbrains.annotations.*;
import com.intellij.psi.PsiElement;

public interface EiffelInstruction extends PsiElement {

  @Nullable
  EiffelAssignerCall getAssignerCall();

  @Nullable
  EiffelAssignment getAssignment();

  @Nullable
  EiffelCastingCall getCastingCall();

  @Nullable
  EiffelCheck getCheck();

  @Nullable
  EiffelConditional getConditional();

  @Nullable
  EiffelCreationInstruction getCreationInstruction();

  @Nullable
  EiffelDebug getDebug();

  @Nullable
  EiffelLoop getLoop();

  @Nullable
  EiffelMultiBranch getMultiBranch();

  @Nullable
  EiffelNonObjectCall getNonObjectCall();

  @Nullable
  EiffelNonObjectParenthesizedCall getNonObjectParenthesizedCall();

  @Nullable
  EiffelObjectCall getObjectCall();

  @Nullable
  EiffelPrecursor getPrecursor();

  @Nullable
  EiffelRetry getRetry();

}
