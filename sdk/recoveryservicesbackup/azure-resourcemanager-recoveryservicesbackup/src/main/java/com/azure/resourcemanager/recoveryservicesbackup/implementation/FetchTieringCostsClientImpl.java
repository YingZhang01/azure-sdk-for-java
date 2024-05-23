// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.recoveryservicesbackup.implementation;

import com.azure.core.annotation.BodyParam;
import com.azure.core.annotation.ExpectedResponses;
import com.azure.core.annotation.HeaderParam;
import com.azure.core.annotation.Headers;
import com.azure.core.annotation.Host;
import com.azure.core.annotation.HostParam;
import com.azure.core.annotation.PathParam;
import com.azure.core.annotation.Post;
import com.azure.core.annotation.QueryParam;
import com.azure.core.annotation.ReturnType;
import com.azure.core.annotation.ServiceInterface;
import com.azure.core.annotation.ServiceMethod;
import com.azure.core.annotation.UnexpectedResponseExceptionType;
import com.azure.core.http.rest.Response;
import com.azure.core.http.rest.RestProxy;
import com.azure.core.management.exception.ManagementException;
import com.azure.core.management.polling.PollResult;
import com.azure.core.util.Context;
import com.azure.core.util.FluxUtil;
import com.azure.core.util.polling.PollerFlux;
import com.azure.core.util.polling.SyncPoller;
import com.azure.resourcemanager.recoveryservicesbackup.fluent.FetchTieringCostsClient;
import com.azure.resourcemanager.recoveryservicesbackup.fluent.models.TieringCostInfoInner;
import com.azure.resourcemanager.recoveryservicesbackup.models.FetchTieringCostInfoRequest;
import java.nio.ByteBuffer;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

/**
 * An instance of this class provides access to all the operations defined in FetchTieringCostsClient.
 */
public final class FetchTieringCostsClientImpl implements FetchTieringCostsClient {
    /**
     * The proxy service used to perform REST calls.
     */
    private final FetchTieringCostsService service;

    /**
     * The service client containing this operation class.
     */
    private final RecoveryServicesBackupClientImpl client;

    /**
     * Initializes an instance of FetchTieringCostsClientImpl.
     * 
     * @param client the instance of the service client containing this operation class.
     */
    FetchTieringCostsClientImpl(RecoveryServicesBackupClientImpl client) {
        this.service
            = RestProxy.create(FetchTieringCostsService.class, client.getHttpPipeline(), client.getSerializerAdapter());
        this.client = client;
    }

    /**
     * The interface defining all the services for RecoveryServicesBackupClientFetchTieringCosts to be used by the proxy
     * service to perform REST calls.
     */
    @Host("{$host}")
    @ServiceInterface(name = "RecoveryServicesBack")
    public interface FetchTieringCostsService {
        @Headers({ "Content-Type: application/json" })
        @Post("/subscriptions/{subscriptionId}/resourceGroups/{resourceGroupName}/providers/Microsoft.RecoveryServices/vaults/{vaultName}/backupTieringCost/default/fetchTieringCost")
        @ExpectedResponses({ 200, 202 })
        @UnexpectedResponseExceptionType(ManagementException.class)
        Mono<Response<Flux<ByteBuffer>>> post(@HostParam("$host") String endpoint,
            @PathParam("subscriptionId") String subscriptionId,
            @PathParam("resourceGroupName") String resourceGroupName, @PathParam("vaultName") String vaultName,
            @QueryParam("api-version") String apiVersion,
            @BodyParam("application/json") FetchTieringCostInfoRequest parameters, @HeaderParam("Accept") String accept,
            Context context);
    }

