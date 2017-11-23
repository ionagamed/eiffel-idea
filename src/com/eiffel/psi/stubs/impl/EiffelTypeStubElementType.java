package com.eiffel.psi.stubs.impl;

import com.eiffel.EiffelLanguage;
import com.eiffel.psi.EiffelType;
import com.eiffel.psi.impl.EiffelTypeImpl;
import com.eiffel.psi.stubs.EiffelStubIndexKeys;
import com.eiffel.psi.stubs.EiffelTypeStub;
import com.intellij.lang.Language;
import com.intellij.psi.stubs.*;
import com.intellij.util.io.StringRef;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

import java.io.IOException;

public class EiffelTypeStubElementType extends IStubElementType<EiffelTypeStub, EiffelType> {
    public EiffelTypeStubElementType() {
        super("TYPE", EiffelLanguage.INSTANCE);
    }

    @Override
    public EiffelType createPsi(@NotNull EiffelTypeStub stub) {
        return new EiffelTypeImpl(stub, this);
    }

    @NotNull
    @Override
    public EiffelTypeStub createStub(@NotNull EiffelType psi, StubElement parentStub) {
        return new EiffelTypeStubImpl(parentStub, psi.getText());
    }

    @NotNull
    @Override
    public String getExternalId() {
        return "eiffel.type";
    }

    @Override
    public void serialize(@NotNull EiffelTypeStub stub, @NotNull StubOutputStream dataStream) throws IOException {
        dataStream.writeName(stub.getName());
    }

    @NotNull
    @Override
    public EiffelTypeStub deserialize(@NotNull StubInputStream dataStream, StubElement parentStub) throws IOException {
        StringRef ref = dataStream.readName();
        return new EiffelTypeStubImpl(parentStub, ref.getString());
    }

    @Override
    public void indexStub(@NotNull EiffelTypeStub stub, @NotNull IndexSink sink) {
        sink.occurrence(EiffelStubIndexKeys.SYMBOLS_KEY, "#");
    }
}
