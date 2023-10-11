// File generated from our OpenAPI spec by Stainless.

package com.tryfinch.api.services

import com.fasterxml.jackson.databind.json.JsonMapper
import com.github.tomakehurst.wiremock.client.WireMock.anyUrl
import com.github.tomakehurst.wiremock.client.WireMock.equalTo
import com.github.tomakehurst.wiremock.client.WireMock.get
import com.github.tomakehurst.wiremock.client.WireMock.getRequestedFor
import com.github.tomakehurst.wiremock.client.WireMock.ok
import com.github.tomakehurst.wiremock.client.WireMock.stubFor
import com.github.tomakehurst.wiremock.client.WireMock.verify
import com.github.tomakehurst.wiremock.junit5.WireMockRuntimeInfo
import com.github.tomakehurst.wiremock.junit5.WireMockTest
import com.tryfinch.api.client.FinchClient
import com.tryfinch.api.client.okhttp.FinchOkHttpClient
import com.tryfinch.api.core.jsonMapper
import com.tryfinch.api.models.*
import com.tryfinch.api.models.HrisDirectoryListPage
import com.tryfinch.api.models.HrisDirectoryListParams
import org.junit.jupiter.api.BeforeEach
import org.junit.jupiter.api.Test

@WireMockTest
class ServiceParamsTest {

    private val JSON_MAPPER: JsonMapper = jsonMapper()

    private val API_KEY: String = "accessToken"

    private lateinit var client: FinchClient

    @BeforeEach
    fun beforeEach(wmRuntimeInfo: WireMockRuntimeInfo) {
        client =
            FinchOkHttpClient.builder()
                .accessToken(API_KEY)
                .baseUrl(wmRuntimeInfo.getHttpBaseUrl())
                .clientId("string")
                .clientSecret("string")
                .webhookSecret("string")
                .build()
    }

    @Test
    fun hrisDirectoryListWithAdditionalParams() {
        val additionalHeaders = mutableMapOf<String, List<String>>()

        additionalHeaders.put("x-test-header", listOf("abc1234"))

        val additionalQueryParams = mutableMapOf<String, List<String>>()

        additionalQueryParams.put("test_query_param", listOf("def567"))

        val params =
            HrisDirectoryListParams.builder()
                .limit(123L)
                .offset(123L)
                .additionalHeaders(additionalHeaders)
                .additionalQueryParams(additionalQueryParams)
                .build()

        val apiResponse =
            HrisDirectoryListPage.Response.builder()
                .individuals(
                    listOf(
                        IndividualInDirectory.builder()
                            .id("string")
                            .department(
                                IndividualInDirectory.Department.builder().name("string").build()
                            )
                            .firstName("string")
                            .isActive(true)
                            .lastName("string")
                            .manager(
                                IndividualInDirectory.Manager.builder()
                                    .id("e8b90071-0c11-471c-86e8-e303ef2f6782")
                                    .build()
                            )
                            .middleName("string")
                            .build()
                    )
                )
                .paging(Paging.builder().count(123L).offset(123L).build())
                .build()

        stubFor(
            get(anyUrl())
                .withHeader("x-test-header", equalTo("abc1234"))
                .withQueryParam("test_query_param", equalTo("def567"))
                .willReturn(ok(JSON_MAPPER.writeValueAsString(apiResponse)))
        )

        client.hris().directory().list(params)

        verify(getRequestedFor(anyUrl()))
    }
}
