// File generated from our OpenAPI spec by Stainless.

package com.tryfinch.api.client

import com.fasterxml.jackson.annotation.JsonProperty
import com.tryfinch.api.core.ClientOptions
import com.tryfinch.api.core.JsonValue
import com.tryfinch.api.core.getPackageVersion
import com.tryfinch.api.core.handlers.errorHandler
import com.tryfinch.api.core.handlers.jsonHandler
import com.tryfinch.api.core.handlers.withErrorHandler
import com.tryfinch.api.core.http.HttpMethod
import com.tryfinch.api.core.http.HttpRequest
import com.tryfinch.api.core.http.HttpResponse.Handler
import com.tryfinch.api.core.http.json
import com.tryfinch.api.errors.FinchException
import com.tryfinch.api.models.*
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
import java.net.URLEncoder
import java.util.function.Consumer

class FinchClientImpl(private val clientOptions: ClientOptions) : FinchClient {

    private val errorHandler: Handler<JsonValue> = errorHandler(clientOptions.jsonMapper)

    private val clientOptionsWithUserAgent =
        if (clientOptions.headers.names().contains("User-Agent")) clientOptions
        else
            clientOptions
                .toBuilder()
                .putHeader("User-Agent", "${javaClass.simpleName}/Java ${getPackageVersion()}")
                .build()

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

    private val getAccessTokenHandler: Handler<GetAccessTokenResponse> =
        jsonHandler<GetAccessTokenResponse>(clientOptions.jsonMapper).withErrorHandler(errorHandler)

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

    /** @deprecated use client.accessTokens().create instead */
    @Deprecated("use client.accessTokens().create instead", ReplaceWith("accessTokens().create()"))
    override fun getAccessToken(
        clientId: String,
        clientSecret: String,
        code: String,
        redirectUri: String?,
    ): String {
        if (!clientOptions.clientId().isPresent) {
            throw FinchException("clientId must be set in order to call getAccessToken")
        }
        if (!clientOptions.clientSecret().isPresent) {
            throw FinchException("clientSecret must be set in order to call getAccessToken")
        }
        val request =
            HttpRequest.builder()
                .method(HttpMethod.POST)
                .addPathSegments("auth", "token")
                .body(
                    json(
                        clientOptions.jsonMapper,
                        GetAccessTokenParams(clientId, clientSecret, code, redirectUri),
                    )
                )
                .build()
        return clientOptions.httpClient.execute(request).let {
            getAccessTokenHandler.handle(it).accessToken
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

    override fun withAccessToken(accessToken: String): FinchClient {
        return FinchClientImpl(
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

        override fun requestForwarding(): RequestForwardingService.WithRawResponse =
            requestForwarding

        override fun jobs(): JobService.WithRawResponse = jobs

        override fun sandbox(): SandboxService.WithRawResponse = sandbox

        override fun payroll(): PayrollService.WithRawResponse = payroll

        override fun connect(): ConnectService.WithRawResponse = connect
    }
}
