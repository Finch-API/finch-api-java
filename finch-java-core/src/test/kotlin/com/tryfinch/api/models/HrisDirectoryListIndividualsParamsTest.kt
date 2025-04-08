// File generated from our OpenAPI spec by Stainless.

package com.tryfinch.api.models

import com.tryfinch.api.core.http.QueryParams
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class HrisDirectoryListIndividualsParamsTest {

    @Test
    fun create() {
        HrisDirectoryListIndividualsParams.builder().limit(0L).offset(0L).build()
    }

    @Test
    fun queryParams() {
        val params = HrisDirectoryListIndividualsParams.builder().limit(0L).offset(0L).build()

        val queryParams = params._queryParams()

        assertThat(queryParams)
            .isEqualTo(QueryParams.builder().put("limit", "0").put("offset", "0").build())
    }

    @Test
    fun queryParamsWithoutOptionalFields() {
        val params = HrisDirectoryListIndividualsParams.builder().build()

        val queryParams = params._queryParams()

        assertThat(queryParams).isEqualTo(QueryParams.builder().build())
    }
}
