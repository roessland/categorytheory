package com.roessland.categorytheory.tests

import com.roessland.categorytheory.id
import kotlin.test.assertEquals
import org.junit.jupiter.api.Test

class Ch1Test {
    @Test fun testAssert() : Unit {
        assertEquals("Hello, world!", id("Hello, world!"))
        assertEquals(5, id(5))
        assertEquals(listOf(5,5,5), id(listOf(5,5,5)))
    }
}