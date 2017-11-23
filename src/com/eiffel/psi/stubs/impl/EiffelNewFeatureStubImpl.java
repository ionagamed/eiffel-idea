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

    protected EiffelNewFeatureStubImpl(StubElement parent, final String name) {
        super(parent, (IStubElementType) EiffelTypes.NEW_FEATURE);
        this.name = name;
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public String getSerializedFormalArguments() {
        EiffelFeatureDeclarationStub fd = getFeatureDeclarationStub();
        if (fd == null) return null;
        for (StubElement el : fd.getChildrenStubs()) {
            if (el instanceof EiffelFormalArgumentsStub) {
                return ((EiffelFormalArgumentsStub) el).getText();
            }
        }
        return null;
    }

    @Override
    public String getTypeString() {
        EiffelFeatureDeclarationStub fd = getFeatureDeclarationStub();
        if (fd == null) return null;
        for (StubElement el : fd.getChildrenStubs()) {
            if (el instanceof EiffelTypeStub) {
                return ((EiffelTypeStub) el).getName();
            }
        }
        return null;
    }

    @Override
    public Set<String> getClientNames() {
        EiffelFeatureDeclarationStub fd = getFeatureDeclarationStub();
        if (fd == null) return null;
        Set<String> result = new HashSet<>();
        for (StubElement el : fd.getChildrenStubs()) {
            if (el instanceof EiffelClientSpecifierStub) {
                result.add(((EiffelClientSpecifierStub) el).getName());
            }
        }
        return result;
    }

    @Override
    public String getClassName() {
        StubElement candidate = getParentStub().getParentStub();
        if (candidate instanceof EiffelClassDeclarationStub) {
            return ((EiffelClassDeclarationStub) candidate).getName();
        }
        return null;
    }

    public EiffelFeatureDeclarationStub getFeatureDeclarationStub() {
        StubElement candidate = getParentStub();
        if (candidate instanceof EiffelFeatureDeclarationStub) {
            return (EiffelFeatureDeclarationStub) candidate;
        }
        return null;
    }
}
