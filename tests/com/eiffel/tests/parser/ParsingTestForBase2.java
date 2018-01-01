package com.eiffel.tests.parser;

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

public class ParsingTestForBase2 extends DirectoryParsingTestBase {
    public ParsingTestForBase2() {
        super("tests/com/eiffel/tests/parser/base2");
    }

    public void testParsingBase2Succeeds() {
        doTest();
    }
}
