package com.eiffel.psi;

import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

import java.util.List;
import java.util.Set;

public interface EiffelFeature extends EiffelTypedElement {
    /**
     * Final name of a feature in current class
     * @return the final name
     */
    @NotNull
    String getFinalName();

    /**
     * Original name of a feature, from a class where it was introduced
     * @return the original name
     */
    @NotNull
    String getOriginalName();

    /**
     * Returns a list of all formal arguments for the feature
     * If there are none, list is empty
     *
     * @return list, containing formals
     */
    @NotNull
    List<EiffelEntity> getArguments();

    /**
     * Convenience method. Returns a formalized version of getFormalArguments().getText()
     * !! not to be mistaken with getArguments(). getArguments returns a list of identifiers,
     * while getFormalArguments returns another psi element.
     *
     * Mainly used for completion
     *
     * @return serialized formals
     */
    @Nullable
    String getSerializedArguments();

    /**
     * Local identifiers for this feature. Mainly used for completion
     *
     * @return list, containing locals
     */
    @NotNull
    List<EiffelEntity> getLocals();

    /**
     * Clients of this feature
     *
     * @return set of client names
     */
    @NotNull
    Set<String> getClientNames();

    /**
     * Convenience method. Checks if a feature can be called in a class, called context
     *
     * @param context - class from which the test occurs
     * @return whether feature can be called from the context
     */
    boolean isAccessibleBy(String context);

    /**
     * Get first line of the feature header comment
     * @return the doc
     */
    String getCommentDoc();
}
