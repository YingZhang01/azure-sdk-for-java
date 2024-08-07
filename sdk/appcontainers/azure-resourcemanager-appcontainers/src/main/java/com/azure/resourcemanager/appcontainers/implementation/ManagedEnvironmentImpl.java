// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.appcontainers.implementation;

import com.azure.core.http.rest.Response;
import com.azure.core.management.Region;
import com.azure.core.management.SystemData;
import com.azure.core.util.Context;
import com.azure.resourcemanager.appcontainers.fluent.models.ManagedEnvironmentInner;
import com.azure.resourcemanager.appcontainers.models.AppLogsConfiguration;
import com.azure.resourcemanager.appcontainers.models.CustomDomainConfiguration;
import com.azure.resourcemanager.appcontainers.models.DaprConfiguration;
import com.azure.resourcemanager.appcontainers.models.EnvironmentAuthToken;
import com.azure.resourcemanager.appcontainers.models.EnvironmentProvisioningState;
import com.azure.resourcemanager.appcontainers.models.KedaConfiguration;
import com.azure.resourcemanager.appcontainers.models.ManagedEnvironment;
import com.azure.resourcemanager.appcontainers.models.ManagedEnvironmentPropertiesPeerAuthentication;
import com.azure.resourcemanager.appcontainers.models.ManagedEnvironmentPropertiesPeerTrafficConfiguration;
import com.azure.resourcemanager.appcontainers.models.VnetConfiguration;
import com.azure.resourcemanager.appcontainers.models.WorkloadProfile;
import java.util.Collections;
import java.util.List;
import java.util.Map;

