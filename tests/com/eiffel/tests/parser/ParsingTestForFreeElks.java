package com.eiffel.tests.parser;

public class ParsingTestForFreeElks extends DirectoryParsingTestBase {
    public ParsingTestForFreeElks() {
        super("tests/com/eiffel/tests/parser/free_elks");
    }

    public void testParsingFreeElksSucceeds() {
        doTest();
    }
}
