package com.eiffel.psi.stubs.impl;

import com.eiffel.psi.*;
import com.eiffel.psi.stubs.*;
import com.intellij.psi.stubs.IStubElementType;
import com.intellij.psi.stubs.StubBase;
import com.intellij.psi.stubs.StubElement;
import com.intellij.util.containers.ContainerUtil;

import java.util.*;
import java.util.List;

public class EiffelClassDeclarationStubImpl extends StubBase<EiffelClassDeclaration> implements EiffelClassDeclarationStub {
    private String name;

    protected EiffelClassDeclarationStubImpl(StubElement parent, final String name) {
        super(parent, (IStubElementType) EiffelTypes.CLASS_DECLARATION);
        this.name = name;
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public List<EiffelNewFeature> getNewFeatures() {
        List<EiffelNewFeature> result = new LinkedList<>();
        for (StubElement fcl : getChildrenStubs()) {
            if (fcl instanceof EiffelFeatureClauseStub) {
                for (StubElement fd : ((EiffelFeatureClauseStub) fcl).getChildrenStubs()) {
                    if (fd instanceof EiffelFeatureDeclarationStub) {
                        for (StubElement nf : ((EiffelFeatureDeclarationStub) fd).getChildrenStubs()) {
                            if (nf instanceof EiffelNewFeatureStub) {
                                result.add(((EiffelNewFeatureStub) nf).getPsi());
                            }
                        }
                    }
                }
            }
        }
        return result;
    }

    @Override
    public Set<String> getDirectParentNames() {
        Set<String> result = new HashSet<>();
        for (StubElement el : getChildrenStubs()) {
            if (el instanceof EiffelParentStub) {
                result.add(((EiffelParentStub) el).getName());
            }
        }
        return result;
    }
}