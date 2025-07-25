// File generated from our OpenAPI spec by Stainless.

package com.tryfinch.api.services.blocking.hris

import com.google.errorprone.annotations.MustBeClosed
import com.tryfinch.api.core.ClientOptions
import com.tryfinch.api.core.RequestOptions
import com.tryfinch.api.core.http.HttpResponseFor
import com.tryfinch.api.models.HrisEmploymentRetrieveManyPage
import com.tryfinch.api.models.HrisEmploymentRetrieveManyParams
import java.util.function.Consumer

interface EmploymentService {

    /**
     * Returns a view of this service that provides access to raw HTTP responses for each method.
     */
    fun withRawResponse(): WithRawResponse

    /**
     * Returns a view of this service with the given option modifications applied.
     *
     * The original service is not modified.
     */
    fun withOptions(modifier: Consumer<ClientOptions.Builder>): EmploymentService

    /** Read individual employment and income data */
    fun retrieveMany(params: HrisEmploymentRetrieveManyParams): HrisEmploymentRetrieveManyPage =
        retrieveMany(params, RequestOptions.none())

    /** @see retrieveMany */
    fun retrieveMany(
        params: HrisEmploymentRetrieveManyParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): HrisEmploymentRetrieveManyPage

    /** A view of [EmploymentService] that provides access to raw HTTP responses for each method. */
    interface WithRawResponse {

        /**
         * Returns a view of this service with the given option modifications applied.
         *
         * The original service is not modified.
         */
        fun withOptions(
            modifier: Consumer<ClientOptions.Builder>
        ): EmploymentService.WithRawResponse

        /**
         * Returns a raw HTTP response for `post /employer/employment`, but is otherwise the same as
         * [EmploymentService.retrieveMany].
         */
        @MustBeClosed
        fun retrieveMany(
            params: HrisEmploymentRetrieveManyParams
        ): HttpResponseFor<HrisEmploymentRetrieveManyPage> =
            retrieveMany(params, RequestOptions.none())

        /** @see retrieveMany */
        @MustBeClosed
        fun retrieveMany(
            params: HrisEmploymentRetrieveManyParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<HrisEmploymentRetrieveManyPage>
    }
}
