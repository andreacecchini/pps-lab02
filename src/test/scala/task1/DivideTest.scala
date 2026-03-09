package task1

import org.junit.*
import org.junit.Assert.*


class DivideTest:
  @Test def canDivide(): Unit =
    val x = 4.0
    val y = 2.0
    val delta = 0.0001
    val expected = 2.0
    assertEquals(expected, divide(y)(x), delta)

  @Test def dividingByZeroShouldGetInfinity(): Unit =
    val x = 4.0
    val y = 0.0
    val delta = 0.0001
    assertEquals(Double.PositiveInfinity, divide(y)(x), delta)

  @Test def dividingByNegativeZeroShouldGetNegativeInfinity(): Unit =
    val x = 4.0
    val y = -0.0
    val delta = 0.0001
    assertEquals(Double.NegativeInfinity, divide(y)(x), delta)

  @Test def canApplyPartially(): Unit =
    val y = 2.0
    val x = 4.0
    val expected = 2.0
    val delta = 0.0001
    val divideByTwo: Double => Double = divide(y)
    assertEquals(expected, divideByTwo(x), delta)
