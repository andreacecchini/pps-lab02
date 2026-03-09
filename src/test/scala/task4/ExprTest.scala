package task4

import org.junit.Assert.assertEquals
import org.junit.Test
import Expr.*

class ExprTest:
  @Test def canDefineALiteral(): Unit =
    val literal: Expr = Literal(1)
    assertEquals(1, evaluate(literal))

  @Test def canDefineASum(): Unit =
    val e1: Expr = Literal(1)
    val e2: Expr = Literal(2)
    val sum: Expr = Add(e1, e2)
    assertEquals(3, evaluate(sum))
