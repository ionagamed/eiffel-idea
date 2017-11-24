package com.eiffel.ide.quickfix;

import com.intellij.codeInsight.intention.impl.BaseIntentionAction;
import com.intellij.openapi.editor.Editor;
import com.intellij.openapi.project.Project;
import com.intellij.psi.PsiElement;
import com.intellij.psi.PsiFile;
import com.intellij.util.IncorrectOperationException;
import org.jetbrains.annotations.Nls;
import org.jetbrains.annotations.NotNull;

import java.util.Collections;
import java.util.List;

public class EiffelRemoveElementsQuickFix extends BaseIntentionAction {
    private String text;
    private List<PsiElement> targets;

    public EiffelRemoveElementsQuickFix(String text, List<PsiElement> targets) {
        this.text = text;
        this.targets = targets;
    }
    public EiffelRemoveElementsQuickFix(String text, PsiElement target) {
        this.text = text;
        this.targets = Collections.singletonList(target);
    }

    @Nls
    @NotNull
    @Override
    public String getFamilyName() {
        return "Remove block base";
    }

    @Override
    public boolean isAvailable(@NotNull Project project, Editor editor, PsiFile file) {
        return true;
    }

    @Override
    public void invoke(@NotNull Project project, Editor editor, PsiFile file) throws IncorrectOperationException {
        for (PsiElement target : targets) {
            target.delete();
        }
    }

    @NotNull
    @Override
    public String getText() {
        return text;
    }
}
