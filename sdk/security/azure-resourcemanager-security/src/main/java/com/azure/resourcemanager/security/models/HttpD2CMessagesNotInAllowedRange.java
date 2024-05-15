// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.security.models;

import com.azure.core.annotation.Fluent;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonTypeId;
import com.fasterxml.jackson.annotation.JsonTypeInfo;
import com.fasterxml.jackson.annotation.JsonTypeName;
import java.time.Duration;

/**
 * Number of device to cloud messages (HTTP protocol) is not in allowed range.
 */
@JsonTypeInfo(
    use = JsonTypeInfo.Id.NAME,
    property = "ruleType",
    defaultImpl = HttpD2CMessagesNotInAllowedRange.class,
    visible = true)
@JsonTypeName("HttpD2CMessagesNotInAllowedRange")
@Fluent
public final class HttpD2CMessagesNotInAllowedRange extends TimeWindowCustomAlertRule {
    /*
     * The type of the custom alert rule.
     */
    @JsonTypeId
    @JsonProperty(value = "ruleType", required = true)
    private String ruleType = "HttpD2CMessagesNotInAllowedRange";

    /**
     * Creates an instance of HttpD2CMessagesNotInAllowedRange class.
     */
    public HttpD2CMessagesNotInAllowedRange() {
    }

    /**
     * Get the ruleType property: The type of the custom alert rule.
     * 
     * @return the ruleType value.
     */
    @Override
    public String ruleType() {
        return this.ruleType;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public HttpD2CMessagesNotInAllowedRange withTimeWindowSize(Duration timeWindowSize) {
        super.withTimeWindowSize(timeWindowSize);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public HttpD2CMessagesNotInAllowedRange withMinThreshold(int minThreshold) {
        super.withMinThreshold(minThreshold);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public HttpD2CMessagesNotInAllowedRange withMaxThreshold(int maxThreshold) {
        super.withMaxThreshold(maxThreshold);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public HttpD2CMessagesNotInAllowedRange withIsEnabled(boolean isEnabled) {
        super.withIsEnabled(isEnabled);
        return this;
    }

    /**
     * Validates the instance.
     * 
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    @Override
    public void validate() {
        super.validate();
    }
}
