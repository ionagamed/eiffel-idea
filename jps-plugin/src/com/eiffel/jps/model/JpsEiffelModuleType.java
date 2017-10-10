package com.eiffel.jps.model;

import org.jetbrains.jps.model.JpsDummyElement;
import org.jetbrains.jps.model.ex.JpsElementTypeWithDummyProperties;
import org.jetbrains.jps.model.module.JpsModuleType;

public class JpsEiffelModuleType extends JpsElementTypeWithDummyProperties implements JpsModuleType<JpsDummyElement> {
    private static final JpsEiffelModuleType INSTANCE = new JpsEiffelModuleType();

    public static JpsEiffelModuleType getInstance() {
        return INSTANCE;
    }
}
