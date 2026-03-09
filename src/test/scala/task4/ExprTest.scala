package task4

import org.junit.Assert.assertEquals
import org.junit.Test
import Expr.*

class ExprTest:
  @Test def canDefineALiteral(): Unit =
    val literal: Expr = Literal(1)
    assertEquals(1, evaluate(literal))
