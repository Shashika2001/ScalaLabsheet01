object FibonacciSequence {

  // Recursive function to calculate the nth Fibonacci number
  def fibonacci(n: Int): Int = {
    if (n <= 0) 0
    else if (n == 1) 1
    else fibonacci(n - 1) + fibonacci(n - 2)
  }

  // Function to print the first n Fibonacci numbers
  def printFibonacciNumbers(n: Int): Unit = {
    def helper(current: Int): Unit = {
      if (current < n) {
        print(fibonacci(current) + " ")
        helper(current + 1)
      }
    }
    helper(0)
    println() // for a newline after printing the sequence
  }

  // Main method to run the program
  def main(args: Array[String]): Unit = {
    println("Enter the value of n:")
    val n = scala.io.StdIn.readInt()
    println(s"The first $n Fibonacci numbers are:")
    printFibonacciNumbers(n)
  }
}
