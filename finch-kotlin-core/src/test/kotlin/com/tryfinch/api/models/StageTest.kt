package com.tryfinch.api.models

import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

class StageTest {

    @Test
    fun createStage() {
        val stage =
            Stage.builder()
                .id("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                .jobId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                .name("string")
                .build()
        assertThat(stage).isNotNull
        assertThat(stage.id()).isEqualTo("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
        assertThat(stage.jobId()).isEqualTo("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
        assertThat(stage.name()).isEqualTo("string")
    }
}
