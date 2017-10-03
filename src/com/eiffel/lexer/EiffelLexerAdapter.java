package com.eiffel.lexer;
import com.eiffel.EiffelLexer;
import com.intellij.lexer.FlexAdapter;
import java.io.Reader;

public class EiffelLexerAdapter extends FlexAdapter {
    public EiffelLexerAdapter() {
        super(new EiffelLexer((Reader) null));
    }
}
