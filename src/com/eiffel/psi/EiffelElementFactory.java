package com.eiffel.psi;

import com.eiffel.EiffelSourceFileType;
import com.eiffel.psi.impl.EiffelClassDeclarationImpl;
import com.intellij.jam.reflect.JamEnumAttributeMeta;
import com.intellij.openapi.project.Project;
import com.intellij.psi.PsiFileFactory;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

public class EiffelElementFactory {
    public static EiffelClassDeclaration createClassDeclaration(Project project, String className) {
        EiffelFile file = createFile(project,
                "class\n" +
                className + "\n" +
                "end"
        );
        return (EiffelClassDeclaration) file.getFirstChild();
    }

    public static EiffelFile createFile(Project project, String text) {
        String name = "dummy.e";
        return (EiffelFile) PsiFileFactory.getInstance(project).createFileFromText(name, EiffelSourceFileType.INSTANCE, text);
    }

    public static EiffelClients createClients(Project project, String client) {
        return createClients(project, Collections.singletonList(client));
    }

    public static EiffelClients createClients(Project project, String[] clients) {
        return createClients(project, Arrays.asList(clients));
    }

    public static EiffelClients createClients(Project project, List<String> clients) {
        return createFeatureClauseWithClients(project, clients)
                .getClients();
    }

    public static EiffelFeatureClause createFeatureClauseWithClient(Project project, String client) {
        return createFeatureClauseWithClients(project, Collections.singletonList(client));
    }

    public static EiffelFeatureClause createFeatureClauseWithClients(Project project, List<String> clients) {
        EiffelFile file = createFile(project,
                "class TMP\n" +
                        "feature {" + clients.stream().collect(Collectors.joining(",")) + "}\n" +
                        "end"
        );
        EiffelClassDeclaration classDeclaration = (EiffelClassDeclaration) file.getFirstChild();
        return classDeclaration
                .getFeatures()
                .getFeatureClauseList()
                .get(0);
    }
}
