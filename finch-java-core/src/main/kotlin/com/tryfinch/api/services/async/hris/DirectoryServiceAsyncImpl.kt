// File generated from our OpenAPI spec by Stainless.

package com.tryfinch.api.services.async.hris

import com.tryfinch.api.core.ClientOptions
import com.tryfinch.api.core.RequestOptions
import com.tryfinch.api.core.handlers.errorHandler
import com.tryfinch.api.core.handlers.jsonHandler
import com.tryfinch.api.core.handlers.withErrorHandler
import com.tryfinch.api.core.http.HttpMethod
import com.tryfinch.api.core.http.HttpRequest
import com.tryfinch.api.core.http.HttpResponse.Handler
import com.tryfinch.api.core.http.HttpResponseFor
import com.tryfinch.api.core.http.parseable
import com.tryfinch.api.core.prepareAsync
import com.tryfinch.api.errors.FinchError
import com.tryfinch.api.models.HrisDirectoryListIndividualsPage
import com.tryfinch.api.models.HrisDirectoryListIndividualsPageAsync
import com.tryfinch.api.models.HrisDirectoryListIndividualsParams
import com.tryfinch.api.models.HrisDirectoryListPage
import com.tryfinch.api.models.HrisDirectoryListPageAsync
import com.tryfinch.api.models.HrisDirectoryListParams
import java.util.concurrent.CompletableFuture

class DirectoryServiceAsyncImpl internal constructor(
    private val clientOptions: ClientOptions,

) : DirectoryServiceAsync {

    private val withRawResponse: DirectoryServiceAsync.WithRawResponse by lazy { WithRawResponseImpl(clientOptions) }

    override fun withRawResponse(): DirectoryServiceAsync.WithRawResponse = withRawResponse

    override fun list(params: HrisDirectoryListParams, requestOptions: RequestOptions): CompletableFuture<HrisDirectoryListPageAsync> =
        // get /employer/directory
        withRawResponse().list(params, requestOptions).thenApply { it.parse() }

    @Deprecated("use `list` instead")
    override fun listIndividuals(params: HrisDirectoryListIndividualsParams, requestOptions: RequestOptions): CompletableFuture<HrisDirectoryListIndividualsPageAsync> =
        // get /employer/directory
        withRawResponse().listIndividuals(params, requestOptions).thenApply { it.parse() }

    class WithRawResponseImpl internal constructor(
        private val clientOptions: ClientOptions,

    ) : DirectoryServiceAsync.WithRawResponse {

        private val errorHandler: Handler<FinchError> = errorHandler(clientOptions.jsonMapper)

        private val listHandler: Handler<HrisDirectoryListPageAsync.Response> = jsonHandler<HrisDirectoryListPageAsync.Response>(clientOptions.jsonMapper).withErrorHandler(errorHandler)

        override fun list(params: HrisDirectoryListParams, requestOptions: RequestOptions): CompletableFuture<HttpResponseFor<HrisDirectoryListPageAsync>> {
          val request = HttpRequest.builder()
            .method(HttpMethod.GET)
            .addPathSegments("employer", "directory")
            .build()
            .prepareAsync(clientOptions, params)
          val requestOptions = requestOptions
              .applyDefaults(RequestOptions.from(clientOptions))
          return request.thenComposeAsync { clientOptions.httpClient.executeAsync(
            it, requestOptions
          ) }.thenApply { response -> response.parseable {
              response.use {
                  listHandler.handle(it)
              }
              .also {
                  if (requestOptions.responseValidation!!) {
                    it.validate()
                  }
              }
              .let {
                  HrisDirectoryListPageAsync.of(DirectoryServiceAsyncImpl(clientOptions), params, it)
              }
          } }
        }

        private val listIndividualsHandler: Handler<HrisDirectoryListIndividualsPageAsync.Response> = jsonHandler<HrisDirectoryListIndividualsPageAsync.Response>(clientOptions.jsonMapper).withErrorHandler(errorHandler)

        @Deprecated("use `list` instead")
        override fun listIndividuals(params: HrisDirectoryListIndividualsParams, requestOptions: RequestOptions): CompletableFuture<HttpResponseFor<HrisDirectoryListIndividualsPageAsync>> {
          val request = HttpRequest.builder()
            .method(HttpMethod.GET)
            .addPathSegments("employer", "directory")
            .build()
            .prepareAsync(clientOptions, params)
          val requestOptions = requestOptions
              .applyDefaults(RequestOptions.from(clientOptions))
          return request.thenComposeAsync { clientOptions.httpClient.executeAsync(
            it, requestOptions
          ) }.thenApply { response -> response.parseable {
              response.use {
                  listIndividualsHandler.handle(it)
              }
              .also {
                  if (requestOptions.responseValidation!!) {
                    it.validate()
                  }
              }
              .let {
                  HrisDirectoryListIndividualsPageAsync.of(DirectoryServiceAsyncImpl(clientOptions), params, it)
              }
          } }
        }
    }
}
