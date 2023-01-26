// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.ai.textanalytics.implementation.models;

import com.azure.core.annotation.Fluent;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonTypeInfo;
import com.fasterxml.jackson.annotation.JsonTypeName;

/** A resolution for numeric entity instances. */
@JsonTypeInfo(use = JsonTypeInfo.Id.NAME, include = JsonTypeInfo.As.PROPERTY, property = "resolutionKind")
@JsonTypeName("NumberResolution")
@Fluent
public final class NumberResolution extends BaseResolution {
    /*
     * The type of the extracted number entity.
     */
    @JsonProperty(value = "numberKind", required = true)
    private NumberKind numberKind;

    /*
     * A numeric representation of what the extracted text denotes.
     */
    @JsonProperty(value = "value", required = true)
    private double value;

    /** Creates an instance of NumberResolution class. */
    public NumberResolution() {}

    /**
     * Get the numberKind property: The type of the extracted number entity.
     *
     * @return the numberKind value.
     */
    public NumberKind getNumberKind() {
        return this.numberKind;
    }

    /**
     * Set the numberKind property: The type of the extracted number entity.
     *
     * @param numberKind the numberKind value to set.
     * @return the NumberResolution object itself.
     */
    public NumberResolution setNumberKind(NumberKind numberKind) {
        this.numberKind = numberKind;
        return this;
    }

    /**
     * Get the value property: A numeric representation of what the extracted text denotes.
     *
     * @return the value value.
     */
    public double getValue() {
        return this.value;
    }

    /**
     * Set the value property: A numeric representation of what the extracted text denotes.
     *
     * @param value the value value to set.
     * @return the NumberResolution object itself.
     */
    public NumberResolution setValue(double value) {
        this.value = value;
        return this;
    }
}
