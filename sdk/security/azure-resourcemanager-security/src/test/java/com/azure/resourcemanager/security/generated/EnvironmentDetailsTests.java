// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.security.generated;

import com.azure.core.util.BinaryData;
import com.azure.resourcemanager.security.models.EnvironmentDetails;
import org.junit.jupiter.api.Assertions;

public final class EnvironmentDetailsTests {
    @org.junit.jupiter.api.Test
    public void testDeserialize() throws Exception {
        EnvironmentDetails model = BinaryData.fromString(
            "{\"nativeResourceId\":\"vyklxuby\",\"environmentHierarchyId\":\"ff\",\"organizationalHierarchyId\":\"fblcq\",\"subscriptionId\":\"ubgq\",\"tenantId\":\"rtalmet\"}")
            .toObject(EnvironmentDetails.class);
        Assertions.assertEquals("vyklxuby", model.nativeResourceId());
        Assertions.assertEquals("ff", model.environmentHierarchyId());
        Assertions.assertEquals("fblcq", model.organizationalHierarchyId());
        Assertions.assertEquals("ubgq", model.subscriptionId());
        Assertions.assertEquals("rtalmet", model.tenantId());
    }

    @org.junit.jupiter.api.Test
    public void testSerialize() throws Exception {
        EnvironmentDetails model = new EnvironmentDetails().withNativeResourceId("vyklxuby")
            .withEnvironmentHierarchyId("ff")
            .withOrganizationalHierarchyId("fblcq")
            .withSubscriptionId("ubgq")
            .withTenantId("rtalmet");
        model = BinaryData.fromObject(model).toObject(EnvironmentDetails.class);
        Assertions.assertEquals("vyklxuby", model.nativeResourceId());
        Assertions.assertEquals("ff", model.environmentHierarchyId());
        Assertions.assertEquals("fblcq", model.organizationalHierarchyId());
        Assertions.assertEquals("ubgq", model.subscriptionId());
        Assertions.assertEquals("rtalmet", model.tenantId());
    }
}
