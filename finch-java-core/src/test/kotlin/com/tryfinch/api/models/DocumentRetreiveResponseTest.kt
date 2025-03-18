// File generated from our OpenAPI spec by Stainless.

package com.tryfinch.api.models

import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class DocumentRetreiveResponseTest {

    @Test
    fun ofW42020() {
        val w42020 = W42020.builder().build()

        val documentRetreiveResponse = DocumentRetreiveResponse.ofW42020(w42020)

        assertThat(documentRetreiveResponse.w42020()).contains(w42020)
        assertThat(documentRetreiveResponse.w42005()).isEmpty
    }

    @Test
    fun ofW42005() {
        val w42005 = W42005.builder().build()

        val documentRetreiveResponse = DocumentRetreiveResponse.ofW42005(w42005)

        assertThat(documentRetreiveResponse.w42020()).isEmpty
        assertThat(documentRetreiveResponse.w42005()).contains(w42005)
    }
}
