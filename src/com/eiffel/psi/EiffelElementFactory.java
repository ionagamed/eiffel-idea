package com.eiffel.psi;

import com.eiffel.EiffelSourceFileType;
import com.eiffel.psi.impl.EiffelClassDeclarationImpl;
import com.intellij.openapi.project.Project;
import com.intellij.psi.PsiFileFactory;

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
}
