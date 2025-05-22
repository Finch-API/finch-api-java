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

internal class PayStatementResponseBodyTest {

    @Test
    fun ofUnionMember0() {
        val unionMember0 =
            PayStatementResponseBody.UnionMember0.builder()
                .paging(
                    PayStatementResponseBody.UnionMember0.Paging.builder()
                        .offset(0L)
                        .count(0L)
                        .build()
                )
                .addPayStatement(
                    PayStatementResponseBody.UnionMember0.PayStatement.builder()
                        .addEarning(
                            PayStatementResponseBody.UnionMember0.PayStatement.Earning.builder()
                                .amount(0L)
                                .currency("currency")
                                .hours(0.0)
                                .name("name")
                                .type(
                                    PayStatementResponseBody.UnionMember0.PayStatement.Earning.Type
                                        .SALARY
                                )
                                .attributes(
                                    PayStatementResponseBody.UnionMember0.PayStatement.Earning
                                        .Attributes
                                        .builder()
                                        .metadata(
                                            PayStatementResponseBody.UnionMember0.PayStatement
                                                .Earning
                                                .Attributes
                                                .Metadata
                                                .builder()
                                                .metadata(
                                                    PayStatementResponseBody.UnionMember0
                                                        .PayStatement
                                                        .Earning
                                                        .Attributes
                                                        .Metadata
                                                        .InnerMetadata
                                                        .builder()
                                                        .putAdditionalProperty(
                                                            "foo",
                                                            JsonValue.from(mapOf<String, Any>()),
                                                        )
                                                        .build()
                                                )
                                                .build()
                                        )
                                        .build()
                                )
                                .build()
                        )
                        .addEmployeeDeduction(
                            PayStatementResponseBody.UnionMember0.PayStatement.EmployeeDeduction
                                .builder()
                                .amount(0L)
                                .currency("currency")
                                .name("name")
                                .preTax(true)
                                .type(BenefitType._457)
                                .attributes(
                                    PayStatementResponseBody.UnionMember0.PayStatement
                                        .EmployeeDeduction
                                        .Attributes
                                        .builder()
                                        .metadata(
                                            PayStatementResponseBody.UnionMember0.PayStatement
                                                .EmployeeDeduction
                                                .Attributes
                                                .Metadata
                                                .builder()
                                                .metadata(
                                                    PayStatementResponseBody.UnionMember0
                                                        .PayStatement
                                                        .EmployeeDeduction
                                                        .Attributes
                                                        .Metadata
                                                        .InnerMetadata
                                                        .builder()
                                                        .putAdditionalProperty(
                                                            "foo",
                                                            JsonValue.from(mapOf<String, Any>()),
                                                        )
                                                        .build()
                                                )
                                                .build()
                                        )
                                        .build()
                                )
                                .build()
                        )
                        .addEmployerContribution(
                            PayStatementResponseBody.UnionMember0.PayStatement.EmployerContribution
                                .builder()
                                .currency("currency")
                                .name("name")
                                .type(BenefitType._457)
                                .amount(0L)
                                .attributes(
                                    PayStatementResponseBody.UnionMember0.PayStatement
                                        .EmployerContribution
                                        .Attributes
                                        .builder()
                                        .metadata(
                                            PayStatementResponseBody.UnionMember0.PayStatement
                                                .EmployerContribution
                                                .Attributes
                                                .Metadata
                                                .builder()
                                                .metadata(
                                                    PayStatementResponseBody.UnionMember0
                                                        .PayStatement
                                                        .EmployerContribution
                                                        .Attributes
                                                        .Metadata
                                                        .InnerMetadata
                                                        .builder()
                                                        .putAdditionalProperty(
                                                            "foo",
                                                            JsonValue.from(mapOf<String, Any>()),
                                                        )
                                                        .build()
                                                )
                                                .build()
                                        )
                                        .build()
                                )
                                .build()
                        )
                        .grossPay(Money.builder().amount(0L).currency("currency").build())
                        .individualId("individual_id")
                        .netPay(Money.builder().amount(0L).currency("currency").build())
                        .paymentMethod(
                            PayStatementResponseBody.UnionMember0.PayStatement.PaymentMethod.CHECK
                        )
                        .addTax(
                            PayStatementResponseBody.UnionMember0.PayStatement.Tax.builder()
                                .currency("currency")
                                .employer(true)
                                .name("name")
                                .type(
                                    PayStatementResponseBody.UnionMember0.PayStatement.Tax.Type
                                        .STATE
                                )
                                .amount(0L)
                                .attributes(
                                    PayStatementResponseBody.UnionMember0.PayStatement.Tax
                                        .Attributes
                                        .builder()
                                        .metadata(
                                            PayStatementResponseBody.UnionMember0.PayStatement.Tax
                                                .Attributes
                                                .Metadata
                                                .builder()
                                                .metadata(
                                                    PayStatementResponseBody.UnionMember0
                                                        .PayStatement
                                                        .Tax
                                                        .Attributes
                                                        .Metadata
                                                        .InnerMetadata
                                                        .builder()
                                                        .putAdditionalProperty(
                                                            "foo",
                                                            JsonValue.from(mapOf<String, Any>()),
                                                        )
                                                        .build()
                                                )
                                                .build()
                                        )
                                        .build()
                                )
                                .build()
                        )
                        .totalHours(0.0)
                        .type(
                            PayStatementResponseBody.UnionMember0.PayStatement.Type
                                .OFF_CYCLE_PAYROLL
                        )
                        .build()
                )
                .build()

        val payStatementResponseBody = PayStatementResponseBody.ofUnionMember0(unionMember0)

        assertThat(payStatementResponseBody.unionMember0()).contains(unionMember0)
        assertThat(payStatementResponseBody.batchError()).isEmpty
        assertThat(payStatementResponseBody.unionMember2()).isEmpty
    }

