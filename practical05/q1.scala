import scala.io.StdIn.readLine

object InventoryManagementSystem {

  
  def getProductList(): List[String] = {
    var productList: List[String] = List()
    var input: String = ""
    println("Enter product names (type 'done' when finished):")
    while (input != "done") {
      input = readLine()
      if (input != "done") {
        productList = productList :+ input
      }
    }
    productList
  }

  
  def printProductList(productList: List[String]): Unit = {
    productList.zipWithIndex.foreach { case (product, index) =>
      println(s"${index + 1}. $product")
    }
  }

  
  def getTotalProducts(productList: List[String]): Int = {
    productList.length
  }

 
  def main(args: Array[String]): Unit = {
    val products = getProductList()
    println("\nProduct List:")
    printProductList(products)
    val totalProducts = getTotalProducts(products)
    println(s"\nTotal number of products: $totalProducts")
  }
}
