// File generated from our OpenAPI spec by Stainless.

package com.tryfinch.api.client

import com.fasterxml.jackson.annotation.JsonProperty
import com.tryfinch.api.core.ClientOptions
import com.tryfinch.api.core.handlers.errorHandler
import com.tryfinch.api.core.handlers.jsonHandler
import com.tryfinch.api.core.handlers.withErrorHandler
import com.tryfinch.api.core.http.HttpMethod
import com.tryfinch.api.core.http.HttpRequest
import com.tryfinch.api.core.http.HttpResponse.Handler
import com.tryfinch.api.core.json
import com.tryfinch.api.errors.FinchError
import com.tryfinch.api.errors.FinchException
import com.tryfinch.api.models.*
import com.tryfinch.api.services.async.*
import java.net.URLEncoder
import java.util.concurrent.CompletableFuture

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

    private val connect: ConnectServiceAsync by lazy { ConnectServiceAsyncImpl(clientOptions) }

    private val getAccessTokenHandler: Handler<GetAccessTokenResponse> =
        jsonHandler<GetAccessTokenResponse>(clientOptions.jsonMapper).withErrorHandler(errorHandler)

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

    override fun connect(): ConnectServiceAsync = connect

    /** @deprecated use client.accessTokens().create instead */
    @Deprecated("use client.accessTokens().create instead", ReplaceWith("accessTokens().create()"))
    override fun getAccessToken(
        clientId: String,
        clientSecret: String,
        code: String,
        redirectUri: String?
    ): CompletableFuture<String> {
        if (clientOptions.clientId == null) {
            throw FinchException("clientId must be set in order to call getAccessToken")
        }
        if (clientOptions.clientSecret == null) {
            throw FinchException("clientSecret must be set in order to call getAccessToken")
        }
        val request =
            HttpRequest.builder()
                .method(HttpMethod.POST)
                .addPathSegments("auth", "token")
                .body(
                    json(
                        clientOptions.jsonMapper,
                        GetAccessTokenParams(
                            clientId,
                            clientSecret,
                            code,
                            redirectUri,
                        )
                    )
                )
                .build()
        return clientOptions.httpClient.executeAsync(request).thenApply {
            getAccessTokenHandler.handle(it).accessToken
        }
    }

    override fun getAuthUrl(products: String, redirectUri: String, sandbox: Boolean): String {
        if (clientOptions.clientId == null) {
            throw FinchException("Expected the clientId to be set in order to call getAuthUrl")
        }
        return "https://connect.tryfinch.com/authorize" +
            "?client_id=${URLEncoder.encode(clientOptions.clientId, Charsets.UTF_8.name())}" +
            "&products=${URLEncoder.encode(products, Charsets.UTF_8.name())}" +
            "&redirect_uri=${URLEncoder.encode(redirectUri, Charsets.UTF_8.name())}" +
            "&sandbox=${if (sandbox) "true" else "false"}"
    }

    override fun withAccessToken(accessToken: String): FinchClientAsync {
        return FinchClientAsyncImpl(
            ClientOptions.builder()
                .httpClient(clientOptions.httpClient)
                .jsonMapper(clientOptions.jsonMapper)
                .clock(clientOptions.clock)
                .baseUrl(clientOptions.baseUrl)
                .accessToken(accessToken)
                .clientId(clientOptions.clientId)
                .clientSecret(clientOptions.clientSecret)
                .webhookSecret(clientOptions.webhookSecret)
                .headers(clientOptions.headers.asMap())
                .responseValidation(clientOptions.responseValidation)
                .build()
        )
    }

    private data class GetAccessTokenParams(
        @JsonProperty("client_id") val clientId: String,
        @JsonProperty("client_secret") val clientSecret: String,
        @JsonProperty("code") val code: String,
        @JsonProperty("redirect_uri") val redirectUri: String?,
    )

    private data class GetAccessTokenResponse(
        @JsonProperty("access_token") val accessToken: String,
        @JsonProperty("account_id") val accountId: String,
        @JsonProperty("client_type") val clientType: String,
        @JsonProperty("company_id") val companyId: String,
        @JsonProperty("connection_type") val connectionType: String,
        @JsonProperty("products") val products: List<String>,
        @JsonProperty("provider_id") val providerId: String,
    )
}
