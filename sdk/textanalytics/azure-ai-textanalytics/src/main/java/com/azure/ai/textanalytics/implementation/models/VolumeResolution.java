// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.ai.textanalytics.implementation.models;

import com.azure.core.annotation.Fluent;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonTypeInfo;
import com.fasterxml.jackson.annotation.JsonTypeName;

/** Represents the volume entity resolution model. */
@JsonTypeInfo(use = JsonTypeInfo.Id.NAME, include = JsonTypeInfo.As.PROPERTY, property = "resolutionKind")
@JsonTypeName("VolumeResolution")
@Fluent
public final class VolumeResolution extends BaseResolution {
    /*
     * The Volume Unit of measurement
     */
    @JsonProperty(value = "unit", required = true)
    private VolumeUnit unit;

    /*
     * The numeric value that the extracted text denotes.
     */
    @JsonProperty(value = "value", required = true)
    private double value;

    /** Creates an instance of VolumeResolution class. */
    public VolumeResolution() {}

    /**
     * Get the unit property: The Volume Unit of measurement.
     *
     * @return the unit value.
     */
    public VolumeUnit getUnit() {
        return this.unit;
    }

    /**
     * Set the unit property: The Volume Unit of measurement.
     *
     * @param unit the unit value to set.
     * @return the VolumeResolution object itself.
     */
    public VolumeResolution setUnit(VolumeUnit unit) {
        this.unit = unit;
        return this;
    }

    /**
     * Get the value property: The numeric value that the extracted text denotes.
     *
     * @return the value value.
     */
    public double getValue() {
        return this.value;
    }

    /**
     * Set the value property: The numeric value that the extracted text denotes.
     *
     * @param value the value value to set.
     * @return the VolumeResolution object itself.
     */
    public VolumeResolution setValue(double value) {
        this.value = value;
        return this;
    }
}
