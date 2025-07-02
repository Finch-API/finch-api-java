// File generated from our OpenAPI spec by Stainless.

package com.tryfinch.api.services.blocking.hris.benefits

import com.google.errorprone.annotations.MustBeClosed
import com.tryfinch.api.core.ClientOptions
import com.tryfinch.api.core.RequestOptions
import com.tryfinch.api.core.http.HttpResponseFor
import com.tryfinch.api.models.HrisBenefitIndividualEnrolledIdsParams
import com.tryfinch.api.models.HrisBenefitIndividualRetrieveManyBenefitsPage
import com.tryfinch.api.models.HrisBenefitIndividualRetrieveManyBenefitsParams
import com.tryfinch.api.models.HrisBenefitIndividualUnenrollManyParams
import com.tryfinch.api.models.IndividualEnrolledIdsResponse
import com.tryfinch.api.models.UnenrolledIndividualBenefitResponse
import java.util.function.Consumer

interface IndividualService {

    /**
     * Returns a view of this service that provides access to raw HTTP responses for each method.
     */
    fun withRawResponse(): WithRawResponse

    /**
     * Returns a view of this service with the given option modifications applied.
     *
     * The original service is not modified.
     */
    fun withOptions(modifier: Consumer<ClientOptions.Builder>): IndividualService

    /** Lists individuals currently enrolled in a given deduction. */
    fun enrolledIds(benefitId: String): IndividualEnrolledIdsResponse =
        enrolledIds(benefitId, HrisBenefitIndividualEnrolledIdsParams.none())

    /** @see [enrolledIds] */
    fun enrolledIds(
        benefitId: String,
        params: HrisBenefitIndividualEnrolledIdsParams =
            HrisBenefitIndividualEnrolledIdsParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): IndividualEnrolledIdsResponse =
        enrolledIds(params.toBuilder().benefitId(benefitId).build(), requestOptions)

    /** @see [enrolledIds] */
    fun enrolledIds(
        benefitId: String,
        params: HrisBenefitIndividualEnrolledIdsParams =
            HrisBenefitIndividualEnrolledIdsParams.none(),
    ): IndividualEnrolledIdsResponse = enrolledIds(benefitId, params, RequestOptions.none())

    /** @see [enrolledIds] */
    fun enrolledIds(
        params: HrisBenefitIndividualEnrolledIdsParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): IndividualEnrolledIdsResponse

    /** @see [enrolledIds] */
    fun enrolledIds(params: HrisBenefitIndividualEnrolledIdsParams): IndividualEnrolledIdsResponse =
        enrolledIds(params, RequestOptions.none())

    /** @see [enrolledIds] */
    fun enrolledIds(
        benefitId: String,
        requestOptions: RequestOptions,
    ): IndividualEnrolledIdsResponse =
        enrolledIds(benefitId, HrisBenefitIndividualEnrolledIdsParams.none(), requestOptions)

    /** Get enrollment information for the given individuals. */
    fun retrieveManyBenefits(benefitId: String): HrisBenefitIndividualRetrieveManyBenefitsPage =
        retrieveManyBenefits(benefitId, HrisBenefitIndividualRetrieveManyBenefitsParams.none())

    /** @see [retrieveManyBenefits] */
    fun retrieveManyBenefits(
        benefitId: String,
        params: HrisBenefitIndividualRetrieveManyBenefitsParams =
            HrisBenefitIndividualRetrieveManyBenefitsParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): HrisBenefitIndividualRetrieveManyBenefitsPage =
        retrieveManyBenefits(params.toBuilder().benefitId(benefitId).build(), requestOptions)

    /** @see [retrieveManyBenefits] */
    fun retrieveManyBenefits(
        benefitId: String,
        params: HrisBenefitIndividualRetrieveManyBenefitsParams =
            HrisBenefitIndividualRetrieveManyBenefitsParams.none(),
    ): HrisBenefitIndividualRetrieveManyBenefitsPage =
        retrieveManyBenefits(benefitId, params, RequestOptions.none())

    /** @see [retrieveManyBenefits] */
    fun retrieveManyBenefits(
        params: HrisBenefitIndividualRetrieveManyBenefitsParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): HrisBenefitIndividualRetrieveManyBenefitsPage

    /** @see [retrieveManyBenefits] */
    fun retrieveManyBenefits(
        params: HrisBenefitIndividualRetrieveManyBenefitsParams
    ): HrisBenefitIndividualRetrieveManyBenefitsPage =
        retrieveManyBenefits(params, RequestOptions.none())

