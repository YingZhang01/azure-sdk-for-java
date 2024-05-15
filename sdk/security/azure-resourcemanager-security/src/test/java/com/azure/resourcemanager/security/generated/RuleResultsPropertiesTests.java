// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.security.generated;

import com.azure.core.util.BinaryData;
import com.azure.resourcemanager.security.models.RuleResultsProperties;
import java.util.Arrays;
import org.junit.jupiter.api.Assertions;

public final class RuleResultsPropertiesTests {
    @org.junit.jupiter.api.Test
    public void testDeserialize() throws Exception {
        RuleResultsProperties model
            = BinaryData.fromString("{\"results\":[[\"byrcdlbhshfwp\"]]}").toObject(RuleResultsProperties.class);
        Assertions.assertEquals("byrcdlbhshfwp", model.results().get(0).get(0));
    }

    @org.junit.jupiter.api.Test
    public void testSerialize() throws Exception {
        RuleResultsProperties model
            = new RuleResultsProperties().withResults(Arrays.asList(Arrays.asList("byrcdlbhshfwp")));
        model = BinaryData.fromObject(model).toObject(RuleResultsProperties.class);
        Assertions.assertEquals("byrcdlbhshfwp", model.results().get(0).get(0));
    }
}
