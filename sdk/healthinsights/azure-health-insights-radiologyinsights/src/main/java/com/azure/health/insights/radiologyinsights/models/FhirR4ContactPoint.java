// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) TypeSpec Code Generator.
package com.azure.health.insights.radiologyinsights.models;

import com.azure.core.annotation.Generated;
import com.azure.core.annotation.Immutable;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * Details for all kinds of technology mediated contact points for a person or organization, including telephone, email,
 * etc.
 * See https://www.hl7.org/fhir/R4/datatypes.html#ContactPoint.
 */
@Immutable
public final class FhirR4ContactPoint {

    /*
     * phone | fax | email | pager | url | sms | other
     */
    @Generated
    @JsonProperty(value = "system")
    private ContactPointSystem system;

    /*
     * The actual contact point details
     */
    @Generated
    @JsonProperty(value = "value")
    private String value;

    /*
     * home | work | temp | old | mobile - purpose of this contact point
     */
    @Generated
    @JsonProperty(value = "use")
    private ContactPointUse use;

    /*
     * Specify preferred order of use (1 = highest)
     */
    @Generated
    @JsonProperty(value = "rank")
    private Integer rank;

    /*
     * Time period when the contact point was/is in use
     */
    @Generated
    @JsonProperty(value = "period")
    private FhirR4Period period;

    /**
     * Creates an instance of FhirR4ContactPoint class.
     */
    @Generated
    private FhirR4ContactPoint() {
    }

    /**
     * Get the system property: phone | fax | email | pager | url | sms | other.
     *
     * @return the system value.
     */
    @Generated
    public ContactPointSystem getSystem() {
        return this.system;
    }

    /**
     * Get the value property: The actual contact point details.
     *
     * @return the value value.
     */
    @Generated
    public String getValue() {
        return this.value;
    }

    /**
     * Get the use property: home | work | temp | old | mobile - purpose of this contact point.
     *
     * @return the use value.
     */
    @Generated
    public ContactPointUse getUse() {
        return this.use;
    }

    /**
     * Get the rank property: Specify preferred order of use (1 = highest).
     *
     * @return the rank value.
     */
    @Generated
    public Integer getRank() {
        return this.rank;
    }

    /**
     * Get the period property: Time period when the contact point was/is in use.
     *
     * @return the period value.
     */
    @Generated
    public FhirR4Period getPeriod() {
        return this.period;
    }
}
