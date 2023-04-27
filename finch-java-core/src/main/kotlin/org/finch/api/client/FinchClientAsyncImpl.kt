package org.finch.api.client

import com.fasterxml.jackson.annotation.JsonProperty
import java.net.URLEncoder
import java.util.concurrent.CompletableFuture
import org.finch.api.core.ClientOptions
import org.finch.api.core.http.HttpMethod
import org.finch.api.core.http.HttpRequest
import org.finch.api.core.http.HttpResponse.Handler
import org.finch.api.errors.FinchError
import org.finch.api.errors.FinchException
import org.finch.api.models.*
import org.finch.api.services.async.*
import org.finch.api.services.errorHandler
import org.finch.api.services.json
import org.finch.api.services.jsonHandler
import org.finch.api.services.withErrorHandler

class FinchClientAsyncImpl
constructor(
    private val clientOptions: ClientOptions,
) : FinchClientAsync {

    private val errorHandler: Handler<FinchError> = errorHandler(clientOptions.jsonMapper)

    private val ats: AtServiceAsync by lazy { AtServiceAsyncImpl(clientOptions) }

    private val hris: HriServiceAsync by lazy { HriServiceAsyncImpl(clientOptions) }

    private val providers: ProviderServiceAsync by lazy { ProviderServiceAsyncImpl(clientOptions) }

    private val account: AccountServiceAsync by lazy { AccountServiceAsyncImpl(clientOptions) }

    private val getAccessTokenHandler: Handler<GetAccessTokenResponse> =
        jsonHandler<GetAccessTokenResponse>(clientOptions.jsonMapper).withErrorHandler(errorHandler)

    override fun ats(): AtServiceAsync = ats

    override fun hris(): HriServiceAsync = hris

    override fun providers(): ProviderServiceAsync = providers

    override fun account(): AccountServiceAsync = account

    override fun getAccessToken(
        clientId: String,
        clientSecret: String,
        code: String,
        redirectUri: String
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

    private data class GetAccessTokenParams(
        @JsonProperty("client_id") val clientId: String,
        @JsonProperty("client_secret") val clientSecret: String,
        @JsonProperty("code") val code: String,
        @JsonProperty("redirect_uri") val redirectUri: String,
    )

    private data class GetAccessTokenResponse(
        @JsonProperty("accessToken") val accessToken: String,
    )
}
