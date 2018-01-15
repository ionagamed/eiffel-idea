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
import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.stream.Collectors;

public class EiffelNewFeatureStubElementType extends IStubElementType<EiffelNewFeatureStub, EiffelFeature> {
    public EiffelNewFeatureStubElementType() {
        super("CLASS_DECLARATION", EiffelLanguage.INSTANCE);
    }

    @Override
    public EiffelFeature createPsi(@NotNull EiffelNewFeatureStub stub) {
        return new EiffelNewFeatureImpl(stub, this);
    }

    @NotNull
    @Override
    public EiffelNewFeatureStub createStub(@NotNull EiffelFeature psi, StubElement parentStub) {
        return new EiffelNewFeatureStubImpl(
                parentStub,
                psi.getFinalName(),
                psi.getTypeString(),
                psi.getSerializedArguments(),
                psi.getClientNames(),
                psi.getCommentDoc()
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
        dataStream.writeName(stub.getTypeString() == null ? "#" : stub.getTypeString());
        dataStream.writeName(stub.getSerializedFormalArguments() == null ? "#" : stub.getSerializedFormalArguments());
        dataStream.writeName(stub.getClientNames().size() == 0 ? "#" :
            stub.getClientNames().stream().collect(Collectors.joining("|"))
        );
        dataStream.writeName(stub.getCommentDoc() == null ? "#" : stub.getCommentDoc());
    }

    @NotNull
    @Override
    public EiffelNewFeatureStub deserialize(@NotNull StubInputStream dataStream, StubElement parentStub) throws IOException {
        final StringRef nameRef = dataStream.readName();
        final StringRef typeRef = dataStream.readName();
        final StringRef formalsRef = dataStream.readName();
        final StringRef clientsRef = dataStream.readName();
        final StringRef docRef = dataStream.readName();
        return new EiffelNewFeatureStubImpl(
                parentStub,
                nameRef.getString(),
                typeRef.getString().equals("#") ? null : typeRef.getString(),
                formalsRef.getString().equals("#") ? null : formalsRef.getString(),
                clientsRef.getString().equals("#") ? Collections.emptySet() : new HashSet<>(Arrays.asList(clientsRef.getString().split("\\|"))),
                docRef.getString().equals("#") ? null : docRef.getString()
        );
    }

    @Override
    public void indexStub(@NotNull EiffelNewFeatureStub stub, @NotNull IndexSink sink) {
        sink.occurrence(EiffelStubIndexKeys.SYMBOLS_KEY, stub.getClassName() + "." + stub.getName());
    }
}
