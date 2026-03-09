package task2

import org.junit.Assert.{assertEquals, assertTrue}
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

  @Test def canNegPredicate(): Unit =
    val empty: String => Boolean = _ == ""
    val notEmpty: String => Boolean = neg(empty)
    assertTrue:
      val notEmptyString = "foo"
      notEmpty(notEmptyString)
    assertTrue:
      val emptyString = ""
      empty(emptyString)

  @Test def canComposeTwoFunction(): Unit =
    val x = compose(_ - 1, _ * 2)(5)
    val expected = 9
    assertEquals(expected, x)

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

  private def assertPow(base: Double, exponent: Int, expected: Double): Unit = {
    val delta = 0.0001
    assertEquals(expected, power(base, exponent), delta)
  }

  private def assertReverse(expected: Int, reversed: Int): Unit =
    assertEquals(expected, reversed)


