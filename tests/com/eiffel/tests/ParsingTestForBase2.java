package com.eiffel.tests;

import com.eiffel.parser.EiffelParserDefinition;
import com.intellij.psi.PsiElement;
import com.intellij.psi.PsiErrorElement;
import com.intellij.psi.PsiRecursiveElementVisitor;
import com.intellij.testFramework.ParsingTestCase;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.Scanner;
import java.util.concurrent.atomic.AtomicBoolean;

public class ParsingTestForBase2 extends ParsingTestCase {
    public ParsingTestForBase2() {
        super("tests", "e", new EiffelParserDefinition());
    }

    public void testParsingBase2Succeeds() {
        doTest(false);
    }

    /**
     * Overridden doTest to ensure only that it parses without errors
     */
    @Override
    protected void doTest(boolean checkResult) {
        String name = getTestName();
        try {
            Files.find(Paths.get("tests/com/eiffel/tests/base2"), 3, (p, bfa) -> bfa.isRegularFile()).forEach(path -> {
                try {
                    String filename = path.toString();
                    String text = new Scanner(new File(filename)).useDelimiter("\\Z").next();
                    myFile = createPsiFile(name, text);
                    ensureParsed(myFile);
                    ensureCorrectReparse(myFile);
//                    if (checkResult) {
//                        checkResult(name, myFile);
//                    } else {
//                        toParseTreeText(myFile, skipSpaces(), includeRanges());
//                    }
                    AtomicBoolean ok = new AtomicBoolean(true);
                    new PsiRecursiveElementVisitor() {
                        @Override
                        public void visitElement(PsiElement element) {
                            super.visitElement(element);

                            if (element instanceof PsiErrorElement) {
                                ok.set(false);
                            }
                        }
                    }.visitFile(myFile);
                    assertTrue(filename + " failed parsing", ok.get());
                } catch (IOException e) {
                    throw new RuntimeException(e);
                }
            });
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    @Override
    protected String getTestDataPath() {
        return "tests/com/eiffel/tests/base2";
    }
}