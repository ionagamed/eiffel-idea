package com.eiffel.psi.stubs.impl;

import com.eiffel.EiffelLanguage;
import com.eiffel.psi.*;
import com.eiffel.psi.impl.EiffelNewFeatureImpl;
import com.eiffel.psi.stubs.EiffelNewFeatureStub;
import com.eiffel.psi.stubs.EiffelStubIndexKeys;
import com.intellij.psi.stubs.*;
import com.intellij.util.io.StringRef;
import org.jetbrains.annotations.NotNull;

import java.io.IOException;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class EiffelNewFeatureStubElementType extends IStubElementType<EiffelNewFeatureStub, EiffelNewFeature> {
    public EiffelNewFeatureStubElementType() {
        super("CLASS_DECLARATION", EiffelLanguage.INSTANCE);
    }

    @Override
    public EiffelNewFeature createPsi(@NotNull EiffelNewFeatureStub stub) {
        return new EiffelNewFeatureImpl(stub, this);
    }

    @NotNull
    @Override
    public EiffelNewFeatureStub createStub(@NotNull EiffelNewFeature psi, StubElement parentStub) {
        return new EiffelNewFeatureStubImpl(
                parentStub,
                psi.getName()
        );
    }

    @NotNull
    @Override
    public String getExternalId() {
        return "eiffel.new_feature";
    }

    @Override
    public void serialize(@NotNull EiffelNewFeatureStub stub, @NotNull StubOutputStream dataStream) throws IOException {
        dataStream.writeName(stub.getName());
    }

    @NotNull
    @Override
    public EiffelNewFeatureStub deserialize(@NotNull StubInputStream dataStream, StubElement parentStub) throws IOException {
        final StringRef ref = dataStream.readName();
        return new EiffelNewFeatureStubImpl(parentStub, ref.getString());
    }

    @Override
    public void indexStub(@NotNull EiffelNewFeatureStub stub, @NotNull IndexSink sink) {
        sink.occurrence(EiffelStubIndexKeys.SYMBOLS_KEY, stub.getClassName() + "." + stub.getName());
    }
}
