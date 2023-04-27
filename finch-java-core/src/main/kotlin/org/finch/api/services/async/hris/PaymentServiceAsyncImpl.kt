package org.finch.api.services.async.hris

import java.util.concurrent.CompletableFuture
import org.finch.api.core.ClientOptions
import org.finch.api.core.RequestOptions
import org.finch.api.core.http.HttpMethod
import org.finch.api.core.http.HttpRequest
import org.finch.api.core.http.HttpResponse.Handler
import org.finch.api.errors.FinchError
import org.finch.api.models.HrisPaymentListPageAsync
import org.finch.api.models.HrisPaymentListParams
import org.finch.api.models.Payment
import org.finch.api.services.errorHandler
import org.finch.api.services.jsonHandler
import org.finch.api.services.withErrorHandler

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
                .putAllQueryParams(params.getQueryParams())
                .putAllHeaders(clientOptions.headers)
                .putAllHeaders(params.getHeaders())
                .build()
        return clientOptions.httpClient.executeAsync(request, requestOptions).thenApply { response
            ->
            response
                .let { listHandler.handle(it) }
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
