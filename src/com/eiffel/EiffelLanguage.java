package com.eiffel;
import com.intellij.lang.Language;

public class EiffelLanguage extends Language {
    public static final EiffelLanguage INSTANCE = new EiffelLanguage();

    private EiffelLanguage() {
        super("Eiffel");

        EditorRoutines.initialize();
    }
}