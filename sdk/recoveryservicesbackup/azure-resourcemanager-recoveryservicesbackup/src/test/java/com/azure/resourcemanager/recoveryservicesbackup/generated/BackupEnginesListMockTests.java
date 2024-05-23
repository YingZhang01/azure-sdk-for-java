// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.recoveryservicesbackup.generated;

import com.azure.core.credential.AccessToken;
import com.azure.core.http.HttpClient;
import com.azure.core.http.rest.PagedIterable;
import com.azure.core.management.AzureEnvironment;
import com.azure.core.management.profile.AzureProfile;
import com.azure.core.test.http.MockHttpResponse;
import com.azure.resourcemanager.recoveryservicesbackup.RecoveryServicesBackupManager;
import com.azure.resourcemanager.recoveryservicesbackup.models.BackupEngineBaseResource;
import com.azure.resourcemanager.recoveryservicesbackup.models.BackupManagementType;
import java.nio.charset.StandardCharsets;
import java.time.OffsetDateTime;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import reactor.core.publisher.Mono;

public final class BackupEnginesListMockTests {
    @Test
    public void testList() throws Exception {
        String responseStr
            = "{\"value\":[{\"properties\":{\"backupEngineType\":\"BackupEngineBase\",\"friendlyName\":\"bwxgoooxzpra\",\"backupManagementType\":\"DefaultBackup\",\"registrationStatus\":\"xknpdgz\",\"backupEngineState\":\"jsugswhgs\",\"healthStatus\":\"dkwwn\",\"canReRegister\":false,\"backupEngineId\":\"ctohzhaquvwsxbgn\",\"dpmVersion\":\"ervqchoadhrsxqvz\",\"azureBackupAgentVersion\":\"pabdsrg\",\"isAzureBackupAgentUpgradeAvailable\":true,\"isDpmUpgradeAvailable\":false,\"extendedInfo\":{\"databaseName\":\"subklr\",\"protectedItemsCount\":1397650583,\"protectedServersCount\":601653470,\"diskCount\":1816417082,\"usedDiskSpace\":84.32223243327167,\"availableDiskSpace\":14.897106796206582,\"refreshedAt\":\"2021-11-13T22:31:32Z\",\"azureProtectedInstances\":653737620}},\"eTag\":\"qkwaruwd\",\"location\":\"vqzxoebwg\",\"tags\":{\"upwtz\":\"ibanb\",\"ozkxbzrpejplss\":\"pak\"},\"id\":\"nbtttkgsuxu\",\"name\":\"rswgkpjhboyikeb\",\"type\":\"uhkslg\"}]}";

        HttpClient httpClient
            = response -> Mono.just(new MockHttpResponse(response, 200, responseStr.getBytes(StandardCharsets.UTF_8)));
        RecoveryServicesBackupManager manager = RecoveryServicesBackupManager.configure()
            .withHttpClient(httpClient)
            .authenticate(tokenRequestContext -> Mono.just(new AccessToken("this_is_a_token", OffsetDateTime.MAX)),
                new AzureProfile("", "", AzureEnvironment.AZURE));

        PagedIterable<BackupEngineBaseResource> response = manager.backupEngines()
            .list("zduewihapfjii", "njdiqfliejhpcl", "iedfsbwcei", "bv", com.azure.core.util.Context.NONE);

        Assertions.assertEquals("vqzxoebwg", response.iterator().next().location());
        Assertions.assertEquals("ibanb", response.iterator().next().tags().get("upwtz"));
        Assertions.assertEquals("bwxgoooxzpra", response.iterator().next().properties().friendlyName());
        Assertions.assertEquals(BackupManagementType.DEFAULT_BACKUP,
            response.iterator().next().properties().backupManagementType());
        Assertions.assertEquals("xknpdgz", response.iterator().next().properties().registrationStatus());
        Assertions.assertEquals("jsugswhgs", response.iterator().next().properties().backupEngineState());
        Assertions.assertEquals("dkwwn", response.iterator().next().properties().healthStatus());
        Assertions.assertEquals(false, response.iterator().next().properties().canReRegister());
        Assertions.assertEquals("ctohzhaquvwsxbgn", response.iterator().next().properties().backupEngineId());
        Assertions.assertEquals("ervqchoadhrsxqvz", response.iterator().next().properties().dpmVersion());
        Assertions.assertEquals("pabdsrg", response.iterator().next().properties().azureBackupAgentVersion());
        Assertions.assertEquals(true, response.iterator().next().properties().isAzureBackupAgentUpgradeAvailable());
        Assertions.assertEquals(false, response.iterator().next().properties().isDpmUpgradeAvailable());
        Assertions.assertEquals("subklr", response.iterator().next().properties().extendedInfo().databaseName());
        Assertions.assertEquals(1397650583,
            response.iterator().next().properties().extendedInfo().protectedItemsCount());
        Assertions.assertEquals(601653470,
            response.iterator().next().properties().extendedInfo().protectedServersCount());
        Assertions.assertEquals(1816417082, response.iterator().next().properties().extendedInfo().diskCount());
        Assertions.assertEquals(84.32223243327167D,
            response.iterator().next().properties().extendedInfo().usedDiskSpace());
        Assertions.assertEquals(14.897106796206582D,
            response.iterator().next().properties().extendedInfo().availableDiskSpace());
        Assertions.assertEquals(OffsetDateTime.parse("2021-11-13T22:31:32Z"),
            response.iterator().next().properties().extendedInfo().refreshedAt());
        Assertions.assertEquals(653737620,
            response.iterator().next().properties().extendedInfo().azureProtectedInstances());
        Assertions.assertEquals("qkwaruwd", response.iterator().next().etag());
    }
}
