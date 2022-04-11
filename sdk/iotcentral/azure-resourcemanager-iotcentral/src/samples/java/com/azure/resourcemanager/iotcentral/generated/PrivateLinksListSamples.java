// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.iotcentral.generated;

import com.azure.core.util.Context;

/** Samples for PrivateLinks List. */
public final class PrivateLinksListSamples {
    /*
     * x-ms-original-file: specification/iotcentral/resource-manager/Microsoft.IoTCentral/preview/2021-11-01-preview/examples/PrivateLinks_List.json
     */
    /**
     * Sample code: PrivateLinks_List.
     *
     * @param manager Entry point to IotCentralManager.
     */
    public static void privateLinksList(com.azure.resourcemanager.iotcentral.IotCentralManager manager) {
        manager.privateLinks().list("resRg", "myIoTCentralApp", Context.NONE);
    }
}
