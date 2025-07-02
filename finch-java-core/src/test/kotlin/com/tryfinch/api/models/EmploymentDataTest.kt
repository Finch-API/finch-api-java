// File generated from our OpenAPI spec by Stainless.

package com.tryfinch.api.models

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.tryfinch.api.core.JsonValue
import com.tryfinch.api.core.jsonMapper
import com.tryfinch.api.errors.FinchInvalidDataException
import java.time.LocalDate
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test
import org.junit.jupiter.api.assertThrows
import org.junit.jupiter.params.ParameterizedTest
import org.junit.jupiter.params.provider.EnumSource

internal class EmploymentDataTest {

    @Test
    fun ofUnionMember0() {
        val unionMember0 =
            EmploymentData.UnionMember0.builder()
                .id("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                .classCode("class_code")
                .department(EmploymentData.UnionMember0.Department.builder().name("name").build())
                .employment(
                    EmploymentData.UnionMember0.Employment.builder()
                        .subtype(EmploymentData.UnionMember0.Employment.Subtype.FULL_TIME)
                        .type(EmploymentData.UnionMember0.Employment.Type.EMPLOYEE)
                        .build()
                )
                .employmentStatus(EmploymentData.UnionMember0.EmploymentStatus.ACTIVE)
                .endDate("end_date")
                .firstName("first_name")
                .isActive(true)
                .lastName("last_name")
                .latestRehireDate("latest_rehire_date")
                .location(
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
                .manager(
                    EmploymentData.UnionMember0.Manager.builder()
                        .id("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                        .build()
                )
                .middleName("middle_name")
                .startDate("start_date")
                .title("title")
                .addCustomField(
                    EmploymentData.UnionMember0.CustomField.builder()
                        .name("name")
                        .value("string")
                        .build()
                )
                .income(
                    Income.builder()
                        .amount(0L)
                        .currency("currency")
                        .effectiveDate(LocalDate.parse("2019-12-27"))
                        .unit(Income.Unit.YEARLY)
                        .build()
                )
                .addIncomeHistory(
                    Income.builder()
                        .amount(0L)
                        .currency("currency")
                        .effectiveDate(LocalDate.parse("2019-12-27"))
                        .unit(Income.Unit.YEARLY)
                        .build()
                )
                .sourceId("source_id")
                .workId("work_id")
                .build()

        val employmentData = EmploymentData.ofUnionMember0(unionMember0)

        assertThat(employmentData.unionMember0()).contains(unionMember0)
        assertThat(employmentData.batchError()).isEmpty
    }

    @Test
    fun ofUnionMember0Roundtrip() {
        val jsonMapper = jsonMapper()
        val employmentData =
            EmploymentData.ofUnionMember0(
                EmploymentData.UnionMember0.builder()
                    .id("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                    .classCode("class_code")
                    .department(
                        EmploymentData.UnionMember0.Department.builder().name("name").build()
                    )
                    .employment(
                        EmploymentData.UnionMember0.Employment.builder()
                            .subtype(EmploymentData.UnionMember0.Employment.Subtype.FULL_TIME)
                            .type(EmploymentData.UnionMember0.Employment.Type.EMPLOYEE)
                            .build()
                    )
                    .employmentStatus(EmploymentData.UnionMember0.EmploymentStatus.ACTIVE)
                    .endDate("end_date")
                    .firstName("first_name")
                    .isActive(true)
                    .lastName("last_name")
                    .latestRehireDate("latest_rehire_date")
                    .location(
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
                    .manager(
                        EmploymentData.UnionMember0.Manager.builder()
                            .id("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                            .build()
                    )
                    .middleName("middle_name")
                    .startDate("start_date")
                    .title("title")
                    .addCustomField(
                        EmploymentData.UnionMember0.CustomField.builder()
                            .name("name")
                            .value("string")
                            .build()
                    )
                    .income(
                        Income.builder()
                            .amount(0L)
                            .currency("currency")
                            .effectiveDate(LocalDate.parse("2019-12-27"))
                            .unit(Income.Unit.YEARLY)
                            .build()
                    )
                    .addIncomeHistory(
                        Income.builder()
                            .amount(0L)
                            .currency("currency")
                            .effectiveDate(LocalDate.parse("2019-12-27"))
                            .unit(Income.Unit.YEARLY)
                            .build()
                    )
                    .sourceId("source_id")
                    .workId("work_id")
                    .build()
            )

        val roundtrippedEmploymentData =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(employmentData),
                jacksonTypeRef<EmploymentData>(),
            )

        assertThat(roundtrippedEmploymentData).isEqualTo(employmentData)
    }

    @Test
    fun ofBatchError() {
        val batchError =
            EmploymentData.BatchError.builder()
                .code(0.0)
                .message("message")
                .name("name")
                .finchCode("finch_code")
                .build()

        val employmentData = EmploymentData.ofBatchError(batchError)

        assertThat(employmentData.unionMember0()).isEmpty
        assertThat(employmentData.batchError()).contains(batchError)
    }

    @Test
    fun ofBatchErrorRoundtrip() {
        val jsonMapper = jsonMapper()
        val employmentData =
            EmploymentData.ofBatchError(
                EmploymentData.BatchError.builder()
                    .code(0.0)
                    .message("message")
                    .name("name")
                    .finchCode("finch_code")
                    .build()
            )

        val roundtrippedEmploymentData =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(employmentData),
                jacksonTypeRef<EmploymentData>(),
            )

        assertThat(roundtrippedEmploymentData).isEqualTo(employmentData)
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
        val employmentData =
            jsonMapper().convertValue(testCase.value, jacksonTypeRef<EmploymentData>())

        val e = assertThrows<FinchInvalidDataException> { employmentData.validate() }
        assertThat(e).hasMessageStartingWith("Unknown ")
    }
}
