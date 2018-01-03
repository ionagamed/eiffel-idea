// This is a generated file. Not intended for manual editing.
package com.eiffel.psi;

import java.util.List;
import org.jetbrains.annotations.*;
import com.intellij.psi.PsiElement;

public interface EiffelCheck extends PsiElement {

  @NotNull
  List<EiffelAssertionClause> getAssertionClauseList();

  @Nullable
  EiffelCompound getCompound();

  @Nullable
  EiffelNotes getNotes();

}
