package com.eiffel.psi.stubs.impl;

import com.eiffel.EiffelLanguage;
import com.eiffel.psi.EiffelEntityDeclarationGroup;
import com.eiffel.psi.impl.EiffelEntityDeclarationGroupImpl;
import com.eiffel.psi.stubs.EiffelEntityDeclarationGroupStub;
import com.eiffel.psi.stubs.EiffelStubIndexKeys;
import com.intellij.lang.Language;
import com.intellij.psi.stubs.*;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

import java.io.IOException;

public class EiffelEntityDeclarationGroupStubElementType extends IStubElementType<EiffelEntityDeclarationGroupStub, EiffelEntityDeclarationGroup> {
    public EiffelEntityDeclarationGroupStubElementType() {
        super("ENTITY_DECLARATION_GROUP", EiffelLanguage.INSTANCE);
    }

    @Override
    public EiffelEntityDeclarationGroup createPsi(@NotNull EiffelEntityDeclarationGroupStub stub) {
        return new EiffelEntityDeclarationGroupImpl(stub, this);
    }

    @NotNull
    @Override
    public EiffelEntityDeclarationGroupStub createStub(@NotNull EiffelEntityDeclarationGroup psi, StubElement parentStub) {
        return new EiffelEntityDeclarationGroupStubImpl(parentStub);
    }

    @NotNull
    @Override
    public String getExternalId() {
        return "eiffel.entity_declaration_group";
    }

    @Override
    public void serialize(@NotNull EiffelEntityDeclarationGroupStub stub, @NotNull StubOutputStream dataStream) throws IOException {

    }

    @NotNull
    @Override
    public EiffelEntityDeclarationGroupStub deserialize(@NotNull StubInputStream dataStream, StubElement parentStub) throws IOException {
        return new EiffelEntityDeclarationGroupStubImpl(parentStub);
    }

    @Override
    public void indexStub(@NotNull EiffelEntityDeclarationGroupStub stub, @NotNull IndexSink sink) {
        sink.occurrence(EiffelStubIndexKeys.SYMBOLS_KEY, "#");
    }
}
