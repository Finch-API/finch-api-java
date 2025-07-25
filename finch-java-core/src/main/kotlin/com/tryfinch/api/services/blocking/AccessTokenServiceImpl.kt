// File generated from our OpenAPI spec by Stainless.

package com.tryfinch.api.services.blocking

import com.tryfinch.api.core.ClientOptions
import com.tryfinch.api.core.RequestOptions
import com.tryfinch.api.core.handlers.errorBodyHandler
import com.tryfinch.api.core.handlers.errorHandler
import com.tryfinch.api.core.handlers.jsonHandler
import com.tryfinch.api.core.http.HttpMethod
import com.tryfinch.api.core.http.HttpRequest
import com.tryfinch.api.core.http.HttpResponse
import com.tryfinch.api.core.http.HttpResponse.Handler
import com.tryfinch.api.core.http.HttpResponseFor
import com.tryfinch.api.core.http.json
import com.tryfinch.api.core.http.parseable
import com.tryfinch.api.core.prepare
import com.tryfinch.api.errors.FinchException
import com.tryfinch.api.models.AccessTokenCreateParams
import com.tryfinch.api.models.CreateAccessTokenResponse
import java.util.function.Consumer
import kotlin.jvm.optionals.getOrNull

class AccessTokenServiceImpl internal constructor(private val clientOptions: ClientOptions) :
    AccessTokenService {

    private val withRawResponse: AccessTokenService.WithRawResponse by lazy {
        WithRawResponseImpl(clientOptions)
    }

    override fun withRawResponse(): AccessTokenService.WithRawResponse = withRawResponse

    override fun withOptions(modifier: Consumer<ClientOptions.Builder>): AccessTokenService =
        AccessTokenServiceImpl(clientOptions.toBuilder().apply(modifier::accept).build())

    override fun create(
        params: AccessTokenCreateParams,
        requestOptions: RequestOptions,
    ): CreateAccessTokenResponse =
        // post /auth/token
        withRawResponse().create(params, requestOptions).parse()

    class WithRawResponseImpl internal constructor(private val clientOptions: ClientOptions) :
        AccessTokenService.WithRawResponse {

        private val errorHandler: Handler<HttpResponse> =
            errorHandler(errorBodyHandler(clientOptions.jsonMapper))

        override fun withOptions(
            modifier: Consumer<ClientOptions.Builder>
        ): AccessTokenService.WithRawResponse =
            AccessTokenServiceImpl.WithRawResponseImpl(
                clientOptions.toBuilder().apply(modifier::accept).build()
            )

        private val createHandler: Handler<CreateAccessTokenResponse> =
            jsonHandler<CreateAccessTokenResponse>(clientOptions.jsonMapper)

        override fun create(
            params: AccessTokenCreateParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<CreateAccessTokenResponse> {
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
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("auth", "token")
                    .putAllQueryParams(clientOptions.queryParams)
                    .replaceAllQueryParams(modifiedParams._queryParams())
                    .putAllHeaders(clientOptions.headers)
                    .putAllHeaders(modifiedParams._headers())
                    .body(json(clientOptions.jsonMapper, modifiedParams._body()))
                    .build()
                    .prepare(clientOptions, modifiedParams)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            val response = clientOptions.httpClient.execute(request, requestOptions)
            return errorHandler.handle(response).parseable {
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
