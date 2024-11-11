// File generated from our OpenAPI spec by Stainless.

package com.tryfinch.api.services

import com.fasterxml.jackson.databind.json.JsonMapper
import com.github.tomakehurst.wiremock.client.WireMock.anyUrl
import com.github.tomakehurst.wiremock.client.WireMock.get
import com.github.tomakehurst.wiremock.client.WireMock.ok
import com.github.tomakehurst.wiremock.client.WireMock.put
import com.github.tomakehurst.wiremock.client.WireMock.status
import com.github.tomakehurst.wiremock.client.WireMock.stubFor
import com.github.tomakehurst.wiremock.junit5.WireMockRuntimeInfo
import com.github.tomakehurst.wiremock.junit5.WireMockTest
import com.tryfinch.api.client.FinchClient
import com.tryfinch.api.client.okhttp.FinchOkHttpClient
import com.tryfinch.api.core.JsonString
import com.tryfinch.api.core.http.Headers
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
                .clientId("4ab15e51-11ad-49f4-acae-f343b7794375")
                .clientSecret("My Client Secret")
                .webhookSecret("My Webhook Secret")
                .build()
    }

    @Test
    fun companiesRetrieve200() {
        val params = HrisCompanyRetrieveParams.builder().build()

        val expected =
            Company.builder()
                .id("id")
                .accounts(
                    listOf(
                        Company.Account.builder()
                            .accountName("account_name")
                            .accountNumber("account_number")
                            .accountType(Company.Account.AccountType.CHECKING)
                            .institutionName("institution_name")
                            .routingNumber("routing_number")
                            .build()
                    )
                )
                .departments(
                    listOf(
                        Company.Department.builder()
                            .name("name")
                            .parent(Company.Department.Parent.builder().name("name").build())
                            .build()
                    )
                )
                .ein("ein")
                .entity(
                    Company.Entity.builder()
                        .subtype(Company.Entity.Subtype.S_CORPORATION)
                        .type(Company.Entity.Type.LLC)
                        .build()
                )
                .legalName("legal_name")
                .locations(
                    listOf(
                        Location.builder()
                            .city("city")
                            .country("country")
                            .line1("line1")
                            .line2("line2")
                            .name("name")
                            .postalCode("postal_code")
                            .sourceId("source_id")
                            .state("state")
                            .build()
                    )
                )
                .primaryEmail("primary_email")
                .primaryPhoneNumber("primary_phone_number")
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
                assertBadRequest(e, Headers.builder().put("Foo", "Bar").build(), FINCH_ERROR)
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
                assertUnauthorized(e, Headers.builder().put("Foo", "Bar").build(), FINCH_ERROR)
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
                assertPermissionDenied(e, Headers.builder().put("Foo", "Bar").build(), FINCH_ERROR)
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
                assertNotFound(e, Headers.builder().put("Foo", "Bar").build(), FINCH_ERROR)
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
                assertUnprocessableEntity(
                    e,
                    Headers.builder().put("Foo", "Bar").build(),
                    FINCH_ERROR
                )
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
                assertRateLimit(e, Headers.builder().put("Foo", "Bar").build(), FINCH_ERROR)
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
                assertInternalServer(e, Headers.builder().put("Foo", "Bar").build(), FINCH_ERROR)
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
                    Headers.builder().put("Foo", "Bar").build(),
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
                assertBadRequest(e, Headers.builder().build(), FinchError.builder().build())
            })
    }

    private fun <T> toJson(body: T): ByteArray {
        return JSON_MAPPER.writeValueAsBytes(body)
    }

    private fun assertUnexpectedStatusCodeException(
        throwable: Throwable,
        statusCode: Int,
        headers: Headers,
        responseBody: ByteArray
    ) {
        assertThat(throwable)
            .asInstanceOf(
                InstanceOfAssertFactories.throwable(UnexpectedStatusCodeException::class.java)
            )
            .satisfies({ e ->
                assertThat(e.statusCode()).isEqualTo(statusCode)
                assertThat(e.body()).isEqualTo(String(responseBody))
                assertThat(e.headers().toMap()).containsAllEntriesOf(headers.toMap())
            })
    }

    private fun assertBadRequest(throwable: Throwable, headers: Headers, error: FinchError) {
        assertThat(throwable)
            .asInstanceOf(InstanceOfAssertFactories.throwable(BadRequestException::class.java))
            .satisfies({ e ->
                assertThat(e.statusCode()).isEqualTo(400)
                assertThat(e.error()).isEqualTo(error)
                assertThat(e.headers().toMap()).containsAllEntriesOf(headers.toMap())
            })
    }

    private fun assertUnauthorized(throwable: Throwable, headers: Headers, error: FinchError) {
        assertThat(throwable)
            .asInstanceOf(InstanceOfAssertFactories.throwable(UnauthorizedException::class.java))
            .satisfies({ e ->
                assertThat(e.statusCode()).isEqualTo(401)
                assertThat(e.error()).isEqualTo(error)
                assertThat(e.headers().toMap()).containsAllEntriesOf(headers.toMap())
            })
    }

    private fun assertPermissionDenied(throwable: Throwable, headers: Headers, error: FinchError) {
        assertThat(throwable)
            .asInstanceOf(
                InstanceOfAssertFactories.throwable(PermissionDeniedException::class.java)
            )
            .satisfies({ e ->
                assertThat(e.statusCode()).isEqualTo(403)
                assertThat(e.error()).isEqualTo(error)
                assertThat(e.headers().toMap()).containsAllEntriesOf(headers.toMap())
            })
    }

    private fun assertNotFound(throwable: Throwable, headers: Headers, error: FinchError) {
        assertThat(throwable)
            .asInstanceOf(InstanceOfAssertFactories.throwable(NotFoundException::class.java))
            .satisfies({ e ->
                assertThat(e.statusCode()).isEqualTo(404)
                assertThat(e.error()).isEqualTo(error)
                assertThat(e.headers().toMap()).containsAllEntriesOf(headers.toMap())
            })
    }

    private fun assertUnprocessableEntity(
        throwable: Throwable,
        headers: Headers,
        error: FinchError
    ) {
        assertThat(throwable)
            .asInstanceOf(
                InstanceOfAssertFactories.throwable(UnprocessableEntityException::class.java)
            )
            .satisfies({ e ->
                assertThat(e.statusCode()).isEqualTo(422)
                assertThat(e.error()).isEqualTo(error)
                assertThat(e.headers().toMap()).containsAllEntriesOf(headers.toMap())
            })
    }

    private fun assertRateLimit(throwable: Throwable, headers: Headers, error: FinchError) {
        assertThat(throwable)
            .asInstanceOf(InstanceOfAssertFactories.throwable(RateLimitException::class.java))
            .satisfies({ e ->
                assertThat(e.statusCode()).isEqualTo(429)
                assertThat(e.error()).isEqualTo(error)
                assertThat(e.headers().toMap()).containsAllEntriesOf(headers.toMap())
            })
    }

    private fun assertInternalServer(throwable: Throwable, headers: Headers, error: FinchError) {
        assertThat(throwable)
            .asInstanceOf(InstanceOfAssertFactories.throwable(InternalServerException::class.java))
            .satisfies({ e ->
                assertThat(e.statusCode()).isEqualTo(500)
                assertThat(e.error()).isEqualTo(error)
                assertThat(e.headers().toMap()).containsAllEntriesOf(headers.toMap())
            })
    }

    private fun Headers.toMap(): Map<String, List<String>> =
        mutableMapOf<String, List<String>>().also { map ->
            names().forEach { map[it] = values(it) }
        }
}
