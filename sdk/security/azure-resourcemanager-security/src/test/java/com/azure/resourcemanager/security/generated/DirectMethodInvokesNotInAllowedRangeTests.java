// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.security.generated;

import com.azure.core.util.BinaryData;
import com.azure.resourcemanager.security.models.DirectMethodInvokesNotInAllowedRange;
import java.time.Duration;
import org.junit.jupiter.api.Assertions;

public final class DirectMethodInvokesNotInAllowedRangeTests {
    @org.junit.jupiter.api.Test
    public void testDeserialize() throws Exception {
        DirectMethodInvokesNotInAllowedRange model = BinaryData.fromString(
            "{\"ruleType\":\"DirectMethodInvokesNotInAllowedRange\",\"timeWindowSize\":\"PT62H48M43S\",\"minThreshold\":1862685940,\"maxThreshold\":1297191670,\"displayName\":\"zf\",\"description\":\"il\",\"isEnabled\":true}")
            .toObject(DirectMethodInvokesNotInAllowedRange.class);
        Assertions.assertEquals(true, model.isEnabled());
        Assertions.assertEquals(1862685940, model.minThreshold());
        Assertions.assertEquals(1297191670, model.maxThreshold());
        Assertions.assertEquals(Duration.parse("PT62H48M43S"), model.timeWindowSize());
    }

    @org.junit.jupiter.api.Test
    public void testSerialize() throws Exception {
        DirectMethodInvokesNotInAllowedRange model = new DirectMethodInvokesNotInAllowedRange().withIsEnabled(true)
            .withMinThreshold(1862685940)
            .withMaxThreshold(1297191670)
            .withTimeWindowSize(Duration.parse("PT62H48M43S"));
        model = BinaryData.fromObject(model).toObject(DirectMethodInvokesNotInAllowedRange.class);
        Assertions.assertEquals(true, model.isEnabled());
        Assertions.assertEquals(1862685940, model.minThreshold());
        Assertions.assertEquals(1297191670, model.maxThreshold());
        Assertions.assertEquals(Duration.parse("PT62H48M43S"), model.timeWindowSize());
    }
}
