package com.eiffel.sdk;

import com.intellij.openapi.components.PersistentStateComponent;
import com.intellij.openapi.components.State;
import com.intellij.openapi.components.Storage;
import com.intellij.openapi.components.StoragePathMacros;
import org.jetbrains.annotations.Nullable;

@State(
        name = "eiffel-module-state",
        storages = @Storage(StoragePathMacros.MODULE_FILE)
)
public class EiffelModulePersistent implements PersistentStateComponent<EiffelModulePersistent.State> {
    static class State {
        public String msvcLocation;
    }

    State state = new State();

    @Nullable
    @Override
    public State getState() {
        return state;
    }

    @Override
    public void loadState(State state) {
        this.state = state;
    }
}
