package org.finch.api.client

import com.fasterxml.jackson.annotation.JsonProperty
import java.net.URLEncoder
import org.finch.api.core.ClientOptions
import org.finch.api.core.http.HttpMethod
import org.finch.api.core.http.HttpRequest
import org.finch.api.core.http.HttpResponse.Handler
import org.finch.api.errors.FinchError
import org.finch.api.errors.FinchException
import org.finch.api.models.*
import org.finch.api.services.blocking.*
import org.finch.api.services.errorHandler
import org.finch.api.services.json
import org.finch.api.services.jsonHandler
import org.finch.api.services.withErrorHandler

class FinchClientImpl
constructor(
    private val clientOptions: ClientOptions,
) : FinchClient {

    private val errorHandler: Handler<FinchError> = errorHandler(clientOptions.jsonMapper)

    private val ats: AtService by lazy { AtServiceImpl(clientOptions) }

    private val hris: HriService by lazy { HriServiceImpl(clientOptions) }

    private val providers: ProviderService by lazy { ProviderServiceImpl(clientOptions) }

    private val account: AccountService by lazy { AccountServiceImpl(clientOptions) }

    private val getAccessTokenHandler: Handler<GetAccessTokenResponse> =
        jsonHandler<GetAccessTokenResponse>(clientOptions.jsonMapper).withErrorHandler(errorHandler)

    override fun ats(): AtService = ats

    override fun hris(): HriService = hris

    override fun providers(): ProviderService = providers

    override fun account(): AccountService = account

    override fun getAccessToken(
        clientId: String,
        clientSecret: String,
        code: String,
        redirectUri: String
    ): String {
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
        return clientOptions.httpClient.execute(request).let {
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
