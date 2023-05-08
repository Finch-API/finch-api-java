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
import com.tryfinch.api.models.AtJobListPage
import com.tryfinch.api.models.AtJobListParams
import com.tryfinch.api.models.HriDirectoryListIndividualsPage
import com.tryfinch.api.models.HriDirectoryListIndividualsParams
import java.time.OffsetDateTime
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
                .build()
    }

    @Test
    fun hrisDirectoryListIndividualsWithAdditionalParams() {
        val additionalHeaders = mutableMapOf<String, List<String>>()

        additionalHeaders.put("x-test-header", listOf("abc1234"))

        val additionalQueryParams = mutableMapOf<String, List<String>>()

        additionalQueryParams.put("test_query_param", listOf("def567"))

        val params =
            HriDirectoryListIndividualsParams.builder()
                .limit(123L)
                .offset(123L)
                .additionalHeaders(additionalHeaders)
                .additionalQueryParams(additionalQueryParams)
                .build()

        val apiResponse =
            HriDirectoryListIndividualsPage.Response.builder()
                .paging(Paging.builder().count(123L).offset(123L).build())
                .individuals(
                    listOf(
                        IndividualInDirectory.builder()
                            .id("string")
                            .firstName("string")
                            .middleName("string")
                            .lastName("string")
                            .manager(
                                IndividualInDirectory.Manager.builder()
                                    .id("e8b90071-0c11-471c-86e8-e303ef2f6782")
                                    .build()
                            )
                            .department(
                                IndividualInDirectory.Department.builder().name("string").build()
                            )
                            .isActive(true)
                            .build()
                    )
                )
                .build()

        stubFor(
            get(anyUrl())
                .withHeader("x-test-header", equalTo("abc1234"))
                .withQueryParam("test_query_param", equalTo("def567"))
                .willReturn(ok(JSON_MAPPER.writeValueAsString(apiResponse)))
        )

        client.hris().directory().listIndividuals(params)

        verify(getRequestedFor(anyUrl()))
    }

    @Test
    fun atsJobsListWithAdditionalParams() {
        val additionalHeaders = mutableMapOf<String, List<String>>()

        additionalHeaders.put("x-test-header", listOf("abc1234"))

        val additionalQueryParams = mutableMapOf<String, List<String>>()

        additionalQueryParams.put("test_query_param", listOf("def567"))

        val params =
            AtJobListParams.builder()
                .limit(123L)
                .offset(123L)
                .additionalHeaders(additionalHeaders)
                .additionalQueryParams(additionalQueryParams)
                .build()

        val apiResponse =
            AtJobListPage.Response.builder()
                .paging(Paging.builder().count(123L).offset(123L).build())
                .jobs(
                    listOf(
                        Job.builder()
                            .id("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                            .name("string")
                            .status(Job.Status.OPEN)
                            .department(Job.Department.builder().name("string").build())
                            .createdAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                            .closedAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                            .hiringTeam(
                                Job.HiringTeam.builder()
                                    .hiringManagers(
                                        listOf(
                                            Job.HiringTeam.HiringManager.builder()
                                                .name("string")
                                                .build()
                                        )
                                    )
                                    .recruiters(
                                        listOf(
                                            Job.HiringTeam.Recruiter.builder()
                                                .name("string")
                                                .build()
                                        )
                                    )
                                    .build()
                            )
                            .build()
                    )
                )
                .build()

        stubFor(
            get(anyUrl())
                .withHeader("x-test-header", equalTo("abc1234"))
                .withQueryParam("test_query_param", equalTo("def567"))
                .willReturn(ok(JSON_MAPPER.writeValueAsString(apiResponse)))
        )

        client.ats().jobs().list(params)

        verify(getRequestedFor(anyUrl()))
    }
}
