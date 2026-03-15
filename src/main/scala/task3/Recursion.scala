package task3

import scala.annotation.tailrec

object Recursion:
  def power(base: Double, exponent: Int): Double =
    @tailrec
    def loop(exponent: Int, acc: Double): Double = exponent match
      case 0 => acc
      case _ => loop(exponent - 1, acc * base)

    loop(exponent, 1)

  def reverseNumber(n: Int): Int =
    val lastDigit: Int => Int = _ % 10
    val removeLastDigit: Int => Int = _ / 10
    val shift: Int => Int = _ * 10

    @tailrec
    def iterate(remaining: Int, reverse: Int): Int = remaining match
      case 0 => reverse
      case _ => iterate(removeLastDigit(remaining), shift(reverse) + lastDigit(remaining))

    iterate(n, 0)
