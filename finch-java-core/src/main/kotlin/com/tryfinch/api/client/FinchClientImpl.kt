// File generated from our OpenAPI spec by Stainless.

package com.tryfinch.api.client

import com.tryfinch.api.core.ClientOptions
import com.tryfinch.api.core.http.HttpResponse.Handler
import com.tryfinch.api.errors.FinchError
import com.tryfinch.api.models.*
import com.tryfinch.api.services.blocking.*
import com.tryfinch.api.services.errorHandler

class FinchClientImpl
constructor(
    private val clientOptions: ClientOptions,
) : FinchClient {

    private val errorHandler: Handler<FinchError> = errorHandler(clientOptions.jsonMapper)

    private val async: FinchClientAsync by lazy { FinchClientAsyncImpl(clientOptions) }

    private val accessTokens: AccessTokenService by lazy { AccessTokenServiceImpl(clientOptions) }

    private val hris: HrisService by lazy { HrisServiceImpl(clientOptions) }

    private val providers: ProviderService by lazy { ProviderServiceImpl(clientOptions) }

    private val account: AccountService by lazy { AccountServiceImpl(clientOptions) }

    private val webhooks: WebhookService by lazy { WebhookServiceImpl(clientOptions) }

    private val requestForwarding: RequestForwardingService by lazy {
        RequestForwardingServiceImpl(clientOptions)
    }

    private val jobs: JobService by lazy { JobServiceImpl(clientOptions) }

    private val sandbox: SandboxService by lazy { SandboxServiceImpl(clientOptions) }

    override fun async(): FinchClientAsync = async

    override fun accessTokens(): AccessTokenService = accessTokens

    override fun hris(): HrisService = hris

    override fun providers(): ProviderService = providers

    override fun account(): AccountService = account

    override fun webhooks(): WebhookService = webhooks

    override fun requestForwarding(): RequestForwardingService = requestForwarding

    override fun jobs(): JobService = jobs

    override fun sandbox(): SandboxService = sandbox
}
