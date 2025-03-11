// File generated from our OpenAPI spec by Stainless.

package com.tryfinch.api.services.blocking.hris.benefits

import com.google.errorprone.annotations.MustBeClosed
import com.tryfinch.api.core.RequestOptions
import com.tryfinch.api.core.http.HttpResponseFor
import com.tryfinch.api.models.HrisBenefitIndividualEnrolledIdsParams
import com.tryfinch.api.models.HrisBenefitIndividualRetrieveManyBenefitsPage
import com.tryfinch.api.models.HrisBenefitIndividualRetrieveManyBenefitsParams
import com.tryfinch.api.models.HrisBenefitIndividualUnenrollManyPage
import com.tryfinch.api.models.HrisBenefitIndividualUnenrollManyParams
import com.tryfinch.api.models.IndividualEnrolledIdsResponse

interface IndividualService {

    /**
     * Returns a view of this service that provides access to raw HTTP responses for
     * each method.
     */
    fun withRawResponse(): WithRawResponse

    /** Lists individuals currently enrolled in a given deduction. */
    fun enrolledIds(params: HrisBenefitIndividualEnrolledIdsParams): IndividualEnrolledIdsResponse =
        enrolledIds(
          params, RequestOptions.none()
        )

    /** @see [enrolledIds] */
    fun enrolledIds(params: HrisBenefitIndividualEnrolledIdsParams, requestOptions: RequestOptions = RequestOptions.none()): IndividualEnrolledIdsResponse

    /** Get enrollment information for the given individuals. */
    fun retrieveManyBenefits(params: HrisBenefitIndividualRetrieveManyBenefitsParams): HrisBenefitIndividualRetrieveManyBenefitsPage =
        retrieveManyBenefits(
          params, RequestOptions.none()
        )

    /** @see [retrieveManyBenefits] */
    fun retrieveManyBenefits(params: HrisBenefitIndividualRetrieveManyBenefitsParams, requestOptions: RequestOptions = RequestOptions.none()): HrisBenefitIndividualRetrieveManyBenefitsPage

    /** Unenroll individuals from a deduction or contribution */
    fun unenrollMany(params: HrisBenefitIndividualUnenrollManyParams): HrisBenefitIndividualUnenrollManyPage =
        unenrollMany(
          params, RequestOptions.none()
        )

    /** @see [unenrollMany] */
    fun unenrollMany(params: HrisBenefitIndividualUnenrollManyParams, requestOptions: RequestOptions = RequestOptions.none()): HrisBenefitIndividualUnenrollManyPage

    /**
     * A view of [IndividualService] that provides access to raw HTTP responses for
     * each method.
     */
    interface WithRawResponse {

        /**
         * Returns a raw HTTP response for `get /employer/benefits/{benefit_id}/enrolled`,
         * but is otherwise the same as [IndividualService.enrolledIds].
         */
        @MustBeClosed
        fun enrolledIds(params: HrisBenefitIndividualEnrolledIdsParams): HttpResponseFor<IndividualEnrolledIdsResponse> =
            enrolledIds(
              params, RequestOptions.none()
            )

        /** @see [enrolledIds] */
        @MustBeClosed
        fun enrolledIds(params: HrisBenefitIndividualEnrolledIdsParams, requestOptions: RequestOptions = RequestOptions.none()): HttpResponseFor<IndividualEnrolledIdsResponse>

        /**
         * Returns a raw HTTP response for
         * `get /employer/benefits/{benefit_id}/individuals`, but is otherwise the same as
         * [IndividualService.retrieveManyBenefits].
         */
        @MustBeClosed
        fun retrieveManyBenefits(params: HrisBenefitIndividualRetrieveManyBenefitsParams): HttpResponseFor<HrisBenefitIndividualRetrieveManyBenefitsPage> =
            retrieveManyBenefits(
              params, RequestOptions.none()
            )

        /** @see [retrieveManyBenefits] */
        @MustBeClosed
        fun retrieveManyBenefits(params: HrisBenefitIndividualRetrieveManyBenefitsParams, requestOptions: RequestOptions = RequestOptions.none()): HttpResponseFor<HrisBenefitIndividualRetrieveManyBenefitsPage>

        /**
         * Returns a raw HTTP response for
         * `delete /employer/benefits/{benefit_id}/individuals`, but is otherwise the same
         * as [IndividualService.unenrollMany].
         */
        @MustBeClosed
        fun unenrollMany(params: HrisBenefitIndividualUnenrollManyParams): HttpResponseFor<HrisBenefitIndividualUnenrollManyPage> =
            unenrollMany(
              params, RequestOptions.none()
            )

        /** @see [unenrollMany] */
        @MustBeClosed
        fun unenrollMany(params: HrisBenefitIndividualUnenrollManyParams, requestOptions: RequestOptions = RequestOptions.none()): HttpResponseFor<HrisBenefitIndividualUnenrollManyPage>
    }
}
