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
import com.azure.resourcemanager.security.models.ApiCollection;
import java.nio.charset.StandardCharsets;
import java.time.OffsetDateTime;
import org.junit.jupiter.api.Test;
import reactor.core.publisher.Mono;

public final class ApiCollectionsListMockTests {
    @Test
    public void testList() throws Exception {
        String responseStr
            = "{\"value\":[{\"properties\":{\"provisioningState\":\"Failed\",\"displayName\":\"ukcdnzoxlabu\",\"discoveredVia\":\"wgb\",\"baseUrl\":\"shramqsug\",\"numberOfApiEndpoints\":474194474343004572,\"numberOfInactiveApiEndpoints\":6450382047119735361,\"numberOfUnauthenticatedApiEndpoints\":402193133565784550,\"numberOfExternalApiEndpoints\":3198683634175463198,\"numberOfApiEndpointsWithSensitiveDataExposed\":2808182827699502301,\"sensitivityLabel\":\"uuagwayfmcer\"},\"id\":\"xfei\",\"name\":\"basthz\",\"type\":\"jipssvnonijcq\"}]}";

        HttpClient httpClient
            = response -> Mono.just(new MockHttpResponse(response, 200, responseStr.getBytes(StandardCharsets.UTF_8)));
        SecurityManager manager = SecurityManager.configure()
            .withHttpClient(httpClient)
            .authenticate(tokenRequestContext -> Mono.just(new AccessToken("this_is_a_token", OffsetDateTime.MAX)),
                new AzureProfile("", "", AzureEnvironment.AZURE));

        PagedIterable<ApiCollection> response = manager.apiCollections().list(com.azure.core.util.Context.NONE);

    }
}
