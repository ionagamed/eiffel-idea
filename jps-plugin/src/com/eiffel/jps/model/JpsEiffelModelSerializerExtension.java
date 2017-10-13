package com.eiffel.jps.model;

import org.jdom.Element;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.jetbrains.jps.model.JpsDummyElement;
import org.jetbrains.jps.model.JpsElementFactory;
import org.jetbrains.jps.model.impl.JpsSimpleElementImpl;
import org.jetbrains.jps.model.serialization.JpsModelSerializerExtension;
import org.jetbrains.jps.model.serialization.library.JpsSdkPropertiesSerializer;
import org.jetbrains.jps.model.serialization.module.JpsModulePropertiesSerializer;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;

public class JpsEiffelModelSerializerExtension extends JpsModelSerializerExtension {
    @NotNull
    @Override
    public List<? extends JpsModulePropertiesSerializer<?>> getModulePropertiesSerializers() {
        return Collections.singletonList(new JpsModulePropertiesSerializer<JpsSimpleElementImpl<HashMap<String, String>>>(JpsEiffelModuleType.getInstance(), "EIFFEL_MODULE", "eiffel-module-state") {

            @Override
            public JpsSimpleElementImpl<HashMap<String, String>> loadProperties(@Nullable Element componentElement) {
                if (componentElement == null) return new JpsSimpleElementImpl<>(new HashMap<>());
                HashMap<String, String> map = new HashMap<>();

                for (Element el : componentElement.getChildren()) {
                    if (el.getName().equals("option")) {
                        try {
                            map.put(
                                    el.getAttribute("name").getValue(),
                                    el.getAttribute("value").getValue()
                            );
                        } catch (Exception e) {
                            return new JpsSimpleElementImpl<>(new HashMap<>());
                        }
                    }
                }

                return new JpsSimpleElementImpl<>(map);
            }

            @Override
            public void saveProperties(@NotNull JpsSimpleElementImpl<HashMap<String, String>> properties, @NotNull Element componentElement) {

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