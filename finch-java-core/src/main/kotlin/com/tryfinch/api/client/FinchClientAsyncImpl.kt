// File generated from our OpenAPI spec by Stainless.

package com.tryfinch.api.client

import com.fasterxml.jackson.annotation.JsonProperty
import com.tryfinch.api.core.ClientOptions
import com.tryfinch.api.core.getPackageVersion
import com.tryfinch.api.core.handlers.errorBodyHandler
import com.tryfinch.api.core.handlers.errorHandler
import com.tryfinch.api.core.handlers.jsonHandler
import com.tryfinch.api.core.http.HttpMethod
import com.tryfinch.api.core.http.HttpRequest
import com.tryfinch.api.core.http.HttpResponse
import com.tryfinch.api.core.http.HttpResponse.Handler
import com.tryfinch.api.core.http.json
import com.tryfinch.api.errors.FinchException
import com.tryfinch.api.models.*
import com.tryfinch.api.services.async.AccessTokenServiceAsync
import com.tryfinch.api.services.async.AccessTokenServiceAsyncImpl
import com.tryfinch.api.services.async.AccountServiceAsync
import com.tryfinch.api.services.async.AccountServiceAsyncImpl
import com.tryfinch.api.services.async.ConnectServiceAsync
import com.tryfinch.api.services.async.ConnectServiceAsyncImpl
import com.tryfinch.api.services.async.HrisServiceAsync
import com.tryfinch.api.services.async.HrisServiceAsyncImpl
import com.tryfinch.api.services.async.JobServiceAsync
import com.tryfinch.api.services.async.JobServiceAsyncImpl
import com.tryfinch.api.services.async.PayrollServiceAsync
import com.tryfinch.api.services.async.PayrollServiceAsyncImpl
import com.tryfinch.api.services.async.ProviderServiceAsync
import com.tryfinch.api.services.async.ProviderServiceAsyncImpl
import com.tryfinch.api.services.async.RequestForwardingServiceAsync
import com.tryfinch.api.services.async.RequestForwardingServiceAsyncImpl
import com.tryfinch.api.services.async.SandboxServiceAsync
import com.tryfinch.api.services.async.SandboxServiceAsyncImpl
import com.tryfinch.api.services.async.WebhookServiceAsync
import com.tryfinch.api.services.async.WebhookServiceAsyncImpl
import java.net.URLEncoder
import java.util.concurrent.CompletableFuture
import java.util.function.Consumer

class FinchClientAsyncImpl(private val clientOptions: ClientOptions) : FinchClientAsync {

    private val errorHandler: Handler<HttpResponse> =
        errorHandler(errorBodyHandler(clientOptions.jsonMapper))

    private val clientOptionsWithUserAgent =
        if (clientOptions.headers.names().contains("User-Agent")) clientOptions
        else
            clientOptions
                .toBuilder()
                .putHeader("User-Agent", "${javaClass.simpleName}/Java ${getPackageVersion()}")
                .build()

    private val sync: FinchClient by lazy { FinchClientImpl(clientOptions) }

    private val withRawResponse: FinchClientAsync.WithRawResponse by lazy {
        WithRawResponseImpl(clientOptions)
    }

    private val accessTokens: AccessTokenServiceAsync by lazy {
        AccessTokenServiceAsyncImpl(clientOptionsWithUserAgent)
    }

    private val hris: HrisServiceAsync by lazy { HrisServiceAsyncImpl(clientOptionsWithUserAgent) }

    private val providers: ProviderServiceAsync by lazy {
        ProviderServiceAsyncImpl(clientOptionsWithUserAgent)
    }

    private val account: AccountServiceAsync by lazy {
        AccountServiceAsyncImpl(clientOptionsWithUserAgent)
    }

    private val webhooks: WebhookServiceAsync by lazy {
        WebhookServiceAsyncImpl(clientOptionsWithUserAgent)
    }

    private val requestForwarding: RequestForwardingServiceAsync by lazy {
        RequestForwardingServiceAsyncImpl(clientOptionsWithUserAgent)
    }

    private val jobs: JobServiceAsync by lazy { JobServiceAsyncImpl(clientOptionsWithUserAgent) }

    private val sandbox: SandboxServiceAsync by lazy {
        SandboxServiceAsyncImpl(clientOptionsWithUserAgent)
    }

    private val payroll: PayrollServiceAsync by lazy {
        PayrollServiceAsyncImpl(clientOptionsWithUserAgent)
    }

    private val connect: ConnectServiceAsync by lazy {
        ConnectServiceAsyncImpl(clientOptionsWithUserAgent)
    }

    private val getAccessTokenHandler: Handler<GetAccessTokenResponse> =
        jsonHandler<GetAccessTokenResponse>(clientOptions.jsonMapper)

    override fun sync(): FinchClient = sync

    override fun withRawResponse(): FinchClientAsync.WithRawResponse = withRawResponse

