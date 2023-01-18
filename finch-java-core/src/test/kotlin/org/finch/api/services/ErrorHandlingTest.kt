package org.finch.api.services

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
import org.assertj.core.api.Assertions.assertThat
import org.assertj.core.api.Assertions.assertThatThrownBy
import org.assertj.core.api.InstanceOfAssertFactories
import org.assertj.guava.api.Assertions.assertThat
import org.finch.api.client.FinchClient
import org.finch.api.client.okhttp.FinchOkHttpClient
import org.finch.api.core.JsonString
import org.finch.api.core.jsonMapper
import org.finch.api.errors.BadRequestException
import org.finch.api.errors.FinchError
import org.finch.api.errors.FinchException
import org.finch.api.errors.InternalServerException
import org.finch.api.errors.NotFoundException
import org.finch.api.errors.PermissionDeniedException
import org.finch.api.errors.RateLimitException
import org.finch.api.errors.UnauthorizedException
import org.finch.api.errors.UnexpectedStatusCodeException
import org.finch.api.errors.UnprocessableEntityException
import org.finch.api.models.*
import org.finch.api.models.HrisDirectoryListIndividualsPage
import org.finch.api.models.HrisDirectoryListIndividualsParams
import org.junit.jupiter.api.BeforeEach
import org.junit.jupiter.api.Test

@WireMockTest
class ErrorHandlingTest {

    private val JSON_MAPPER: JsonMapper = jsonMapper()

    private val API_KEY: String = "accessToken"

    private val FINCH_ERROR: FinchError =
        FinchError.builder().putAdditionalProperty("key", JsonString.of("value")).build()

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
    fun directoryListIndividuals_200() {
        val service = client.hris().directory()

        val params = HrisDirectoryListIndividualsParams.builder().limit(123L).offset(123L).build()

        val expected =
            HrisDirectoryListIndividualsPage.of(
                service,
                params,
                HrisDirectoryListIndividualsPage.Response.builder()
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
                                    IndividualInDirectory.Department.builder()
                                        .name("string")
                                        .build()
                                )
                                .isActive(true)
                                .build()
                        )
                    )
                    .build()
            )

        stubFor(get(anyUrl()).willReturn(ok().withBody(toJson(expected.response()))))

        assertThat(service.listIndividuals(params).response()).isEqualTo(expected.response())
    }

    @Test
    fun directoryListIndividuals_400() {
        val params = HrisDirectoryListIndividualsParams.builder().limit(123L).offset(123L).build()

        stubFor(
            get(anyUrl())
                .willReturn(status(400).withHeader("Foo", "Bar").withBody(toJson(FINCH_ERROR)))
        )

        assertThatThrownBy({ client.hris().directory().listIndividuals(params) })
            .satisfies({ e ->
                assertBadRequest(e, ImmutableListMultimap.of("Foo", "Bar"), FINCH_ERROR)
            })
    }

    @Test
    fun directoryListIndividuals_401() {
        val params = HrisDirectoryListIndividualsParams.builder().limit(123L).offset(123L).build()

        stubFor(
            get(anyUrl())
                .willReturn(status(401).withHeader("Foo", "Bar").withBody(toJson(FINCH_ERROR)))
        )

        assertThatThrownBy({ client.hris().directory().listIndividuals(params) })
            .satisfies({ e ->
                assertUnauthorized(e, ImmutableListMultimap.of("Foo", "Bar"), FINCH_ERROR)
            })
    }

    @Test
    fun directoryListIndividuals_403() {
        val params = HrisDirectoryListIndividualsParams.builder().limit(123L).offset(123L).build()

        stubFor(
            get(anyUrl())
                .willReturn(status(403).withHeader("Foo", "Bar").withBody(toJson(FINCH_ERROR)))
        )

        assertThatThrownBy({ client.hris().directory().listIndividuals(params) })
            .satisfies({ e ->
                assertPermissionDenied(e, ImmutableListMultimap.of("Foo", "Bar"), FINCH_ERROR)
            })
    }

    @Test
    fun directoryListIndividuals_404() {
        val params = HrisDirectoryListIndividualsParams.builder().limit(123L).offset(123L).build()

        stubFor(
            get(anyUrl())
                .willReturn(status(404).withHeader("Foo", "Bar").withBody(toJson(FINCH_ERROR)))
        )

        assertThatThrownBy({ client.hris().directory().listIndividuals(params) })
            .satisfies({ e ->
                assertNotFound(e, ImmutableListMultimap.of("Foo", "Bar"), FINCH_ERROR)
            })
    }

    @Test
    fun directoryListIndividuals_422() {
        val params = HrisDirectoryListIndividualsParams.builder().limit(123L).offset(123L).build()

        stubFor(
            get(anyUrl())
                .willReturn(status(422).withHeader("Foo", "Bar").withBody(toJson(FINCH_ERROR)))
        )

        assertThatThrownBy({ client.hris().directory().listIndividuals(params) })
            .satisfies({ e ->
                assertUnprocessableEntity(e, ImmutableListMultimap.of("Foo", "Bar"), FINCH_ERROR)
            })
    }

    @Test
    fun directoryListIndividuals_429() {
        val params = HrisDirectoryListIndividualsParams.builder().limit(123L).offset(123L).build()

        stubFor(
            get(anyUrl())
                .willReturn(status(429).withHeader("Foo", "Bar").withBody(toJson(FINCH_ERROR)))
        )

        assertThatThrownBy({ client.hris().directory().listIndividuals(params) })
            .satisfies({ e ->
                assertRateLimit(e, ImmutableListMultimap.of("Foo", "Bar"), FINCH_ERROR)
            })
    }

    @Test
    fun directoryListIndividuals_500() {
        val params = HrisDirectoryListIndividualsParams.builder().limit(123L).offset(123L).build()

        stubFor(
            get(anyUrl())
                .willReturn(status(500).withHeader("Foo", "Bar").withBody(toJson(FINCH_ERROR)))
        )

        assertThatThrownBy({ client.hris().directory().listIndividuals(params) })
            .satisfies({ e ->
                assertInternalServer(e, ImmutableListMultimap.of("Foo", "Bar"), FINCH_ERROR)
            })
    }

    @Test
    fun unexpectedStatusCode() {
        val params = HrisDirectoryListIndividualsParams.builder().limit(123L).offset(123L).build()

        stubFor(
            get(anyUrl())
                .willReturn(status(999).withHeader("Foo", "Bar").withBody(toJson(FINCH_ERROR)))
        )

        assertThatThrownBy({ client.hris().directory().listIndividuals(params) })
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
        val params = HrisDirectoryListIndividualsParams.builder().limit(123L).offset(123L).build()

        stubFor(get(anyUrl()).willReturn(status(200).withBody("Not JSON")))

        assertThatThrownBy({ client.hris().directory().listIndividuals(params) })
            .satisfies({ e ->
                assertThat(e)
                    .isInstanceOf(FinchException::class.java)
                    .hasMessage("Error reading response")
            })
    }

    @Test
    fun invalidErrorBody() {
        val params = HrisDirectoryListIndividualsParams.builder().limit(123L).offset(123L).build()

        stubFor(get(anyUrl()).willReturn(status(400).withBody("Not JSON")))

        assertThatThrownBy({ client.hris().directory().listIndividuals(params) })
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
