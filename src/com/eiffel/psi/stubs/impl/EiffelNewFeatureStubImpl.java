package com.eiffel.psi.stubs.impl;

import com.eiffel.psi.EiffelNewFeature;
import com.eiffel.psi.stubs.*;
import com.eiffel.psi.EiffelTypes;
import com.intellij.psi.stubs.IStubElementType;
import com.intellij.psi.stubs.StubBase;
import com.intellij.psi.stubs.StubElement;

import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Set;

public class EiffelNewFeatureStubImpl extends StubBase<EiffelNewFeature> implements EiffelNewFeatureStub {
    private String name;
    private String type;
    private String formals;
    private Set<String> clients;
    private String comment;

    protected EiffelNewFeatureStubImpl(StubElement parent, final String name, final String type, final String formals, final Set<String> clients, final String comment) {
        super(parent, (IStubElementType) EiffelTypes.NEW_FEATURE);
        this.name = name;
        this.type = type;
        this.formals = formals;
        this.clients = clients;
        this.comment = comment;
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public String getSerializedFormalArguments() {
        return formals;
    }

    @Override
    public String getTypeString() {
        return type;
    }

    @Override
    public Set<String> getClientNames() {
        return clients;
    }

    @Override
    public String getCommentDoc() {
        return comment;
    }

    @Override
    public String getClassName() {
        StubElement current = this;
        while (current != null && !(current instanceof EiffelClassDeclarationStub)) current = current.getParentStub();
        return current != null ? ((EiffelClassDeclarationStub) current).getName() : null;
    }
}
