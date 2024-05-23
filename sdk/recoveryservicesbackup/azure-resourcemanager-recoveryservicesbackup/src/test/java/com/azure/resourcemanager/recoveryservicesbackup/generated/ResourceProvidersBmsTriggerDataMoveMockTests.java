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
import com.azure.resourcemanager.recoveryservicesbackup.models.DataMoveLevel;
import com.azure.resourcemanager.recoveryservicesbackup.models.TriggerDataMoveRequest;
import java.nio.charset.StandardCharsets;
import java.time.OffsetDateTime;
import java.util.Arrays;
import org.junit.jupiter.api.Test;
import reactor.core.publisher.Mono;

public final class ResourceProvidersBmsTriggerDataMoveMockTests {
    @Test
    public void testBmsTriggerDataMove() throws Exception {
        String responseStr = "{}";

        HttpClient httpClient
            = response -> Mono.just(new MockHttpResponse(response, 200, responseStr.getBytes(StandardCharsets.UTF_8)));
        RecoveryServicesBackupManager manager = RecoveryServicesBackupManager.configure()
            .withHttpClient(httpClient)
            .authenticate(tokenRequestContext -> Mono.just(new AccessToken("this_is_a_token", OffsetDateTime.MAX)),
                new AzureProfile("", "", AzureEnvironment.AZURE));

        manager.resourceProviders()
            .bmsTriggerDataMove("k", "clwzacnmwpfsu",
                new TriggerDataMoveRequest().withSourceResourceId("t")
                    .withSourceRegion("azyqbxyxoyfp")
                    .withDataMoveLevel(DataMoveLevel.CONTAINER)
                    .withCorrelationId("qi")
                    .withSourceContainerArmIds(Arrays.asList("xlhdj", "qdcadwvps", "zjiihjr", "ybmrzoepnxwd"))
                    .withPauseGC(true),
                com.azure.core.util.Context.NONE);

    }
}
