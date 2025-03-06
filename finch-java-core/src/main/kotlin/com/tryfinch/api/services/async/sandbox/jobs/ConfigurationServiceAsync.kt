// File generated from our OpenAPI spec by Stainless.

@file:Suppress("OVERLOADS_INTERFACE") // See https://youtrack.jetbrains.com/issue/KT-36102

package com.tryfinch.api.services.async.sandbox.jobs

import com.google.errorprone.annotations.MustBeClosed
import com.tryfinch.api.core.RequestOptions
import com.tryfinch.api.core.http.HttpResponseFor
import com.tryfinch.api.models.SandboxJobConfiguration
import com.tryfinch.api.models.SandboxJobConfigurationRetrieveParams
import com.tryfinch.api.models.SandboxJobConfigurationUpdateParams
import java.util.concurrent.CompletableFuture

interface ConfigurationServiceAsync {

    /**
     * Returns a view of this service that provides access to raw HTTP responses for each method.
     */
    fun withRawResponse(): WithRawResponse

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

    /**
     * A view of [ConfigurationServiceAsync] that provides access to raw HTTP responses for each
     * method.
     */
    interface WithRawResponse {

        /**
         * Returns a raw HTTP response for `get /sandbox/jobs/configuration`, but is otherwise the
         * same as [ConfigurationServiceAsync.retrieve].
         */
        @JvmOverloads
        @MustBeClosed
        fun retrieve(
            params: SandboxJobConfigurationRetrieveParams =
                SandboxJobConfigurationRetrieveParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<List<SandboxJobConfiguration>>>

        /**
         * Returns a raw HTTP response for `get /sandbox/jobs/configuration`, but is otherwise the
         * same as [ConfigurationServiceAsync.retrieve].
         */
        @MustBeClosed
        fun retrieve(
            requestOptions: RequestOptions
        ): CompletableFuture<HttpResponseFor<List<SandboxJobConfiguration>>> =
            retrieve(SandboxJobConfigurationRetrieveParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `put /sandbox/jobs/configuration`, but is otherwise the
         * same as [ConfigurationServiceAsync.update].
         */
        @JvmOverloads
        @MustBeClosed
        fun update(
            params: SandboxJobConfigurationUpdateParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<SandboxJobConfiguration>>
    }
}
