// File generated from our OpenAPI spec by Stainless.

package com.tryfinch.api.services.async

import com.tryfinch.api.core.ClientOptions
import com.tryfinch.api.services.async.hris.BenefitServiceAsync
import com.tryfinch.api.services.async.hris.CompanyServiceAsync
import com.tryfinch.api.services.async.hris.DirectoryServiceAsync
import com.tryfinch.api.services.async.hris.DocumentServiceAsync
import com.tryfinch.api.services.async.hris.EmploymentServiceAsync
import com.tryfinch.api.services.async.hris.IndividualServiceAsync
import com.tryfinch.api.services.async.hris.PayStatementServiceAsync
import com.tryfinch.api.services.async.hris.PaymentServiceAsync
import java.util.function.Consumer

interface HrisServiceAsync {

    /**
     * Returns a view of this service that provides access to raw HTTP responses for each method.
     */
    fun withRawResponse(): WithRawResponse

    /**
     * Returns a view of this service with the given option modifications applied.
     *
     * The original service is not modified.
     */
    fun withOptions(modifier: Consumer<ClientOptions.Builder>): HrisServiceAsync

    fun company(): CompanyServiceAsync

    fun directory(): DirectoryServiceAsync

    fun individuals(): IndividualServiceAsync

    fun employments(): EmploymentServiceAsync

    fun payments(): PaymentServiceAsync

    fun payStatements(): PayStatementServiceAsync

    fun documents(): DocumentServiceAsync

    fun benefits(): BenefitServiceAsync

    /** A view of [HrisServiceAsync] that provides access to raw HTTP responses for each method. */
    interface WithRawResponse {

        /**
         * Returns a view of this service with the given option modifications applied.
         *
         * The original service is not modified.
         */
        fun withOptions(modifier: Consumer<ClientOptions.Builder>): HrisServiceAsync.WithRawResponse

        fun company(): CompanyServiceAsync.WithRawResponse

        fun directory(): DirectoryServiceAsync.WithRawResponse

        fun individuals(): IndividualServiceAsync.WithRawResponse

        fun employments(): EmploymentServiceAsync.WithRawResponse

        fun payments(): PaymentServiceAsync.WithRawResponse

        fun payStatements(): PayStatementServiceAsync.WithRawResponse

        fun documents(): DocumentServiceAsync.WithRawResponse

        fun benefits(): BenefitServiceAsync.WithRawResponse
    }
}
