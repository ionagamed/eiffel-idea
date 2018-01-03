// This is a generated file. Not intended for manual editing.
package com.eiffel.psi;

import java.util.List;
import org.jetbrains.annotations.*;
import com.intellij.psi.PsiElement;

public interface EiffelFeatureAdaption extends PsiElement {

  @Nullable
  EiffelNewExports getNewExports();

  @Nullable
  EiffelRedefine getRedefine();

  @NotNull
  List<EiffelRenamePair> getRenamePairList();

  @Nullable
  EiffelSelect getSelect();

  @Nullable
  EiffelUndefine getUndefine();

}
