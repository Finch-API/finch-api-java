// File generated from our OpenAPI spec by Stainless.

package com.tryfinch.api.client

import com.tryfinch.api.core.ClientOptions
import com.tryfinch.api.core.http.HttpResponse.Handler
import com.tryfinch.api.errors.FinchError
import com.tryfinch.api.models.*
import com.tryfinch.api.services.async.*
import com.tryfinch.api.services.errorHandler

class FinchClientAsyncImpl
constructor(
    private val clientOptions: ClientOptions,
) : FinchClientAsync {

    private val errorHandler: Handler<FinchError> = errorHandler(clientOptions.jsonMapper)

    private val sync: FinchClient by lazy { FinchClientImpl(clientOptions) }

    private val accessTokens: AccessTokenServiceAsync by lazy {
        AccessTokenServiceAsyncImpl(clientOptions)
    }

    private val hris: HrisServiceAsync by lazy { HrisServiceAsyncImpl(clientOptions) }

    private val providers: ProviderServiceAsync by lazy { ProviderServiceAsyncImpl(clientOptions) }

    private val account: AccountServiceAsync by lazy { AccountServiceAsyncImpl(clientOptions) }

    private val webhooks: WebhookServiceAsync by lazy { WebhookServiceAsyncImpl(clientOptions) }

    private val requestForwarding: RequestForwardingServiceAsync by lazy {
        RequestForwardingServiceAsyncImpl(clientOptions)
    }

    private val jobs: JobServiceAsync by lazy { JobServiceAsyncImpl(clientOptions) }

    private val sandbox: SandboxServiceAsync by lazy { SandboxServiceAsyncImpl(clientOptions) }

    private val payroll: PayrollServiceAsync by lazy { PayrollServiceAsyncImpl(clientOptions) }

    override fun sync(): FinchClient = sync

    override fun accessTokens(): AccessTokenServiceAsync = accessTokens

    override fun hris(): HrisServiceAsync = hris

    override fun providers(): ProviderServiceAsync = providers

    override fun account(): AccountServiceAsync = account

    override fun webhooks(): WebhookServiceAsync = webhooks

    override fun requestForwarding(): RequestForwardingServiceAsync = requestForwarding

    override fun jobs(): JobServiceAsync = jobs

    override fun sandbox(): SandboxServiceAsync = sandbox

    override fun payroll(): PayrollServiceAsync = payroll
}
