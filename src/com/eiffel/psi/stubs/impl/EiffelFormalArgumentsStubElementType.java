package com.eiffel.psi.stubs.impl;

import com.eiffel.EiffelLanguage;
import com.eiffel.psi.EiffelFormalArguments;
import com.eiffel.psi.impl.EiffelFormalArgumentsImpl;
import com.eiffel.psi.stubs.EiffelFormalArgumentsStub;
import com.eiffel.psi.stubs.EiffelStubIndexKeys;
import com.intellij.lang.Language;
import com.intellij.psi.stubs.*;
import com.intellij.util.io.StringRef;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

import java.io.IOException;

public class EiffelFormalArgumentsStubElementType extends IStubElementType<EiffelFormalArgumentsStub, EiffelFormalArguments> {
    public EiffelFormalArgumentsStubElementType() {
        super("FORMAL_ARGUMENTS", EiffelLanguage.INSTANCE);
    }

    @Override
    public EiffelFormalArguments createPsi(@NotNull EiffelFormalArgumentsStub stub) {
        return new EiffelFormalArgumentsImpl(stub, this);
    }

    @NotNull
    @Override
    public EiffelFormalArgumentsStub createStub(@NotNull EiffelFormalArguments psi, StubElement parentStub) {
        return new EiffelFormalArgumentsStubImpl(parentStub, psi.getText());
    }

    @NotNull
    @Override
    public String getExternalId() {
        return "eiffel.formal_arguments";
    }

    @Override
    public void serialize(@NotNull EiffelFormalArgumentsStub stub, @NotNull StubOutputStream dataStream) throws IOException {
        dataStream.writeName(stub.getText());
    }

    @NotNull
    @Override
    public EiffelFormalArgumentsStub deserialize(@NotNull StubInputStream dataStream, StubElement parentStub) throws IOException {
        StringRef ref = dataStream.readName();
        return new EiffelFormalArgumentsStubImpl(parentStub, ref.getString());
    }

    @Override
    public void indexStub(@NotNull EiffelFormalArgumentsStub stub, @NotNull IndexSink sink) {
        sink.occurrence(EiffelStubIndexKeys.SYMBOLS_KEY, "#");
    }
}
