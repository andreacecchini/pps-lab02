package task1

def divide(den: Double)(num: Double): Double =
  num / den


@main def test(): Unit =
  val x: Double = 4.0
  // Divide by 0
  println(divide(x)(0.0))
  // Divide by -0
  println(divide(x)(-0.0))
  // Partially application
  val divideByTwo: Double => Double = divide(2.0)
  println(divideByTwo(x))

