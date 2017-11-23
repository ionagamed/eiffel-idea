package com.eiffel.psi.stubs.impl;

import com.eiffel.EiffelLanguage;
import com.eiffel.psi.EiffelFeatureDeclaration;
import com.eiffel.psi.impl.EiffelFeatureDeclarationImpl;
import com.eiffel.psi.stubs.EiffelFeatureDeclarationStub;
import com.eiffel.psi.stubs.EiffelStubIndexKeys;
import com.intellij.lang.Language;
import com.intellij.psi.stubs.*;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

import java.io.IOException;

public class EiffelFeatureDeclarationStubElementType extends IStubElementType<EiffelFeatureDeclarationStub, EiffelFeatureDeclaration> {
    public EiffelFeatureDeclarationStubElementType() {
        super("FEATURE_DECLARATION", EiffelLanguage.INSTANCE);
    }

    @Override
    public EiffelFeatureDeclaration createPsi(@NotNull EiffelFeatureDeclarationStub stub) {
        return new EiffelFeatureDeclarationImpl(stub, this);
    }

    @NotNull
    @Override
    public EiffelFeatureDeclarationStub createStub(@NotNull EiffelFeatureDeclaration psi, StubElement parentStub) {
        return new EiffelFeatureDeclarationStubImpl(parentStub);
    }

    @NotNull
    @Override
    public String getExternalId() {
        return "eiffel.feature_declaration";
    }

    @Override
    public void serialize(@NotNull EiffelFeatureDeclarationStub stub, @NotNull StubOutputStream dataStream) throws IOException {
        dataStream.writeName("#");
    }

    @NotNull
    @Override
    public EiffelFeatureDeclarationStub deserialize(@NotNull StubInputStream dataStream, StubElement parentStub) throws IOException {
        dataStream.readName();
        return new EiffelFeatureDeclarationStubImpl(parentStub);
    }

    @Override
    public void indexStub(@NotNull EiffelFeatureDeclarationStub stub, @NotNull IndexSink sink) {
        sink.occurrence(EiffelStubIndexKeys.SYMBOLS_KEY, "#");
    }
}
