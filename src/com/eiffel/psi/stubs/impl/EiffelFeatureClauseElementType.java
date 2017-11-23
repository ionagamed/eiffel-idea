package com.eiffel.psi.stubs.impl;

import com.eiffel.EiffelLanguage;
import com.eiffel.psi.EiffelFeatureClause;
import com.eiffel.psi.impl.EiffelFeatureClauseImpl;
import com.eiffel.psi.stubs.EiffelFeatureClauseStub;
import com.eiffel.psi.stubs.EiffelStubIndexKeys;
import com.intellij.lang.Language;
import com.intellij.psi.stubs.*;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

import java.io.IOException;

public class EiffelFeatureClauseElementType extends IStubElementType<EiffelFeatureClauseStub, EiffelFeatureClause> {
    public EiffelFeatureClauseElementType() {
        super("FEATURE_CLAUSE", EiffelLanguage.INSTANCE);
    }

    @Override
    public EiffelFeatureClause createPsi(@NotNull EiffelFeatureClauseStub stub) {
        return new EiffelFeatureClauseImpl(stub, this);
    }

    @NotNull
    @Override
    public EiffelFeatureClauseStub createStub(@NotNull EiffelFeatureClause psi, StubElement parentStub) {
        return new EiffelFeatureClauseStubImpl(parentStub);
    }

    @NotNull
    @Override
    public String getExternalId() {
        return "eiffel.feature_clause";
    }

    @Override
    public void serialize(@NotNull EiffelFeatureClauseStub stub, @NotNull StubOutputStream dataStream) throws IOException {
        dataStream.writeName("#");
    }

    @NotNull
    @Override
    public EiffelFeatureClauseStub deserialize(@NotNull StubInputStream dataStream, StubElement parentStub) throws IOException {
        dataStream.readName();
        return new EiffelFeatureClauseStubImpl(parentStub);
    }

    @Override
    public void indexStub(@NotNull EiffelFeatureClauseStub stub, @NotNull IndexSink sink) {
        sink.occurrence(EiffelStubIndexKeys.SYMBOLS_KEY, "#");
    }
}