    /** @see [retrieveManyBenefits] */
    fun retrieveManyBenefits(
        benefitId: String,
        requestOptions: RequestOptions,
    ): HrisBenefitIndividualRetrieveManyBenefitsPage =
        retrieveManyBenefits(
            benefitId,
            HrisBenefitIndividualRetrieveManyBenefitsParams.none(),
            requestOptions,
        )

    /** Unenroll individuals from a deduction or contribution */
    fun unenrollMany(benefitId: String): UnenrolledIndividualBenefitResponse =
        unenrollMany(benefitId, HrisBenefitIndividualUnenrollManyParams.none())

    /** @see [unenrollMany] */
    fun unenrollMany(
        benefitId: String,
        params: HrisBenefitIndividualUnenrollManyParams =
            HrisBenefitIndividualUnenrollManyParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): UnenrolledIndividualBenefitResponse =
        unenrollMany(params.toBuilder().benefitId(benefitId).build(), requestOptions)

    /** @see [unenrollMany] */
    fun unenrollMany(
        benefitId: String,
        params: HrisBenefitIndividualUnenrollManyParams =
            HrisBenefitIndividualUnenrollManyParams.none(),
    ): UnenrolledIndividualBenefitResponse = unenrollMany(benefitId, params, RequestOptions.none())

    /** @see [unenrollMany] */
    fun unenrollMany(
        params: HrisBenefitIndividualUnenrollManyParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): UnenrolledIndividualBenefitResponse

    /** @see [unenrollMany] */
    fun unenrollMany(
        params: HrisBenefitIndividualUnenrollManyParams
    ): UnenrolledIndividualBenefitResponse = unenrollMany(params, RequestOptions.none())

    /** @see [unenrollMany] */
    fun unenrollMany(
        benefitId: String,
        requestOptions: RequestOptions,
    ): UnenrolledIndividualBenefitResponse =
        unenrollMany(benefitId, HrisBenefitIndividualUnenrollManyParams.none(), requestOptions)

    /** A view of [IndividualService] that provides access to raw HTTP responses for each method. */
    interface WithRawResponse {

        /**
         * Returns a view of this service with the given option modifications applied.
         *
         * The original service is not modified.
         */
        fun withOptions(
            modifier: Consumer<ClientOptions.Builder>
        ): IndividualService.WithRawResponse

        /**
         * Returns a raw HTTP response for `get /employer/benefits/{benefit_id}/enrolled`, but is
         * otherwise the same as [IndividualService.enrolledIds].
         */
        @MustBeClosed
        fun enrolledIds(benefitId: String): HttpResponseFor<IndividualEnrolledIdsResponse> =
            enrolledIds(benefitId, HrisBenefitIndividualEnrolledIdsParams.none())

