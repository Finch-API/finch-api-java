// File generated from our OpenAPI spec by Stainless.

package com.tryfinch.api.models

import com.tryfinch.api.core.http.QueryParams
import com.tryfinch.api.models.*
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

class HrisDirectoryListIndividualsParamsTest {

    @Test
    fun createHrisDirectoryListIndividualsParams() {
        HrisDirectoryListIndividualsParams.builder().limit(123L).offset(123L).build()
    }

    @Test
    fun getQueryParams() {
        val params = HrisDirectoryListIndividualsParams.builder().limit(123L).offset(123L).build()
        val expected = QueryParams.builder()
        expected.put("limit", "123")
        expected.put("offset", "123")
        assertThat(params.getQueryParams()).isEqualTo(expected.build())
    }

    @Test
    fun getQueryParamsWithoutOptionalFields() {
        val params = HrisDirectoryListIndividualsParams.builder().build()
        val expected = QueryParams.builder()
        assertThat(params.getQueryParams()).isEqualTo(expected.build())
    }
}
