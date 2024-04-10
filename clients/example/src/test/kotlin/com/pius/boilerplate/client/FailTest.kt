package com.pius.boilerplate.client

import org.assertj.core.api.Assertions
import org.junit.jupiter.api.Test

class FailTest {

    @Test
    fun `실패 테스트`() {

        Assertions.assertThat(true).isFalse()
    }
}