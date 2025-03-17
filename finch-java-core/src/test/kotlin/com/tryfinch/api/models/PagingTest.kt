// File generated from our OpenAPI spec by Stainless.

package com.tryfinch.api.models

import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class PagingTest {

    @Test
    fun createPaging() {
        val paging = Paging.builder().count(0L).offset(0L).build()
        assertThat(paging).isNotNull
        assertThat(paging.count()).contains(0L)
        assertThat(paging.offset()).contains(0L)
    }
}
