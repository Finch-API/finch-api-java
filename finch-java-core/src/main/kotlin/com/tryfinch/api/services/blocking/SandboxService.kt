// File generated from our OpenAPI spec by Stainless.

package com.tryfinch.api.services.blocking

import com.tryfinch.api.core.ClientOptions
import com.tryfinch.api.services.blocking.sandbox.CompanyService
import com.tryfinch.api.services.blocking.sandbox.ConnectionService
import com.tryfinch.api.services.blocking.sandbox.DirectoryService
import com.tryfinch.api.services.blocking.sandbox.EmploymentService
import com.tryfinch.api.services.blocking.sandbox.IndividualService
import com.tryfinch.api.services.blocking.sandbox.JobService
import com.tryfinch.api.services.blocking.sandbox.PaymentService
import java.util.function.Consumer

interface SandboxService {

    /**
     * Returns a view of this service that provides access to raw HTTP responses for each method.
     */
    fun withRawResponse(): WithRawResponse

    /**
     * Returns a view of this service with the given option modifications applied.
     *
     * The original service is not modified.
     */
    fun withOptions(modifier: Consumer<ClientOptions.Builder>): SandboxService

    fun connections(): ConnectionService

    fun company(): CompanyService

    fun directory(): DirectoryService

    fun individual(): IndividualService

    fun employment(): EmploymentService

    fun payment(): PaymentService

    fun jobs(): JobService

    /** A view of [SandboxService] that provides access to raw HTTP responses for each method. */
    interface WithRawResponse {

        /**
         * Returns a view of this service with the given option modifications applied.
         *
         * The original service is not modified.
         */
        fun withOptions(modifier: Consumer<ClientOptions.Builder>): SandboxService.WithRawResponse

        fun connections(): ConnectionService.WithRawResponse

        fun company(): CompanyService.WithRawResponse

        fun directory(): DirectoryService.WithRawResponse

        fun individual(): IndividualService.WithRawResponse

        fun employment(): EmploymentService.WithRawResponse

        fun payment(): PaymentService.WithRawResponse

        fun jobs(): JobService.WithRawResponse
    }
}
