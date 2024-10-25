// File generated from our OpenAPI spec by Stainless.

package com.tryfinch.api.client

import com.tryfinch.api.core.ClientOptions
import com.tryfinch.api.core.getPackageVersion
import com.tryfinch.api.models.*
import com.tryfinch.api.services.blocking.*

class FinchClientImpl
constructor(
    private val clientOptions: ClientOptions,
) : FinchClient {

    private val clientOptionsWithUserAgent =
        if (clientOptions.headers.containsKey("User-Agent")) clientOptions
        else
            clientOptions
                .toBuilder()
                .putHeader("User-Agent", "${javaClass.simpleName}/Java ${getPackageVersion()}")
                .build()

    // Pass the original clientOptions so that this client sets its own User-Agent.
    private val async: FinchClientAsync by lazy { FinchClientAsyncImpl(clientOptions) }

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
}
