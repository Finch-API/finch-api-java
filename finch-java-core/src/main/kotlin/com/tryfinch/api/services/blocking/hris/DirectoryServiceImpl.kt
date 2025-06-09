// File generated from our OpenAPI spec by Stainless.

package com.tryfinch.api.services.blocking.hris

import com.tryfinch.api.core.ClientOptions
import com.tryfinch.api.core.JsonValue
import com.tryfinch.api.core.RequestOptions
import com.tryfinch.api.core.handlers.errorHandler
import com.tryfinch.api.core.handlers.jsonHandler
import com.tryfinch.api.core.handlers.withErrorHandler
import com.tryfinch.api.core.http.HttpMethod
import com.tryfinch.api.core.http.HttpRequest
import com.tryfinch.api.core.http.HttpResponse.Handler
import com.tryfinch.api.core.http.HttpResponseFor
import com.tryfinch.api.core.http.parseable
import com.tryfinch.api.core.prepare
import com.tryfinch.api.models.HrisDirectoryListIndividualsPage
import com.tryfinch.api.models.HrisDirectoryListIndividualsPageResponse
import com.tryfinch.api.models.HrisDirectoryListIndividualsParams
import com.tryfinch.api.models.HrisDirectoryListPage
import com.tryfinch.api.models.HrisDirectoryListPageResponse
import com.tryfinch.api.models.HrisDirectoryListParams

class DirectoryServiceImpl internal constructor(private val clientOptions: ClientOptions) :
    DirectoryService {

    private val withRawResponse: DirectoryService.WithRawResponse by lazy {
        WithRawResponseImpl(clientOptions)
    }

    override fun withRawResponse(): DirectoryService.WithRawResponse = withRawResponse

    override fun list(
        params: HrisDirectoryListParams,
        requestOptions: RequestOptions,
    ): HrisDirectoryListPage =
        // get /employer/directory
        withRawResponse().list(params, requestOptions).parse()

    @Deprecated("use `list` instead")
    override fun listIndividuals(
        params: HrisDirectoryListIndividualsParams,
        requestOptions: RequestOptions,
    ): HrisDirectoryListIndividualsPage =
        // get /employer/directory
        withRawResponse().listIndividuals(params, requestOptions).parse()

    class WithRawResponseImpl internal constructor(private val clientOptions: ClientOptions) :
        DirectoryService.WithRawResponse {

        private val errorHandler: Handler<JsonValue> = errorHandler(clientOptions.jsonMapper)

        private val listHandler: Handler<HrisDirectoryListPageResponse> =
            jsonHandler<HrisDirectoryListPageResponse>(clientOptions.jsonMapper)
                .withErrorHandler(errorHandler)

        override fun list(
            params: HrisDirectoryListParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<HrisDirectoryListPage> {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.GET)
                    .addPathSegments("employer", "directory")
                    .build()
                    .prepare(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            val response = clientOptions.httpClient.execute(request, requestOptions)
            return response.parseable {
                response
                    .use { listHandler.handle(it) }
                    .also {
                        if (requestOptions.responseValidation!!) {
                            it.validate()
                        }
                    }
                    .let {
                        HrisDirectoryListPage.builder()
                            .service(DirectoryServiceImpl(clientOptions))
                            .params(params)
                            .response(it)
                            .build()
                    }
            }
        }

        private val listIndividualsHandler: Handler<HrisDirectoryListIndividualsPageResponse> =
            jsonHandler<HrisDirectoryListIndividualsPageResponse>(clientOptions.jsonMapper)
                .withErrorHandler(errorHandler)

        @Deprecated("use `list` instead")
        override fun listIndividuals(
            params: HrisDirectoryListIndividualsParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<HrisDirectoryListIndividualsPage> {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.GET)
                    .addPathSegments("employer", "directory")
                    .build()
                    .prepare(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            val response = clientOptions.httpClient.execute(request, requestOptions)
            return response.parseable {
                response
                    .use { listIndividualsHandler.handle(it) }
                    .also {
                        if (requestOptions.responseValidation!!) {
                            it.validate()
                        }
                    }
                    .let {
                        HrisDirectoryListIndividualsPage.builder()
                            .service(DirectoryServiceImpl(clientOptions))
                            .params(params)
                            .response(it)
                            .build()
                    }
            }
        }
    }
}
