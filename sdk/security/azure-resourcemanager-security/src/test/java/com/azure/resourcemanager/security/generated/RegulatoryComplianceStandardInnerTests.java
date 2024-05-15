// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.security.generated;

import com.azure.core.util.BinaryData;
import com.azure.resourcemanager.security.fluent.models.RegulatoryComplianceStandardInner;
import com.azure.resourcemanager.security.models.State;
import org.junit.jupiter.api.Assertions;

public final class RegulatoryComplianceStandardInnerTests {
    @org.junit.jupiter.api.Test
    public void testDeserialize() throws Exception {
        RegulatoryComplianceStandardInner model = BinaryData.fromString(
            "{\"properties\":{\"state\":\"Failed\",\"passedControls\":82509516,\"failedControls\":567050301,\"skippedControls\":435564330,\"unsupportedControls\":1613065996},\"id\":\"lmoyrx\",\"name\":\"wfudwpzntxhdzhl\",\"type\":\"qj\"}")
            .toObject(RegulatoryComplianceStandardInner.class);
        Assertions.assertEquals(State.FAILED, model.state());
    }

    @org.junit.jupiter.api.Test
    public void testSerialize() throws Exception {
        RegulatoryComplianceStandardInner model = new RegulatoryComplianceStandardInner().withState(State.FAILED);
        model = BinaryData.fromObject(model).toObject(RegulatoryComplianceStandardInner.class);
        Assertions.assertEquals(State.FAILED, model.state());
    }
}
