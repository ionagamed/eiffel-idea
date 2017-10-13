package com.eiffel.sdk;

import com.intellij.openapi.projectRoots.SdkAdditionalData;
import com.intellij.openapi.util.DefaultJDOMExternalizer;
import com.intellij.openapi.util.InvalidDataException;
import com.intellij.openapi.util.WriteExternalException;
import org.jdom.Element;

public class EiffelSDKAdditionalData implements SdkAdditionalData {
    public String msvcLocation;

    @Override
    public Object clone() throws CloneNotSupportedException {
        EiffelSDKAdditionalData data = new EiffelSDKAdditionalData();
        data.msvcLocation = msvcLocation;
        return data;
    }

    void readExternal(Element element) throws InvalidDataException {
        DefaultJDOMExternalizer.readExternal(this, element);
    }

    void writeExternal(Element element) throws WriteExternalException {
        DefaultJDOMExternalizer.writeExternal(this, element);
    }
}
