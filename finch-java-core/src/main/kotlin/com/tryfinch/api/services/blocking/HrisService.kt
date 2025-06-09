// File generated from our OpenAPI spec by Stainless.

package com.tryfinch.api.services.blocking

import com.tryfinch.api.services.blocking.hris.BenefitService
import com.tryfinch.api.services.blocking.hris.CompanyService
import com.tryfinch.api.services.blocking.hris.DirectoryService
import com.tryfinch.api.services.blocking.hris.DocumentService
import com.tryfinch.api.services.blocking.hris.EmploymentService
import com.tryfinch.api.services.blocking.hris.IndividualService
import com.tryfinch.api.services.blocking.hris.PayStatementService
import com.tryfinch.api.services.blocking.hris.PaymentService

interface HrisService {

    /**
     * Returns a view of this service that provides access to raw HTTP responses for each method.
     */
    fun withRawResponse(): WithRawResponse

    fun company(): CompanyService

    fun directory(): DirectoryService

    fun individuals(): IndividualService

    fun employments(): EmploymentService

    fun payments(): PaymentService

    fun payStatements(): PayStatementService

    fun documents(): DocumentService

    fun benefits(): BenefitService

    /** A view of [HrisService] that provides access to raw HTTP responses for each method. */
    interface WithRawResponse {

        fun company(): CompanyService.WithRawResponse

        fun directory(): DirectoryService.WithRawResponse

        fun individuals(): IndividualService.WithRawResponse

        fun employments(): EmploymentService.WithRawResponse

        fun payments(): PaymentService.WithRawResponse

        fun payStatements(): PayStatementService.WithRawResponse

        fun documents(): DocumentService.WithRawResponse

        fun benefits(): BenefitService.WithRawResponse
    }
}
