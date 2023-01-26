// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.ai.textanalytics.implementation.models;

import com.azure.core.annotation.Fluent;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonTypeInfo;
import com.fasterxml.jackson.annotation.JsonTypeName;

/** Represents the information (data) entity resolution model. */
@JsonTypeInfo(use = JsonTypeInfo.Id.NAME, include = JsonTypeInfo.As.PROPERTY, property = "resolutionKind")
@JsonTypeName("InformationResolution")
@Fluent
public final class InformationResolution extends BaseResolution {
    /*
     * The information (data) Unit of measurement.
     */
    @JsonProperty(value = "unit", required = true)
    private InformationUnit unit;

    /*
     * The numeric value that the extracted text denotes.
     */
    @JsonProperty(value = "value", required = true)
    private double value;

    /** Creates an instance of InformationResolution class. */
    public InformationResolution() {}

    /**
     * Get the unit property: The information (data) Unit of measurement.
     *
     * @return the unit value.
     */
    public InformationUnit getUnit() {
        return this.unit;
    }

    /**
     * Set the unit property: The information (data) Unit of measurement.
     *
     * @param unit the unit value to set.
     * @return the InformationResolution object itself.
     */
    public InformationResolution setUnit(InformationUnit unit) {
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
     * @return the InformationResolution object itself.
     */
    public InformationResolution setValue(double value) {
        this.value = value;
        return this;
    }
}
