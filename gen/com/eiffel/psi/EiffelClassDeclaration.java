// This is a generated file. Not intended for manual editing.
package com.eiffel.psi;

import java.util.List;
import org.jetbrains.annotations.*;
import com.intellij.psi.PsiElement;
import com.intellij.psi.StubBasedPsiElement;
import com.eiffel.psi.stubs.EiffelClassDeclarationStub;
import java.util.Map;
import java.util.Set;

public interface EiffelClassDeclaration extends PsiElement, StubBasedPsiElement<EiffelClassDeclarationStub> {

  @NotNull
  EiffelClassHeader getClassHeader();

  @Nullable
  EiffelConverters getConverters();

  @Nullable
  EiffelCreators getCreators();

  @Nullable
  EiffelFeatures getFeatures();

  @Nullable
  EiffelFormalGenerics getFormalGenerics();

  @Nullable
  EiffelInheritance getInheritance();

  @Nullable
  EiffelInvariant getInvariant();

  @NotNull
  List<EiffelNotes> getNotesList();

  @Nullable
  EiffelObsolete getObsolete();

  @Nullable
  String getName();

  @NotNull
  PsiElement setName(String newName);

  @Nullable
  PsiElement getNameIdentifier();

  @NotNull
  List<EiffelFeatureDeclaration> getFeatureDeclarations();

  @NotNull
  List<EiffelNewFeature> getNewFeatures();

  @NotNull
  List<String> getFeatureNames();

  @NotNull
  List<EiffelNewFeature> getAllNewFeatures();

  @NotNull
  List<EiffelNewFeature> getAllNewFeaturesInContext(String context);

  @NotNull
  Set<String> getDirectParentNames();

  @NotNull
  List<EiffelClassDeclaration> getDirectParents();

  @NotNull
  Set<String> getParentNames();

  @NotNull
  List<EiffelClassDeclaration> getParents();

  @NotNull
  Map<String, Integer> getParentNamesWithDepth();

  @NotNull
  Map<EiffelClassDeclaration, Integer> getParentsWithDepth();

  @NotNull
  Map<EiffelNewFeature, Integer> getAllNewFeaturesInContextWithDepth(String context);

  @NotNull
  List<EiffelNewFeature> getAllNewFeaturesSubset(Set<String> names);

  @NotNull
  List<EiffelNewFeature> getCreationProcedures();

  @Nullable
  EiffelNewFeature getNewFeature(String featureName);

}
