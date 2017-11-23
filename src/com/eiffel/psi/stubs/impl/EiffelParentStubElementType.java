package com.eiffel.psi.stubs.impl;

import com.eiffel.EiffelLanguage;
import com.eiffel.psi.EiffelParent;
import com.eiffel.psi.impl.EiffelParentImpl;
import com.eiffel.psi.stubs.EiffelParentStub;
import com.eiffel.psi.stubs.EiffelStubIndexKeys;
import com.intellij.psi.stubs.*;
import com.intellij.util.io.StringRef;
import org.jetbrains.annotations.NotNull;

import java.io.IOException;

public class EiffelParentStubElementType extends IStubElementType<EiffelParentStub, EiffelParent> {
    public EiffelParentStubElementType() {
        super("PARENT", EiffelLanguage.INSTANCE);
    }

    @Override
    public EiffelParent createPsi(@NotNull EiffelParentStub stub) {
        return new EiffelParentImpl(stub, this);
    }

    @NotNull
    @Override
    public EiffelParentStub createStub(@NotNull EiffelParent psi, StubElement parentStub) {
        return new EiffelParentStubImpl(parentStub, psi.getClassName().getText());
    }

    @NotNull
    @Override
    public String getExternalId() {
        return "eiffel.parent";
    }

    @Override
    public void serialize(@NotNull EiffelParentStub stub, @NotNull StubOutputStream dataStream) throws IOException {
        dataStream.writeName(stub.getName());
    }

    @NotNull
    @Override
    public EiffelParentStub deserialize(@NotNull StubInputStream dataStream, StubElement parentStub) throws IOException {
        final StringRef ref = dataStream.readName();
        return new EiffelParentStubImpl(parentStub, ref.getString());
    }

    @Override
    public void indexStub(@NotNull EiffelParentStub stub, @NotNull IndexSink sink) {
        sink.occurrence(EiffelStubIndexKeys.SYMBOLS_KEY, "parent." + stub.getClassName() + "." + stub.getName());
    }
}
