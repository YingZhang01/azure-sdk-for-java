// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.containers.containerregistry.implementation.models;

import com.azure.core.annotation.Fluent;
import com.fasterxml.jackson.annotation.JsonProperty;

/** A list of unstructured historical data for v1 compatibility. */
@Fluent
public final class History {
    /*
     * The raw v1 compatibility information
     */
    @JsonProperty(value = "v1Compatibility")
    private String v1Compatibility;

    /** Creates an instance of History class. */
    public History() {}

    /**
     * Get the v1Compatibility property: The raw v1 compatibility information.
     *
     * @return the v1Compatibility value.
     */
    public String getV1Compatibility() {
        return this.v1Compatibility;
    }

    /**
     * Set the v1Compatibility property: The raw v1 compatibility information.
     *
     * @param v1Compatibility the v1Compatibility value to set.
     * @return the History object itself.
     */
    public History setV1Compatibility(String v1Compatibility) {
        this.v1Compatibility = v1Compatibility;
        return this;
    }
}