    override fun withOptions(modifier: Consumer<ClientOptions.Builder>): FinchClientAsync =
        FinchClientAsyncImpl(clientOptions.toBuilder().apply(modifier::accept).build())

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
        redirectUri: String?,
    ): CompletableFuture<String> {
        if (!clientOptions.clientId().isPresent) {
            throw FinchException("clientId must be set in order to call getAccessToken")
        }
        if (!clientOptions.clientSecret().isPresent) {
            throw FinchException("clientSecret must be set in order to call getAccessToken")
        }
        val request =
            HttpRequest.builder()
                .method(HttpMethod.POST)
                .baseUrl(clientOptions.baseUrl())
                .addPathSegments("auth", "token")
                .body(
                    json(
                        clientOptions.jsonMapper,
                        GetAccessTokenParams(clientId, clientSecret, code, redirectUri),
                    )
                )
                .build()
        return clientOptions.httpClient.executeAsync(request).thenApply {
            getAccessTokenHandler.handle(errorHandler.handle(it)).accessToken
        }
    }

    override fun getAuthUrl(products: String, redirectUri: String, sandbox: Boolean): String {
        if (!clientOptions.clientId().isPresent) {
            throw FinchException("Expected the clientId to be set in order to call getAuthUrl")
        }
        return "https://connect.tryfinch.com/authorize" +
            "?client_id=${URLEncoder.encode(clientOptions.clientId().get(), Charsets.UTF_8.name())}" +
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
                .baseUrl(clientOptions.baseUrl())
                .accessToken(accessToken)
                .clientId(clientOptions.clientId())
                .clientSecret(clientOptions.clientSecret())
                .webhookSecret(clientOptions.webhookSecret())
                .headers(clientOptions.headers)
                .responseValidation(clientOptions.responseValidation)
                .build()
        )
    }

    private data class GetAccessTokenParams(
        @get:JsonProperty("client_id") val clientId: String,
        @get:JsonProperty("client_secret") val clientSecret: String,
        @get:JsonProperty("code") val code: String,
        @get:JsonProperty("redirect_uri") val redirectUri: String?,
    )

    private data class GetAccessTokenResponse(
        @get:JsonProperty("access_token") val accessToken: String,
        @get:JsonProperty("account_id") val accountId: String,
        @get:JsonProperty("client_type") val clientType: String,
        @get:JsonProperty("company_id") val companyId: String,
        @get:JsonProperty("connection_type") val connectionType: String,
        @get:JsonProperty("products") val products: List<String>,
        @get:JsonProperty("provider_id") val providerId: String,
    )

    override fun close() = clientOptions.httpClient.close()

    class WithRawResponseImpl internal constructor(private val clientOptions: ClientOptions) :
        FinchClientAsync.WithRawResponse {

        private val accessTokens: AccessTokenServiceAsync.WithRawResponse by lazy {
            AccessTokenServiceAsyncImpl.WithRawResponseImpl(clientOptions)
        }

        private val hris: HrisServiceAsync.WithRawResponse by lazy {
            HrisServiceAsyncImpl.WithRawResponseImpl(clientOptions)
        }

        private val providers: ProviderServiceAsync.WithRawResponse by lazy {
            ProviderServiceAsyncImpl.WithRawResponseImpl(clientOptions)
        }

        private val account: AccountServiceAsync.WithRawResponse by lazy {
            AccountServiceAsyncImpl.WithRawResponseImpl(clientOptions)
        }

        private val requestForwarding: RequestForwardingServiceAsync.WithRawResponse by lazy {
            RequestForwardingServiceAsyncImpl.WithRawResponseImpl(clientOptions)
        }

        private val jobs: JobServiceAsync.WithRawResponse by lazy {
            JobServiceAsyncImpl.WithRawResponseImpl(clientOptions)
        }

        private val sandbox: SandboxServiceAsync.WithRawResponse by lazy {
            SandboxServiceAsyncImpl.WithRawResponseImpl(clientOptions)
        }

        private val payroll: PayrollServiceAsync.WithRawResponse by lazy {
            PayrollServiceAsyncImpl.WithRawResponseImpl(clientOptions)
        }

        private val connect: ConnectServiceAsync.WithRawResponse by lazy {
            ConnectServiceAsyncImpl.WithRawResponseImpl(clientOptions)
        }

        override fun withOptions(
            modifier: Consumer<ClientOptions.Builder>
        ): FinchClientAsync.WithRawResponse =
            FinchClientAsyncImpl.WithRawResponseImpl(
                clientOptions.toBuilder().apply(modifier::accept).build()
            )

        override fun accessTokens(): AccessTokenServiceAsync.WithRawResponse = accessTokens

        override fun hris(): HrisServiceAsync.WithRawResponse = hris

        override fun providers(): ProviderServiceAsync.WithRawResponse = providers

        override fun account(): AccountServiceAsync.WithRawResponse = account

        override fun requestForwarding(): RequestForwardingServiceAsync.WithRawResponse =
            requestForwarding

        override fun jobs(): JobServiceAsync.WithRawResponse = jobs

        override fun sandbox(): SandboxServiceAsync.WithRawResponse = sandbox

        override fun payroll(): PayrollServiceAsync.WithRawResponse = payroll

        override fun connect(): ConnectServiceAsync.WithRawResponse = connect
    }
}
