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
    fun ofUnionMember0() {
        val unionMember0 =
            Individual.UnionMember0.builder()
                .id("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                .dob("dob")
                .ethnicity(Individual.UnionMember0.Ethnicity.ASIAN)
                .firstName("first_name")
                .gender(Individual.UnionMember0.Gender.FEMALE)
                .lastName("last_name")
                .middleName("middle_name")
                .addPhoneNumber(
                    Individual.UnionMember0.PhoneNumber.builder()
                        .data("data")
                        .type(Individual.UnionMember0.PhoneNumber.Type.WORK)
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
                    Individual.UnionMember0.Email.builder()
                        .data("data")
                        .type(Individual.UnionMember0.Email.Type.WORK)
                        .build()
                )
                .encryptedSsn("encrypted_ssn")
                .ssn("ssn")
                .build()

        val individual = Individual.ofUnionMember0(unionMember0)

        assertThat(individual.unionMember0()).contains(unionMember0)
        assertThat(individual.batchError()).isEmpty
    }

    @Test
    fun ofUnionMember0Roundtrip() {
        val jsonMapper = jsonMapper()
        val individual =
            Individual.ofUnionMember0(
                Individual.UnionMember0.builder()
                    .id("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                    .dob("dob")
                    .ethnicity(Individual.UnionMember0.Ethnicity.ASIAN)
                    .firstName("first_name")
                    .gender(Individual.UnionMember0.Gender.FEMALE)
                    .lastName("last_name")
                    .middleName("middle_name")
                    .addPhoneNumber(
                        Individual.UnionMember0.PhoneNumber.builder()
                            .data("data")
                            .type(Individual.UnionMember0.PhoneNumber.Type.WORK)
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
                        Individual.UnionMember0.Email.builder()
                            .data("data")
                            .type(Individual.UnionMember0.Email.Type.WORK)
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

        assertThat(individual.unionMember0()).isEmpty
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
