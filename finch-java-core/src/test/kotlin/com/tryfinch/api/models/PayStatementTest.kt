// File generated from our OpenAPI spec by Stainless.

package com.tryfinch.api.models

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.tryfinch.api.core.JsonValue
import com.tryfinch.api.core.jsonMapper
import kotlin.jvm.optionals.getOrNull
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class PayStatementTest {

    @Test
    fun create() {
        val payStatement =
            PayStatement.builder()
                .addEarning(
                    PayStatement.Earning.builder()
                        .amount(0L)
                        .attributes(
                            PayStatement.Earning.Attributes.builder()
                                .metadata(
                                    PayStatement.Earning.Attributes.Metadata.builder()
                                        .metadata(
                                            PayStatement.Earning.Attributes.Metadata.InnerMetadata
                                                .builder()
                                                .putAdditionalProperty("foo", JsonValue.from("bar"))
                                                .build()
                                        )
                                        .build()
                                )
                                .build()
                        )
                        .currency("currency")
                        .hours(0.0)
                        .name("name")
                        .type(PayStatement.Earning.Type.SALARY)
                        .build()
                )
                .addEmployeeDeduction(
                    PayStatement.EmployeeDeduction.builder()
                        .amount(0L)
                        .attributes(
                            PayStatement.EmployeeDeduction.Attributes.builder()
                                .metadata(
                                    PayStatement.EmployeeDeduction.Attributes.Metadata.builder()
                                        .metadata(
                                            PayStatement.EmployeeDeduction.Attributes.Metadata
                                                .InnerMetadata
                                                .builder()
                                                .putAdditionalProperty("foo", JsonValue.from("bar"))
                                                .build()
                                        )
                                        .build()
                                )
                                .build()
                        )
                        .currency("currency")
                        .name("name")
                        .preTax(true)
                        .type(BenefitType._401K)
                        .build()
                )
                .addEmployerContribution(
                    PayStatement.EmployerContribution.builder()
                        .amount(0L)
                        .attributes(
                            PayStatement.EmployerContribution.Attributes.builder()
                                .metadata(
                                    PayStatement.EmployerContribution.Attributes.Metadata.builder()
                                        .metadata(
                                            PayStatement.EmployerContribution.Attributes.Metadata
                                                .InnerMetadata
                                                .builder()
                                                .putAdditionalProperty("foo", JsonValue.from("bar"))
                                                .build()
                                        )
                                        .build()
                                )
                                .build()
                        )
                        .currency("currency")
                        .name("name")
                        .type(BenefitType._401K)
                        .build()
                )
                .grossPay(Money.builder().amount(0L).currency("currency").build())
                .individualId("individual_id")
                .netPay(Money.builder().amount(0L).currency("currency").build())
                .paymentMethod(PayStatement.PaymentMethod.CHECK)
                .addTax(
                    PayStatement.Tax.builder()
                        .amount(0L)
                        .attributes(
                            PayStatement.Tax.Attributes.builder()
                                .metadata(
                                    PayStatement.Tax.Attributes.Metadata.builder()
                                        .metadata(
                                            PayStatement.Tax.Attributes.Metadata.InnerMetadata
                                                .builder()
                                                .putAdditionalProperty("foo", JsonValue.from("bar"))
                                                .build()
                                        )
                                        .build()
                                )
                                .build()
                        )
                        .currency("currency")
                        .employer(true)
                        .name("name")
                        .type(PayStatement.Tax.Type.STATE)
                        .build()
                )
                .totalHours(0.0)
                .type(PayStatement.Type.REGULAR_PAYROLL)
                .build()

        assertThat(payStatement.earnings().getOrNull())
            .containsExactly(
                PayStatement.Earning.builder()
                    .amount(0L)
                    .attributes(
                        PayStatement.Earning.Attributes.builder()
                            .metadata(
                                PayStatement.Earning.Attributes.Metadata.builder()
                                    .metadata(
                                        PayStatement.Earning.Attributes.Metadata.InnerMetadata
                                            .builder()
                                            .putAdditionalProperty("foo", JsonValue.from("bar"))
                                            .build()
                                    )
                                    .build()
                            )
                            .build()
                    )
                    .currency("currency")
                    .hours(0.0)
                    .name("name")
                    .type(PayStatement.Earning.Type.SALARY)
                    .build()
            )
        assertThat(payStatement.employeeDeductions().getOrNull())
            .containsExactly(
                PayStatement.EmployeeDeduction.builder()
                    .amount(0L)
                    .attributes(
                        PayStatement.EmployeeDeduction.Attributes.builder()
                            .metadata(
                                PayStatement.EmployeeDeduction.Attributes.Metadata.builder()
                                    .metadata(
                                        PayStatement.EmployeeDeduction.Attributes.Metadata
                                            .InnerMetadata
                                            .builder()
                                            .putAdditionalProperty("foo", JsonValue.from("bar"))
                                            .build()
                                    )
                                    .build()
                            )
                            .build()
                    )
                    .currency("currency")
                    .name("name")
                    .preTax(true)
                    .type(BenefitType._401K)
                    .build()
            )
        assertThat(payStatement.employerContributions().getOrNull())
            .containsExactly(
                PayStatement.EmployerContribution.builder()
                    .amount(0L)
                    .attributes(
                        PayStatement.EmployerContribution.Attributes.builder()
                            .metadata(
                                PayStatement.EmployerContribution.Attributes.Metadata.builder()
                                    .metadata(
                                        PayStatement.EmployerContribution.Attributes.Metadata
                                            .InnerMetadata
                                            .builder()
                                            .putAdditionalProperty("foo", JsonValue.from("bar"))
                                            .build()
                                    )
                                    .build()
                            )
                            .build()
                    )
                    .currency("currency")
                    .name("name")
                    .type(BenefitType._401K)
                    .build()
            )
        assertThat(payStatement.grossPay())
            .contains(Money.builder().amount(0L).currency("currency").build())
        assertThat(payStatement.individualId()).contains("individual_id")
        assertThat(payStatement.netPay())
            .contains(Money.builder().amount(0L).currency("currency").build())
        assertThat(payStatement.paymentMethod()).contains(PayStatement.PaymentMethod.CHECK)
        assertThat(payStatement.taxes().getOrNull())
            .containsExactly(
                PayStatement.Tax.builder()
                    .amount(0L)
                    .attributes(
                        PayStatement.Tax.Attributes.builder()
                            .metadata(
                                PayStatement.Tax.Attributes.Metadata.builder()
                                    .metadata(
                                        PayStatement.Tax.Attributes.Metadata.InnerMetadata.builder()
                                            .putAdditionalProperty("foo", JsonValue.from("bar"))
                                            .build()
                                    )
                                    .build()
                            )
                            .build()
                    )
                    .currency("currency")
                    .employer(true)
                    .name("name")
                    .type(PayStatement.Tax.Type.STATE)
                    .build()
            )
        assertThat(payStatement.totalHours()).contains(0.0)
        assertThat(payStatement.type()).contains(PayStatement.Type.REGULAR_PAYROLL)
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val payStatement =
            PayStatement.builder()
                .addEarning(
                    PayStatement.Earning.builder()
                        .amount(0L)
                        .attributes(
                            PayStatement.Earning.Attributes.builder()
                                .metadata(
                                    PayStatement.Earning.Attributes.Metadata.builder()
                                        .metadata(
                                            PayStatement.Earning.Attributes.Metadata.InnerMetadata
                                                .builder()
                                                .putAdditionalProperty("foo", JsonValue.from("bar"))
                                                .build()
                                        )
                                        .build()
                                )
                                .build()
                        )
                        .currency("currency")
                        .hours(0.0)
                        .name("name")
                        .type(PayStatement.Earning.Type.SALARY)
                        .build()
                )
                .addEmployeeDeduction(
                    PayStatement.EmployeeDeduction.builder()
                        .amount(0L)
                        .attributes(
                            PayStatement.EmployeeDeduction.Attributes.builder()
                                .metadata(
                                    PayStatement.EmployeeDeduction.Attributes.Metadata.builder()
                                        .metadata(
                                            PayStatement.EmployeeDeduction.Attributes.Metadata
                                                .InnerMetadata
                                                .builder()
                                                .putAdditionalProperty("foo", JsonValue.from("bar"))
                                                .build()
                                        )
                                        .build()
                                )
                                .build()
                        )
                        .currency("currency")
                        .name("name")
                        .preTax(true)
                        .type(BenefitType._401K)
                        .build()
                )
                .addEmployerContribution(
                    PayStatement.EmployerContribution.builder()
                        .amount(0L)
                        .attributes(
                            PayStatement.EmployerContribution.Attributes.builder()
                                .metadata(
                                    PayStatement.EmployerContribution.Attributes.Metadata.builder()
                                        .metadata(
                                            PayStatement.EmployerContribution.Attributes.Metadata
                                                .InnerMetadata
                                                .builder()
                                                .putAdditionalProperty("foo", JsonValue.from("bar"))
                                                .build()
                                        )
                                        .build()
                                )
                                .build()
                        )
                        .currency("currency")
                        .name("name")
                        .type(BenefitType._401K)
                        .build()
                )
                .grossPay(Money.builder().amount(0L).currency("currency").build())
                .individualId("individual_id")
                .netPay(Money.builder().amount(0L).currency("currency").build())
                .paymentMethod(PayStatement.PaymentMethod.CHECK)
                .addTax(
                    PayStatement.Tax.builder()
                        .amount(0L)
                        .attributes(
                            PayStatement.Tax.Attributes.builder()
                                .metadata(
                                    PayStatement.Tax.Attributes.Metadata.builder()
                                        .metadata(
                                            PayStatement.Tax.Attributes.Metadata.InnerMetadata
                                                .builder()
                                                .putAdditionalProperty("foo", JsonValue.from("bar"))
                                                .build()
                                        )
                                        .build()
                                )
                                .build()
                        )
                        .currency("currency")
                        .employer(true)
                        .name("name")
                        .type(PayStatement.Tax.Type.STATE)
                        .build()
                )
                .totalHours(0.0)
                .type(PayStatement.Type.REGULAR_PAYROLL)
                .build()

        val roundtrippedPayStatement =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(payStatement),
                jacksonTypeRef<PayStatement>(),
            )

        assertThat(roundtrippedPayStatement).isEqualTo(payStatement)
    }
}
