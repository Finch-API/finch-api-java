// File generated from our OpenAPI spec by Stainless.

package com.tryfinch.api.client

import com.tryfinch.api.core.ClientOptions
import com.tryfinch.api.core.getPackageVersion
import com.tryfinch.api.services.blocking.AccessTokenService
import com.tryfinch.api.services.blocking.AccessTokenServiceImpl
import com.tryfinch.api.services.blocking.AccountService
import com.tryfinch.api.services.blocking.AccountServiceImpl
import com.tryfinch.api.services.blocking.ConnectService
import com.tryfinch.api.services.blocking.ConnectServiceImpl
import com.tryfinch.api.services.blocking.HrisService
import com.tryfinch.api.services.blocking.HrisServiceImpl
import com.tryfinch.api.services.blocking.JobService
import com.tryfinch.api.services.blocking.JobServiceImpl
import com.tryfinch.api.services.blocking.PayrollService
import com.tryfinch.api.services.blocking.PayrollServiceImpl
import com.tryfinch.api.services.blocking.ProviderService
import com.tryfinch.api.services.blocking.ProviderServiceImpl
import com.tryfinch.api.services.blocking.RequestForwardingService
import com.tryfinch.api.services.blocking.RequestForwardingServiceImpl
import com.tryfinch.api.services.blocking.SandboxService
import com.tryfinch.api.services.blocking.SandboxServiceImpl
import com.tryfinch.api.services.blocking.WebhookService
import com.tryfinch.api.services.blocking.WebhookServiceImpl
import java.util.function.Consumer

class FinchClientImpl(private val clientOptions: ClientOptions) : FinchClient {

    private val clientOptionsWithUserAgent =
        if (clientOptions.headers.names().contains("User-Agent")) clientOptions
        else
            clientOptions
                .toBuilder()
                .putHeader("User-Agent", "${javaClass.simpleName}/Java ${getPackageVersion()}")
                .build()

    // Pass the original clientOptions so that this client sets its own User-Agent.
    private val async: FinchClientAsync by lazy { FinchClientAsyncImpl(clientOptions) }

    private val withRawResponse: FinchClient.WithRawResponse by lazy {
        WithRawResponseImpl(clientOptions)
    }

    private val accessTokens: AccessTokenService by lazy {
        AccessTokenServiceImpl(clientOptionsWithUserAgent)
    }

    private val hris: HrisService by lazy { HrisServiceImpl(clientOptionsWithUserAgent) }

    private val providers: ProviderService by lazy {
        ProviderServiceImpl(clientOptionsWithUserAgent)
    }

    private val account: AccountService by lazy { AccountServiceImpl(clientOptionsWithUserAgent) }

    private val webhooks: WebhookService by lazy { WebhookServiceImpl(clientOptionsWithUserAgent) }

    private val requestForwarding: RequestForwardingService by lazy {
        RequestForwardingServiceImpl(clientOptionsWithUserAgent)
    }

    private val jobs: JobService by lazy { JobServiceImpl(clientOptionsWithUserAgent) }

    private val sandbox: SandboxService by lazy { SandboxServiceImpl(clientOptionsWithUserAgent) }

    private val payroll: PayrollService by lazy { PayrollServiceImpl(clientOptionsWithUserAgent) }

    private val connect: ConnectService by lazy { ConnectServiceImpl(clientOptionsWithUserAgent) }

    override fun async(): FinchClientAsync = async

    override fun withRawResponse(): FinchClient.WithRawResponse = withRawResponse

    override fun withOptions(modifier: Consumer<ClientOptions.Builder>): FinchClient =
        FinchClientImpl(clientOptions.toBuilder().apply(modifier::accept).build())

    override fun accessTokens(): AccessTokenService = accessTokens

    override fun hris(): HrisService = hris

    override fun providers(): ProviderService = providers

    override fun account(): AccountService = account

    override fun webhooks(): WebhookService = webhooks

    override fun requestForwarding(): RequestForwardingService = requestForwarding

    override fun jobs(): JobService = jobs

    override fun sandbox(): SandboxService = sandbox

    override fun payroll(): PayrollService = payroll

    override fun connect(): ConnectService = connect

    override fun close() = clientOptions.httpClient.close()

    class WithRawResponseImpl internal constructor(private val clientOptions: ClientOptions) :
        FinchClient.WithRawResponse {

        private val accessTokens: AccessTokenService.WithRawResponse by lazy {
            AccessTokenServiceImpl.WithRawResponseImpl(clientOptions)
        }

        private val hris: HrisService.WithRawResponse by lazy {
            HrisServiceImpl.WithRawResponseImpl(clientOptions)
        }

        private val providers: ProviderService.WithRawResponse by lazy {
            ProviderServiceImpl.WithRawResponseImpl(clientOptions)
        }

        private val account: AccountService.WithRawResponse by lazy {
            AccountServiceImpl.WithRawResponseImpl(clientOptions)
        }

        private val webhooks: WebhookService.WithRawResponse by lazy {
            WebhookServiceImpl.WithRawResponseImpl(clientOptions)
        }

        private val requestForwarding: RequestForwardingService.WithRawResponse by lazy {
            RequestForwardingServiceImpl.WithRawResponseImpl(clientOptions)
        }

        private val jobs: JobService.WithRawResponse by lazy {
            JobServiceImpl.WithRawResponseImpl(clientOptions)
        }

        private val sandbox: SandboxService.WithRawResponse by lazy {
            SandboxServiceImpl.WithRawResponseImpl(clientOptions)
        }

        private val payroll: PayrollService.WithRawResponse by lazy {
            PayrollServiceImpl.WithRawResponseImpl(clientOptions)
        }

        private val connect: ConnectService.WithRawResponse by lazy {
            ConnectServiceImpl.WithRawResponseImpl(clientOptions)
        }

        override fun withOptions(
            modifier: Consumer<ClientOptions.Builder>
        ): FinchClient.WithRawResponse =
            FinchClientImpl.WithRawResponseImpl(
                clientOptions.toBuilder().apply(modifier::accept).build()
            )

        override fun accessTokens(): AccessTokenService.WithRawResponse = accessTokens

        override fun hris(): HrisService.WithRawResponse = hris

        override fun providers(): ProviderService.WithRawResponse = providers

        override fun account(): AccountService.WithRawResponse = account

        override fun webhooks(): WebhookService.WithRawResponse = webhooks

        override fun requestForwarding(): RequestForwardingService.WithRawResponse =
            requestForwarding

        override fun jobs(): JobService.WithRawResponse = jobs

        override fun sandbox(): SandboxService.WithRawResponse = sandbox

        override fun payroll(): PayrollService.WithRawResponse = payroll

        override fun connect(): ConnectService.WithRawResponse = connect
    }
}