    @Test
    fun ofUnionMember0Roundtrip() {
        val jsonMapper = jsonMapper()
        val payStatementResponseBody =
            PayStatementResponseBody.ofUnionMember0(
                PayStatementResponseBody.UnionMember0.builder()
                    .paging(
                        PayStatementResponseBody.UnionMember0.Paging.builder()
                            .offset(0L)
                            .count(0L)
                            .build()
                    )
                    .addPayStatement(
                        PayStatementResponseBody.UnionMember0.PayStatement.builder()
                            .addEarning(
                                PayStatementResponseBody.UnionMember0.PayStatement.Earning.builder()
                                    .amount(0L)
                                    .currency("currency")
                                    .hours(0.0)
                                    .name("name")
                                    .type(
                                        PayStatementResponseBody.UnionMember0.PayStatement.Earning
                                            .Type
                                            .SALARY
                                    )
                                    .attributes(
                                        PayStatementResponseBody.UnionMember0.PayStatement.Earning
                                            .Attributes
                                            .builder()
                                            .metadata(
                                                PayStatementResponseBody.UnionMember0.PayStatement
                                                    .Earning
                                                    .Attributes
                                                    .Metadata
                                                    .builder()
                                                    .metadata(
                                                        PayStatementResponseBody.UnionMember0
                                                            .PayStatement
                                                            .Earning
                                                            .Attributes
                                                            .Metadata
                                                            .InnerMetadata
                                                            .builder()
                                                            .putAdditionalProperty(
                                                                "foo",
                                                                JsonValue.from(mapOf<String, Any>()),
                                                            )
                                                            .build()
                                                    )
                                                    .build()
                                            )
                                            .build()
                                    )
                                    .build()
                            )
                            .addEmployeeDeduction(
                                PayStatementResponseBody.UnionMember0.PayStatement.EmployeeDeduction
                                    .builder()
                                    .amount(0L)
                                    .currency("currency")
                                    .name("name")
                                    .preTax(true)
                                    .type(BenefitType._457)
                                    .attributes(
                                        PayStatementResponseBody.UnionMember0.PayStatement
                                            .EmployeeDeduction
                                            .Attributes
                                            .builder()
                                            .metadata(
                                                PayStatementResponseBody.UnionMember0.PayStatement
                                                    .EmployeeDeduction
                                                    .Attributes
                                                    .Metadata
                                                    .builder()
                                                    .metadata(
                                                        PayStatementResponseBody.UnionMember0
                                                            .PayStatement
                                                            .EmployeeDeduction
                                                            .Attributes
                                                            .Metadata
                                                            .InnerMetadata
                                                            .builder()
                                                            .putAdditionalProperty(
                                                                "foo",
                                                                JsonValue.from(mapOf<String, Any>()),
                                                            )
                                                            .build()
                                                    )
                                                    .build()
                                            )
                                            .build()
                                    )
                                    .build()
                            )
                            .addEmployerContribution(
                                PayStatementResponseBody.UnionMember0.PayStatement
                                    .EmployerContribution
                                    .builder()
                                    .currency("currency")
                                    .name("name")
                                    .type(BenefitType._457)
                                    .amount(0L)
                                    .attributes(
                                        PayStatementResponseBody.UnionMember0.PayStatement
                                            .EmployerContribution
                                            .Attributes
                                            .builder()
                                            .metadata(
                                                PayStatementResponseBody.UnionMember0.PayStatement
                                                    .EmployerContribution
                                                    .Attributes
                                                    .Metadata
                                                    .builder()
                                                    .metadata(
                                                        PayStatementResponseBody.UnionMember0
                                                            .PayStatement
                                                            .EmployerContribution
                                                            .Attributes
                                                            .Metadata
                                                            .InnerMetadata
                                                            .builder()
                                                            .putAdditionalProperty(
                                                                "foo",
                                                                JsonValue.from(mapOf<String, Any>()),
                                                            )
                                                            .build()
                                                    )
                                                    .build()
                                            )
                                            .build()
                                    )
                                    .build()
                            )
                            .grossPay(Money.builder().amount(0L).currency("currency").build())
                            .individualId("individual_id")
                            .netPay(Money.builder().amount(0L).currency("currency").build())
                            .paymentMethod(
                                PayStatementResponseBody.UnionMember0.PayStatement.PaymentMethod
                                    .CHECK
                            )
                            .addTax(
                                PayStatementResponseBody.UnionMember0.PayStatement.Tax.builder()
                                    .currency("currency")
                                    .employer(true)
                                    .name("name")
                                    .type(
                                        PayStatementResponseBody.UnionMember0.PayStatement.Tax.Type
                                            .STATE
                                    )
                                    .amount(0L)
                                    .attributes(
                                        PayStatementResponseBody.UnionMember0.PayStatement.Tax
                                            .Attributes
                                            .builder()
                                            .metadata(
                                                PayStatementResponseBody.UnionMember0.PayStatement
                                                    .Tax
                                                    .Attributes
                                                    .Metadata
                                                    .builder()
                                                    .metadata(
                                                        PayStatementResponseBody.UnionMember0
                                                            .PayStatement
                                                            .Tax
                                                            .Attributes
                                                            .Metadata
                                                            .InnerMetadata
                                                            .builder()
                                                            .putAdditionalProperty(
                                                                "foo",
                                                                JsonValue.from(mapOf<String, Any>()),
                                                            )
                                                            .build()
                                                    )
                                                    .build()
                                            )
                                            .build()
                                    )
                                    .build()
                            )
                            .totalHours(0.0)
                            .type(
                                PayStatementResponseBody.UnionMember0.PayStatement.Type
                                    .OFF_CYCLE_PAYROLL
                            )
                            .build()
                    )
                    .build()
            )

        val roundtrippedPayStatementResponseBody =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(payStatementResponseBody),
                jacksonTypeRef<PayStatementResponseBody>(),
            )

