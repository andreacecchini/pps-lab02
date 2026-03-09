package task3

import org.junit.Assert.assertEquals
import org.junit.Test
import Recursion.*

class RecursionTest:
  @Test def canComputePower(): Unit =
    assertPow(base = 2, exponent = 3, expected = 8.0)

  @Test def poweringByZeroShouldGetOne(): Unit =
    assertPow(base = 2, exponent = 0, expected = 1.0)

  @Test def poweringByOneShouldGetBase(): Unit =
    assertPow(base = 2, exponent = 1, expected = 2.0)

  @Test def canReverseNumber(): Unit =
    assertReverse(expected = 4321, reversed = reverseNumber(1234))

  @Test def canReverseOneLengthNumber(): Unit =
    assertReverse(expected = 1, reversed = reverseNumber(1))

  @Test def canReverseZero(): Unit =
    assertReverse(expected = 0, reversed = reverseNumber(0))

  @Test def canReverseNumbersTerminatingByZero(): Unit =
    assertReverse(expected = 321, reversed = reverseNumber(1230))

  private def assertPow(base: Double, exponent: Int, expected: Double): Unit = {
    val delta = 0.0001
    assertEquals(expected, power(base, exponent), delta)
  }

  private def assertReverse(expected: Int, reversed: Int): Unit =
    assertEquals(expected, reversed)



