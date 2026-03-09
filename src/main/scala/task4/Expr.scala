package task4

enum Expr:
  case Literal(n: Int)
  case Add(e1: Expr, e2: Expr)

object Expr:
  def evaluate(expression: Expr): Int = expression match
    case Literal(n) => n
    case Add(e1, e2) => evaluate(e1) + evaluate(e2)
