// File generated from our OpenAPI spec by Stainless.

package com.tryfinch.api.models

import java.time.LocalDate
import kotlin.jvm.optionals.getOrNull
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class SandboxPaymentCreateParamsTest {

    @Test
    fun create() {
        SandboxPaymentCreateParams.builder()
            .endDate(LocalDate.parse("2019-12-27"))
            .addPayStatement(
                SandboxPaymentCreateParams.PayStatement.builder()
                    .individualId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                    .addEarning(
                        SandboxPaymentCreateParams.PayStatement.Earning.builder()
                            .amount(0L)
                            .hours(0.0)
                            .name("x")
                            .type(SandboxPaymentCreateParams.PayStatement.Earning.Type.BONUS)
                            .build()
                    )
                    .addEmployeeDeduction(
                        SandboxPaymentCreateParams.PayStatement.EmployeeDeduction.builder()
                            .amount(0L)
                            .name("x")
                            .preTax(true)
                            .type(
                                SandboxPaymentCreateParams.PayStatement.EmployeeDeduction.Type._457
                            )
                            .build()
                    )
                    .addEmployerContribution(
                        SandboxPaymentCreateParams.PayStatement.EmployerContribution.builder()
                            .amount(0L)
                            .name("x")
                            .type(
                                SandboxPaymentCreateParams.PayStatement.EmployerContribution.Type
                                    ._457
                            )
                            .build()
                    )
                    .grossPay(1L)
                    .netPay(9007199254740991L)
                    .paymentMethod(SandboxPaymentCreateParams.PayStatement.PaymentMethod.CHECK)
                    .addTax(
                        SandboxPaymentCreateParams.PayStatement.Tax.builder()
                            .amount(0L)
                            .employer(true)
                            .name("x")
                            .type(SandboxPaymentCreateParams.PayStatement.Tax.Type.FEDERAL)
                            .build()
                    )
                    .totalHours(1.0)
                    .type(SandboxPaymentCreateParams.PayStatement.Type.OFF_CYCLE_PAYROLL)
                    .build()
            )
            .startDate(LocalDate.parse("2019-12-27"))
            .build()
    }

    @Test
    fun body() {
        val params =
            SandboxPaymentCreateParams.builder()
                .endDate(LocalDate.parse("2019-12-27"))
                .addPayStatement(
                    SandboxPaymentCreateParams.PayStatement.builder()
                        .individualId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                        .addEarning(
                            SandboxPaymentCreateParams.PayStatement.Earning.builder()
                                .amount(0L)
                                .hours(0.0)
                                .name("x")
                                .type(SandboxPaymentCreateParams.PayStatement.Earning.Type.BONUS)
                                .build()
                        )
                        .addEmployeeDeduction(
                            SandboxPaymentCreateParams.PayStatement.EmployeeDeduction.builder()
                                .amount(0L)
                                .name("x")
                                .preTax(true)
                                .type(
                                    SandboxPaymentCreateParams.PayStatement.EmployeeDeduction.Type
                                        ._457
                                )
                                .build()
                        )
                        .addEmployerContribution(
                            SandboxPaymentCreateParams.PayStatement.EmployerContribution.builder()
                                .amount(0L)
                                .name("x")
                                .type(
                                    SandboxPaymentCreateParams.PayStatement.EmployerContribution
                                        .Type
                                        ._457
                                )
                                .build()
                        )
                        .grossPay(1L)
                        .netPay(9007199254740991L)
                        .paymentMethod(SandboxPaymentCreateParams.PayStatement.PaymentMethod.CHECK)
                        .addTax(
                            SandboxPaymentCreateParams.PayStatement.Tax.builder()
                                .amount(0L)
                                .employer(true)
                                .name("x")
                                .type(SandboxPaymentCreateParams.PayStatement.Tax.Type.FEDERAL)
                                .build()
                        )
                        .totalHours(1.0)
                        .type(SandboxPaymentCreateParams.PayStatement.Type.OFF_CYCLE_PAYROLL)
                        .build()
                )
                .startDate(LocalDate.parse("2019-12-27"))
                .build()

        val body = params._body()

        assertThat(body.endDate()).contains(LocalDate.parse("2019-12-27"))
        assertThat(body.payStatements().getOrNull())
            .containsExactly(
                SandboxPaymentCreateParams.PayStatement.builder()
                    .individualId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                    .addEarning(
                        SandboxPaymentCreateParams.PayStatement.Earning.builder()
                            .amount(0L)
                            .hours(0.0)
                            .name("x")
                            .type(SandboxPaymentCreateParams.PayStatement.Earning.Type.BONUS)
                            .build()
                    )
                    .addEmployeeDeduction(
                        SandboxPaymentCreateParams.PayStatement.EmployeeDeduction.builder()
                            .amount(0L)
                            .name("x")
                            .preTax(true)
                            .type(
                                SandboxPaymentCreateParams.PayStatement.EmployeeDeduction.Type._457
                            )
                            .build()
                    )
                    .addEmployerContribution(
                        SandboxPaymentCreateParams.PayStatement.EmployerContribution.builder()
                            .amount(0L)
                            .name("x")
                            .type(
                                SandboxPaymentCreateParams.PayStatement.EmployerContribution.Type
                                    ._457
                            )
                            .build()
                    )
                    .grossPay(1L)
                    .netPay(9007199254740991L)
                    .paymentMethod(SandboxPaymentCreateParams.PayStatement.PaymentMethod.CHECK)
                    .addTax(
                        SandboxPaymentCreateParams.PayStatement.Tax.builder()
                            .amount(0L)
                            .employer(true)
                            .name("x")
                            .type(SandboxPaymentCreateParams.PayStatement.Tax.Type.FEDERAL)
                            .build()
                    )
                    .totalHours(1.0)
                    .type(SandboxPaymentCreateParams.PayStatement.Type.OFF_CYCLE_PAYROLL)
                    .build()
            )
        assertThat(body.startDate()).contains(LocalDate.parse("2019-12-27"))
    }

    @Test
    fun bodyWithoutOptionalFields() {
        val params = SandboxPaymentCreateParams.builder().build()

        val body = params._body()
    }
}
