// File generated from our OpenAPI spec by Stainless.

package com.tryfinch.api.services

import com.fasterxml.jackson.databind.json.JsonMapper
import com.github.tomakehurst.wiremock.client.WireMock.anyUrl
import com.github.tomakehurst.wiremock.client.WireMock.get
import com.github.tomakehurst.wiremock.client.WireMock.ok
import com.github.tomakehurst.wiremock.client.WireMock.status
import com.github.tomakehurst.wiremock.client.WireMock.stubFor
import com.github.tomakehurst.wiremock.junit5.WireMockRuntimeInfo
import com.github.tomakehurst.wiremock.junit5.WireMockTest
import com.google.common.collect.ImmutableListMultimap
import com.google.common.collect.ListMultimap
import com.tryfinch.api.client.FinchClient
import com.tryfinch.api.client.okhttp.FinchOkHttpClient
import com.tryfinch.api.core.JsonString
import com.tryfinch.api.core.jsonMapper
import com.tryfinch.api.errors.BadRequestException
import com.tryfinch.api.errors.FinchError
import com.tryfinch.api.errors.FinchException
import com.tryfinch.api.errors.InternalServerException
import com.tryfinch.api.errors.NotFoundException
import com.tryfinch.api.errors.PermissionDeniedException
import com.tryfinch.api.errors.RateLimitException
import com.tryfinch.api.errors.UnauthorizedException
import com.tryfinch.api.errors.UnexpectedStatusCodeException
import com.tryfinch.api.errors.UnprocessableEntityException
import com.tryfinch.api.models.*
import com.tryfinch.api.models.HrisDirectoryListPage
import com.tryfinch.api.models.HrisDirectoryListParams
import org.assertj.core.api.Assertions.assertThat
import org.assertj.core.api.Assertions.assertThatThrownBy
import org.assertj.core.api.InstanceOfAssertFactories
import org.assertj.guava.api.Assertions.assertThat
import org.junit.jupiter.api.BeforeEach
import org.junit.jupiter.api.Test

@WireMockTest
class ErrorHandlingTest {

    private val JSON_MAPPER: JsonMapper = jsonMapper()

    private val FINCH_ERROR: FinchError =
        FinchError.builder().putAdditionalProperty("key", JsonString.of("value")).build()

    private lateinit var client: FinchClient

    @BeforeEach
    fun beforeEach(wmRuntimeInfo: WireMockRuntimeInfo) {
        client =
            FinchOkHttpClient.builder()
                .baseUrl(wmRuntimeInfo.getHttpBaseUrl())
                .accessToken("My Access Token")
                .clientId("My Client ID")
                .clientSecret("My Client Secret")
                .webhookSecret("My Webhook Secret")
                .build()
    }

