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

internal class DocumentRetreiveResponseTest {

    @Test
    fun ofW42020() {
        val w42020 =
            W42020.builder()
                .data(
                    W42020.Data.builder()
                        .amountForOtherDependents(0L)
                        .amountForQualifyingChildrenUnder17(0L)
                        .deductions(0L)
                        .extraWithholding(0L)
                        .filingStatus(W42020.Data.FilingStatus.HEAD_OF_HOUSEHOLD)
                        .individualId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                        .otherIncome(0L)
                        .totalClaimDependentAndOtherCredits(0L)
                        .build()
                )
                .type(W42020.Type.W4_2020)
                .year(0.0)
                .build()

        val documentRetreiveResponse = DocumentRetreiveResponse.ofW42020(w42020)

        assertThat(documentRetreiveResponse.w42020()).contains(w42020)
        assertThat(documentRetreiveResponse.w42005()).isEmpty
    }

    @Test
    fun ofW42020Roundtrip() {
        val jsonMapper = jsonMapper()
        val documentRetreiveResponse =
            DocumentRetreiveResponse.ofW42020(
                W42020.builder()
                    .data(
                        W42020.Data.builder()
                            .amountForOtherDependents(0L)
                            .amountForQualifyingChildrenUnder17(0L)
                            .deductions(0L)
                            .extraWithholding(0L)
                            .filingStatus(W42020.Data.FilingStatus.HEAD_OF_HOUSEHOLD)
                            .individualId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                            .otherIncome(0L)
                            .totalClaimDependentAndOtherCredits(0L)
                            .build()
                    )
                    .type(W42020.Type.W4_2020)
                    .year(0.0)
                    .build()
            )

        val roundtrippedDocumentRetreiveResponse =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(documentRetreiveResponse),
                jacksonTypeRef<DocumentRetreiveResponse>(),
            )

        assertThat(roundtrippedDocumentRetreiveResponse).isEqualTo(documentRetreiveResponse)
    }

    @Test
    fun ofW42005() {
        val w42005 =
            W42005.builder()
                .data(
                    W42005.Data.builder()
                        .additionalWithholding(0L)
                        .exemption(W42005.Data.Exemption.EXEMPT)
                        .filingStatus(W42005.Data.FilingStatus.MARRIED)
                        .individualId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                        .totalNumberOfAllowances(0L)
                        .build()
                )
                .type(W42005.Type.W4_2005)
                .year(0.0)
                .build()

        val documentRetreiveResponse = DocumentRetreiveResponse.ofW42005(w42005)

        assertThat(documentRetreiveResponse.w42020()).isEmpty
        assertThat(documentRetreiveResponse.w42005()).contains(w42005)
    }

    @Test
    fun ofW42005Roundtrip() {
        val jsonMapper = jsonMapper()
        val documentRetreiveResponse =
            DocumentRetreiveResponse.ofW42005(
                W42005.builder()
                    .data(
                        W42005.Data.builder()
                            .additionalWithholding(0L)
                            .exemption(W42005.Data.Exemption.EXEMPT)
                            .filingStatus(W42005.Data.FilingStatus.MARRIED)
                            .individualId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                            .totalNumberOfAllowances(0L)
                            .build()
                    )
                    .type(W42005.Type.W4_2005)
                    .year(0.0)
                    .build()
            )

        val roundtrippedDocumentRetreiveResponse =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(documentRetreiveResponse),
                jacksonTypeRef<DocumentRetreiveResponse>(),
            )

        assertThat(roundtrippedDocumentRetreiveResponse).isEqualTo(documentRetreiveResponse)
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
        val documentRetreiveResponse =
            jsonMapper().convertValue(testCase.value, jacksonTypeRef<DocumentRetreiveResponse>())

        val e = assertThrows<FinchInvalidDataException> { documentRetreiveResponse.validate() }
        assertThat(e).hasMessageStartingWith("Unknown ")
    }
}
