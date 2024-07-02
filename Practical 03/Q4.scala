object SumEvenNumbers {
  def sumOfEven(numbers: List[Int]): Int = {
    numbers.filter(_ % 2 == 0).sum
  }

  def main(args: Array[String]): Unit = {
    val input = List(1, 2, 3, 4, 5, 6, 7,8,9,10,11,12);
    val sumEvens = sumOfEven(input);
    println(s"List of numbers: $input");
    println(s"Sum of even numbers: $sumEvens");
  }
}