    @Test
    fun directoryList200() {
        val service = client.hris().directory()

        val params = HrisDirectoryListParams.builder().limit(123L).offset(123L).build()

        val expected =
            HrisDirectoryListPage.of(
                service,
                params,
                HrisDirectoryListPage.Response.builder()
                    .individuals(
                        listOf(
                            IndividualInDirectory.builder()
                                .id("string")
                                .department(
                                    IndividualInDirectory.Department.builder()
                                        .name("string")
                                        .build()
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
            )

        stubFor(get(anyUrl()).willReturn(ok().withBody(toJson(expected.response()))))

        assertThat(client.hris().directory().list(params).response()).isEqualTo(expected.response())
    }

    @Test
    fun directoryList400() {
        val params = HrisDirectoryListParams.builder().limit(123L).offset(123L).build()

        stubFor(
            get(anyUrl())
                .willReturn(status(400).withHeader("Foo", "Bar").withBody(toJson(FINCH_ERROR)))
        )

        assertThatThrownBy({ client.hris().directory().list(params) })
            .satisfies({ e ->
                assertBadRequest(e, ImmutableListMultimap.of("Foo", "Bar"), FINCH_ERROR)
            })
    }

    @Test
    fun directoryList401() {
        val params = HrisDirectoryListParams.builder().limit(123L).offset(123L).build()

        stubFor(
            get(anyUrl())
                .willReturn(status(401).withHeader("Foo", "Bar").withBody(toJson(FINCH_ERROR)))
        )

        assertThatThrownBy({ client.hris().directory().list(params) })
            .satisfies({ e ->
                assertUnauthorized(e, ImmutableListMultimap.of("Foo", "Bar"), FINCH_ERROR)
            })
    }

    @Test
    fun directoryList403() {
        val params = HrisDirectoryListParams.builder().limit(123L).offset(123L).build()

        stubFor(
            get(anyUrl())
                .willReturn(status(403).withHeader("Foo", "Bar").withBody(toJson(FINCH_ERROR)))
        )

        assertThatThrownBy({ client.hris().directory().list(params) })
            .satisfies({ e ->
                assertPermissionDenied(e, ImmutableListMultimap.of("Foo", "Bar"), FINCH_ERROR)
            })
    }

    @Test
    fun directoryList404() {
        val params = HrisDirectoryListParams.builder().limit(123L).offset(123L).build()

        stubFor(
            get(anyUrl())
                .willReturn(status(404).withHeader("Foo", "Bar").withBody(toJson(FINCH_ERROR)))
        )

        assertThatThrownBy({ client.hris().directory().list(params) })
            .satisfies({ e ->
                assertNotFound(e, ImmutableListMultimap.of("Foo", "Bar"), FINCH_ERROR)
            })
    }

    @Test
    fun directoryList422() {
        val params = HrisDirectoryListParams.builder().limit(123L).offset(123L).build()

        stubFor(
            get(anyUrl())
                .willReturn(status(422).withHeader("Foo", "Bar").withBody(toJson(FINCH_ERROR)))
        )

        assertThatThrownBy({ client.hris().directory().list(params) })
            .satisfies({ e ->
                assertUnprocessableEntity(e, ImmutableListMultimap.of("Foo", "Bar"), FINCH_ERROR)
            })
    }

    @Test
    fun directoryList429() {
        val params = HrisDirectoryListParams.builder().limit(123L).offset(123L).build()

        stubFor(
            get(anyUrl())
                .willReturn(status(429).withHeader("Foo", "Bar").withBody(toJson(FINCH_ERROR)))
        )

        assertThatThrownBy({ client.hris().directory().list(params) })
            .satisfies({ e ->
                assertRateLimit(e, ImmutableListMultimap.of("Foo", "Bar"), FINCH_ERROR)
            })
    }

    @Test
    fun directoryList500() {
        val params = HrisDirectoryListParams.builder().limit(123L).offset(123L).build()

        stubFor(
            get(anyUrl())
                .willReturn(status(500).withHeader("Foo", "Bar").withBody(toJson(FINCH_ERROR)))
        )

        assertThatThrownBy({ client.hris().directory().list(params) })
            .satisfies({ e ->
                assertInternalServer(e, ImmutableListMultimap.of("Foo", "Bar"), FINCH_ERROR)
            })
    }

    @Test
    fun unexpectedStatusCode() {
        val params = HrisDirectoryListParams.builder().limit(123L).offset(123L).build()

        stubFor(
            get(anyUrl())
                .willReturn(status(999).withHeader("Foo", "Bar").withBody(toJson(FINCH_ERROR)))
        )

        assertThatThrownBy({ client.hris().directory().list(params) })
            .satisfies({ e ->
                assertUnexpectedStatusCodeException(
                    e,
                    999,
                    ImmutableListMultimap.of("Foo", "Bar"),
                    toJson(FINCH_ERROR)
                )
            })
    }

    @Test
    fun invalidBody() {
        val params = HrisDirectoryListParams.builder().limit(123L).offset(123L).build()

        stubFor(get(anyUrl()).willReturn(status(200).withBody("Not JSON")))

        assertThatThrownBy({ client.hris().directory().list(params) })
            .satisfies({ e ->
                assertThat(e)
                    .isInstanceOf(FinchException::class.java)
                    .hasMessage("Error reading response")
            })
    }

    @Test
    fun invalidErrorBody() {
        val params = HrisDirectoryListParams.builder().limit(123L).offset(123L).build()

        stubFor(get(anyUrl()).willReturn(status(400).withBody("Not JSON")))

        assertThatThrownBy({ client.hris().directory().list(params) })
            .satisfies({ e ->
                assertBadRequest(e, ImmutableListMultimap.of(), FinchError.builder().build())
            })
    }

    private fun <T> toJson(body: T): ByteArray {
        return JSON_MAPPER.writeValueAsBytes(body)
    }

    private fun assertUnexpectedStatusCodeException(
        throwable: Throwable,
        statusCode: Int,
        headers: ListMultimap<String, String>,
        responseBody: ByteArray
    ) {
        assertThat(throwable)
            .asInstanceOf(
                InstanceOfAssertFactories.throwable(UnexpectedStatusCodeException::class.java)
            )
            .satisfies({ e ->
                assertThat(e.statusCode()).isEqualTo(statusCode)
                assertThat(e.body()).isEqualTo(String(responseBody))
                assertThat(e.headers()).containsAllEntriesOf(headers)
            })
    }

    private fun assertBadRequest(
        throwable: Throwable,
        headers: ListMultimap<String, String>,
        error: FinchError
    ) {
        assertThat(throwable)
            .asInstanceOf(InstanceOfAssertFactories.throwable(BadRequestException::class.java))
            .satisfies({ e ->
                assertThat(e.statusCode()).isEqualTo(400)
                assertThat(e.error()).isEqualTo(error)
                assertThat(e.headers()).containsAllEntriesOf(headers)
            })
    }

    private fun assertUnauthorized(
        throwable: Throwable,
        headers: ListMultimap<String, String>,
        error: FinchError
    ) {
        assertThat(throwable)
            .asInstanceOf(InstanceOfAssertFactories.throwable(UnauthorizedException::class.java))
            .satisfies({ e ->
                assertThat(e.statusCode()).isEqualTo(401)
                assertThat(e.error()).isEqualTo(error)
                assertThat(e.headers()).containsAllEntriesOf(headers)
            })
    }

    private fun assertPermissionDenied(
        throwable: Throwable,
        headers: ListMultimap<String, String>,
        error: FinchError
    ) {
        assertThat(throwable)
            .asInstanceOf(
                InstanceOfAssertFactories.throwable(PermissionDeniedException::class.java)
            )
            .satisfies({ e ->
                assertThat(e.statusCode()).isEqualTo(403)
                assertThat(e.error()).isEqualTo(error)
                assertThat(e.headers()).containsAllEntriesOf(headers)
            })
    }

    private fun assertNotFound(
        throwable: Throwable,
        headers: ListMultimap<String, String>,
        error: FinchError
    ) {
        assertThat(throwable)
            .asInstanceOf(InstanceOfAssertFactories.throwable(NotFoundException::class.java))
            .satisfies({ e ->
                assertThat(e.statusCode()).isEqualTo(404)
                assertThat(e.error()).isEqualTo(error)
                assertThat(e.headers()).containsAllEntriesOf(headers)
            })
    }

    private fun assertUnprocessableEntity(
        throwable: Throwable,
        headers: ListMultimap<String, String>,
        error: FinchError
    ) {
        assertThat(throwable)
            .asInstanceOf(
                InstanceOfAssertFactories.throwable(UnprocessableEntityException::class.java)
            )
            .satisfies({ e ->
                assertThat(e.statusCode()).isEqualTo(422)
                assertThat(e.error()).isEqualTo(error)
                assertThat(e.headers()).containsAllEntriesOf(headers)
            })
    }

    private fun assertRateLimit(
        throwable: Throwable,
        headers: ListMultimap<String, String>,
        error: FinchError
    ) {
        assertThat(throwable)
            .asInstanceOf(InstanceOfAssertFactories.throwable(RateLimitException::class.java))
            .satisfies({ e ->
                assertThat(e.statusCode()).isEqualTo(429)
                assertThat(e.error()).isEqualTo(error)
                assertThat(e.headers()).containsAllEntriesOf(headers)
            })
    }

    private fun assertInternalServer(
        throwable: Throwable,
        headers: ListMultimap<String, String>,
        error: FinchError
    ) {
        assertThat(throwable)
            .asInstanceOf(InstanceOfAssertFactories.throwable(InternalServerException::class.java))
            .satisfies({ e ->
                assertThat(e.statusCode()).isEqualTo(500)
                assertThat(e.error()).isEqualTo(error)
                assertThat(e.headers()).containsAllEntriesOf(headers)
            })
    }
}
