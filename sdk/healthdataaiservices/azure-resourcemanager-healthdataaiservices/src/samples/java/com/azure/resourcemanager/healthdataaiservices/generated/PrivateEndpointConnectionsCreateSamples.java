// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) TypeSpec Code Generator.

package com.azure.resourcemanager.healthdataaiservices.generated;

import com.azure.resourcemanager.healthdataaiservices.models.PrivateEndpoint;
import com.azure.resourcemanager.healthdataaiservices.models.PrivateEndpointConnectionProperties;
import com.azure.resourcemanager.healthdataaiservices.models.PrivateEndpointServiceConnectionStatus;
import com.azure.resourcemanager.healthdataaiservices.models.PrivateLinkServiceConnectionState;

/**
 * Samples for PrivateEndpointConnections Create.
 */
public final class PrivateEndpointConnectionsCreateSamples {
    /*
     * x-ms-original-file: 2024-02-28-preview/PrivateEndpointConnections_Create_MaximumSet_Gen.json
     */
    /**
     * Sample code: PrivateEndpointConnections_Create - generated by [MaximumSet] rule - generated by [MaximumSet] rule.
     * 
     * @param manager Entry point to HealthDataAIServicesManager.
     */
    public static void privateEndpointConnectionsCreateGeneratedByMaximumSetRuleGeneratedByMaximumSetRule(
        com.azure.resourcemanager.healthdataaiservices.HealthDataAIServicesManager manager) {
        manager.privateEndpointConnections()
            .define("kgwgrrpabvrsrrvpcgcnfmyfgyrl")
            .withExistingDeidService("rgopenapi", "deidTest")
            .withProperties(
                new PrivateEndpointConnectionProperties().withPrivateEndpoint(new PrivateEndpoint())
                    .withPrivateLinkServiceConnectionState(new PrivateLinkServiceConnectionState()
                        .withStatus(PrivateEndpointServiceConnectionStatus.PENDING)
                        .withDescription("xr")
                        .withActionsRequired("ulb")))
            .create();
    }
}
