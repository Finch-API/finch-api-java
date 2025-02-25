// File generated from our OpenAPI spec by Stainless.

@file:Suppress("OVERLOADS_INTERFACE") // See https://youtrack.jetbrains.com/issue/KT-36102

package com.tryfinch.api.services.async.sandbox.jobs

import com.tryfinch.api.core.RequestOptions
import com.tryfinch.api.models.SandboxJobConfiguration
import com.tryfinch.api.models.SandboxJobConfigurationRetrieveParams
import com.tryfinch.api.models.SandboxJobConfigurationUpdateParams
import java.util.concurrent.CompletableFuture

interface ConfigurationServiceAsync {

    /** Get configurations for sandbox jobs */
    @JvmOverloads
    fun retrieve(
        params: SandboxJobConfigurationRetrieveParams =
            SandboxJobConfigurationRetrieveParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<List<SandboxJobConfiguration>>

    /** Get configurations for sandbox jobs */
    fun retrieve(requestOptions: RequestOptions): CompletableFuture<List<SandboxJobConfiguration>> =
        retrieve(SandboxJobConfigurationRetrieveParams.none(), requestOptions)

    /** Update configurations for sandbox jobs */
    @JvmOverloads
    fun update(
        params: SandboxJobConfigurationUpdateParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<SandboxJobConfiguration>
}
