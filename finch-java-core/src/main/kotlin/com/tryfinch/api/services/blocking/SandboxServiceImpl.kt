// File generated from our OpenAPI spec by Stainless.

package com.tryfinch.api.services.blocking

import com.tryfinch.api.core.ClientOptions
import com.tryfinch.api.services.blocking.sandbox.CompanyService
import com.tryfinch.api.services.blocking.sandbox.CompanyServiceImpl
import com.tryfinch.api.services.blocking.sandbox.ConnectionService
import com.tryfinch.api.services.blocking.sandbox.ConnectionServiceImpl
import com.tryfinch.api.services.blocking.sandbox.DirectoryService
import com.tryfinch.api.services.blocking.sandbox.DirectoryServiceImpl
import com.tryfinch.api.services.blocking.sandbox.EmploymentService
import com.tryfinch.api.services.blocking.sandbox.EmploymentServiceImpl
import com.tryfinch.api.services.blocking.sandbox.IndividualService
import com.tryfinch.api.services.blocking.sandbox.IndividualServiceImpl
import com.tryfinch.api.services.blocking.sandbox.JobService
import com.tryfinch.api.services.blocking.sandbox.JobServiceImpl
import com.tryfinch.api.services.blocking.sandbox.PaymentService
import com.tryfinch.api.services.blocking.sandbox.PaymentServiceImpl

class SandboxServiceImpl internal constructor(
    private val clientOptions: ClientOptions,

) : SandboxService {

    private val withRawResponse: SandboxService.WithRawResponse by lazy { WithRawResponseImpl(clientOptions) }

    private val connections: ConnectionService by lazy { ConnectionServiceImpl(clientOptions) }

    private val company: CompanyService by lazy { CompanyServiceImpl(clientOptions) }

    private val directory: DirectoryService by lazy { DirectoryServiceImpl(clientOptions) }

    private val individual: IndividualService by lazy { IndividualServiceImpl(clientOptions) }

    private val employment: EmploymentService by lazy { EmploymentServiceImpl(clientOptions) }

    private val payment: PaymentService by lazy { PaymentServiceImpl(clientOptions) }

    private val jobs: JobService by lazy { JobServiceImpl(clientOptions) }

    override fun withRawResponse(): SandboxService.WithRawResponse = withRawResponse

    override fun connections(): ConnectionService = connections

    override fun company(): CompanyService = company

    override fun directory(): DirectoryService = directory

    override fun individual(): IndividualService = individual

    override fun employment(): EmploymentService = employment

    override fun payment(): PaymentService = payment

    override fun jobs(): JobService = jobs

    class WithRawResponseImpl internal constructor(
        private val clientOptions: ClientOptions,

    ) : SandboxService.WithRawResponse {

        private val connections: ConnectionService.WithRawResponse by lazy { ConnectionServiceImpl.WithRawResponseImpl(clientOptions) }

        private val company: CompanyService.WithRawResponse by lazy { CompanyServiceImpl.WithRawResponseImpl(clientOptions) }

        private val directory: DirectoryService.WithRawResponse by lazy { DirectoryServiceImpl.WithRawResponseImpl(clientOptions) }

        private val individual: IndividualService.WithRawResponse by lazy { IndividualServiceImpl.WithRawResponseImpl(clientOptions) }

        private val employment: EmploymentService.WithRawResponse by lazy { EmploymentServiceImpl.WithRawResponseImpl(clientOptions) }

        private val payment: PaymentService.WithRawResponse by lazy { PaymentServiceImpl.WithRawResponseImpl(clientOptions) }

        private val jobs: JobService.WithRawResponse by lazy { JobServiceImpl.WithRawResponseImpl(clientOptions) }

        override fun connections(): ConnectionService.WithRawResponse = connections

        override fun company(): CompanyService.WithRawResponse = company

        override fun directory(): DirectoryService.WithRawResponse = directory

        override fun individual(): IndividualService.WithRawResponse = individual

        override fun employment(): EmploymentService.WithRawResponse = employment

        override fun payment(): PaymentService.WithRawResponse = payment

        override fun jobs(): JobService.WithRawResponse = jobs
    }
}
