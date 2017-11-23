package com.eiffel.psi.stubs.impl;

import com.eiffel.EiffelLanguage;
import com.eiffel.psi.EiffelClientSpecifier;
import com.eiffel.psi.impl.EiffelClientSpecifierImpl;
import com.eiffel.psi.stubs.EiffelClientSpecifierStub;
import com.eiffel.psi.stubs.EiffelStubIndexKeys;
import com.intellij.lang.Language;
import com.intellij.psi.stubs.*;
import com.intellij.util.io.StringRef;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

import java.io.IOException;

public class EiffelClientSpecifierStubElementType extends IStubElementType<EiffelClientSpecifierStub, EiffelClientSpecifier> {
    public EiffelClientSpecifierStubElementType() {
        super("CLIENT_SPECIFIER", EiffelLanguage.INSTANCE);
    }

    @Override
    public EiffelClientSpecifier createPsi(@NotNull EiffelClientSpecifierStub stub) {
        return new EiffelClientSpecifierImpl(stub, this);
    }

    @NotNull
    @Override
    public EiffelClientSpecifierStub createStub(@NotNull EiffelClientSpecifier psi, StubElement parentStub) {
        return new EiffelClientSpecifierStubImpl(parentStub, psi.getText());
    }

    @NotNull
    @Override
    public String getExternalId() {
        return "eiffel.client_specifier";
    }

    @Override
    public void serialize(@NotNull EiffelClientSpecifierStub stub, @NotNull StubOutputStream dataStream) throws IOException {
        dataStream.writeName(stub.getName());
    }

    @NotNull
    @Override
    public EiffelClientSpecifierStub deserialize(@NotNull StubInputStream dataStream, StubElement parentStub) throws IOException {
        StringRef ref = dataStream.readName();
        return new EiffelClientSpecifierStubImpl(parentStub, ref.getString());
    }

    @Override
    public void indexStub(@NotNull EiffelClientSpecifierStub stub, @NotNull IndexSink sink) {
        sink.occurrence(EiffelStubIndexKeys.SYMBOLS_KEY, "#");
    }
}
