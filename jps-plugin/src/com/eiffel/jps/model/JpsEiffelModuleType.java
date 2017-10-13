package com.eiffel.jps.model;

import org.jetbrains.annotations.NotNull;
import org.jetbrains.jps.model.JpsElementChildRole;
import org.jetbrains.jps.model.JpsElementContainer;
import org.jetbrains.jps.model.JpsElementType;
import org.jetbrains.jps.model.ex.JpsElementTypeBase;
import org.jetbrains.jps.model.impl.JpsSimpleElementImpl;
import org.jetbrains.jps.model.impl.JpsUrlListRole;
import org.jetbrains.jps.model.module.JpsModuleType;

import java.util.HashMap;

public class JpsEiffelModuleType extends JpsElementTypeBase<JpsSimpleElementImpl<HashMap<String, String>>> implements JpsModuleType<JpsSimpleElementImpl<HashMap<String, String>>>, JpsElementType<JpsSimpleElementImpl<HashMap<String, String>>> {
    private static final JpsEiffelModuleType INSTANCE = new JpsEiffelModuleType();

    public static JpsEiffelModuleType getInstance() {
        return INSTANCE;
    }
}
