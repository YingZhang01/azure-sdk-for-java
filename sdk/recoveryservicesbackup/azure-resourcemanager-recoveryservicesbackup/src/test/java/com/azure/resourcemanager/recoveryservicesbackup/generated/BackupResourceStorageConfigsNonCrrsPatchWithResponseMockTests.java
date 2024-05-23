// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.recoveryservicesbackup.generated;

import com.azure.core.credential.AccessToken;
import com.azure.core.http.HttpClient;
import com.azure.core.management.AzureEnvironment;
import com.azure.core.management.profile.AzureProfile;
import com.azure.core.test.http.MockHttpResponse;
import com.azure.resourcemanager.recoveryservicesbackup.RecoveryServicesBackupManager;
import com.azure.resourcemanager.recoveryservicesbackup.fluent.models.BackupResourceConfigResourceInner;
import com.azure.resourcemanager.recoveryservicesbackup.models.BackupResourceConfig;
import com.azure.resourcemanager.recoveryservicesbackup.models.DedupState;
import com.azure.resourcemanager.recoveryservicesbackup.models.StorageType;
import com.azure.resourcemanager.recoveryservicesbackup.models.StorageTypeState;
import com.azure.resourcemanager.recoveryservicesbackup.models.XcoolState;
import java.nio.charset.StandardCharsets;
import java.time.OffsetDateTime;
import java.util.HashMap;
import java.util.Map;
import org.junit.jupiter.api.Test;
import reactor.core.publisher.Mono;

public final class BackupResourceStorageConfigsNonCrrsPatchWithResponseMockTests {
    @Test
    public void testPatchWithResponse() throws Exception {
        String responseStr = "{}";

        HttpClient httpClient
            = response -> Mono.just(new MockHttpResponse(response, 204, responseStr.getBytes(StandardCharsets.UTF_8)));
        RecoveryServicesBackupManager manager = RecoveryServicesBackupManager.configure()
            .withHttpClient(httpClient)
            .authenticate(tokenRequestContext -> Mono.just(new AccessToken("this_is_a_token", OffsetDateTime.MAX)),
                new AzureProfile("", "", AzureEnvironment.AZURE));

        manager.backupResourceStorageConfigsNonCrrs()
            .patchWithResponse("r", "jb",
                new BackupResourceConfigResourceInner().withLocation("v")
                    .withTags(mapOf("uliyslpkcv", "bwbqamt", "auxxepmyw", "w", "ijqpkzfbojxjmcs", "ormcqmic"))
                    .withProperties(new BackupResourceConfig().withStorageModelType(StorageType.ZONE_REDUNDANT)
                        .withStorageType(StorageType.LOCALLY_REDUNDANT)
                        .withStorageTypeState(StorageTypeState.LOCKED)
                        .withCrossRegionRestoreFlag(true)
                        .withDedupState(DedupState.ENABLED)
                        .withXcoolState(XcoolState.ENABLED))
                    .withEtag("w"),
                com.azure.core.util.Context.NONE);

    }

    // Use "Map.of" if available
    @SuppressWarnings("unchecked")
    private static <T> Map<String, T> mapOf(Object... inputs) {
        Map<String, T> map = new HashMap<>();
        for (int i = 0; i < inputs.length; i += 2) {
            String key = (String) inputs[i];
            T value = (T) inputs[i + 1];
            map.put(key, value);
        }
        return map;
    }
}
