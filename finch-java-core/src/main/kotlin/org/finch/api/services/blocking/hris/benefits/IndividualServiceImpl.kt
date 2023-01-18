package org.finch.api.services.blocking.hris.benefits

import org.finch.api.core.ClientOptions
import org.finch.api.core.RequestOptions
import org.finch.api.core.http.HttpMethod
import org.finch.api.core.http.HttpRequest
import org.finch.api.core.http.HttpResponse.Handler
import org.finch.api.errors.FinchError
import org.finch.api.models.HrisBenefitsIndividualEnrolledIdsParams
import org.finch.api.models.HrisBenefitsIndividualRetrieveManyBenefitsPage
import org.finch.api.models.HrisBenefitsIndividualRetrieveManyBenefitsParams
import org.finch.api.models.HrisBenefitsIndividualUnenrollPage
import org.finch.api.models.HrisBenefitsIndividualUnenrollParams
import org.finch.api.models.IndividualBenefit
import org.finch.api.models.IndividualEnrolledIdsResponse
import org.finch.api.models.UnenrolledIndividual
import org.finch.api.services.errorHandler
import org.finch.api.services.json
import org.finch.api.services.jsonHandler
import org.finch.api.services.withErrorHandler

class IndividualServiceImpl
constructor(
    private val clientOptions: ClientOptions,
) : IndividualService {

    private val errorHandler: Handler<FinchError> = errorHandler(clientOptions.jsonMapper)

    private val enrolledIdsHandler: Handler<IndividualEnrolledIdsResponse> =
        jsonHandler<IndividualEnrolledIdsResponse>(clientOptions.jsonMapper)
            .withErrorHandler(errorHandler)

    /**
     * **Availability: Automated Benefits providers only**
     *
     * Lists individuals currently enrolled in a given benefit.
     */
    override fun enrolledIds(
        params: HrisBenefitsIndividualEnrolledIdsParams,
        requestOptions: RequestOptions
    ): IndividualEnrolledIdsResponse {
        val request =
            HttpRequest.builder()
                .method(HttpMethod.GET)
                .addPathSegments("employer", "benefits", params.getPathParam(0), "enrolled")
                .putAllQueryParams(params.getQueryParams())
                .putAllHeaders(clientOptions.headers)
                .putAllHeaders(params.getHeaders())
                .build()
        return clientOptions.httpClient.execute(request, requestOptions).let { response ->
            response
                .let { enrolledIdsHandler.handle(it) }
                .apply {
                    if (requestOptions.responseValidation ?: clientOptions.responseValidation) {
                        validate()
                    }
                }
        }
    }

    private val retrieveManyBenefitsHandler: Handler<List<IndividualBenefit>> =
        jsonHandler<List<IndividualBenefit>>(clientOptions.jsonMapper)
            .withErrorHandler(errorHandler)

    /**
     * **Availability: Automated Benefits providers only**
     *
     * Get enrolled benefit information for the given individuals.
     */
    override fun retrieveManyBenefits(
        params: HrisBenefitsIndividualRetrieveManyBenefitsParams,
        requestOptions: RequestOptions
    ): HrisBenefitsIndividualRetrieveManyBenefitsPage {
        val request =
            HttpRequest.builder()
                .method(HttpMethod.GET)
                .addPathSegments("employer", "benefits", params.getPathParam(0), "individuals")
                .putAllQueryParams(params.getQueryParams())
                .putAllHeaders(clientOptions.headers)
                .putAllHeaders(params.getHeaders())
                .build()
        return clientOptions.httpClient.execute(request, requestOptions).let { response ->
            response
                .let { retrieveManyBenefitsHandler.handle(it) }
                .apply {
                    if (requestOptions.responseValidation ?: clientOptions.responseValidation) {
                        forEach { it.validate() }
                    }
                }
                .let {
                    HrisBenefitsIndividualRetrieveManyBenefitsPage.Response.Builder()
                        .items(it)
                        .build()
                }
                .let { HrisBenefitsIndividualRetrieveManyBenefitsPage.of(this, params, it) }
        }
    }

    private val unenrollHandler: Handler<List<UnenrolledIndividual>> =
        jsonHandler<List<UnenrolledIndividual>>(clientOptions.jsonMapper)
            .withErrorHandler(errorHandler)

    /**
     * **Availability: Automated and Assisted Benefits providers**
     *
     * Unenroll individuals from a benefit
     */
    override fun unenroll(
        params: HrisBenefitsIndividualUnenrollParams,
        requestOptions: RequestOptions
    ): HrisBenefitsIndividualUnenrollPage {
        val request =
            HttpRequest.builder()
                .method(HttpMethod.DELETE)
                .addPathSegments("employer", "benefits", params.getPathParam(0), "individuals")
                .putAllQueryParams(params.getQueryParams())
                .putAllHeaders(clientOptions.headers)
                .putAllHeaders(params.getHeaders())
                .body(json(clientOptions.jsonMapper, params.getBody()))
                .build()
        return clientOptions.httpClient.execute(request, requestOptions).let { response ->
            response
                .let { unenrollHandler.handle(it) }
                .apply {
                    if (requestOptions.responseValidation ?: clientOptions.responseValidation) {
                        forEach { it.validate() }
                    }
                }
                .let { HrisBenefitsIndividualUnenrollPage.Response.Builder().items(it).build() }
                .let { HrisBenefitsIndividualUnenrollPage.of(this, params, it) }
        }
    }
}