public final class ManagedEnvironmentImpl
    implements ManagedEnvironment, ManagedEnvironment.Definition, ManagedEnvironment.Update {
    private ManagedEnvironmentInner innerObject;

    private final com.azure.resourcemanager.appcontainers.ContainerAppsApiManager serviceManager;

    public String id() {
        return this.innerModel().id();
    }

    public String name() {
        return this.innerModel().name();
    }

    public String type() {
        return this.innerModel().type();
    }

    public String location() {
        return this.innerModel().location();
    }

    public Map<String, String> tags() {
        Map<String, String> inner = this.innerModel().tags();
        if (inner != null) {
            return Collections.unmodifiableMap(inner);
        } else {
            return Collections.emptyMap();
        }
    }

    public String kind() {
        return this.innerModel().kind();
    }

    public SystemData systemData() {
        return this.innerModel().systemData();
    }

    public EnvironmentProvisioningState provisioningState() {
        return this.innerModel().provisioningState();
    }

    public String daprAIInstrumentationKey() {
        return this.innerModel().daprAIInstrumentationKey();
    }

    public String daprAIConnectionString() {
        return this.innerModel().daprAIConnectionString();
    }

    public VnetConfiguration vnetConfiguration() {
        return this.innerModel().vnetConfiguration();
    }

    public String deploymentErrors() {
        return this.innerModel().deploymentErrors();
    }

    public String defaultDomain() {
        return this.innerModel().defaultDomain();
    }

    public String staticIp() {
        return this.innerModel().staticIp();
    }

    public AppLogsConfiguration appLogsConfiguration() {
        return this.innerModel().appLogsConfiguration();
    }

    public Boolean zoneRedundant() {
        return this.innerModel().zoneRedundant();
    }

    public CustomDomainConfiguration customDomainConfiguration() {
        return this.innerModel().customDomainConfiguration();
    }

    public String eventStreamEndpoint() {
        return this.innerModel().eventStreamEndpoint();
    }

    public List<WorkloadProfile> workloadProfiles() {
        List<WorkloadProfile> inner = this.innerModel().workloadProfiles();
        if (inner != null) {
            return Collections.unmodifiableList(inner);
        } else {
            return Collections.emptyList();
        }
    }

    public KedaConfiguration kedaConfiguration() {
        return this.innerModel().kedaConfiguration();
    }

    public DaprConfiguration daprConfiguration() {
        return this.innerModel().daprConfiguration();
    }

    public String infrastructureResourceGroup() {
        return this.innerModel().infrastructureResourceGroup();
    }

    public ManagedEnvironmentPropertiesPeerAuthentication peerAuthentication() {
        return this.innerModel().peerAuthentication();
    }

    public ManagedEnvironmentPropertiesPeerTrafficConfiguration peerTrafficConfiguration() {
        return this.innerModel().peerTrafficConfiguration();
    }

    public Region region() {
        return Region.fromName(this.regionName());
    }

    public String regionName() {
        return this.location();
    }

    public String resourceGroupName() {
        return resourceGroupName;
    }

    public ManagedEnvironmentInner innerModel() {
        return this.innerObject;
    }

    private com.azure.resourcemanager.appcontainers.ContainerAppsApiManager manager() {
        return this.serviceManager;
    }

    private String resourceGroupName;

    private String environmentName;

    public ManagedEnvironmentImpl withExistingResourceGroup(String resourceGroupName) {
        this.resourceGroupName = resourceGroupName;
        return this;
    }

    public ManagedEnvironment create() {
        this.innerObject = serviceManager.serviceClient()
            .getManagedEnvironments()
            .createOrUpdate(resourceGroupName, environmentName, this.innerModel(), Context.NONE);
        return this;
    }

    public ManagedEnvironment create(Context context) {
        this.innerObject = serviceManager.serviceClient()
            .getManagedEnvironments()
            .createOrUpdate(resourceGroupName, environmentName, this.innerModel(), context);
        return this;
    }

    ManagedEnvironmentImpl(String name,
        com.azure.resourcemanager.appcontainers.ContainerAppsApiManager serviceManager) {
        this.innerObject = new ManagedEnvironmentInner();
        this.serviceManager = serviceManager;
        this.environmentName = name;
    }

    public ManagedEnvironmentImpl update() {
        return this;
    }

    public ManagedEnvironment apply() {
        this.innerObject = serviceManager.serviceClient()
            .getManagedEnvironments()
            .update(resourceGroupName, environmentName, this.innerModel(), Context.NONE);
        return this;
    }

    public ManagedEnvironment apply(Context context) {
        this.innerObject = serviceManager.serviceClient()
            .getManagedEnvironments()
            .update(resourceGroupName, environmentName, this.innerModel(), context);
        return this;
    }

    ManagedEnvironmentImpl(ManagedEnvironmentInner innerObject,
        com.azure.resourcemanager.appcontainers.ContainerAppsApiManager serviceManager) {
        this.innerObject = innerObject;
        this.serviceManager = serviceManager;
        this.resourceGroupName = ResourceManagerUtils.getValueFromIdByName(innerObject.id(), "resourceGroups");
        this.environmentName = ResourceManagerUtils.getValueFromIdByName(innerObject.id(), "managedEnvironments");
    }

    public ManagedEnvironment refresh() {
        this.innerObject = serviceManager.serviceClient()
            .getManagedEnvironments()
            .getByResourceGroupWithResponse(resourceGroupName, environmentName, Context.NONE)
            .getValue();
        return this;
    }

    public ManagedEnvironment refresh(Context context) {
        this.innerObject = serviceManager.serviceClient()
            .getManagedEnvironments()
            .getByResourceGroupWithResponse(resourceGroupName, environmentName, context)
            .getValue();
        return this;
    }

    public Response<EnvironmentAuthToken> getAuthTokenWithResponse(Context context) {
        return serviceManager.managedEnvironments()
            .getAuthTokenWithResponse(resourceGroupName, environmentName, context);
    }

    public EnvironmentAuthToken getAuthToken() {
        return serviceManager.managedEnvironments().getAuthToken(resourceGroupName, environmentName);
    }

    public ManagedEnvironmentImpl withRegion(Region location) {
        this.innerModel().withLocation(location.toString());
        return this;
    }

    public ManagedEnvironmentImpl withRegion(String location) {
        this.innerModel().withLocation(location);
        return this;
    }

    public ManagedEnvironmentImpl withTags(Map<String, String> tags) {
        this.innerModel().withTags(tags);
        return this;
    }

    public ManagedEnvironmentImpl withKind(String kind) {
        this.innerModel().withKind(kind);
        return this;
    }

    public ManagedEnvironmentImpl withDaprAIInstrumentationKey(String daprAIInstrumentationKey) {
        this.innerModel().withDaprAIInstrumentationKey(daprAIInstrumentationKey);
        return this;
    }

    public ManagedEnvironmentImpl withDaprAIConnectionString(String daprAIConnectionString) {
        this.innerModel().withDaprAIConnectionString(daprAIConnectionString);
        return this;
    }

    public ManagedEnvironmentImpl withVnetConfiguration(VnetConfiguration vnetConfiguration) {
        this.innerModel().withVnetConfiguration(vnetConfiguration);
        return this;
    }

    public ManagedEnvironmentImpl withAppLogsConfiguration(AppLogsConfiguration appLogsConfiguration) {
        this.innerModel().withAppLogsConfiguration(appLogsConfiguration);
        return this;
    }

    public ManagedEnvironmentImpl withZoneRedundant(Boolean zoneRedundant) {
        this.innerModel().withZoneRedundant(zoneRedundant);
        return this;
    }

    public ManagedEnvironmentImpl withCustomDomainConfiguration(CustomDomainConfiguration customDomainConfiguration) {
        this.innerModel().withCustomDomainConfiguration(customDomainConfiguration);
        return this;
    }

    public ManagedEnvironmentImpl withWorkloadProfiles(List<WorkloadProfile> workloadProfiles) {
        this.innerModel().withWorkloadProfiles(workloadProfiles);
        return this;
    }

    public ManagedEnvironmentImpl withKedaConfiguration(KedaConfiguration kedaConfiguration) {
        this.innerModel().withKedaConfiguration(kedaConfiguration);
        return this;
    }

    public ManagedEnvironmentImpl withDaprConfiguration(DaprConfiguration daprConfiguration) {
        this.innerModel().withDaprConfiguration(daprConfiguration);
        return this;
    }

    public ManagedEnvironmentImpl withInfrastructureResourceGroup(String infrastructureResourceGroup) {
        this.innerModel().withInfrastructureResourceGroup(infrastructureResourceGroup);
        return this;
    }

    public ManagedEnvironmentImpl
        withPeerAuthentication(ManagedEnvironmentPropertiesPeerAuthentication peerAuthentication) {
        this.innerModel().withPeerAuthentication(peerAuthentication);
        return this;
    }

    public ManagedEnvironmentImpl
        withPeerTrafficConfiguration(ManagedEnvironmentPropertiesPeerTrafficConfiguration peerTrafficConfiguration) {
        this.innerModel().withPeerTrafficConfiguration(peerTrafficConfiguration);
        return this;
    }
}
