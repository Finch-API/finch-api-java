// File generated from our OpenAPI spec by Stainless.

package com.tryfinch.api.services.async.hris

import com.tryfinch.api.core.ClientOptions
import com.tryfinch.api.core.RequestOptions
import com.tryfinch.api.core.http.HttpMethod
import com.tryfinch.api.core.http.HttpRequest
import com.tryfinch.api.core.http.HttpResponse.Handler
import com.tryfinch.api.errors.FinchError
import com.tryfinch.api.models.HrisPaymentListPageAsync
import com.tryfinch.api.models.HrisPaymentListParams
import com.tryfinch.api.models.Payment
import com.tryfinch.api.services.errorHandler
import com.tryfinch.api.services.jsonHandler
import com.tryfinch.api.services.withErrorHandler
import java.util.concurrent.CompletableFuture

class PaymentServiceAsyncImpl
constructor(
    private val clientOptions: ClientOptions,
) : PaymentServiceAsync {

    private val errorHandler: Handler<FinchError> = errorHandler(clientOptions.jsonMapper)

    private val listHandler: Handler<List<Payment>> =
        jsonHandler<List<Payment>>(clientOptions.jsonMapper).withErrorHandler(errorHandler)

    /** Read payroll and contractor related payments by the company. */
    override fun list(
        params: HrisPaymentListParams,
        requestOptions: RequestOptions
    ): CompletableFuture<HrisPaymentListPageAsync> {
        val request =
            HttpRequest.builder()
                .method(HttpMethod.GET)
                .addPathSegments("employer", "payment")
                .putAllQueryParams(clientOptions.queryParams)
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
                .let { HrisPaymentListPageAsync.Response.Builder().items(it).build() }
                .let { HrisPaymentListPageAsync.of(this, params, it) }
        }
    }
}
