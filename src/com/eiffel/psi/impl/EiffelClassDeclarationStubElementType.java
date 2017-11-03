package com.eiffel.psi.impl;

import com.eiffel.EiffelLanguage;
import com.eiffel.psi.EiffelClassDeclaration;
import com.eiffel.psi.EiffelClassDeclarationStub;
import com.eiffel.psi.EiffelStubIndexKeys;
import com.intellij.lang.Language;
import com.intellij.lang.LighterAST;
import com.intellij.lang.LighterASTNode;
import com.intellij.psi.PsiElement;
import com.intellij.psi.stubs.*;
import com.intellij.psi.tree.IElementType;
import com.intellij.psi.tree.TokenSet;
import com.intellij.util.ArrayFactory;
import com.intellij.util.io.StringRef;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

import java.io.IOException;
import java.util.List;

public class EiffelClassDeclarationStubElementType extends IStubElementType<EiffelClassDeclarationStub, EiffelClassDeclaration> {
    public EiffelClassDeclarationStubElementType() {
        super("CLASS_DECLARATION", EiffelLanguage.INSTANCE);
    }

    @Override
    public EiffelClassDeclaration createPsi(@NotNull EiffelClassDeclarationStub stub) {
        return new EiffelClassDeclarationImpl(stub, this);
    }

    @NotNull
    @Override
    public EiffelClassDeclarationStub createStub(@NotNull EiffelClassDeclaration psi, StubElement parentStub) {
        return new EiffelClassDeclarationStubImpl(parentStub, psi.getName());
    }

    @NotNull
    @Override
    public String getExternalId() {
        return "eiffel.class_declaration";
    }

    @Override
    public void serialize(@NotNull EiffelClassDeclarationStub stub, @NotNull StubOutputStream dataStream) throws IOException {
        dataStream.writeName(stub.getName());
    }

    @NotNull
    @Override
    public EiffelClassDeclarationStub deserialize(@NotNull StubInputStream dataStream, StubElement parentStub) throws IOException {
        final StringRef ref = dataStream.readName();
        return new EiffelClassDeclarationStubImpl(parentStub, ref.getString());
    }

    @Override
    public void indexStub(@NotNull EiffelClassDeclarationStub stub, @NotNull IndexSink sink) {
        sink.occurrence(EiffelStubIndexKeys.CLASS_DECLARATION_KEY, stub.getName());
    }
}
