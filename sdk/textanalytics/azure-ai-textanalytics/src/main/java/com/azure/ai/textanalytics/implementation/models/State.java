// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.ai.textanalytics.implementation.models;

import com.azure.core.util.ExpandableStringEnum;
import com.fasterxml.jackson.annotation.JsonCreator;
import java.util.Collection;

/** The status of the task at the mentioned last update time. */
public final class State extends ExpandableStringEnum<State> {
    /** Static value notStarted for State. */
    public static final State NOT_STARTED = fromString("notStarted");

    /** Static value running for State. */
    public static final State RUNNING = fromString("running");

    /** Static value succeeded for State. */
    public static final State SUCCEEDED = fromString("succeeded");

    /** Static value failed for State. */
    public static final State FAILED = fromString("failed");

    /** Static value cancelled for State. */
    public static final State CANCELLED = fromString("cancelled");

    /** Static value cancelling for State. */
    public static final State CANCELLING = fromString("cancelling");

    /** Static value partiallyCompleted for State. */
    public static final State PARTIALLY_COMPLETED = fromString("partiallyCompleted");

    /**
     * Creates or finds a State from its string representation.
     *
     * @param name a name to look for.
     * @return the corresponding State.
     */
    @JsonCreator
    public static State fromString(String name) {
        return fromString(name, State.class);
    }

    /**
     * Gets known State values.
     *
     * @return known State values.
     */
    public static Collection<State> values() {
        return values(State.class);
    }
}
