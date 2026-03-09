package task2

import scala.NamedTuple.Reverse
import scala.annotation.tailrec

object Function:
  /** Part 3 */

  def positive(x: Int): String = x match
    case x if x >= 0 => "positive"
    case _ => "negative"

  def neg(predicate: String => Boolean): String => Boolean = !predicate(_)

  /** Part 4. */
  // [TODO] check _ scoping
  val p1: Int => Int => Int => Boolean = x => y => z => x <= y && y == z
  val p2: (Int, Int, Int) => Boolean = (x, y, z) => x <= y && y == z

  def p3(x: Int)(y: Int)(z: Int): Boolean = x <= y && y == z

  def p4(x: Int, y: Int, z: Int): Boolean = x <= y && y == z

  /** Part 5. */
  // [TODO] check _ scoping -> why does f(g(_)) return an error?
  def compose(f: Int => Int, g: Int => Int): Int => Int = x => f(g(x))

  /** Part 7. */
  def power(base: Double, exponent: Int): Double =
    @tailrec
    def loop(exponent: Int, acc: Double): Double = exponent match
      case 0 => acc
      case _ => loop(exponent - 1, acc * base)

    loop(exponent, 1)

  def reverseNumber(n: Int): Int =
    val lastDigit: Int => Int = _ % 10

    @tailrec
    def iterate(remaining: Int, reverse: Int): Int = remaining match
      case 0 => reverse
      case _ => iterate(remaining / 10, reverse * 10 + lastDigit(remaining))

    iterate(n, 0)

@main def test(): Unit =
  import Function.*
  val x = 1
  val y = 2
  val z = y
  println(p1(x)(y)(z))
  println(p2(x, y, z))
  println(p3(x)(y)(z))
  println(p4(x, y, z))
