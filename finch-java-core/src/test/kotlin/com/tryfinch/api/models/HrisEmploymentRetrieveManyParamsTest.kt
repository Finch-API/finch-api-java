// File generated from our OpenAPI spec by Stainless.

package com.tryfinch.api.models

import com.tryfinch.api.core.http.QueryParams
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class HrisEmploymentRetrieveManyParamsTest {

    @Test
    fun create() {
        HrisEmploymentRetrieveManyParams.builder()
            .addEntityId("550e8400-e29b-41d4-a716-446655440000")
            .addRequest(
                HrisEmploymentRetrieveManyParams.Request.builder()
                    .individualId("individual_id")
                    .build()
            )
            .build()
    }

    @Test
    fun queryParams() {
        val params =
            HrisEmploymentRetrieveManyParams.builder()
                .addEntityId("550e8400-e29b-41d4-a716-446655440000")
                .addRequest(
                    HrisEmploymentRetrieveManyParams.Request.builder()
                        .individualId("individual_id")
                        .build()
                )
                .build()

        val queryParams = params._queryParams()

        assertThat(queryParams)
            .isEqualTo(
                QueryParams.builder()
                    .put("entity_ids[]", "550e8400-e29b-41d4-a716-446655440000")
                    .build()
            )
    }

    @Test
    fun body() {
        val params =
            HrisEmploymentRetrieveManyParams.builder()
                .addEntityId("550e8400-e29b-41d4-a716-446655440000")
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
