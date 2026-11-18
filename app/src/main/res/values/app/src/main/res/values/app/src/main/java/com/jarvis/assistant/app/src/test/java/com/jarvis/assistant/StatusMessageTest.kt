package com.jarvis.assistant

import org.junit.Assert.assertEquals
import org.junit.Test

class StatusMessageTest {
    @Test
    fun statusMessage_isCorrect() {
        assertEquals("JARVIS online", statusMessage())
    }
}
