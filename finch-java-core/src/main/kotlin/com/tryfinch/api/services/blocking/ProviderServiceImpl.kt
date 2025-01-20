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
import com.tryfinch.api.errors.FinchError
import com.tryfinch.api.models.Provider
import com.tryfinch.api.models.ProviderListPage
import com.tryfinch.api.models.ProviderListParams

class ProviderServiceImpl
internal constructor(
    private val clientOptions: ClientOptions,
) : ProviderService {

    private val errorHandler: Handler<FinchError> = errorHandler(clientOptions.jsonMapper)

    private val listHandler: Handler<List<Provider>> =
        jsonHandler<List<Provider>>(clientOptions.jsonMapper).withErrorHandler(errorHandler)

    /** Return details on all available payroll and HR systems. */
    override fun list(
        params: ProviderListParams,
        requestOptions: RequestOptions
    ): ProviderListPage {
        val request =
            HttpRequest.builder()
                .method(HttpMethod.GET)
                .addPathSegments("providers")
                .putAllQueryParams(clientOptions.queryParams)
                .replaceAllQueryParams(params.getQueryParams())
                .putAllHeaders(clientOptions.headers)
                .replaceAllHeaders(params.getHeaders())
                .build()
        return clientOptions.httpClient.execute(request, requestOptions).let { response ->
            response
                .use { listHandler.handle(it) }
                .apply {
                    if (requestOptions.responseValidation ?: clientOptions.responseValidation) {
                        forEach { it.validate() }
                    }
                }
                .let { ProviderListPage.Response.Builder().items(it).build() }
                .let { ProviderListPage.of(this, params, it) }
        }
    }
}
