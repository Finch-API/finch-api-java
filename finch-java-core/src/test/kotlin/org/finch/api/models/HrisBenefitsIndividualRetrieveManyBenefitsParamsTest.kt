package org.finch.api.models

import org.assertj.core.api.Assertions.assertThat
import org.finch.api.models.*
import org.junit.jupiter.api.Test

class HrisBenefitsIndividualRetrieveManyBenefitsParamsTest {

    @Test
    fun createHrisBenefitsIndividualRetrieveManyBenefitsParams() {
        HrisBenefitsIndividualRetrieveManyBenefitsParams.builder()
            .benefitId("string")
            .individualIds(
                "d675d2b7-6d7b-41a8-b2d3-001eb3fb88f6,d02a6346-1f08-4312-a064-49ff3cafaa7a"
            )
            .build()
    }

    @Test
    fun getQueryParams() {
        val params =
            HrisBenefitsIndividualRetrieveManyBenefitsParams.builder()
                .benefitId("string")
                .individualIds(
                    "d675d2b7-6d7b-41a8-b2d3-001eb3fb88f6,d02a6346-1f08-4312-a064-49ff3cafaa7a"
                )
                .build()
        val expected = mutableMapOf<String, List<String>>()
        expected.put(
            "individual_ids",
            listOf("d675d2b7-6d7b-41a8-b2d3-001eb3fb88f6,d02a6346-1f08-4312-a064-49ff3cafaa7a")
        )
        assertThat(params.getQueryParams()).isEqualTo(expected)
    }

    @Test
    fun getQueryParamsWithoutOptionalFields() {
        val params =
            HrisBenefitsIndividualRetrieveManyBenefitsParams.builder().benefitId("string").build()
        val expected = mutableMapOf<String, List<String>>()
        assertThat(params.getQueryParams()).isEqualTo(expected)
    }

    @Test
    fun getPathParam() {
        val params =
            HrisBenefitsIndividualRetrieveManyBenefitsParams.builder().benefitId("string").build()
        assertThat(params).isNotNull
        // path param "benefitId"
        assertThat(params.getPathParam(0)).isEqualTo("string")
        // out-of-bound path param
        assertThat(params.getPathParam(1)).isEqualTo("")
    }
}
