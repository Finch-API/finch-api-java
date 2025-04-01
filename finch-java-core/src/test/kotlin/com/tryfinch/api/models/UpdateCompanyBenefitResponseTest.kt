// File generated from our OpenAPI spec by Stainless.

package com.tryfinch.api.models

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.tryfinch.api.core.jsonMapper
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class UpdateCompanyBenefitResponseTest {

    @Test
    fun create() {
        val updateCompanyBenefitResponse =
            UpdateCompanyBenefitResponse.builder().benefitId("benefit_id").build()

        assertThat(updateCompanyBenefitResponse.benefitId()).isEqualTo("benefit_id")
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val updateCompanyBenefitResponse =
            UpdateCompanyBenefitResponse.builder().benefitId("benefit_id").build()

        val roundtrippedUpdateCompanyBenefitResponse =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(updateCompanyBenefitResponse),
                jacksonTypeRef<UpdateCompanyBenefitResponse>(),
            )

        assertThat(roundtrippedUpdateCompanyBenefitResponse).isEqualTo(updateCompanyBenefitResponse)
    }
}
