// File generated from our OpenAPI spec by Stainless.

package com.tryfinch.api.models

import com.tryfinch.api.core.http.QueryParams
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class HrisDocumentListParamsTest {

    @Test
    fun create() {
        HrisDocumentListParams.builder()
            .addEntityId("550e8400-e29b-41d4-a716-446655440000")
            .addIndividualId("string")
            .limit(0L)
            .offset(0L)
            .addType(HrisDocumentListParams.Type.W4_2020)
            .build()
    }

    @Test
    fun queryParams() {
        val params =
            HrisDocumentListParams.builder()
                .addEntityId("550e8400-e29b-41d4-a716-446655440000")
                .addIndividualId("string")
                .limit(0L)
                .offset(0L)
                .addType(HrisDocumentListParams.Type.W4_2020)
                .build()

        val queryParams = params._queryParams()

        assertThat(queryParams)
            .isEqualTo(
                QueryParams.builder()
                    .put("entity_ids[]", "550e8400-e29b-41d4-a716-446655440000")
                    .put("individual_ids[]", "string")
                    .put("limit", "0")
                    .put("offset", "0")
                    .put("types[]", "w4_2020")
                    .build()
            )
    }

    @Test
    fun queryParamsWithoutOptionalFields() {
        val params =
            HrisDocumentListParams.builder()
                .addEntityId("550e8400-e29b-41d4-a716-446655440000")
                .build()

        val queryParams = params._queryParams()

        assertThat(queryParams)
            .isEqualTo(
                QueryParams.builder()
                    .put("entity_ids[]", "550e8400-e29b-41d4-a716-446655440000")
                    .build()
            )
    }
}
