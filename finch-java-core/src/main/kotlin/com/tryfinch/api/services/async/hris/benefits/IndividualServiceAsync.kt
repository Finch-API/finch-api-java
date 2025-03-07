// File generated from our OpenAPI spec by Stainless.

package com.tryfinch.api.services.async.hris.benefits

import com.google.errorprone.annotations.MustBeClosed
import com.tryfinch.api.core.RequestOptions
import com.tryfinch.api.core.http.HttpResponseFor
import com.tryfinch.api.models.HrisBenefitIndividualEnrolledIdsParams
import com.tryfinch.api.models.HrisBenefitIndividualRetrieveManyBenefitsPageAsync
import com.tryfinch.api.models.HrisBenefitIndividualRetrieveManyBenefitsParams
import com.tryfinch.api.models.HrisBenefitIndividualUnenrollManyPageAsync
import com.tryfinch.api.models.HrisBenefitIndividualUnenrollManyParams
import com.tryfinch.api.models.IndividualEnrolledIdsResponse
import java.util.concurrent.CompletableFuture

interface IndividualServiceAsync {

    /**
     * Returns a view of this service that provides access to raw HTTP responses for each method.
     */
    fun withRawResponse(): WithRawResponse

    /** Lists individuals currently enrolled in a given deduction. */
    fun enrolledIds(
        params: HrisBenefitIndividualEnrolledIdsParams
    ): CompletableFuture<IndividualEnrolledIdsResponse> = enrolledIds(params, RequestOptions.none())

    /** @see [enrolledIds] */
    fun enrolledIds(
        params: HrisBenefitIndividualEnrolledIdsParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<IndividualEnrolledIdsResponse>

    /** Get enrollment information for the given individuals. */
    fun retrieveManyBenefits(
        params: HrisBenefitIndividualRetrieveManyBenefitsParams
    ): CompletableFuture<HrisBenefitIndividualRetrieveManyBenefitsPageAsync> =
        retrieveManyBenefits(params, RequestOptions.none())

    /** @see [retrieveManyBenefits] */
    fun retrieveManyBenefits(
        params: HrisBenefitIndividualRetrieveManyBenefitsParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<HrisBenefitIndividualRetrieveManyBenefitsPageAsync>

    /** Unenroll individuals from a deduction or contribution */
    fun unenrollMany(
        params: HrisBenefitIndividualUnenrollManyParams
    ): CompletableFuture<HrisBenefitIndividualUnenrollManyPageAsync> =
        unenrollMany(params, RequestOptions.none())

    /** @see [unenrollMany] */
    fun unenrollMany(
        params: HrisBenefitIndividualUnenrollManyParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<HrisBenefitIndividualUnenrollManyPageAsync>

    /**
     * A view of [IndividualServiceAsync] that provides access to raw HTTP responses for each
     * method.
     */
    interface WithRawResponse {

        /**
         * Returns a raw HTTP response for `get /employer/benefits/{benefit_id}/enrolled`, but is
         * otherwise the same as [IndividualServiceAsync.enrolledIds].
         */
        @MustBeClosed
        fun enrolledIds(
            params: HrisBenefitIndividualEnrolledIdsParams
        ): CompletableFuture<HttpResponseFor<IndividualEnrolledIdsResponse>> =
            enrolledIds(params, RequestOptions.none())

        /** @see [enrolledIds] */
        @MustBeClosed
        fun enrolledIds(
            params: HrisBenefitIndividualEnrolledIdsParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<IndividualEnrolledIdsResponse>>

        /**
         * Returns a raw HTTP response for `get /employer/benefits/{benefit_id}/individuals`, but is
         * otherwise the same as [IndividualServiceAsync.retrieveManyBenefits].
         */
        @MustBeClosed
        fun retrieveManyBenefits(
            params: HrisBenefitIndividualRetrieveManyBenefitsParams
        ): CompletableFuture<HttpResponseFor<HrisBenefitIndividualRetrieveManyBenefitsPageAsync>> =
            retrieveManyBenefits(params, RequestOptions.none())

        /** @see [retrieveManyBenefits] */
        @MustBeClosed
        fun retrieveManyBenefits(
            params: HrisBenefitIndividualRetrieveManyBenefitsParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<HrisBenefitIndividualRetrieveManyBenefitsPageAsync>>

        /**
         * Returns a raw HTTP response for `delete /employer/benefits/{benefit_id}/individuals`, but
         * is otherwise the same as [IndividualServiceAsync.unenrollMany].
         */
        @MustBeClosed
        fun unenrollMany(
            params: HrisBenefitIndividualUnenrollManyParams
        ): CompletableFuture<HttpResponseFor<HrisBenefitIndividualUnenrollManyPageAsync>> =
            unenrollMany(params, RequestOptions.none())

        /** @see [unenrollMany] */
        @MustBeClosed
        fun unenrollMany(
            params: HrisBenefitIndividualUnenrollManyParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<HrisBenefitIndividualUnenrollManyPageAsync>>
    }
}
