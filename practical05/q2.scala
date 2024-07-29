case class Book(title: String, author: String, isbn: String)

object LibraryManagement {

  
  var library: Set[Book] = Set(
    Book("Madol Duwa", "Martin wichramasinghe", "1000"),
    Book("SenKottan", "Mahinda Prasad Masimbula", "2000"),
    Book("The White Sambhur Roars", "R.L.Spitle", "3000")
  )

  
  def addBook(book: Book): Unit = {
    library += book
  }

  
  def removeBookByISBN(isbn: String): Unit = {
    library = library.filterNot(_.isbn == isbn)
  }

  
  def isBookInLibrary(isbn: String): Boolean = {
    library.exists(_.isbn == isbn)
  }

  
  def displayLibrary(): Unit = {
    if (library.isEmpty) {
      println("The library is currently empty.")
    } else {
      library.foreach { book =>
        println(s"Title: ${book.title}, Author: ${book.author}, ISBN: ${book.isbn}")
      }
    }
  }

  
  def searchBookByTitle(title: String): Unit = {
    val foundBooks = library.filter(_.title.equalsIgnoreCase(title))
    if (foundBooks.isEmpty) {
      println(s"No book found with the title: $title")
    } else {
      foundBooks.foreach { book =>
        println(s"Title: ${book.title}, Author: ${book.author}, ISBN: ${book.isbn}")
      }
    }
  }

  
  def displayBooksByAuthor(author: String): Unit = {
    val foundBooks = library.filter(_.author.equalsIgnoreCase(author))
    if (foundBooks.isEmpty) {
      println(s"No books found by the author: $author")
    } else {
      foundBooks.foreach { book =>
        println(s"Title: ${book.title}, Author: ${book.author}, ISBN: ${book.isbn}")
      }
    }
  }

  
  def main(args: Array[String]): Unit = {
    println("Initial Library Collection:")
    displayLibrary()

    println("\nAdding a new book to the library...")
    val newBook = Book("Hath Pana", "Kumarathunga Munidasa", "4000")
    addBook(newBook)
    displayLibrary()

    println("\nAdding a new book to the library...")
    val newBook2 = Book("Sherlok", "Doylee", "5000")
    addBook(newBook2)
    displayLibrary()

    println("\nRemoving a book by ISBN (2000)...")
    removeBookByISBN("2000")
    displayLibrary()
//removed
    println("\nRemoving a book by ISBN (5000)...")
    removeBookByISBN("5000")
    displayLibrary()

    println("\nChecking if a book with ISBN (1000) is in the library:")
    println(isBookInLibrary("1000"))

    println("\nSearching for a book by title 'Hath Pana':")
    searchBookByTitle("Hath Pana")

    println("\nDisplaying all books by author 'Kumarathunga Munidasa':")
    displayBooksByAuthor("Kumarathunga Munidasa")

  }
}
