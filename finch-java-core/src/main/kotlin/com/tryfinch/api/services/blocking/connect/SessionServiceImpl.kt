// File generated from our OpenAPI spec by Stainless.

package com.tryfinch.api.services.blocking.connect

import com.tryfinch.api.core.ClientOptions
import com.tryfinch.api.core.RequestOptions
import com.tryfinch.api.core.handlers.errorHandler
import com.tryfinch.api.core.handlers.jsonHandler
import com.tryfinch.api.core.handlers.withErrorHandler
import com.tryfinch.api.core.http.HttpMethod
import com.tryfinch.api.core.http.HttpRequest
import com.tryfinch.api.core.http.HttpResponse.Handler
import com.tryfinch.api.core.json
import com.tryfinch.api.errors.FinchError
import com.tryfinch.api.models.ConnectSessionNewParams
import com.tryfinch.api.models.ConnectSessionReauthenticateParams
import com.tryfinch.api.models.SessionNewResponse
import com.tryfinch.api.models.SessionReauthenticateResponse

class SessionServiceImpl
constructor(
    private val clientOptions: ClientOptions,
) : SessionService {

    private val errorHandler: Handler<FinchError> = errorHandler(clientOptions.jsonMapper)

    private val newHandler: Handler<SessionNewResponse> =
        jsonHandler<SessionNewResponse>(clientOptions.jsonMapper).withErrorHandler(errorHandler)

    /** Create a new connect session for an employer */
    override fun new_(
        params: ConnectSessionNewParams,
        requestOptions: RequestOptions
    ): SessionNewResponse {
        val request =
            HttpRequest.builder()
                .method(HttpMethod.POST)
                .addPathSegments("connect", "sessions")
                .putAllQueryParams(clientOptions.queryParams)
                .putAllQueryParams(params.getQueryParams())
                .putAllHeaders(clientOptions.headers)
                .putAllHeaders(params.getHeaders())
                .body(json(clientOptions.jsonMapper, params.getBody()))
                .build()
        return clientOptions.httpClient.execute(request, requestOptions).let { response ->
            response
                .use { newHandler.handle(it) }
                .apply {
                    if (requestOptions.responseValidation ?: clientOptions.responseValidation) {
                        validate()
                    }
                }
        }
    }

    private val reauthenticateHandler: Handler<SessionReauthenticateResponse> =
        jsonHandler<SessionReauthenticateResponse>(clientOptions.jsonMapper)
            .withErrorHandler(errorHandler)

    /** Create a new Connect session for reauthenticating an existing connection */
    override fun reauthenticate(
        params: ConnectSessionReauthenticateParams,
        requestOptions: RequestOptions
    ): SessionReauthenticateResponse {
        val request =
            HttpRequest.builder()
                .method(HttpMethod.POST)
                .addPathSegments("connect", "sessions", "reauthenticate")
                .putAllQueryParams(clientOptions.queryParams)
                .putAllQueryParams(params.getQueryParams())
                .putAllHeaders(clientOptions.headers)
                .putAllHeaders(params.getHeaders())
                .body(json(clientOptions.jsonMapper, params.getBody()))
                .build()
        return clientOptions.httpClient.execute(request, requestOptions).let { response ->
            response
                .use { reauthenticateHandler.handle(it) }
                .apply {
                    if (requestOptions.responseValidation ?: clientOptions.responseValidation) {
                        validate()
                    }
                }
        }
    }
}
