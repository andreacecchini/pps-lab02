package task4

enum Expr:
  case Literal(n: Int)

object Expr:
  def evaluate(expression: Expr): Int = expression match
    case Literal(n) => n
