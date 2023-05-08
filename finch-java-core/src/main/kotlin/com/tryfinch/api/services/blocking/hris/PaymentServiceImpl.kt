package com.tryfinch.api.services.blocking.hris

import com.tryfinch.api.core.ClientOptions
import com.tryfinch.api.core.RequestOptions
import com.tryfinch.api.core.http.HttpMethod
import com.tryfinch.api.core.http.HttpRequest
import com.tryfinch.api.core.http.HttpResponse.Handler
import com.tryfinch.api.errors.FinchError
import com.tryfinch.api.models.HrisPaymentListPage
import com.tryfinch.api.models.HrisPaymentListParams
import com.tryfinch.api.models.Payment
import com.tryfinch.api.services.errorHandler
import com.tryfinch.api.services.jsonHandler
import com.tryfinch.api.services.withErrorHandler

class PaymentServiceImpl
constructor(
    private val clientOptions: ClientOptions,
) : PaymentService {

    private val errorHandler: Handler<FinchError> = errorHandler(clientOptions.jsonMapper)

    private val listHandler: Handler<List<Payment>> =
        jsonHandler<List<Payment>>(clientOptions.jsonMapper).withErrorHandler(errorHandler)

    /** Read payroll and contractor related payments by the company. */
    override fun list(
        params: HrisPaymentListParams,
        requestOptions: RequestOptions
    ): HrisPaymentListPage {
        val request =
            HttpRequest.builder()
                .method(HttpMethod.GET)
                .addPathSegments("employer", "payment")
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
                .let { HrisPaymentListPage.Response.Builder().items(it).build() }
                .let { HrisPaymentListPage.of(this, params, it) }
        }
    }
}
