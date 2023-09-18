// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.iothub.generated;

import com.azure.resourcemanager.iothub.models.FailoverInput;

/** Samples for IotHub ManualFailover. */
public final class IotHubManualFailoverSamples {
    /*
     * x-ms-original-file: specification/iothub/resource-manager/Microsoft.Devices/preview/2023-06-30-preview/examples/IotHub_ManualFailover.json
     */
    /**
     * Sample code: IotHub_ManualFailover.
     *
     * @param manager Entry point to IotHubManager.
     */
    public static void iotHubManualFailover(com.azure.resourcemanager.iothub.IotHubManager manager) {
        manager
            .iotHubs()
            .manualFailover(
                "testHub",
                "myResourceGroup",
                new FailoverInput().withFailoverRegion("testHub"),
                com.azure.core.util.Context.NONE);
    }
}
