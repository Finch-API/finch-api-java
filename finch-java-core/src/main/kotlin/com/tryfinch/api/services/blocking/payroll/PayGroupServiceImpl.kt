// File generated from our OpenAPI spec by Stainless.

package com.tryfinch.api.services.blocking.payroll

import com.tryfinch.api.core.ClientOptions
import com.tryfinch.api.core.RequestOptions
import com.tryfinch.api.core.handlers.errorHandler
import com.tryfinch.api.core.handlers.jsonHandler
import com.tryfinch.api.core.handlers.withErrorHandler
import com.tryfinch.api.core.http.HttpMethod
import com.tryfinch.api.core.http.HttpRequest
import com.tryfinch.api.core.http.HttpResponse.Handler
import com.tryfinch.api.core.prepare
import com.tryfinch.api.errors.FinchError
import com.tryfinch.api.models.PayGroupListResponse
import com.tryfinch.api.models.PayGroupRetrieveResponse
import com.tryfinch.api.models.PayrollPayGroupListPage
import com.tryfinch.api.models.PayrollPayGroupListParams
import com.tryfinch.api.models.PayrollPayGroupRetrieveParams

class PayGroupServiceImpl internal constructor(private val clientOptions: ClientOptions) :
    PayGroupService {

    private val errorHandler: Handler<FinchError> = errorHandler(clientOptions.jsonMapper)

    private val retrieveHandler: Handler<PayGroupRetrieveResponse> =
        jsonHandler<PayGroupRetrieveResponse>(clientOptions.jsonMapper)
            .withErrorHandler(errorHandler)

    /** Read information from a single pay group */
    override fun retrieve(
        params: PayrollPayGroupRetrieveParams,
        requestOptions: RequestOptions,
    ): PayGroupRetrieveResponse {
        val request =
            HttpRequest.builder()
                .method(HttpMethod.GET)
                .addPathSegments("employer", "pay-groups", params.getPathParam(0))
                .build()
                .prepare(clientOptions, params)
        val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
        val response = clientOptions.httpClient.execute(request, requestOptions)
        return response
            .use { retrieveHandler.handle(it) }
            .also {
                if (requestOptions.responseValidation!!) {
                    it.validate()
                }
            }
    }

    private val listHandler: Handler<List<PayGroupListResponse>> =
        jsonHandler<List<PayGroupListResponse>>(clientOptions.jsonMapper)
            .withErrorHandler(errorHandler)

    /** Read company pay groups and frequencies */
    override fun list(
        params: PayrollPayGroupListParams,
        requestOptions: RequestOptions,
    ): PayrollPayGroupListPage {
        val request =
            HttpRequest.builder()
                .method(HttpMethod.GET)
                .addPathSegments("employer", "pay-groups")
                .build()
                .prepare(clientOptions, params)
        val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
        val response = clientOptions.httpClient.execute(request, requestOptions)
        return response
            .use { listHandler.handle(it) }
            .also {
                if (requestOptions.responseValidation!!) {
                    it.forEach { it.validate() }
                }
            }
            .let {
                PayrollPayGroupListPage.of(
                    this,
                    params,
                    PayrollPayGroupListPage.Response.builder().items(it).build(),
                )
            }
    }
}
