// File generated from our OpenAPI spec by Stainless.

package com.tryfinch.api.services.async.payroll

import com.tryfinch.api.core.ClientOptions
import com.tryfinch.api.core.RequestOptions
import com.tryfinch.api.core.http.HttpMethod
import com.tryfinch.api.core.http.HttpRequest
import com.tryfinch.api.core.http.HttpResponse.Handler
import com.tryfinch.api.errors.FinchError
import com.tryfinch.api.models.PayGroupListResponse
import com.tryfinch.api.models.PayGroupRetrieveResponse
import com.tryfinch.api.models.PayrollPayGroupListPageAsync
import com.tryfinch.api.models.PayrollPayGroupListParams
import com.tryfinch.api.models.PayrollPayGroupRetrieveParams
import com.tryfinch.api.services.errorHandler
import com.tryfinch.api.services.jsonHandler
import com.tryfinch.api.services.withErrorHandler
import java.util.concurrent.CompletableFuture

class PayGroupServiceAsyncImpl
constructor(
    private val clientOptions: ClientOptions,
) : PayGroupServiceAsync {

    private val errorHandler: Handler<FinchError> = errorHandler(clientOptions.jsonMapper)

    private val retrieveHandler: Handler<PayGroupRetrieveResponse> =
        jsonHandler<PayGroupRetrieveResponse>(clientOptions.jsonMapper)
            .withErrorHandler(errorHandler)

    /** Read information from a single pay group */
    override fun retrieve(
        params: PayrollPayGroupRetrieveParams,
        requestOptions: RequestOptions
    ): CompletableFuture<PayGroupRetrieveResponse> {
        val request =
            HttpRequest.builder()
                .method(HttpMethod.GET)
                .addPathSegments("employer", "pay-group", params.getPathParam(0))
                .putAllQueryParams(params.getQueryParams())
                .putAllHeaders(clientOptions.headers)
                .putAllHeaders(params.getHeaders())
                .build()
        return clientOptions.httpClient.executeAsync(request, requestOptions).thenApply { response
            ->
            response
                .use { retrieveHandler.handle(it) }
                .apply {
                    if (requestOptions.responseValidation ?: clientOptions.responseValidation) {
                        validate()
                    }
                }
        }
    }

    private val listHandler: Handler<List<PayGroupListResponse>> =
        jsonHandler<List<PayGroupListResponse>>(clientOptions.jsonMapper)
            .withErrorHandler(errorHandler)

    /** Read company pay groups and frequencies */
    override fun list(
        params: PayrollPayGroupListParams,
        requestOptions: RequestOptions
    ): CompletableFuture<PayrollPayGroupListPageAsync> {
        val request =
            HttpRequest.builder()
                .method(HttpMethod.GET)
                .addPathSegments("employer", "pay-groups")
                .putAllQueryParams(params.getQueryParams())
                .putAllHeaders(clientOptions.headers)
                .putAllHeaders(params.getHeaders())
                .build()
        return clientOptions.httpClient.executeAsync(request, requestOptions).thenApply { response
            ->
            response
                .use { listHandler.handle(it) }
                .apply {
                    if (requestOptions.responseValidation ?: clientOptions.responseValidation) {
                        forEach { it.validate() }
                    }
                }
                .let { PayrollPayGroupListPageAsync.Response.Builder().items(it).build() }
                .let { PayrollPayGroupListPageAsync.of(this, params, it) }
        }
    }
}
