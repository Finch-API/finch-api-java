package org.finch.api.services.blocking.ats

import org.finch.api.core.ClientOptions
import org.finch.api.core.RequestOptions
import org.finch.api.core.http.HttpMethod
import org.finch.api.core.http.HttpRequest
import org.finch.api.core.http.HttpResponse.Handler
import org.finch.api.errors.FinchError
import org.finch.api.models.AtsOfferListPage
import org.finch.api.models.AtsOfferListParams
import org.finch.api.models.AtsOfferRetrieveParams
import org.finch.api.models.Offer
import org.finch.api.services.errorHandler
import org.finch.api.services.jsonHandler
import org.finch.api.services.withErrorHandler

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
                .let { retrieveHandler.handle(it) }
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
                .let { listHandler.handle(it) }
                .apply {
                    if (requestOptions.responseValidation ?: clientOptions.responseValidation) {
                        validate()
                    }
                }
                .let { AtsOfferListPage.of(this, params, it) }
        }
    }
}
