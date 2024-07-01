object ArithmeticMean {
  def mean(num1: Int, num2: Int): Double = {
    val average = (num1 + num2) / 2.0
    BigDecimal(average).setScale(2, BigDecimal.RoundingMode.HALF_UP).toDouble
  }

  def main(args: Array[String]): Unit = {
    println("Enter the first number: ")
    val num1 = scala.io.StdIn.readInt()
    println("Enter the second number: ")
    val num2 = scala.io.StdIn.readInt()
    println(s"The mean of $num1 and $num2 is ${mean(num1, num2)}")
  }
}
