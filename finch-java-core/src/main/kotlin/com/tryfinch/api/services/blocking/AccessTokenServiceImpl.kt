// File generated from our OpenAPI spec by Stainless.

package com.tryfinch.api.services.blocking

import com.tryfinch.api.core.ClientOptions
import com.tryfinch.api.core.RequestOptions
import com.tryfinch.api.core.http.HttpMethod
import com.tryfinch.api.core.http.HttpRequest
import com.tryfinch.api.core.http.HttpResponse.Handler
import com.tryfinch.api.errors.FinchError
import com.tryfinch.api.errors.FinchException
import com.tryfinch.api.models.AccessTokenCreateParams
import com.tryfinch.api.models.CreateAccessTokenResponse
import com.tryfinch.api.services.errorHandler
import com.tryfinch.api.services.json
import com.tryfinch.api.services.jsonHandler
import com.tryfinch.api.services.withErrorHandler

class AccessTokenServiceImpl
constructor(
    private val clientOptions: ClientOptions,
) : AccessTokenService {

    private val errorHandler: Handler<FinchError> = errorHandler(clientOptions.jsonMapper)

    private val createHandler: Handler<CreateAccessTokenResponse> =
        jsonHandler<CreateAccessTokenResponse>(clientOptions.jsonMapper)
            .withErrorHandler(errorHandler)

    /** Exchange the authorization code for an access token */
    override fun create(
        params: AccessTokenCreateParams,
        requestOptions: RequestOptions
    ): CreateAccessTokenResponse {
        val builder = params.toBuilder()

        if (!params.clientSecret().isPresent) {
            if (clientOptions.clientSecret == null || clientOptions.clientSecret.isEmpty()) {
                throw FinchException(
                    "client_secret must be provided as an argument or with the FINCH_CLIENT_SECRET environment variable"
                )
            }
            builder.clientSecret(clientOptions.clientSecret)
        }

        if (!params.clientId().isPresent) {
            if (clientOptions.clientId == null || clientOptions.clientId.isEmpty()) {
                throw FinchException(
                    "client_id must be provided as an argument or with the FINCH_CLIENT_ID environment variable"
                )
            }
            builder.clientId(clientOptions.clientId)
        }

        val modifiedParams = builder.build()

        val request =
            HttpRequest.builder()
                .method(HttpMethod.POST)
                .addPathSegments("auth", "token")
                .putAllQueryParams(clientOptions.queryParams)
                .putAllQueryParams(params.getQueryParams())
                .putAllHeaders(clientOptions.headers)
                .putAllHeaders(params.getHeaders())
                .body(json(clientOptions.jsonMapper, modifiedParams.getBody()))
                .build()
        return clientOptions.httpClient.execute(request, requestOptions).let { response ->
            response
                .use { createHandler.handle(it) }
                .apply {
                    if (requestOptions.responseValidation ?: clientOptions.responseValidation) {
                        validate()
                    }
                }
        }
    }
}
