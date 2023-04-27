package org.finch.api.services.blocking

import org.finch.api.core.ClientOptions
import org.finch.api.core.RequestOptions
import org.finch.api.core.http.HttpMethod
import org.finch.api.core.http.HttpRequest
import org.finch.api.core.http.HttpResponse.Handler
import org.finch.api.errors.FinchError
import org.finch.api.models.Provider
import org.finch.api.models.ProviderListPage
import org.finch.api.models.ProviderListParams
import org.finch.api.services.errorHandler
import org.finch.api.services.jsonHandler
import org.finch.api.services.withErrorHandler

class ProviderServiceImpl
constructor(
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
                .putAllQueryParams(params.getQueryParams())
                .putAllHeaders(clientOptions.headers)
                .putAllHeaders(params.getHeaders())
                .build()
        return clientOptions.httpClient.execute(request, requestOptions).let { response ->
            response
                .let { listHandler.handle(it) }
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
