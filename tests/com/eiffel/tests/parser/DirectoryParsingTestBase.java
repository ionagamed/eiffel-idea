package com.eiffel.tests.parser;

import com.eiffel.parser.EiffelParserDefinition;
import com.intellij.psi.PsiElement;
import com.intellij.psi.PsiErrorElement;
import com.intellij.psi.PsiRecursiveElementVisitor;
import com.intellij.testFramework.ParsingTestCase;
import org.apache.commons.lang.StringUtils;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.Scanner;
import java.util.concurrent.atomic.AtomicBoolean;

public abstract class DirectoryParsingTestBase extends ParsingTestCase {
    private final String myPath;

    protected DirectoryParsingTestBase(String path) {
        super("", "e", new EiffelParserDefinition());
        myPath = path;
    }

    @Override
    protected String getTestDataPath() {
        return myPath;
    }

    /**
     * Overridden doTest to ensure only that it parses without errors
     */
    void doTest() {
        String name = getTestName();
        try {
            Files.find(Paths.get(myPath), 100, (p, bfa) -> bfa.isRegularFile()).forEach(path -> {
                try {
                    String filename = path.toString();
                    String text = StringUtils.strip(new Scanner(new File(filename)).useDelimiter("\\Z").next(), "\uFEFF");
                    myFile = createPsiFile(name, text);
//                    ensureParsed(myFile);
                    //ensureCorrectReparse(myFile);
//                    if (checkResult) {
//                        checkResult(name, myFile);
//                    } else {
//                        toParseTreeText(myFile, skipSpaces(), includeRanges());
//                    }
                    AtomicBoolean ok = new AtomicBoolean(true);
                    StringBuilder msg = new StringBuilder();
                    new PsiRecursiveElementVisitor() {
                        @Override
                        public void visitElement(PsiElement element) {
                            super.visitElement(element);

                            if (element instanceof PsiErrorElement) {
                                ok.set(false);
                                msg.append(((PsiErrorElement) element).getErrorDescription());
                            }
                        }
                    }.visitFile(myFile);
                    assertTrue(filename + " failed parsing:\n " + msg.toString(), ok.get());
                } catch (IOException e) {
                    throw new RuntimeException(e);
                }
            });
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
