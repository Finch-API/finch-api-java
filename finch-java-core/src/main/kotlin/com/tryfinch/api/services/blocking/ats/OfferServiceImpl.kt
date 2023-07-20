package com.tryfinch.api.services.blocking.ats

import com.tryfinch.api.core.ClientOptions
import com.tryfinch.api.core.RequestOptions
import com.tryfinch.api.core.http.HttpMethod
import com.tryfinch.api.core.http.HttpRequest
import com.tryfinch.api.core.http.HttpResponse.Handler
import com.tryfinch.api.errors.FinchError
import com.tryfinch.api.models.AtsOfferListPage
import com.tryfinch.api.models.AtsOfferListParams
import com.tryfinch.api.models.AtsOfferRetrieveParams
import com.tryfinch.api.models.Offer
import com.tryfinch.api.services.errorHandler
import com.tryfinch.api.services.jsonHandler
import com.tryfinch.api.services.withErrorHandler

class OfferServiceImpl
constructor(
    private val clientOptions: ClientOptions,
) : OfferService {

    private val errorHandler: Handler<FinchError> = errorHandler(clientOptions.jsonMapper)

    private val retrieveHandler: Handler<Offer> =
        jsonHandler<Offer>(clientOptions.jsonMapper).withErrorHandler(errorHandler)

    /** Get a single offer from an organization. */
    override fun retrieve(params: AtsOfferRetrieveParams, requestOptions: RequestOptions): Offer {
        val request =
            HttpRequest.builder()
                .method(HttpMethod.GET)
                .addPathSegments("ats", "offers", params.getPathParam(0))
                .putAllQueryParams(params.getQueryParams())
                .putAllHeaders(clientOptions.headers)
                .putAllHeaders(params.getHeaders())
                .build()
        return clientOptions.httpClient.execute(request, requestOptions).let { response ->
            response
                .use { retrieveHandler.handle(it) }
                .apply {
                    if (requestOptions.responseValidation ?: clientOptions.responseValidation) {
                        validate()
                    }
                }
        }
    }

    private val listHandler: Handler<AtsOfferListPage.Response> =
        jsonHandler<AtsOfferListPage.Response>(clientOptions.jsonMapper)
            .withErrorHandler(errorHandler)

    /** Get all offers put out by an organization. */
    override fun list(
        params: AtsOfferListParams,
        requestOptions: RequestOptions
    ): AtsOfferListPage {
        val request =
            HttpRequest.builder()
                .method(HttpMethod.GET)
                .addPathSegments("ats", "offers")
                .putAllQueryParams(params.getQueryParams())
                .putAllHeaders(clientOptions.headers)
                .putAllHeaders(params.getHeaders())
                .build()
        return clientOptions.httpClient.execute(request, requestOptions).let { response ->
            response
                .use { listHandler.handle(it) }
                .apply {
                    if (requestOptions.responseValidation ?: clientOptions.responseValidation) {
                        validate()
                    }
                }
                .let { AtsOfferListPage.of(this, params, it) }
        }
    }
}
