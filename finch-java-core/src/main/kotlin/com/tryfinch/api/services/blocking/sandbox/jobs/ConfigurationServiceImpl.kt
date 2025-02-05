// File generated from our OpenAPI spec by Stainless.

package com.tryfinch.api.services.blocking.sandbox.jobs

import com.tryfinch.api.core.ClientOptions
import com.tryfinch.api.core.RequestOptions
import com.tryfinch.api.core.handlers.errorHandler
import com.tryfinch.api.core.handlers.jsonHandler
import com.tryfinch.api.core.handlers.withErrorHandler
import com.tryfinch.api.core.http.HttpMethod
import com.tryfinch.api.core.http.HttpRequest
import com.tryfinch.api.core.http.HttpResponse.Handler
import com.tryfinch.api.core.json
import com.tryfinch.api.core.prepare
import com.tryfinch.api.errors.FinchError
import com.tryfinch.api.models.SandboxJobConfiguration
import com.tryfinch.api.models.SandboxJobConfigurationRetrieveParams
import com.tryfinch.api.models.SandboxJobConfigurationUpdateParams

class ConfigurationServiceImpl
internal constructor(
    private val clientOptions: ClientOptions,
) : ConfigurationService {

    private val errorHandler: Handler<FinchError> = errorHandler(clientOptions.jsonMapper)

    private val retrieveHandler: Handler<List<SandboxJobConfiguration>> =
        jsonHandler<List<SandboxJobConfiguration>>(clientOptions.jsonMapper)
            .withErrorHandler(errorHandler)

    /** Get configurations for sandbox jobs */
    override fun retrieve(
        params: SandboxJobConfigurationRetrieveParams,
        requestOptions: RequestOptions
    ): List<SandboxJobConfiguration> {
        val request =
            HttpRequest.builder()
                .method(HttpMethod.GET)
                .addPathSegments("sandbox", "jobs", "configuration")
                .build()
                .prepare(clientOptions, params)
        val response = clientOptions.httpClient.execute(request, requestOptions)
        return response
            .use { retrieveHandler.handle(it) }
            .also {
                if (requestOptions.responseValidation ?: clientOptions.responseValidation) {
                    it.forEach { it.validate() }
                }
            }
    }

    private val updateHandler: Handler<SandboxJobConfiguration> =
        jsonHandler<SandboxJobConfiguration>(clientOptions.jsonMapper)
            .withErrorHandler(errorHandler)

    /** Update configurations for sandbox jobs */
    override fun update(
        params: SandboxJobConfigurationUpdateParams,
        requestOptions: RequestOptions
    ): SandboxJobConfiguration {
        val request =
            HttpRequest.builder()
                .method(HttpMethod.PUT)
                .addPathSegments("sandbox", "jobs", "configuration")
                .body(json(clientOptions.jsonMapper, params._body()))
                .build()
                .prepare(clientOptions, params)
        val response = clientOptions.httpClient.execute(request, requestOptions)
        return response
            .use { updateHandler.handle(it) }
            .also {
                if (requestOptions.responseValidation ?: clientOptions.responseValidation) {
                    it.validate()
                }
            }
    }
}
