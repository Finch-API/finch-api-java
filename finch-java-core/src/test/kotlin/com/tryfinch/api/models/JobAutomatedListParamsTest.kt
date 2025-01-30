// File generated from our OpenAPI spec by Stainless.

package com.tryfinch.api.models

import com.tryfinch.api.core.http.QueryParams
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

class JobAutomatedListParamsTest {

    @Test
    fun createJobAutomatedListParams() {
        JobAutomatedListParams.builder().limit(0L).offset(0L).build()
    }

    @Test
    fun queryParams() {
        val params = JobAutomatedListParams.builder().limit(0L).offset(0L).build()
        val expected = QueryParams.builder()
        expected.put("limit", "0")
        expected.put("offset", "0")
        assertThat(params._queryParams()).isEqualTo(expected.build())
    }

    @Test
    fun queryParamsWithoutOptionalFields() {
        val params = JobAutomatedListParams.builder().build()
        val expected = QueryParams.builder()
        assertThat(params._queryParams()).isEqualTo(expected.build())
    }
}
