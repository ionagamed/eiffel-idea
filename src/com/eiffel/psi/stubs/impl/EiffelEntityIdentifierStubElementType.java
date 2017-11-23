package com.eiffel.psi.stubs.impl;

import com.eiffel.EiffelLanguage;
import com.eiffel.psi.EiffelEntityIdentifier;
import com.eiffel.psi.impl.EiffelEntityIdentifierImpl;
import com.eiffel.psi.stubs.EiffelEntityIdentifierStub;
import com.eiffel.psi.stubs.EiffelStubIndexKeys;
import com.intellij.lang.Language;
import com.intellij.psi.stubs.*;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

import java.io.IOException;

public class EiffelEntityIdentifierStubElementType extends IStubElementType<EiffelEntityIdentifierStub, EiffelEntityIdentifier> {
    public EiffelEntityIdentifierStubElementType() {
        super("ENTITY_IDENTIFIER", EiffelLanguage.INSTANCE);
    }

    @Override
    public EiffelEntityIdentifier createPsi(@NotNull EiffelEntityIdentifierStub stub) {
        return new EiffelEntityIdentifierImpl(stub, this);
    }

    @NotNull
    @Override
    public EiffelEntityIdentifierStub createStub(@NotNull EiffelEntityIdentifier psi, StubElement parentStub) {
        return new EiffelEntityIdentifierStubImpl(parentStub);
    }

    @NotNull
    @Override
    public String getExternalId() {
        return "eiffel.entity_identifier";
    }

    @Override
    public void serialize(@NotNull EiffelEntityIdentifierStub stub, @NotNull StubOutputStream dataStream) throws IOException {

    }

    @NotNull
    @Override
    public EiffelEntityIdentifierStub deserialize(@NotNull StubInputStream dataStream, StubElement parentStub) throws IOException {
        return new EiffelEntityIdentifierStubImpl(parentStub);
    }

    @Override
    public void indexStub(@NotNull EiffelEntityIdentifierStub stub, @NotNull IndexSink sink) {
        sink.occurrence(EiffelStubIndexKeys.SYMBOLS_KEY, "#");
    }
}
