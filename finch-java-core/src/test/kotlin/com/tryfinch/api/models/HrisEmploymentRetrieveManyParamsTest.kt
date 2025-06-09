// File generated from our OpenAPI spec by Stainless.

package com.tryfinch.api.models

import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class HrisEmploymentRetrieveManyParamsTest {

    @Test
    fun create() {
        HrisEmploymentRetrieveManyParams.builder()
            .addRequest(
                HrisEmploymentRetrieveManyParams.Request.builder()
                    .individualId("individual_id")
                    .build()
            )
            .build()
    }

    @Test
    fun body() {
        val params =
            HrisEmploymentRetrieveManyParams.builder()
                .addRequest(
                    HrisEmploymentRetrieveManyParams.Request.builder()
                        .individualId("individual_id")
                        .build()
                )
                .build()

        val body = params._body()

        assertThat(body.requests())
            .containsExactly(
                HrisEmploymentRetrieveManyParams.Request.builder()
                    .individualId("individual_id")
                    .build()
            )
    }
}
