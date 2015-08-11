// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License. See License.txt in the project root for
// license information.
// 
// Code generated by Microsoft (R) AutoRest Code Generator 0.11.0.0
// Changes may cause incorrect behavior and will be lost if the code is
// regenerated.


package fixtures.bodyarray;

import com.microsoft.rest.ServiceClient;
import com.squareup.okhttp.OkHttpClient;
import retrofit.RestAdapter;

/**
 * Initializes a new instance of the AutoRestSwaggerBATArrayService class.
 */
public class AutoRestSwaggerBATArrayServiceImpl extends ServiceClient<AutoRestSwaggerBATArrayService> implements AutoRestSwaggerBATArrayService {
    private String baseUri;

    /**
     * Gets the URI used as the base for all cloud service requests.
     * @return The BaseUri value.
     */
    public String getBaseUri() {
        return this.baseUri;
    }

    private Array array;

    /**
     * Test Infrastructure for AutoRest Swagger BAT
     * @return the array value.
     */
    public Array getArray() {
        return this.array;
    }

    public AutoRestSwaggerBATArrayServiceImpl() {
        this("http://localhost");
    }

    public AutoRestSwaggerBATArrayServiceImpl(String baseUri) {
        super();
        this.baseUri = baseUri;
        initialize();
    }

    public AutoRestSwaggerBATArrayServiceImpl(String baseUri, OkHttpClient client, RestAdapter.Builder restAdapterBuilder) {
        super(client, restAdapterBuilder);
        this.baseUri = baseUri;
        initialize();
    }

    private void initialize() {
        RestAdapter restAdapter = restAdapterBuilder.setEndpoint(baseUri).build();
        this.array = restAdapter.create(Array.class);
    }
}
