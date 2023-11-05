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
    fun companiesRetrieve200() {
        val params = HrisCompanyRetrieveParams.builder().build()

        val expected =
            Company.builder()
                .id("string")
                .accounts(
                    listOf(
                        Company.Account.builder()
                            .accountName("string")
                            .accountNumber("string")
                            .accountType(Company.Account.AccountType.CHECKING)
                            .institutionName("string")
                            .routingNumber("string")
                            .build()
                    )
                )
                .departments(
                    listOf(
                        Company.Department.builder()
                            .name("string")
                            .parent(Company.Department.Parent.builder().name("string").build())
                            .build()
                    )
                )
                .ein("string")
                .entity(
                    Company.Entity.builder()
                        .subtype(Company.Entity.Subtype.S_CORPORATION)
                        .type(Company.Entity.Type.LLC)
                        .build()
                )
                .legalName("string")
                .locations(
                    listOf(
                        Location.builder()
                            .city("string")
                            .country("string")
                            .line1("string")
                            .line2("string")
                            .name("string")
                            .postalCode("string")
                            .sourceId("string")
                            .state("string")
                            .build()
                    )
                )
                .primaryEmail("string")
                .primaryPhoneNumber("string")
                .build()

        stubFor(get(anyUrl()).willReturn(ok().withBody(toJson(expected))))

        assertThat(client.hris().company().retrieve(params)).isEqualTo(expected)
    }

    @Test
    fun companiesRetrieve400() {
        val params = HrisCompanyRetrieveParams.builder().build()

        stubFor(
            get(anyUrl())
                .willReturn(status(400).withHeader("Foo", "Bar").withBody(toJson(FINCH_ERROR)))
        )

        assertThatThrownBy({ client.hris().company().retrieve(params) })
            .satisfies({ e ->
                assertBadRequest(e, ImmutableListMultimap.of("Foo", "Bar"), FINCH_ERROR)
            })
    }

    @Test
    fun companiesRetrieve401() {
        val params = HrisCompanyRetrieveParams.builder().build()

        stubFor(
            get(anyUrl())
                .willReturn(status(401).withHeader("Foo", "Bar").withBody(toJson(FINCH_ERROR)))
        )

        assertThatThrownBy({ client.hris().company().retrieve(params) })
            .satisfies({ e ->
                assertUnauthorized(e, ImmutableListMultimap.of("Foo", "Bar"), FINCH_ERROR)
            })
    }

    @Test
    fun companiesRetrieve403() {
        val params = HrisCompanyRetrieveParams.builder().build()

        stubFor(
            get(anyUrl())
                .willReturn(status(403).withHeader("Foo", "Bar").withBody(toJson(FINCH_ERROR)))
        )

        assertThatThrownBy({ client.hris().company().retrieve(params) })
            .satisfies({ e ->
                assertPermissionDenied(e, ImmutableListMultimap.of("Foo", "Bar"), FINCH_ERROR)
            })
    }

    @Test
    fun companiesRetrieve404() {
        val params = HrisCompanyRetrieveParams.builder().build()

        stubFor(
            get(anyUrl())
                .willReturn(status(404).withHeader("Foo", "Bar").withBody(toJson(FINCH_ERROR)))
        )

        assertThatThrownBy({ client.hris().company().retrieve(params) })
            .satisfies({ e ->
                assertNotFound(e, ImmutableListMultimap.of("Foo", "Bar"), FINCH_ERROR)
            })
    }

    @Test
    fun companiesRetrieve422() {
        val params = HrisCompanyRetrieveParams.builder().build()

        stubFor(
            get(anyUrl())
                .willReturn(status(422).withHeader("Foo", "Bar").withBody(toJson(FINCH_ERROR)))
        )

        assertThatThrownBy({ client.hris().company().retrieve(params) })
            .satisfies({ e ->
                assertUnprocessableEntity(e, ImmutableListMultimap.of("Foo", "Bar"), FINCH_ERROR)
            })
    }

    @Test
    fun companiesRetrieve429() {
        val params = HrisCompanyRetrieveParams.builder().build()

        stubFor(
            get(anyUrl())
                .willReturn(status(429).withHeader("Foo", "Bar").withBody(toJson(FINCH_ERROR)))
        )

        assertThatThrownBy({ client.hris().company().retrieve(params) })
            .satisfies({ e ->
                assertRateLimit(e, ImmutableListMultimap.of("Foo", "Bar"), FINCH_ERROR)
            })
    }

    @Test
    fun companiesRetrieve500() {
        val params = HrisCompanyRetrieveParams.builder().build()

        stubFor(
            get(anyUrl())
                .willReturn(status(500).withHeader("Foo", "Bar").withBody(toJson(FINCH_ERROR)))
        )

        assertThatThrownBy({ client.hris().company().retrieve(params) })
            .satisfies({ e ->
                assertInternalServer(e, ImmutableListMultimap.of("Foo", "Bar"), FINCH_ERROR)
            })
    }

    @Test
    fun unexpectedStatusCode() {
        val params = HrisCompanyRetrieveParams.builder().build()

        stubFor(
            get(anyUrl())
                .willReturn(status(999).withHeader("Foo", "Bar").withBody(toJson(FINCH_ERROR)))
        )

        assertThatThrownBy({ client.hris().company().retrieve(params) })
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
        val params = HrisCompanyRetrieveParams.builder().build()

        stubFor(get(anyUrl()).willReturn(status(200).withBody("Not JSON")))

        assertThatThrownBy({ client.hris().company().retrieve(params) })
            .satisfies({ e ->
                assertThat(e)
                    .isInstanceOf(FinchException::class.java)
                    .hasMessage("Error reading response")
            })
    }

    @Test
    fun invalidErrorBody() {
        val params = HrisCompanyRetrieveParams.builder().build()

        stubFor(get(anyUrl()).willReturn(status(400).withBody("Not JSON")))

        assertThatThrownBy({ client.hris().company().retrieve(params) })
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
