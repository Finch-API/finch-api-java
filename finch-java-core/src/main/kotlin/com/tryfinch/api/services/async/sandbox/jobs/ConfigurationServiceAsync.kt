// File generated from our OpenAPI spec by Stainless.

package com.tryfinch.api.services.async.sandbox.jobs

import com.tryfinch.api.core.ClientOptions
import com.tryfinch.api.core.RequestOptions
import com.tryfinch.api.core.http.HttpResponseFor
import com.tryfinch.api.models.SandboxJobConfiguration
import com.tryfinch.api.models.SandboxJobConfigurationRetrieveParams
import com.tryfinch.api.models.SandboxJobConfigurationUpdateParams
import java.util.concurrent.CompletableFuture
import java.util.function.Consumer

interface ConfigurationServiceAsync {

    /**
     * Returns a view of this service that provides access to raw HTTP responses for each method.
     */
    fun withRawResponse(): WithRawResponse

    /**
     * Returns a view of this service with the given option modifications applied.
     *
     * The original service is not modified.
     */
    fun withOptions(modifier: Consumer<ClientOptions.Builder>): ConfigurationServiceAsync

    /** Get configurations for sandbox jobs */
    fun retrieve(): CompletableFuture<List<SandboxJobConfiguration>> =
        retrieve(SandboxJobConfigurationRetrieveParams.none())

    /** @see [retrieve] */
    fun retrieve(
        params: SandboxJobConfigurationRetrieveParams =
            SandboxJobConfigurationRetrieveParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<List<SandboxJobConfiguration>>

    /** @see [retrieve] */
    fun retrieve(
        params: SandboxJobConfigurationRetrieveParams = SandboxJobConfigurationRetrieveParams.none()
    ): CompletableFuture<List<SandboxJobConfiguration>> = retrieve(params, RequestOptions.none())

    /** @see [retrieve] */
    fun retrieve(requestOptions: RequestOptions): CompletableFuture<List<SandboxJobConfiguration>> =
        retrieve(SandboxJobConfigurationRetrieveParams.none(), requestOptions)

    /** Update configurations for sandbox jobs */
    fun update(
        params: SandboxJobConfigurationUpdateParams
    ): CompletableFuture<SandboxJobConfiguration> = update(params, RequestOptions.none())

    /** @see [update] */
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
         * Returns a view of this service with the given option modifications applied.
         *
         * The original service is not modified.
         */
        fun withOptions(
            modifier: Consumer<ClientOptions.Builder>
        ): ConfigurationServiceAsync.WithRawResponse

        /**
         * Returns a raw HTTP response for `get /sandbox/jobs/configuration`, but is otherwise the
         * same as [ConfigurationServiceAsync.retrieve].
         */
        fun retrieve(): CompletableFuture<HttpResponseFor<List<SandboxJobConfiguration>>> =
            retrieve(SandboxJobConfigurationRetrieveParams.none())

        /** @see [retrieve] */
        fun retrieve(
            params: SandboxJobConfigurationRetrieveParams =
                SandboxJobConfigurationRetrieveParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<List<SandboxJobConfiguration>>>

        /** @see [retrieve] */
        fun retrieve(
            params: SandboxJobConfigurationRetrieveParams =
                SandboxJobConfigurationRetrieveParams.none()
        ): CompletableFuture<HttpResponseFor<List<SandboxJobConfiguration>>> =
            retrieve(params, RequestOptions.none())

        /** @see [retrieve] */
        fun retrieve(
            requestOptions: RequestOptions
        ): CompletableFuture<HttpResponseFor<List<SandboxJobConfiguration>>> =
            retrieve(SandboxJobConfigurationRetrieveParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `put /sandbox/jobs/configuration`, but is otherwise the
         * same as [ConfigurationServiceAsync.update].
         */
        fun update(
            params: SandboxJobConfigurationUpdateParams
        ): CompletableFuture<HttpResponseFor<SandboxJobConfiguration>> =
            update(params, RequestOptions.none())

        /** @see [update] */
        fun update(
            params: SandboxJobConfigurationUpdateParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<SandboxJobConfiguration>>
    }
}
