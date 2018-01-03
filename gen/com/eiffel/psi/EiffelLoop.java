// This is a generated file. Not intended for manual editing.
package com.eiffel.psi;

import java.util.List;
import org.jetbrains.annotations.*;
import com.intellij.psi.PsiElement;

public interface EiffelLoop extends PsiElement {

  @Nullable
  EiffelExitCondition getExitCondition();

  @Nullable
  EiffelInitialization getInitialization();

  @Nullable
  EiffelInvariant getInvariant();

  @Nullable
  EiffelIteration getIteration();

  @NotNull
  EiffelLoopBody getLoopBody();

  @Nullable
  EiffelVariant getVariant();

}
