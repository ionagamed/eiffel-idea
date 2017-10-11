package com.eiffel.jps.model;

import org.jdom.Element;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.jetbrains.jps.model.JpsDummyElement;
import org.jetbrains.jps.model.JpsElementFactory;
import org.jetbrains.jps.model.serialization.JpsModelSerializerExtension;
import org.jetbrains.jps.model.serialization.library.JpsSdkPropertiesSerializer;
import org.jetbrains.jps.model.serialization.module.JpsModulePropertiesSerializer;

import java.util.Collections;
import java.util.List;

public class JpsEiffelModelSerializerExtension extends JpsModelSerializerExtension {
    @NotNull
    @Override
    public List<? extends JpsModulePropertiesSerializer<?>> getModulePropertiesSerializers() {
        return Collections.singletonList(new JpsModulePropertiesSerializer<JpsDummyElement>(JpsEiffelModuleType.getInstance(), "EIFFEL_MODULE", null) {
            @Override
            public JpsDummyElement loadProperties(@Nullable Element componentElement) {
                return JpsElementFactory.getInstance().createDummyElement();
            }

            @Override
            public void saveProperties(@NotNull JpsDummyElement properties, @NotNull Element componentElement) {
            }
        });
    }

    @NotNull
    @Override
    public List<? extends JpsSdkPropertiesSerializer<?>> getSdkPropertiesSerializers()
    {
        return Collections.singletonList(new JpsSdkPropertiesSerializer<JpsDummyElement>("EIFFEL_SDK", JpsEiffelSdkType.getInstance())
        {
            @NotNull
            @Override
            public JpsDummyElement loadProperties(@Nullable Element element)
            {
                return JpsElementFactory.getInstance().createDummyElement();
            }

            @Override
            public void saveProperties(@NotNull JpsDummyElement jpsElement, @NotNull Element element)
            {

            }
        });
    }
}