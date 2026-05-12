// File generated from our OpenAPI spec by Stainless.

package com.tryfinch.api.models

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.tryfinch.api.core.JsonValue
import com.tryfinch.api.core.jsonMapper
import com.tryfinch.api.errors.FinchInvalidDataException
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test
import org.junit.jupiter.api.assertThrows
import org.junit.jupiter.params.ParameterizedTest
import org.junit.jupiter.params.provider.EnumSource

internal class IndividualTest {

    @Test
    fun ofResponseBody() {
        val responseBody =
            Individual.IndividualResponseBody.builder()
                .id("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                .dob("dob")
                .ethnicity(Individual.IndividualResponseBody.Ethnicity.ASIAN)
                .firstName("first_name")
                .gender(Individual.IndividualResponseBody.Gender.FEMALE)
                .lastName("last_name")
                .middleName("middle_name")
                .addPhoneNumber(
                    Individual.IndividualResponseBody.PhoneNumber.builder()
                        .data("data")
                        .type(Individual.IndividualResponseBody.PhoneNumber.Type.WORK)
                        .build()
                )
                .preferredName("preferred_name")
                .residence(
                    Location.builder()
                        .city("city")
                        .country("country")
                        .line1("line1")
                        .line2("line2")
                        .postalCode("postal_code")
                        .state("state")
                        .name("name")
                        .sourceId("source_id")
                        .build()
                )
                .addEmail(
                    Individual.IndividualResponseBody.Email.builder()
                        .data("data")
                        .type(Individual.IndividualResponseBody.Email.Type.WORK)
                        .build()
                )
                .encryptedSsn("encrypted_ssn")
                .ssn("ssn")
                .build()

        val individual = Individual.ofResponseBody(responseBody)

        assertThat(individual.responseBody()).contains(responseBody)
        assertThat(individual.batchError()).isEmpty
    }

    @Test
    fun ofResponseBodyRoundtrip() {
        val jsonMapper = jsonMapper()
        val individual =
            Individual.ofResponseBody(
                Individual.IndividualResponseBody.builder()
                    .id("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                    .dob("dob")
                    .ethnicity(Individual.IndividualResponseBody.Ethnicity.ASIAN)
                    .firstName("first_name")
                    .gender(Individual.IndividualResponseBody.Gender.FEMALE)
                    .lastName("last_name")
                    .middleName("middle_name")
                    .addPhoneNumber(
                        Individual.IndividualResponseBody.PhoneNumber.builder()
                            .data("data")
                            .type(Individual.IndividualResponseBody.PhoneNumber.Type.WORK)
                            .build()
                    )
                    .preferredName("preferred_name")
                    .residence(
                        Location.builder()
                            .city("city")
                            .country("country")
                            .line1("line1")
                            .line2("line2")
                            .postalCode("postal_code")
                            .state("state")
                            .name("name")
                            .sourceId("source_id")
                            .build()
                    )
                    .addEmail(
                        Individual.IndividualResponseBody.Email.builder()
                            .data("data")
                            .type(Individual.IndividualResponseBody.Email.Type.WORK)
                            .build()
                    )
                    .encryptedSsn("encrypted_ssn")
                    .ssn("ssn")
                    .build()
            )

        val roundtrippedIndividual =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(individual),
                jacksonTypeRef<Individual>(),
            )

        assertThat(roundtrippedIndividual).isEqualTo(individual)
    }

    @Test
    fun ofBatchError() {
        val batchError =
            Individual.BatchError.builder()
                .code(0.0)
                .message("message")
                .name("name")
                .finchCode("finch_code")
                .build()

        val individual = Individual.ofBatchError(batchError)

        assertThat(individual.responseBody()).isEmpty
        assertThat(individual.batchError()).contains(batchError)
    }

    @Test
    fun ofBatchErrorRoundtrip() {
        val jsonMapper = jsonMapper()
        val individual =
            Individual.ofBatchError(
                Individual.BatchError.builder()
                    .code(0.0)
                    .message("message")
                    .name("name")
                    .finchCode("finch_code")
                    .build()
            )

        val roundtrippedIndividual =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(individual),
                jacksonTypeRef<Individual>(),
            )

        assertThat(roundtrippedIndividual).isEqualTo(individual)
    }

    enum class IncompatibleJsonShapeTestCase(val value: JsonValue) {
        BOOLEAN(JsonValue.from(false)),
        STRING(JsonValue.from("invalid")),
        INTEGER(JsonValue.from(-1)),
        FLOAT(JsonValue.from(3.14)),
        ARRAY(JsonValue.from(listOf("invalid", "array"))),
    }

    @ParameterizedTest
    @EnumSource
    fun incompatibleJsonShapeDeserializesToUnknown(testCase: IncompatibleJsonShapeTestCase) {
        val individual = jsonMapper().convertValue(testCase.value, jacksonTypeRef<Individual>())

        val e = assertThrows<FinchInvalidDataException> { individual.validate() }
        assertThat(e).hasMessageStartingWith("Unknown ")
    }
}
