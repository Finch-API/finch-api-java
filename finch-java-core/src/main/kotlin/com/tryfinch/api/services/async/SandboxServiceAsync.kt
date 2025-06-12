// File generated from our OpenAPI spec by Stainless.

package com.tryfinch.api.services.async

import com.tryfinch.api.core.ClientOptions
import com.tryfinch.api.services.async.sandbox.CompanyServiceAsync
import com.tryfinch.api.services.async.sandbox.ConnectionServiceAsync
import com.tryfinch.api.services.async.sandbox.DirectoryServiceAsync
import com.tryfinch.api.services.async.sandbox.EmploymentServiceAsync
import com.tryfinch.api.services.async.sandbox.IndividualServiceAsync
import com.tryfinch.api.services.async.sandbox.JobServiceAsync
import com.tryfinch.api.services.async.sandbox.PaymentServiceAsync
import java.util.function.Consumer

interface SandboxServiceAsync {

    /**
     * Returns a view of this service that provides access to raw HTTP responses for each method.
     */
    fun withRawResponse(): WithRawResponse

    /**
     * Returns a view of this service with the given option modifications applied.
     *
     * The original service is not modified.
     */
    fun withOptions(modifier: Consumer<ClientOptions.Builder>): SandboxServiceAsync

    fun connections(): ConnectionServiceAsync

    fun company(): CompanyServiceAsync

    fun directory(): DirectoryServiceAsync

    fun individual(): IndividualServiceAsync

    fun employment(): EmploymentServiceAsync

    fun payment(): PaymentServiceAsync

    fun jobs(): JobServiceAsync

    /**
     * A view of [SandboxServiceAsync] that provides access to raw HTTP responses for each method.
     */
    interface WithRawResponse {

        /**
         * Returns a view of this service with the given option modifications applied.
         *
         * The original service is not modified.
         */
        fun withOptions(
            modifier: Consumer<ClientOptions.Builder>
        ): SandboxServiceAsync.WithRawResponse

        fun connections(): ConnectionServiceAsync.WithRawResponse

        fun company(): CompanyServiceAsync.WithRawResponse

        fun directory(): DirectoryServiceAsync.WithRawResponse

        fun individual(): IndividualServiceAsync.WithRawResponse

        fun employment(): EmploymentServiceAsync.WithRawResponse

        fun payment(): PaymentServiceAsync.WithRawResponse

        fun jobs(): JobServiceAsync.WithRawResponse
    }
}
