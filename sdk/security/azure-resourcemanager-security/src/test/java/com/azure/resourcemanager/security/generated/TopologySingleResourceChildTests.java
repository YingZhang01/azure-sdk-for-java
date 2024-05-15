// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.security.generated;

import com.azure.core.util.BinaryData;
import com.azure.resourcemanager.security.models.TopologySingleResourceChild;

public final class TopologySingleResourceChildTests {
    @org.junit.jupiter.api.Test
    public void testDeserialize() throws Exception {
        TopologySingleResourceChild model
            = BinaryData.fromString("{\"resourceId\":\"ehpphthdklmveta\"}").toObject(TopologySingleResourceChild.class);
    }

    @org.junit.jupiter.api.Test
    public void testSerialize() throws Exception {
        TopologySingleResourceChild model = new TopologySingleResourceChild();
        model = BinaryData.fromObject(model).toObject(TopologySingleResourceChild.class);
    }
}
