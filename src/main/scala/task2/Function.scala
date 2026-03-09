package task2

object Function:
  def positive(x: Int): String = x match
    case x if x >= 0 => "positive"
    case _ => "negative"
