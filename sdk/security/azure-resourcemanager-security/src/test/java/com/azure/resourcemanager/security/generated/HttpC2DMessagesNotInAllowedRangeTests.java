// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.security.generated;

import com.azure.core.util.BinaryData;
import com.azure.resourcemanager.security.models.HttpC2DMessagesNotInAllowedRange;
import java.time.Duration;
import org.junit.jupiter.api.Assertions;

public final class HttpC2DMessagesNotInAllowedRangeTests {
    @org.junit.jupiter.api.Test
    public void testDeserialize() throws Exception {
        HttpC2DMessagesNotInAllowedRange model = BinaryData.fromString(
            "{\"ruleType\":\"HttpC2DMessagesNotInAllowedRange\",\"timeWindowSize\":\"PT182H20M58S\",\"minThreshold\":615230688,\"maxThreshold\":1304040,\"displayName\":\"iiqqcqikclsmalns\",\"description\":\"oykdno\",\"isEnabled\":false}")
            .toObject(HttpC2DMessagesNotInAllowedRange.class);
        Assertions.assertEquals(false, model.isEnabled());
        Assertions.assertEquals(615230688, model.minThreshold());
        Assertions.assertEquals(1304040, model.maxThreshold());
        Assertions.assertEquals(Duration.parse("PT182H20M58S"), model.timeWindowSize());
    }

    @org.junit.jupiter.api.Test
    public void testSerialize() throws Exception {
        HttpC2DMessagesNotInAllowedRange model = new HttpC2DMessagesNotInAllowedRange().withIsEnabled(false)
            .withMinThreshold(615230688)
            .withMaxThreshold(1304040)
            .withTimeWindowSize(Duration.parse("PT182H20M58S"));
        model = BinaryData.fromObject(model).toObject(HttpC2DMessagesNotInAllowedRange.class);
        Assertions.assertEquals(false, model.isEnabled());
        Assertions.assertEquals(615230688, model.minThreshold());
        Assertions.assertEquals(1304040, model.maxThreshold());
        Assertions.assertEquals(Duration.parse("PT182H20M58S"), model.timeWindowSize());
    }
}
