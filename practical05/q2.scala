case class Book(title: String, author: String, isbn: String)

object LibraryManagement {

  // Initial set of books
  var library: Set[Book] = Set(
    Book("To Kill a Mockingbird", "Harper Lee", "978-0-06-112008-4"),
    Book("1984", "George Orwell", "978-0-452-28423-4"),
    Book("The Great Gatsby", "F. Scott Fitzgerald", "978-0-7432-7356-5")
  )

  // Function to add a new book to the library
  def addBook(book: Book): Unit = {
    library += book
  }

  // Function to remove a book from the library by its ISBN
  def removeBookByISBN(isbn: String): Unit = {
    library = library.filterNot(_.isbn == isbn)
  }

  // Function to check if a book is already in the library by its ISBN
  def isBookInLibrary(isbn: String): Boolean = {
    library.exists(_.isbn == isbn)
  }

  // Function to display the current library collection
  def displayLibrary(): Unit = {
    if (library.isEmpty) {
      println("The library is currently empty.")
    } else {
      library.foreach { book =>
        println(s"Title: ${book.title}, Author: ${book.author}, ISBN: ${book.isbn}")
      }
    }
  }

  // Function to search for a book by its title
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

  // Function to display all books by a specific author
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

  // Main method to run the program
  def main(args: Array[String]): Unit = {
    println("Initial Library Collection:")
    displayLibrary()

    println("\nAdding a new book to the library...")
    val newBook = Book("Brave New World", "Aldous Huxley", "978-0-06-085052-4")
    addBook(newBook)
    displayLibrary()

    println("\nRemoving a book by ISBN (978-0-452-28423-4)...")
    removeBookByISBN("978-0-452-28423-4")
    displayLibrary()

    println("\nChecking if a book with ISBN (978-0-06-112008-4) is in the library:")
    println(isBookInLibrary("978-0-06-112008-4"))

    println("\nSearching for a book by title '1984':")
    searchBookByTitle("1984")

    println("\nDisplaying all books by author 'Harper Lee':")
    displayBooksByAuthor("Harper Lee")
  }
}