        assertThat(roundtrippedPayStatementResponseBody).isEqualTo(payStatementResponseBody)
    }

    @Test
    fun ofBatchError() {
        val batchError =
            PayStatementResponseBody.BatchError.builder()
                .code(0.0)
                .message("message")
                .name("name")
                .finchCode("finch_code")
                .build()

        val payStatementResponseBody = PayStatementResponseBody.ofBatchError(batchError)

        assertThat(payStatementResponseBody.unionMember0()).isEmpty
        assertThat(payStatementResponseBody.batchError()).contains(batchError)
        assertThat(payStatementResponseBody.unionMember2()).isEmpty
    }

    @Test
    fun ofBatchErrorRoundtrip() {
        val jsonMapper = jsonMapper()
        val payStatementResponseBody =
            PayStatementResponseBody.ofBatchError(
                PayStatementResponseBody.BatchError.builder()
                    .code(0.0)
                    .message("message")
                    .name("name")
                    .finchCode("finch_code")
                    .build()
            )

        val roundtrippedPayStatementResponseBody =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(payStatementResponseBody),
                jacksonTypeRef<PayStatementResponseBody>(),
            )

        assertThat(roundtrippedPayStatementResponseBody).isEqualTo(payStatementResponseBody)
    }

    @Test
    fun ofUnionMember2() {
        val unionMember2 =
            PayStatementResponseBody.UnionMember2.builder()
                .code(PayStatementResponseBody.UnionMember2.Code._202)
                .finchCode(PayStatementResponseBody.UnionMember2.FinchCode.DATA_SYNC_IN_PROGRESS)
                .message(
                    PayStatementResponseBody.UnionMember2.Message
                        .THE_PAY_STATEMENTS_FOR_THIS_PAYMENT_ARE_BEING_FETCHED_PLEASE_CHECK_BACK_LATER
                )
                .name(PayStatementResponseBody.UnionMember2.Name.ACCEPTED)
                .build()

        val payStatementResponseBody = PayStatementResponseBody.ofUnionMember2(unionMember2)

        assertThat(payStatementResponseBody.unionMember0()).isEmpty
        assertThat(payStatementResponseBody.batchError()).isEmpty
        assertThat(payStatementResponseBody.unionMember2()).contains(unionMember2)
    }

    @Test
    fun ofUnionMember2Roundtrip() {
        val jsonMapper = jsonMapper()
        val payStatementResponseBody =
            PayStatementResponseBody.ofUnionMember2(
                PayStatementResponseBody.UnionMember2.builder()
                    .code(PayStatementResponseBody.UnionMember2.Code._202)
                    .finchCode(
                        PayStatementResponseBody.UnionMember2.FinchCode.DATA_SYNC_IN_PROGRESS
                    )
                    .message(
                        PayStatementResponseBody.UnionMember2.Message
                            .THE_PAY_STATEMENTS_FOR_THIS_PAYMENT_ARE_BEING_FETCHED_PLEASE_CHECK_BACK_LATER
                    )
                    .name(PayStatementResponseBody.UnionMember2.Name.ACCEPTED)
                    .build()
            )

        val roundtrippedPayStatementResponseBody =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(payStatementResponseBody),
                jacksonTypeRef<PayStatementResponseBody>(),
            )

        assertThat(roundtrippedPayStatementResponseBody).isEqualTo(payStatementResponseBody)
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
        val payStatementResponseBody =
            jsonMapper().convertValue(testCase.value, jacksonTypeRef<PayStatementResponseBody>())

        val e = assertThrows<FinchInvalidDataException> { payStatementResponseBody.validate() }
        assertThat(e).hasMessageStartingWith("Unknown ")
    }
}
