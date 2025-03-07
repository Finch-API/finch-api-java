// File generated from our OpenAPI spec by Stainless.

package com.tryfinch.api.services.async

import com.tryfinch.api.core.ClientOptions
import com.tryfinch.api.core.RequestOptions
import com.tryfinch.api.core.handlers.errorHandler
import com.tryfinch.api.core.handlers.jsonHandler
import com.tryfinch.api.core.handlers.withErrorHandler
import com.tryfinch.api.core.http.HttpMethod
import com.tryfinch.api.core.http.HttpRequest
import com.tryfinch.api.core.http.HttpResponse.Handler
import com.tryfinch.api.core.http.HttpResponseFor
import com.tryfinch.api.core.http.json
import com.tryfinch.api.core.http.parseable
import com.tryfinch.api.core.prepareAsync
import com.tryfinch.api.errors.FinchError
import com.tryfinch.api.errors.FinchException
import com.tryfinch.api.models.AccessTokenCreateParams
import com.tryfinch.api.models.CreateAccessTokenResponse
import java.util.concurrent.CompletableFuture
import kotlin.jvm.optionals.getOrNull

class AccessTokenServiceAsyncImpl internal constructor(private val clientOptions: ClientOptions) :
    AccessTokenServiceAsync {

    private val withRawResponse: AccessTokenServiceAsync.WithRawResponse by lazy {
        WithRawResponseImpl(clientOptions)
    }

    override fun withRawResponse(): AccessTokenServiceAsync.WithRawResponse = withRawResponse

    override fun create(
        params: AccessTokenCreateParams,
        requestOptions: RequestOptions,
    ): CompletableFuture<CreateAccessTokenResponse> =
        // post /auth/token
        withRawResponse().create(params, requestOptions).thenApply { it.parse() }

    class WithRawResponseImpl internal constructor(private val clientOptions: ClientOptions) :
        AccessTokenServiceAsync.WithRawResponse {

        private val errorHandler: Handler<FinchError> = errorHandler(clientOptions.jsonMapper)

        private val createHandler: Handler<CreateAccessTokenResponse> =
            jsonHandler<CreateAccessTokenResponse>(clientOptions.jsonMapper)
                .withErrorHandler(errorHandler)

        override fun create(
            params: AccessTokenCreateParams,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<CreateAccessTokenResponse>> {
            val builder = params.toBuilder()

            if (!params.clientSecret().isPresent) {
                val clientSecret = clientOptions.clientSecret().getOrNull()
                if (clientSecret.isNullOrEmpty()) {
                    throw FinchException(
                        "client_secret must be provided as an argument or with the FINCH_CLIENT_SECRET environment variable"
                    )
                }
                builder.clientSecret(clientSecret)
            }

            if (!params.clientId().isPresent) {
                val clientId = clientOptions.clientId().getOrNull()
                if (clientId.isNullOrEmpty()) {
                    throw FinchException(
                        "client_id must be provided as an argument or with the FINCH_CLIENT_ID environment variable"
                    )
                }
                builder.clientId(clientId)
            }

            val modifiedParams = builder.build()

            val request =
                HttpRequest.builder()
                    .method(HttpMethod.POST)
                    .addPathSegments("auth", "token")
                    .putAllQueryParams(clientOptions.queryParams)
                    .replaceAllQueryParams(modifiedParams._queryParams())
                    .putAllHeaders(clientOptions.headers)
                    .putAllHeaders(modifiedParams._headers())
                    .body(json(clientOptions.jsonMapper, modifiedParams._body()))
                    .build()
                    .prepareAsync(clientOptions, modifiedParams)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            return request
                .thenComposeAsync { clientOptions.httpClient.executeAsync(it, requestOptions) }
                .thenApply { response ->
                    response.parseable {
                        response
                            .use { createHandler.handle(it) }
                            .also {
                                if (requestOptions.responseValidation!!) {
                                    it.validate()
                                }
                            }
                    }
                }
        }
    }
}
