// File generated from our OpenAPI spec by Stainless.

package com.tryfinch.api.models

import com.tryfinch.api.core.http.QueryParams
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

class HrisBenefitIndividualRetrieveManyBenefitsParamsTest {

    @Test
    fun createHrisBenefitIndividualRetrieveManyBenefitsParams() {
        HrisBenefitIndividualRetrieveManyBenefitsParams.builder()
            .benefitId("benefit_id")
            .individualIds(
                "d675d2b7-6d7b-41a8-b2d3-001eb3fb88f6,d02a6346-1f08-4312-a064-49ff3cafaa7a"
            )
            .build()
    }

    @Test
    fun getQueryParams() {
        val params =
            HrisBenefitIndividualRetrieveManyBenefitsParams.builder()
                .benefitId("benefit_id")
                .individualIds(
                    "d675d2b7-6d7b-41a8-b2d3-001eb3fb88f6,d02a6346-1f08-4312-a064-49ff3cafaa7a"
                )
                .build()
        val expected = QueryParams.builder()
        expected.put(
            "individual_ids",
            "d675d2b7-6d7b-41a8-b2d3-001eb3fb88f6,d02a6346-1f08-4312-a064-49ff3cafaa7a"
        )
        assertThat(params.getQueryParams()).isEqualTo(expected.build())
    }

    @Test
    fun getQueryParamsWithoutOptionalFields() {
        val params =
            HrisBenefitIndividualRetrieveManyBenefitsParams.builder()
                .benefitId("benefit_id")
                .build()
        val expected = QueryParams.builder()
        assertThat(params.getQueryParams()).isEqualTo(expected.build())
    }

    @Test
    fun getPathParam() {
        val params =
            HrisBenefitIndividualRetrieveManyBenefitsParams.builder()
                .benefitId("benefit_id")
                .build()
        assertThat(params).isNotNull
        // path param "benefitId"
        assertThat(params.getPathParam(0)).isEqualTo("benefit_id")
        // out-of-bound path param
        assertThat(params.getPathParam(1)).isEqualTo("")
    }
}