    /**
     * Provides the details of the tiering related sizes and cost.
     * Status of the operation can be fetched using GetTieringCostOperationStatus API and result using
     * GetTieringCostOperationResult API.
     * 
     * @param resourceGroupName The name of the resource group where the recovery services vault is present.
     * @param vaultName The name of the recovery services vault.
     * @param parameters Fetch Tiering Cost Request.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return base class for tiering cost response along with {@link Response} on successful completion of
     * {@link Mono}.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    private Mono<Response<Flux<ByteBuffer>>> postWithResponseAsync(String resourceGroupName, String vaultName,
        FetchTieringCostInfoRequest parameters) {
        if (this.client.getEndpoint() == null) {
            return Mono.error(
                new IllegalArgumentException("Parameter this.client.getEndpoint() is required and cannot be null."));
        }
        if (this.client.getSubscriptionId() == null) {
            return Mono.error(new IllegalArgumentException(
                "Parameter this.client.getSubscriptionId() is required and cannot be null."));
        }
        if (resourceGroupName == null) {
            return Mono
                .error(new IllegalArgumentException("Parameter resourceGroupName is required and cannot be null."));
        }
        if (vaultName == null) {
            return Mono.error(new IllegalArgumentException("Parameter vaultName is required and cannot be null."));
        }
        if (parameters == null) {
            return Mono.error(new IllegalArgumentException("Parameter parameters is required and cannot be null."));
        } else {
            parameters.validate();
        }
        final String accept = "application/json";
        return FluxUtil
            .withContext(context -> service.post(this.client.getEndpoint(), this.client.getSubscriptionId(),
                resourceGroupName, vaultName, this.client.getApiVersion(), parameters, accept, context))
            .contextWrite(context -> context.putAll(FluxUtil.toReactorContext(this.client.getContext()).readOnly()));
    }

    /**
     * Provides the details of the tiering related sizes and cost.
     * Status of the operation can be fetched using GetTieringCostOperationStatus API and result using
     * GetTieringCostOperationResult API.
     * 
     * @param resourceGroupName The name of the resource group where the recovery services vault is present.
     * @param vaultName The name of the recovery services vault.
     * @param parameters Fetch Tiering Cost Request.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return base class for tiering cost response along with {@link Response} on successful completion of
     * {@link Mono}.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    private Mono<Response<Flux<ByteBuffer>>> postWithResponseAsync(String resourceGroupName, String vaultName,
        FetchTieringCostInfoRequest parameters, Context context) {
        if (this.client.getEndpoint() == null) {
            return Mono.error(
                new IllegalArgumentException("Parameter this.client.getEndpoint() is required and cannot be null."));
        }
        if (this.client.getSubscriptionId() == null) {
            return Mono.error(new IllegalArgumentException(
                "Parameter this.client.getSubscriptionId() is required and cannot be null."));
        }
        if (resourceGroupName == null) {
            return Mono
                .error(new IllegalArgumentException("Parameter resourceGroupName is required and cannot be null."));
        }
        if (vaultName == null) {
            return Mono.error(new IllegalArgumentException("Parameter vaultName is required and cannot be null."));
        }
        if (parameters == null) {
            return Mono.error(new IllegalArgumentException("Parameter parameters is required and cannot be null."));
        } else {
            parameters.validate();
        }
        final String accept = "application/json";
        context = this.client.mergeContext(context);
        return service.post(this.client.getEndpoint(), this.client.getSubscriptionId(), resourceGroupName, vaultName,
            this.client.getApiVersion(), parameters, accept, context);
    }

    /**
     * Provides the details of the tiering related sizes and cost.
     * Status of the operation can be fetched using GetTieringCostOperationStatus API and result using
     * GetTieringCostOperationResult API.
     * 
     * @param resourceGroupName The name of the resource group where the recovery services vault is present.
     * @param vaultName The name of the recovery services vault.
     * @param parameters Fetch Tiering Cost Request.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the {@link PollerFlux} for polling of base class for tiering cost response.
     */
    @ServiceMethod(returns = ReturnType.LONG_RUNNING_OPERATION)
    private PollerFlux<PollResult<TieringCostInfoInner>, TieringCostInfoInner> beginPostAsync(String resourceGroupName,
        String vaultName, FetchTieringCostInfoRequest parameters) {
        Mono<Response<Flux<ByteBuffer>>> mono = postWithResponseAsync(resourceGroupName, vaultName, parameters);
        return this.client.<TieringCostInfoInner, TieringCostInfoInner>getLroResult(mono, this.client.getHttpPipeline(),
            TieringCostInfoInner.class, TieringCostInfoInner.class, this.client.getContext());
    }

    /**
     * Provides the details of the tiering related sizes and cost.
     * Status of the operation can be fetched using GetTieringCostOperationStatus API and result using
     * GetTieringCostOperationResult API.
     * 
     * @param resourceGroupName The name of the resource group where the recovery services vault is present.
     * @param vaultName The name of the recovery services vault.
     * @param parameters Fetch Tiering Cost Request.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the {@link PollerFlux} for polling of base class for tiering cost response.
     */
    @ServiceMethod(returns = ReturnType.LONG_RUNNING_OPERATION)
    private PollerFlux<PollResult<TieringCostInfoInner>, TieringCostInfoInner> beginPostAsync(String resourceGroupName,
        String vaultName, FetchTieringCostInfoRequest parameters, Context context) {
        context = this.client.mergeContext(context);
        Mono<Response<Flux<ByteBuffer>>> mono
            = postWithResponseAsync(resourceGroupName, vaultName, parameters, context);
        return this.client.<TieringCostInfoInner, TieringCostInfoInner>getLroResult(mono, this.client.getHttpPipeline(),
            TieringCostInfoInner.class, TieringCostInfoInner.class, context);
    }

