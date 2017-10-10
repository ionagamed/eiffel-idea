package com.eiffel.jps.model;

import org.jetbrains.annotations.NotNull;
import org.jetbrains.jps.model.JpsDummyElement;
import org.jetbrains.jps.model.JpsElementFactory;
import org.jetbrains.jps.model.JpsElementTypeWithDefaultProperties;
import org.jetbrains.jps.model.library.sdk.JpsSdkType;

public class JpsEiffelSdkType extends JpsSdkType<JpsDummyElement> implements JpsElementTypeWithDefaultProperties<JpsDummyElement> {

    private static final JpsEiffelSdkType INSTANCE = new JpsEiffelSdkType();

    public static JpsEiffelSdkType getInstance() {
        return INSTANCE;
    }

    @NotNull
    @Override
    public JpsDummyElement createDefaultProperties()
    {
        return JpsElementFactory.getInstance().createDummyElement();
    }
}