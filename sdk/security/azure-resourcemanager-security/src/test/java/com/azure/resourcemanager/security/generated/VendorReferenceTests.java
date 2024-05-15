// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.security.generated;

import com.azure.core.util.BinaryData;
import com.azure.resourcemanager.security.models.VendorReference;

public final class VendorReferenceTests {
    @org.junit.jupiter.api.Test
    public void testDeserialize() throws Exception {
        VendorReference model = BinaryData.fromString("{\"title\":\"fculzjrmhpfyw\",\"link\":\"ldqpzf\"}")
            .toObject(VendorReference.class);
    }

    @org.junit.jupiter.api.Test
    public void testSerialize() throws Exception {
        VendorReference model = new VendorReference();
        model = BinaryData.fromObject(model).toObject(VendorReference.class);
    }
}
