package com.eiffel;
import com.intellij.lexer.FlexAdapter;
import java.io.Reader;

public class EiffelLexerAdapter extends FlexAdapter {
    public EiffelLexerAdapter() {
        super(new EiffelLexer((Reader) null));
    }
}
