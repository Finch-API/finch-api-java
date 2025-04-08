// File generated from our OpenAPI spec by Stainless.

package com.tryfinch.api.models

import com.tryfinch.api.core.http.QueryParams
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class HrisBenefitIndividualRetrieveManyBenefitsParamsTest {

    @Test
    fun create() {
        HrisBenefitIndividualRetrieveManyBenefitsParams.builder()
            .benefitId("benefit_id")
            .individualIds(
                "d675d2b7-6d7b-41a8-b2d3-001eb3fb88f6,d02a6346-1f08-4312-a064-49ff3cafaa7a"
            )
            .build()
    }

    @Test
    fun pathParams() {
        val params =
            HrisBenefitIndividualRetrieveManyBenefitsParams.builder()
                .benefitId("benefit_id")
                .build()

        assertThat(params._pathParam(0)).isEqualTo("benefit_id")
        // out-of-bound path param
        assertThat(params._pathParam(1)).isEqualTo("")
    }

    @Test
    fun queryParams() {
        val params =
            HrisBenefitIndividualRetrieveManyBenefitsParams.builder()
                .benefitId("benefit_id")
                .individualIds(
                    "d675d2b7-6d7b-41a8-b2d3-001eb3fb88f6,d02a6346-1f08-4312-a064-49ff3cafaa7a"
                )
                .build()

        val queryParams = params._queryParams()

        assertThat(queryParams)
            .isEqualTo(
                QueryParams.builder()
                    .put(
                        "individual_ids",
                        "d675d2b7-6d7b-41a8-b2d3-001eb3fb88f6,d02a6346-1f08-4312-a064-49ff3cafaa7a",
                    )
                    .build()
            )
    }

    @Test
    fun queryParamsWithoutOptionalFields() {
        val params =
            HrisBenefitIndividualRetrieveManyBenefitsParams.builder()
                .benefitId("benefit_id")
                .build()

        val queryParams = params._queryParams()

        assertThat(queryParams).isEqualTo(QueryParams.builder().build())
    }
}
