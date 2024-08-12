def filterEvenNumbers(nums: List[Int]): List[Int] = {
  nums.filter(num => num % 2 == 0)
}

// Example usage
def main(args: Array[String]): Unit = {
    val input = List(1, 2, 3, 4, 5, 6, 7, 8, 9, 10)
    val output = filterEvenNumbers(input)
    println{output} // Output: List(2, 4, 6, 8, 10)
}

 