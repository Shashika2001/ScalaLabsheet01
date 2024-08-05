def isPrime(n: Int): Boolean = {
  if (n <= 1) false
  else if (n == 2) true
  else !(2 to math.sqrt(n).toInt).exists(i => n % i == 0)
}

def filterPrime(nums: List[Int]): List[Int] = {
  nums.filter(num => isPrime(num))
}


   val input = List(1, 2, 3, 4, 5, 6, 7, 8, 9, 10)
val output = filterPrime(input)
println(output) // Output: List(2, 3, 5, 7) 

// Example usage

