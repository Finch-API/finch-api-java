// File generated from our OpenAPI spec by Stainless.

package com.tryfinch.api.services.async.hris.benefits

import com.tryfinch.api.core.ClientOptions
import com.tryfinch.api.core.RequestOptions
import com.tryfinch.api.core.http.HttpResponseFor
import com.tryfinch.api.models.HrisBenefitIndividualEnrolledIdsParams
import com.tryfinch.api.models.HrisBenefitIndividualRetrieveManyBenefitsPageAsync
import com.tryfinch.api.models.HrisBenefitIndividualRetrieveManyBenefitsParams
import com.tryfinch.api.models.HrisBenefitIndividualUnenrollManyParams
import com.tryfinch.api.models.IndividualEnrolledIdsResponse
import com.tryfinch.api.models.UnenrolledIndividualBenefitResponse
import java.util.concurrent.CompletableFuture
import java.util.function.Consumer

interface IndividualServiceAsync {

    /**
     * Returns a view of this service that provides access to raw HTTP responses for each method.
     */
    fun withRawResponse(): WithRawResponse

    /**
     * Returns a view of this service with the given option modifications applied.
     *
     * The original service is not modified.
     */
    fun withOptions(modifier: Consumer<ClientOptions.Builder>): IndividualServiceAsync

    /** Lists individuals currently enrolled in a given deduction. */
    fun enrolledIds(
        benefitId: String,
        params: HrisBenefitIndividualEnrolledIdsParams,
    ): CompletableFuture<IndividualEnrolledIdsResponse> =
        enrolledIds(benefitId, params, RequestOptions.none())

