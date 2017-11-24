package com.eiffel.ide.quickfix;

import com.eiffel.psi.*;
import com.intellij.codeInsight.intention.impl.BaseIntentionAction;
import com.intellij.openapi.application.ApplicationManager;
import com.intellij.openapi.application.Result;
import com.intellij.openapi.application.WriteAction;
import com.intellij.openapi.command.WriteCommandAction;
import com.intellij.openapi.editor.Editor;
import com.intellij.openapi.project.Project;
import com.intellij.psi.PsiFile;
import com.intellij.util.IncorrectOperationException;
import org.jetbrains.annotations.Nls;
import org.jetbrains.annotations.NotNull;

import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

public class EiffelSetFeatureClientsQuickFix extends BaseIntentionAction {
    private List<String> clients;
    private EiffelFeatureDeclaration target;

    public EiffelSetFeatureClientsQuickFix(List<String> clients, EiffelFeatureDeclaration target) {
        this.clients = clients;
        this.target = target;
    }

    public EiffelSetFeatureClientsQuickFix(String client, EiffelFeatureDeclaration target) {
        this.clients = Collections.singletonList(client);
        this.target = target;
    }

    @Nls
    @NotNull
    @Override
    public String getFamilyName() {
        return "Eiffel";
    }

    @Override
    public boolean isAvailable(@NotNull Project project, Editor editor, PsiFile file) {
        return true;
    }

    @Override
    public void invoke(@NotNull Project project, Editor editor, PsiFile file) throws IncorrectOperationException {
        new WriteAction() {
            @Override
            public void run(@NotNull Result unused) throws Throwable {
                EiffelFeatureClause clause = (EiffelFeatureClause) target.getParent();
                if (clause.getFeatureDeclarationList().size() == 1) {
                    if (clause.getClients() != null) {
                        clause.getClients().delete();
                    }
                    EiffelClients newClients = EiffelElementFactory.createClients(project, clients);
                    clause.addAfter(newClients, clause.getFirstChild());
                }
            }
        }.execute();
    }

    @NotNull
    @Override
    public String getText() {
        return "Set clients to " + clients.stream().collect(Collectors.joining(", "));
    }
}
