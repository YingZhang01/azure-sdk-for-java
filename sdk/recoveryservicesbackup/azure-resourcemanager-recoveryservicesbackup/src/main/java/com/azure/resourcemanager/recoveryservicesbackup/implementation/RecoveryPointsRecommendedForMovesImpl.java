// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.recoveryservicesbackup.implementation;

import com.azure.core.http.rest.PagedIterable;
import com.azure.core.util.Context;
import com.azure.core.util.logging.ClientLogger;
import com.azure.resourcemanager.recoveryservicesbackup.fluent.RecoveryPointsRecommendedForMovesClient;
import com.azure.resourcemanager.recoveryservicesbackup.fluent.models.RecoveryPointResourceInner;
import com.azure.resourcemanager.recoveryservicesbackup.models.ListRecoveryPointsRecommendedForMoveRequest;
import com.azure.resourcemanager.recoveryservicesbackup.models.RecoveryPointResource;
import com.azure.resourcemanager.recoveryservicesbackup.models.RecoveryPointsRecommendedForMoves;

public final class RecoveryPointsRecommendedForMovesImpl implements RecoveryPointsRecommendedForMoves {
    private static final ClientLogger LOGGER = new ClientLogger(RecoveryPointsRecommendedForMovesImpl.class);

    private final RecoveryPointsRecommendedForMovesClient innerClient;

    private final com.azure.resourcemanager.recoveryservicesbackup.RecoveryServicesBackupManager serviceManager;

    public RecoveryPointsRecommendedForMovesImpl(RecoveryPointsRecommendedForMovesClient innerClient,
        com.azure.resourcemanager.recoveryservicesbackup.RecoveryServicesBackupManager serviceManager) {
        this.innerClient = innerClient;
        this.serviceManager = serviceManager;
    }

    public PagedIterable<RecoveryPointResource> list(String vaultName, String resourceGroupName, String fabricName,
        String containerName, String protectedItemName, ListRecoveryPointsRecommendedForMoveRequest parameters) {
        PagedIterable<RecoveryPointResourceInner> inner = this.serviceClient()
            .list(vaultName, resourceGroupName, fabricName, containerName, protectedItemName, parameters);
        return ResourceManagerUtils.mapPage(inner, inner1 -> new RecoveryPointResourceImpl(inner1, this.manager()));
    }

    public PagedIterable<RecoveryPointResource> list(String vaultName, String resourceGroupName, String fabricName,
        String containerName, String protectedItemName, ListRecoveryPointsRecommendedForMoveRequest parameters,
        Context context) {
        PagedIterable<RecoveryPointResourceInner> inner = this.serviceClient()
            .list(vaultName, resourceGroupName, fabricName, containerName, protectedItemName, parameters, context);
        return ResourceManagerUtils.mapPage(inner, inner1 -> new RecoveryPointResourceImpl(inner1, this.manager()));
    }

    private RecoveryPointsRecommendedForMovesClient serviceClient() {
        return this.innerClient;
    }

    private com.azure.resourcemanager.recoveryservicesbackup.RecoveryServicesBackupManager manager() {
        return this.serviceManager;
    }
}