    /**
     * Provides the details of the tiering related sizes and cost.
     * Status of the operation can be fetched using GetTieringCostOperationStatus API and result using
     * GetTieringCostOperationResult API.
     * 
     * @param resourceGroupName The name of the resource group where the recovery services vault is present.
     * @param vaultName The name of the recovery services vault.
     * @param parameters Fetch Tiering Cost Request.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the {@link SyncPoller} for polling of base class for tiering cost response.
     */
    @ServiceMethod(returns = ReturnType.LONG_RUNNING_OPERATION)
    public SyncPoller<PollResult<TieringCostInfoInner>, TieringCostInfoInner> beginPost(String resourceGroupName,
        String vaultName, FetchTieringCostInfoRequest parameters) {
        return this.beginPostAsync(resourceGroupName, vaultName, parameters).getSyncPoller();
    }

    /**
     * Provides the details of the tiering related sizes and cost.
     * Status of the operation can be fetched using GetTieringCostOperationStatus API and result using
     * GetTieringCostOperationResult API.
     * 
     * @param resourceGroupName The name of the resource group where the recovery services vault is present.
     * @param vaultName The name of the recovery services vault.
     * @param parameters Fetch Tiering Cost Request.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the {@link SyncPoller} for polling of base class for tiering cost response.
     */
    @ServiceMethod(returns = ReturnType.LONG_RUNNING_OPERATION)
    public SyncPoller<PollResult<TieringCostInfoInner>, TieringCostInfoInner> beginPost(String resourceGroupName,
        String vaultName, FetchTieringCostInfoRequest parameters, Context context) {
        return this.beginPostAsync(resourceGroupName, vaultName, parameters, context).getSyncPoller();
    }

    /**
     * Provides the details of the tiering related sizes and cost.
     * Status of the operation can be fetched using GetTieringCostOperationStatus API and result using
     * GetTieringCostOperationResult API.
     * 
     * @param resourceGroupName The name of the resource group where the recovery services vault is present.
     * @param vaultName The name of the recovery services vault.
     * @param parameters Fetch Tiering Cost Request.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return base class for tiering cost response on successful completion of {@link Mono}.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    private Mono<TieringCostInfoInner> postAsync(String resourceGroupName, String vaultName,
        FetchTieringCostInfoRequest parameters) {
        return beginPostAsync(resourceGroupName, vaultName, parameters).last()
            .flatMap(this.client::getLroFinalResultOrError);
    }

    /**
     * Provides the details of the tiering related sizes and cost.
     * Status of the operation can be fetched using GetTieringCostOperationStatus API and result using
     * GetTieringCostOperationResult API.
     * 
     * @param resourceGroupName The name of the resource group where the recovery services vault is present.
     * @param vaultName The name of the recovery services vault.
     * @param parameters Fetch Tiering Cost Request.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return base class for tiering cost response on successful completion of {@link Mono}.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    private Mono<TieringCostInfoInner> postAsync(String resourceGroupName, String vaultName,
        FetchTieringCostInfoRequest parameters, Context context) {
        return beginPostAsync(resourceGroupName, vaultName, parameters, context).last()
            .flatMap(this.client::getLroFinalResultOrError);
    }

    /**
     * Provides the details of the tiering related sizes and cost.
     * Status of the operation can be fetched using GetTieringCostOperationStatus API and result using
     * GetTieringCostOperationResult API.
     * 
     * @param resourceGroupName The name of the resource group where the recovery services vault is present.
     * @param vaultName The name of the recovery services vault.
     * @param parameters Fetch Tiering Cost Request.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return base class for tiering cost response.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public TieringCostInfoInner post(String resourceGroupName, String vaultName,
        FetchTieringCostInfoRequest parameters) {
        return postAsync(resourceGroupName, vaultName, parameters).block();
    }

    /**
     * Provides the details of the tiering related sizes and cost.
     * Status of the operation can be fetched using GetTieringCostOperationStatus API and result using
     * GetTieringCostOperationResult API.
     * 
     * @param resourceGroupName The name of the resource group where the recovery services vault is present.
     * @param vaultName The name of the recovery services vault.
     * @param parameters Fetch Tiering Cost Request.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return base class for tiering cost response.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public TieringCostInfoInner post(String resourceGroupName, String vaultName, FetchTieringCostInfoRequest parameters,
        Context context) {
        return postAsync(resourceGroupName, vaultName, parameters, context).block();
    }
}
