package org.finch.api.models

import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

class PagingTest {

    @Test
    fun createPaging() {
        val paging = Paging.builder().count(123L).offset(123L).build()
        assertThat(paging).isNotNull
        assertThat(paging.count()).contains(123L)
        assertThat(paging.offset()).contains(123L)
    }
}
