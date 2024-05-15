// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.security.generated;

import com.azure.core.credential.AccessToken;
import com.azure.core.http.HttpClient;
import com.azure.core.management.AzureEnvironment;
import com.azure.core.management.profile.AzureProfile;
import com.azure.core.test.http.MockHttpResponse;
import com.azure.resourcemanager.security.SecurityManager;
import com.azure.resourcemanager.security.models.GetSensitivitySettingsResponse;
import com.azure.resourcemanager.security.models.MipIntegrationStatus;
import java.nio.charset.StandardCharsets;
import java.time.OffsetDateTime;
import java.util.UUID;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import reactor.core.publisher.Mono;

public final class SensitivitySettingsGetWithResponseMockTests {
    @Test
    public void testGetWithResponse() throws Exception {
        String responseStr
            = "{\"properties\":{\"sensitiveInfoTypesIds\":[\"144e7990-0ef7-4ba9-9299-bcaccd8254a4\",\"daca6080-7f01-4fa7-8c27-f1fc3c437d08\",\"eb3a3505-99bd-4357-89b7-aa0f95858588\",\"f2f43458-ae38-485b-8903-a74d2492fe7f\"],\"sensitivityThresholdLabelOrder\":53.555878,\"sensitivityThresholdLabelId\":\"228a756f-c44f-4426-9d2d-82e38481893c\",\"mipInformation\":{\"mipIntegrationStatus\":\"Ok\",\"labels\":[{\"name\":\"hawkmibuydwi\",\"id\":\"d37cff5e-4d6f-4942-bd88-3483eafa42b6\",\"order\":39.98521},{\"name\":\"updyttqm\",\"id\":\"163fa2c4-e27e-47c9-b1bf-4dedf55179d6\",\"order\":51.10358},{\"name\":\"l\",\"id\":\"eaf32cb4-57d4-4984-aed3-a374c0963f82\",\"order\":52.05425}],\"customInfoTypes\":[{\"name\":\"tuqmtxynoflqob\",\"id\":\"a61d45f8-fae8-4546-9a2d-5bfad7b3985e\",\"description\":\"ngxebihexhnk\"},{\"name\":\"giqcdolrpg\",\"id\":\"cc03b270-b1cc-43f8-a2d4-fe59bd0f548e\",\"description\":\"jlbsmndafbncuyj\"},{\"name\":\"kcnhpplzhc\",\"id\":\"6d01f10b-4079-4e80-8393-387b3b67ff59\",\"description\":\"jziuucrlnewnuwk\"}],\"builtInInfoTypes\":[{\"name\":\"et\",\"id\":\"02fdaefe-79b3-4f63-97b3-866eba7353d1\",\"type\":\"dyxzlvwywjvr\"},{\"name\":\"qpwwlzpddarc\",\"id\":\"a027469b-214c-4084-90d4-6e681ad6afe9\",\"type\":\"whslxebaja\"},{\"name\":\"n\",\"id\":\"68f918d8-e6d5-4511-8230-5e3c8dbdb06d\",\"type\":\"bd\"}]}},\"id\":\"prwkampyhw\",\"name\":\"bldz\",\"type\":\"iudrcycmwhuzym\"}";

        HttpClient httpClient
            = response -> Mono.just(new MockHttpResponse(response, 200, responseStr.getBytes(StandardCharsets.UTF_8)));
        SecurityManager manager = SecurityManager.configure()
            .withHttpClient(httpClient)
            .authenticate(tokenRequestContext -> Mono.just(new AccessToken("this_is_a_token", OffsetDateTime.MAX)),
                new AzureProfile("", "", AzureEnvironment.AZURE));

        GetSensitivitySettingsResponse response
            = manager.sensitivitySettings().getWithResponse(com.azure.core.util.Context.NONE).getValue();

        Assertions.assertEquals(UUID.fromString("144e7990-0ef7-4ba9-9299-bcaccd8254a4"),
            response.properties().sensitiveInfoTypesIds().get(0));
        Assertions.assertEquals(53.555878F, response.properties().sensitivityThresholdLabelOrder());
        Assertions.assertEquals(UUID.fromString("228a756f-c44f-4426-9d2d-82e38481893c"),
            response.properties().sensitivityThresholdLabelId());
        Assertions.assertEquals(MipIntegrationStatus.OK, response.properties().mipInformation().mipIntegrationStatus());
        Assertions.assertEquals("hawkmibuydwi", response.properties().mipInformation().labels().get(0).name());
        Assertions.assertEquals(UUID.fromString("d37cff5e-4d6f-4942-bd88-3483eafa42b6"),
            response.properties().mipInformation().labels().get(0).id());
        Assertions.assertEquals(39.98521F, response.properties().mipInformation().labels().get(0).order());
        Assertions.assertEquals("tuqmtxynoflqob",
            response.properties().mipInformation().customInfoTypes().get(0).name());
        Assertions.assertEquals(UUID.fromString("a61d45f8-fae8-4546-9a2d-5bfad7b3985e"),
            response.properties().mipInformation().customInfoTypes().get(0).id());
        Assertions.assertEquals("ngxebihexhnk",
            response.properties().mipInformation().customInfoTypes().get(0).description());
        Assertions.assertEquals("et", response.properties().mipInformation().builtInInfoTypes().get(0).name());
        Assertions.assertEquals(UUID.fromString("02fdaefe-79b3-4f63-97b3-866eba7353d1"),
            response.properties().mipInformation().builtInInfoTypes().get(0).id());
        Assertions.assertEquals("dyxzlvwywjvr",
            response.properties().mipInformation().builtInInfoTypes().get(0).type());
    }
}
