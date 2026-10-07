public class Book {
  String title;
  String author;
  String isbn;
  static int totalBooks = 0;

  Book(String title, String author, String isbn) {
    this.title = title;
    this.author = author;
    this.isbn = isbn;
    totalBooks++;
  }

  void borrowBook() {
    System.out.println("Book borrowed: " + title);
  }

  void returnBook() {
    System.out.println("Book returned: " + title);
  }

  static int getTotalBooks() {
    return totalBooks;
  }

  public static void main(String[] args) {
    Book book1 = new Book("1984", "George Orwell", "12345");
    Book book2 = new Book("Brave New World", "Aldous Huxley", "67890");

    book1.borrowBook();
    book2.returnBook();

    System.out.println("Total books in the library: " + Book.getTotalBooks());
  }
}
