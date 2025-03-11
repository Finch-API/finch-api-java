// File generated from our OpenAPI spec by Stainless.

package com.tryfinch.api.services.blocking

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
import com.tryfinch.api.core.prepare
import com.tryfinch.api.errors.FinchError
import com.tryfinch.api.models.AccessTokenCreateParams
import com.tryfinch.api.models.CreateAccessTokenResponse

class AccessTokenServiceImpl internal constructor(
    private val clientOptions: ClientOptions,

) : AccessTokenService {

    private val withRawResponse: AccessTokenService.WithRawResponse by lazy { WithRawResponseImpl(clientOptions) }

    override fun withRawResponse(): AccessTokenService.WithRawResponse = withRawResponse

    override fun create(params: AccessTokenCreateParams, requestOptions: RequestOptions): CreateAccessTokenResponse =
        // post /auth/token
        withRawResponse().create(params, requestOptions).parse()

    class WithRawResponseImpl internal constructor(
        private val clientOptions: ClientOptions,

    ) : AccessTokenService.WithRawResponse {

        private val errorHandler: Handler<FinchError> = errorHandler(clientOptions.jsonMapper)

        private val createHandler: Handler<CreateAccessTokenResponse> = jsonHandler<CreateAccessTokenResponse>(clientOptions.jsonMapper).withErrorHandler(errorHandler)

        override fun create(params: AccessTokenCreateParams, requestOptions: RequestOptions): HttpResponseFor<CreateAccessTokenResponse> {
          val request = HttpRequest.builder()
            .method(HttpMethod.POST)
            .addPathSegments("auth", "token")
            .body(json(clientOptions.jsonMapper, params._body()))
            .build()
            .prepare(clientOptions, params)
          val requestOptions = requestOptions
              .applyDefaults(RequestOptions.from(clientOptions))
          val response = clientOptions.httpClient.execute(
            request, requestOptions
          )
          return response.parseable {
              response.use {
                  createHandler.handle(it)
              }
              .also {
                  if (requestOptions.responseValidation!!) {
                    it.validate()
                  }
              }
          }
        }
    }
}
