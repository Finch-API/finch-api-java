// File generated from our OpenAPI spec by Stainless.

package com.tryfinch.api.services.blocking.sandbox.jobs

import com.tryfinch.api.core.ClientOptions
import com.tryfinch.api.core.JsonValue
import com.tryfinch.api.core.RequestOptions
import com.tryfinch.api.core.handlers.errorHandler
import com.tryfinch.api.core.handlers.jsonHandler
import com.tryfinch.api.core.handlers.withErrorHandler
import com.tryfinch.api.core.http.HttpMethod
import com.tryfinch.api.core.http.HttpRequest
import com.tryfinch.api.core.http.HttpResponse.Handler
import com.tryfinch.api.core.http.HttpResponseFor
import com.tryfinch.api.core.http.json
import com.tryfinch.api.core.http.parseable
import com.tryfinch.api.core.prepare
import com.tryfinch.api.models.SandboxJobConfiguration
import com.tryfinch.api.models.SandboxJobConfigurationRetrieveParams
import com.tryfinch.api.models.SandboxJobConfigurationUpdateParams

class ConfigurationServiceImpl internal constructor(private val clientOptions: ClientOptions) :
    ConfigurationService {

    private val withRawResponse: ConfigurationService.WithRawResponse by lazy {
        WithRawResponseImpl(clientOptions)
    }

    override fun withRawResponse(): ConfigurationService.WithRawResponse = withRawResponse

    override fun retrieve(
        params: SandboxJobConfigurationRetrieveParams,
        requestOptions: RequestOptions,
    ): List<SandboxJobConfiguration> =
        // get /sandbox/jobs/configuration
        withRawResponse().retrieve(params, requestOptions).parse()

    override fun update(
        params: SandboxJobConfigurationUpdateParams,
        requestOptions: RequestOptions,
    ): SandboxJobConfiguration =
        // put /sandbox/jobs/configuration
        withRawResponse().update(params, requestOptions).parse()

    class WithRawResponseImpl internal constructor(private val clientOptions: ClientOptions) :
        ConfigurationService.WithRawResponse {

        private val errorHandler: Handler<JsonValue> = errorHandler(clientOptions.jsonMapper)

        private val retrieveHandler: Handler<List<SandboxJobConfiguration>> =
            jsonHandler<List<SandboxJobConfiguration>>(clientOptions.jsonMapper)
                .withErrorHandler(errorHandler)

        override fun retrieve(
            params: SandboxJobConfigurationRetrieveParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<List<SandboxJobConfiguration>> {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.GET)
                    .addPathSegments("sandbox", "jobs", "configuration")
                    .build()
                    .prepare(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            val response = clientOptions.httpClient.execute(request, requestOptions)
            return response.parseable {
                response
                    .use { retrieveHandler.handle(it) }
                    .also {
                        if (requestOptions.responseValidation!!) {
                            it.forEach { it.validate() }
                        }
                    }
            }
        }

        private val updateHandler: Handler<SandboxJobConfiguration> =
            jsonHandler<SandboxJobConfiguration>(clientOptions.jsonMapper)
                .withErrorHandler(errorHandler)

        override fun update(
            params: SandboxJobConfigurationUpdateParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<SandboxJobConfiguration> {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.PUT)
                    .addPathSegments("sandbox", "jobs", "configuration")
                    .body(json(clientOptions.jsonMapper, params._body()))
                    .build()
                    .prepare(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            val response = clientOptions.httpClient.execute(request, requestOptions)
            return response.parseable {
                response
                    .use { updateHandler.handle(it) }
                    .also {
                        if (requestOptions.responseValidation!!) {
                            it.validate()
                        }
                    }
            }
        }
    }
}
