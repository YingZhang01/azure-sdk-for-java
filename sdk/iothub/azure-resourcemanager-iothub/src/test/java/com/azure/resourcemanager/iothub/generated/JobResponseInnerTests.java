// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.iothub.generated;

import com.azure.core.util.BinaryData;
import com.azure.resourcemanager.iothub.fluent.models.JobResponseInner;

public final class JobResponseInnerTests {
    @org.junit.jupiter.api.Test
    public void testDeserialize() throws Exception {
        JobResponseInner model =
            BinaryData
                .fromString(
                    "{\"jobId\":\"bxwyjsflhhcaa\",\"startTimeUtc\":\"Fri, 06 Aug 2021 05:51:03"
                        + " GMT\",\"endTimeUtc\":\"Thu, 25 Mar 2021 19:19:56"
                        + " GMT\",\"type\":\"updateDeviceConfiguration\",\"status\":\"enqueued\",\"failureReason\":\"wjo\",\"statusMessage\":\"qcslyjpkiid\",\"parentJobId\":\"exznelixhnr\"}")
                .toObject(JobResponseInner.class);
    }

    @org.junit.jupiter.api.Test
    public void testSerialize() throws Exception {
        JobResponseInner model = new JobResponseInner();
        model = BinaryData.fromObject(model).toObject(JobResponseInner.class);
    }
}
