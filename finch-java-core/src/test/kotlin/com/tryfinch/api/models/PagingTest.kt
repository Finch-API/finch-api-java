// File generated from our OpenAPI spec by Stainless.

package com.tryfinch.api.models

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.tryfinch.api.core.jsonMapper
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class PagingTest {

    @Test
    fun create() {
        val paging = Paging.builder().count(0L).offset(0L).build()

        assertThat(paging.count()).contains(0L)
        assertThat(paging.offset()).contains(0L)
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val paging = Paging.builder().count(0L).offset(0L).build()

        val roundtrippedPaging =
            jsonMapper.readValue(jsonMapper.writeValueAsString(paging), jacksonTypeRef<Paging>())

        assertThat(roundtrippedPaging).isEqualTo(paging)
    }
}
