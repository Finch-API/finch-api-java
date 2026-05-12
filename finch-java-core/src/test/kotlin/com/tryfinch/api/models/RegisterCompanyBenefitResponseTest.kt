// File generated from our OpenAPI spec by Stainless.

package com.tryfinch.api.models

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.tryfinch.api.core.jsonMapper
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class RegisterCompanyBenefitResponseTest {

    @Test
    fun create() {
        val registerCompanyBenefitResponse =
            RegisterCompanyBenefitResponse.builder()
                .benefitId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                .jobId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                .build()

        assertThat(registerCompanyBenefitResponse.benefitId())
            .isEqualTo("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
        assertThat(registerCompanyBenefitResponse.jobId())
            .isEqualTo("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val registerCompanyBenefitResponse =
            RegisterCompanyBenefitResponse.builder()
                .benefitId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                .jobId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                .build()

        val roundtrippedRegisterCompanyBenefitResponse =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(registerCompanyBenefitResponse),
                jacksonTypeRef<RegisterCompanyBenefitResponse>(),
            )

        assertThat(roundtrippedRegisterCompanyBenefitResponse)
            .isEqualTo(registerCompanyBenefitResponse)
    }
}
