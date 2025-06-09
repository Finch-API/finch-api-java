// File generated from our OpenAPI spec by Stainless.

package com.tryfinch.api.services.blocking.hris

import com.google.errorprone.annotations.MustBeClosed
import com.tryfinch.api.core.RequestOptions
import com.tryfinch.api.core.http.HttpResponseFor
import com.tryfinch.api.models.HrisPayStatementRetrieveManyPage
import com.tryfinch.api.models.HrisPayStatementRetrieveManyParams

interface PayStatementService {

    /**
     * Returns a view of this service that provides access to raw HTTP responses for each method.
     */
    fun withRawResponse(): WithRawResponse

    /**
     * Read detailed pay statements for each individual.
     *
     * Deduction and contribution types are supported by the payroll systems that supports Benefits.
     */
    fun retrieveMany(params: HrisPayStatementRetrieveManyParams): HrisPayStatementRetrieveManyPage =
        retrieveMany(params, RequestOptions.none())

    /** @see [retrieveMany] */
    fun retrieveMany(
        params: HrisPayStatementRetrieveManyParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): HrisPayStatementRetrieveManyPage

    /**
     * A view of [PayStatementService] that provides access to raw HTTP responses for each method.
     */
    interface WithRawResponse {

        /**
         * Returns a raw HTTP response for `post /employer/pay-statement`, but is otherwise the same
         * as [PayStatementService.retrieveMany].
         */
        @MustBeClosed
        fun retrieveMany(
            params: HrisPayStatementRetrieveManyParams
        ): HttpResponseFor<HrisPayStatementRetrieveManyPage> =
            retrieveMany(params, RequestOptions.none())

        /** @see [retrieveMany] */
        @MustBeClosed
        fun retrieveMany(
            params: HrisPayStatementRetrieveManyParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<HrisPayStatementRetrieveManyPage>
    }
}
