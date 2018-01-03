// This is a generated file. Not intended for manual editing.
package com.eiffel.psi;

import java.util.List;
import org.jetbrains.annotations.*;
import com.intellij.psi.PsiElement;

public interface EiffelBasicExpression extends EiffelExpression {

  @Nullable
  EiffelArrayLiteral getArrayLiteral();

  @Nullable
  EiffelBooleanLoop getBooleanLoop();

  @Nullable
  EiffelBracketExpression getBracketExpression();

  @Nullable
  EiffelCastingCall getCastingCall();

  @Nullable
  EiffelCreationExpression getCreationExpression();

  @Nullable
  EiffelExpression getExpression();

  @Nullable
  EiffelLocal getLocal();

  @Nullable
  EiffelManifestConstant getManifestConstant();

  @Nullable
  EiffelManifestTuple getManifestTuple();

  @Nullable
  EiffelNonObjectCall getNonObjectCall();

  @Nullable
  EiffelNonObjectParenthesizedCall getNonObjectParenthesizedCall();

  @Nullable
  EiffelObjectCall getObjectCall();

  @Nullable
  EiffelObjectTest getObjectTest();

  @Nullable
  EiffelOld getOld();

  @Nullable
  EiffelParenthesized getParenthesized();

  @Nullable
  EiffelPrecursor getPrecursor();

  @Nullable
  EiffelReadOnly getReadOnly();

}
