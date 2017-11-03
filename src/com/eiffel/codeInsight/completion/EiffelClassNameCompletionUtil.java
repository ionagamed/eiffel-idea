package com.eiffel.codeInsight.completion;

import com.eiffel.psi.EiffelClassDeclaration;
import com.eiffel.psi.EiffelClassUtil;
import com.eiffel.psi.EiffelTypes;
import com.intellij.codeInsight.completion.*;
import com.intellij.codeInsight.lookup.LookupElement;
import com.intellij.codeInsight.lookup.LookupElementBuilder;
import com.intellij.codeInsight.lookup.LookupElementPresentation;
import com.intellij.codeInsight.lookup.LookupElementRenderer;
import com.intellij.icons.AllIcons;
import com.intellij.psi.PsiElement;
import com.intellij.util.ProcessingContext;
import org.jetbrains.annotations.NotNull;

import java.util.List;

public class EiffelClassNameCompletionUtil {
    public static void addCompletions(@NotNull CompletionParameters parameters, ProcessingContext context, @NotNull CompletionResultSet resultSet) {
        if (isClassType(parameters.getPosition())) {
            List<EiffelClassDeclaration> classDeclarations = EiffelClassUtil.findClassDeclarations(parameters.getEditor().getProject());
            for (EiffelClassDeclaration declaration : classDeclarations) {
                resultSet.addElement(
                        LookupElementBuilder
                                .create(declaration.getName())
                                .withRenderer(new LookupElementRenderer<LookupElement>() {
                                    @Override
                                    public void renderElement(LookupElement element, LookupElementPresentation presentation) {
                                        presentation.setIcon(AllIcons.Nodes.Class);
                                        presentation.setItemText(EiffelClassUtil.formalizeName(declaration.getName()));
                                        presentation.setItemTextBold(true);
                                    }
                                })
                );
            }
        }
    }

    private static boolean isClassType(@NotNull PsiElement element) {
        if (!element.getNode().getElementType().equals(EiffelTypes.IDENTIFIER)) {
            return false;
        }
        if (element.getNode().getTreeParent() == null) return false;
        if (element.getNode().getTreeParent().getTreeParent() == null) return false;
//        return element.getNode().getTreeParent().getTreeParent().getElementType().equals(EiffelTypes.CLASS_TYPE);
        return false;
    }
}
