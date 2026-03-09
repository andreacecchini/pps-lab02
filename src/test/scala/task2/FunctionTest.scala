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
    // f.g = f(g(x))
    val x = compose(_ - 1, _ * 2)(5)
    val expected = 9
    assertEquals(expected, x)

  @Test def canComputePower(): Unit =
    val base: Double = 2
    val exponent: Int = 3
    val expected: Double = 8.0
    val delta = 0.0001
    assertEquals(expected, power(base, exponent), delta)

  @Test def poweringByZeroShouldGetOne(): Unit =
    val base: Double = 2
    val exponent: Int = 0
    val expected: Double = 1.0
    val delta = 0.0001
    assertEquals(expected, power(base, exponent), delta)

  @Test def poweringByOneShouldGetBase(): Unit =
    val base: Double = 2
    val exponent: Int = 1
    val expected: Double = 2.0
    val delta = 0.0001
    assertEquals(expected, power(base, exponent), delta)