        /** @see [enrolledIds] */
        @MustBeClosed
        fun enrolledIds(
            benefitId: String,
            params: HrisBenefitIndividualEnrolledIdsParams =
                HrisBenefitIndividualEnrolledIdsParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<IndividualEnrolledIdsResponse> =
            enrolledIds(params.toBuilder().benefitId(benefitId).build(), requestOptions)

        /** @see [enrolledIds] */
        @MustBeClosed
        fun enrolledIds(
            benefitId: String,
            params: HrisBenefitIndividualEnrolledIdsParams =
                HrisBenefitIndividualEnrolledIdsParams.none(),
        ): HttpResponseFor<IndividualEnrolledIdsResponse> =
            enrolledIds(benefitId, params, RequestOptions.none())

        /** @see [enrolledIds] */
        @MustBeClosed
        fun enrolledIds(
            params: HrisBenefitIndividualEnrolledIdsParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<IndividualEnrolledIdsResponse>

        /** @see [enrolledIds] */
        @MustBeClosed
        fun enrolledIds(
            params: HrisBenefitIndividualEnrolledIdsParams
        ): HttpResponseFor<IndividualEnrolledIdsResponse> =
            enrolledIds(params, RequestOptions.none())

        /** @see [enrolledIds] */
        @MustBeClosed
        fun enrolledIds(
            benefitId: String,
            requestOptions: RequestOptions,
        ): HttpResponseFor<IndividualEnrolledIdsResponse> =
            enrolledIds(benefitId, HrisBenefitIndividualEnrolledIdsParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `get /employer/benefits/{benefit_id}/individuals`, but is
         * otherwise the same as [IndividualService.retrieveManyBenefits].
         */
        @MustBeClosed
        fun retrieveManyBenefits(
            benefitId: String
        ): HttpResponseFor<HrisBenefitIndividualRetrieveManyBenefitsPage> =
            retrieveManyBenefits(benefitId, HrisBenefitIndividualRetrieveManyBenefitsParams.none())

        /** @see [retrieveManyBenefits] */
        @MustBeClosed
        fun retrieveManyBenefits(
            benefitId: String,
            params: HrisBenefitIndividualRetrieveManyBenefitsParams =
                HrisBenefitIndividualRetrieveManyBenefitsParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<HrisBenefitIndividualRetrieveManyBenefitsPage> =
            retrieveManyBenefits(params.toBuilder().benefitId(benefitId).build(), requestOptions)

        /** @see [retrieveManyBenefits] */
        @MustBeClosed
        fun retrieveManyBenefits(
            benefitId: String,
            params: HrisBenefitIndividualRetrieveManyBenefitsParams =
                HrisBenefitIndividualRetrieveManyBenefitsParams.none(),
        ): HttpResponseFor<HrisBenefitIndividualRetrieveManyBenefitsPage> =
            retrieveManyBenefits(benefitId, params, RequestOptions.none())

        /** @see [retrieveManyBenefits] */
        @MustBeClosed
        fun retrieveManyBenefits(
            params: HrisBenefitIndividualRetrieveManyBenefitsParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<HrisBenefitIndividualRetrieveManyBenefitsPage>

        /** @see [retrieveManyBenefits] */
        @MustBeClosed
        fun retrieveManyBenefits(
            params: HrisBenefitIndividualRetrieveManyBenefitsParams
        ): HttpResponseFor<HrisBenefitIndividualRetrieveManyBenefitsPage> =
            retrieveManyBenefits(params, RequestOptions.none())

        /** @see [retrieveManyBenefits] */
        @MustBeClosed
        fun retrieveManyBenefits(
            benefitId: String,
            requestOptions: RequestOptions,
        ): HttpResponseFor<HrisBenefitIndividualRetrieveManyBenefitsPage> =
            retrieveManyBenefits(
                benefitId,
                HrisBenefitIndividualRetrieveManyBenefitsParams.none(),
                requestOptions,
            )

        /**
         * Returns a raw HTTP response for `delete /employer/benefits/{benefit_id}/individuals`, but
         * is otherwise the same as [IndividualService.unenrollMany].
         */
        @MustBeClosed
        fun unenrollMany(benefitId: String): HttpResponseFor<UnenrolledIndividualBenefitResponse> =
            unenrollMany(benefitId, HrisBenefitIndividualUnenrollManyParams.none())

        /** @see [unenrollMany] */
        @MustBeClosed
        fun unenrollMany(
            benefitId: String,
            params: HrisBenefitIndividualUnenrollManyParams =
                HrisBenefitIndividualUnenrollManyParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<UnenrolledIndividualBenefitResponse> =
            unenrollMany(params.toBuilder().benefitId(benefitId).build(), requestOptions)

        /** @see [unenrollMany] */
        @MustBeClosed
        fun unenrollMany(
            benefitId: String,
            params: HrisBenefitIndividualUnenrollManyParams =
                HrisBenefitIndividualUnenrollManyParams.none(),
        ): HttpResponseFor<UnenrolledIndividualBenefitResponse> =
            unenrollMany(benefitId, params, RequestOptions.none())

        /** @see [unenrollMany] */
        @MustBeClosed
        fun unenrollMany(
            params: HrisBenefitIndividualUnenrollManyParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<UnenrolledIndividualBenefitResponse>

        /** @see [unenrollMany] */
        @MustBeClosed
        fun unenrollMany(
            params: HrisBenefitIndividualUnenrollManyParams
        ): HttpResponseFor<UnenrolledIndividualBenefitResponse> =
            unenrollMany(params, RequestOptions.none())

        /** @see [unenrollMany] */
        @MustBeClosed
        fun unenrollMany(
            benefitId: String,
            requestOptions: RequestOptions,
        ): HttpResponseFor<UnenrolledIndividualBenefitResponse> =
            unenrollMany(benefitId, HrisBenefitIndividualUnenrollManyParams.none(), requestOptions)
    }
}
