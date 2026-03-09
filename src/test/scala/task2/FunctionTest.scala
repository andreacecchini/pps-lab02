package task2

import org.junit.Assert.assertEquals
import org.junit.Test
import Function.*

class FunctionTest:
  @Test def canMatchPositive(): Unit =
    val x: Int = 1
    assertEquals("positive", positive(x))

  @Test def canMatchNegative(): Unit =
    val x: Int = -1
    assertEquals("negative", positive(x))

  @Test def zeroShouldBeMatchedAsPositive(): Unit =
    val x: Int = 0
    assertEquals("positive", positive(x))
