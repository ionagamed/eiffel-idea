// This is a generated file. Not intended for manual editing.
package com.eiffel.psi;

import java.util.List;
import org.jetbrains.annotations.*;
import com.intellij.psi.PsiElement;

public interface EiffelFeatureClause extends PsiElement {

  @Nullable
  EiffelClients getClients();

  @NotNull
  List<EiffelFeatureDeclaration> getFeatureDeclarationList();

  @Nullable
  EiffelHeaderComment getHeaderComment();

}
