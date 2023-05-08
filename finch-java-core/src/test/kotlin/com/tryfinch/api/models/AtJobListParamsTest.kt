package com.tryfinch.api.models

import com.tryfinch.api.models.*
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

class AtJobListParamsTest {

    @Test
    fun createAtJobListParams() {
        AtJobListParams.builder().limit(123L).offset(123L).build()
    }

    @Test
    fun getQueryParams() {
        val params = AtJobListParams.builder().limit(123L).offset(123L).build()
        val expected = mutableMapOf<String, List<String>>()
        expected.put("limit", listOf("123"))
        expected.put("offset", listOf("123"))
        assertThat(params.getQueryParams()).isEqualTo(expected)
    }

    @Test
    fun getQueryParamsWithoutOptionalFields() {
        val params = AtJobListParams.builder().build()
        val expected = mutableMapOf<String, List<String>>()
        assertThat(params.getQueryParams()).isEqualTo(expected)
    }
}
