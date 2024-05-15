// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.security.generated;

import com.azure.core.credential.AccessToken;
import com.azure.core.http.HttpClient;
import com.azure.core.http.rest.PagedIterable;
import com.azure.core.management.AzureEnvironment;
import com.azure.core.management.profile.AzureProfile;
import com.azure.core.test.http.MockHttpResponse;
import com.azure.resourcemanager.security.SecurityManager;
import com.azure.resourcemanager.security.models.SecureScoreControlDefinitionItem;
import java.nio.charset.StandardCharsets;
import java.time.OffsetDateTime;
import org.junit.jupiter.api.Test;
import reactor.core.publisher.Mono;

public final class SecureScoreControlDefinitionsListBySubscriptionMockTests {
    @Test
    public void testListBySubscription() throws Exception {
        String responseStr
            = "{\"value\":[{\"properties\":{\"displayName\":\"ozffsobggvalcrq\",\"description\":\"lm\",\"maxScore\":618788438,\"source\":{\"sourceType\":\"BuiltIn\"},\"assessmentDefinitions\":[{\"id\":\"lplgtlayyxhxj\"},{\"id\":\"ys\"}]},\"id\":\"aqqjh\",\"name\":\"fhfaobqnjcsb\",\"type\":\"zvcdqws\"}]}";

        HttpClient httpClient
            = response -> Mono.just(new MockHttpResponse(response, 200, responseStr.getBytes(StandardCharsets.UTF_8)));
        SecurityManager manager = SecurityManager.configure()
            .withHttpClient(httpClient)
            .authenticate(tokenRequestContext -> Mono.just(new AccessToken("this_is_a_token", OffsetDateTime.MAX)),
                new AzureProfile("", "", AzureEnvironment.AZURE));

        PagedIterable<SecureScoreControlDefinitionItem> response
            = manager.secureScoreControlDefinitions().listBySubscription(com.azure.core.util.Context.NONE);

    }
}