    /** @see enrolledIds */
    fun enrolledIds(
        benefitId: String,
        params: HrisBenefitIndividualEnrolledIdsParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<IndividualEnrolledIdsResponse> =
        enrolledIds(params.toBuilder().benefitId(benefitId).build(), requestOptions)

    /** @see enrolledIds */
    fun enrolledIds(
        params: HrisBenefitIndividualEnrolledIdsParams
    ): CompletableFuture<IndividualEnrolledIdsResponse> = enrolledIds(params, RequestOptions.none())

    /** @see enrolledIds */
    fun enrolledIds(
        params: HrisBenefitIndividualEnrolledIdsParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<IndividualEnrolledIdsResponse>

    /** Get enrollment information for the given individuals. */
    fun retrieveManyBenefits(
        benefitId: String,
        params: HrisBenefitIndividualRetrieveManyBenefitsParams,
    ): CompletableFuture<HrisBenefitIndividualRetrieveManyBenefitsPageAsync> =
        retrieveManyBenefits(benefitId, params, RequestOptions.none())

    /** @see retrieveManyBenefits */
    fun retrieveManyBenefits(
        benefitId: String,
        params: HrisBenefitIndividualRetrieveManyBenefitsParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<HrisBenefitIndividualRetrieveManyBenefitsPageAsync> =
        retrieveManyBenefits(params.toBuilder().benefitId(benefitId).build(), requestOptions)

    /** @see retrieveManyBenefits */
    fun retrieveManyBenefits(
        params: HrisBenefitIndividualRetrieveManyBenefitsParams
    ): CompletableFuture<HrisBenefitIndividualRetrieveManyBenefitsPageAsync> =
        retrieveManyBenefits(params, RequestOptions.none())

    /** @see retrieveManyBenefits */
    fun retrieveManyBenefits(
        params: HrisBenefitIndividualRetrieveManyBenefitsParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<HrisBenefitIndividualRetrieveManyBenefitsPageAsync>

    /** Unenroll individuals from a deduction or contribution */
    fun unenrollMany(
        benefitId: String,
        params: HrisBenefitIndividualUnenrollManyParams,
    ): CompletableFuture<UnenrolledIndividualBenefitResponse> =
        unenrollMany(benefitId, params, RequestOptions.none())

    /** @see unenrollMany */
    fun unenrollMany(
        benefitId: String,
        params: HrisBenefitIndividualUnenrollManyParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<UnenrolledIndividualBenefitResponse> =
        unenrollMany(params.toBuilder().benefitId(benefitId).build(), requestOptions)

    /** @see unenrollMany */
    fun unenrollMany(
        params: HrisBenefitIndividualUnenrollManyParams
    ): CompletableFuture<UnenrolledIndividualBenefitResponse> =
        unenrollMany(params, RequestOptions.none())

    /** @see unenrollMany */
    fun unenrollMany(
        params: HrisBenefitIndividualUnenrollManyParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<UnenrolledIndividualBenefitResponse>

    /**
     * A view of [IndividualServiceAsync] that provides access to raw HTTP responses for each
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
        ): IndividualServiceAsync.WithRawResponse

        /**
         * Returns a raw HTTP response for `get /employer/benefits/{benefit_id}/enrolled`, but is
         * otherwise the same as [IndividualServiceAsync.enrolledIds].
         */
        fun enrolledIds(
            benefitId: String,
            params: HrisBenefitIndividualEnrolledIdsParams,
        ): CompletableFuture<HttpResponseFor<IndividualEnrolledIdsResponse>> =
            enrolledIds(benefitId, params, RequestOptions.none())

        /** @see enrolledIds */
        fun enrolledIds(
            benefitId: String,
            params: HrisBenefitIndividualEnrolledIdsParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<IndividualEnrolledIdsResponse>> =
            enrolledIds(params.toBuilder().benefitId(benefitId).build(), requestOptions)

        /** @see enrolledIds */
        fun enrolledIds(
            params: HrisBenefitIndividualEnrolledIdsParams
        ): CompletableFuture<HttpResponseFor<IndividualEnrolledIdsResponse>> =
            enrolledIds(params, RequestOptions.none())

        /** @see enrolledIds */
        fun enrolledIds(
            params: HrisBenefitIndividualEnrolledIdsParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<IndividualEnrolledIdsResponse>>

        /**
         * Returns a raw HTTP response for `get /employer/benefits/{benefit_id}/individuals`, but is
         * otherwise the same as [IndividualServiceAsync.retrieveManyBenefits].
         */
        fun retrieveManyBenefits(
            benefitId: String,
            params: HrisBenefitIndividualRetrieveManyBenefitsParams,
        ): CompletableFuture<HttpResponseFor<HrisBenefitIndividualRetrieveManyBenefitsPageAsync>> =
            retrieveManyBenefits(benefitId, params, RequestOptions.none())

        /** @see retrieveManyBenefits */
        fun retrieveManyBenefits(
            benefitId: String,
            params: HrisBenefitIndividualRetrieveManyBenefitsParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<HrisBenefitIndividualRetrieveManyBenefitsPageAsync>> =
            retrieveManyBenefits(params.toBuilder().benefitId(benefitId).build(), requestOptions)

        /** @see retrieveManyBenefits */
        fun retrieveManyBenefits(
            params: HrisBenefitIndividualRetrieveManyBenefitsParams
        ): CompletableFuture<HttpResponseFor<HrisBenefitIndividualRetrieveManyBenefitsPageAsync>> =
            retrieveManyBenefits(params, RequestOptions.none())

        /** @see retrieveManyBenefits */
        fun retrieveManyBenefits(
            params: HrisBenefitIndividualRetrieveManyBenefitsParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<HrisBenefitIndividualRetrieveManyBenefitsPageAsync>>

        /**
         * Returns a raw HTTP response for `delete /employer/benefits/{benefit_id}/individuals`, but
         * is otherwise the same as [IndividualServiceAsync.unenrollMany].
         */
        fun unenrollMany(
            benefitId: String,
            params: HrisBenefitIndividualUnenrollManyParams,
        ): CompletableFuture<HttpResponseFor<UnenrolledIndividualBenefitResponse>> =
            unenrollMany(benefitId, params, RequestOptions.none())

        /** @see unenrollMany */
        fun unenrollMany(
            benefitId: String,
            params: HrisBenefitIndividualUnenrollManyParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<UnenrolledIndividualBenefitResponse>> =
            unenrollMany(params.toBuilder().benefitId(benefitId).build(), requestOptions)

        /** @see unenrollMany */
        fun unenrollMany(
            params: HrisBenefitIndividualUnenrollManyParams
        ): CompletableFuture<HttpResponseFor<UnenrolledIndividualBenefitResponse>> =
            unenrollMany(params, RequestOptions.none())

        /** @see unenrollMany */
        fun unenrollMany(
            params: HrisBenefitIndividualUnenrollManyParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<UnenrolledIndividualBenefitResponse>>
    }
}
