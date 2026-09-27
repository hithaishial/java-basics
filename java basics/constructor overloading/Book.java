class Book {
    String bookId;
    String title;
    String author;
    String publisher;
    String genre;
    String language;
    int pages;
    int publishedYear;
    double price;
    boolean isAvailable;

    static int count = 0;

    Book(String bookId, String title, String author, String publisher, String genre,
         String language, int pages, int publishedYear, double price, boolean isAvailable) {
        this(title, author, publisher, genre, language, pages, publishedYear, price, isAvailable);
        this.bookId = bookId;
        System.out.println("Book ID: " + bookId);
    }

    Book(String title, String author, String publisher, String genre,
         String language, int pages, int publishedYear, double price, boolean isAvailable) {
        this(author, publisher, genre, language, pages, publishedYear, price, isAvailable);
        this.title = title;
        System.out.println("Title: " + title);
    }

    Book(String author, String publisher, String genre, String language,
         int pages, int publishedYear, double price, boolean isAvailable) {
        this(publisher, genre, language, pages, publishedYear, price, isAvailable);
        this.author = author;
        System.out.println("Author: " + author);
    }

    Book(String publisher, String genre, String language,
         int pages, int publishedYear, double price, boolean isAvailable) {
        this(genre, language, pages, publishedYear, price, isAvailable);
        this.publisher = publisher;
        System.out.println("Publisher: " + publisher);
    }

    Book(String genre, String language, int pages,
         int publishedYear, double price, boolean isAvailable) {
        this(language, pages, publishedYear, price, isAvailable);
        this.genre = genre;
        System.out.println("Genre: " + genre);
    }

    Book(String language, int pages, int publishedYear,
         double price, boolean isAvailable) {
        this(pages, publishedYear, price, isAvailable);
        this.language = language;
        System.out.println("Language: " + language);
    }

    Book(int pages, int publishedYear, double price, boolean isAvailable) {
        this(publishedYear, price, isAvailable);
        this.pages = pages;
        System.out.println("Pages: " + pages);
    }

    Book(int publishedYear, double price, boolean isAvailable) {
        this(price, isAvailable);
        this.publishedYear = publishedYear;
        System.out.println("Published Year: " + publishedYear);
    }

    Book(double price, boolean isAvailable) {
        this(isAvailable);
        this.price = price;
        System.out.println("Price: " + price);
    }

    Book(boolean isAvailable) {
        this();
        this.isAvailable = isAvailable;
        System.out.println("Is Available: " + isAvailable);
    }

    Book() {
        System.out.println("constructor: Book");
        count++;
    }

    void display() {
        System.out.println("Book ID: " + bookId);
        System.out.println("Title: " + title);
        System.out.println("Author: " + author);
        System.out.println("Publisher: " + publisher);
        System.out.println("Genre: " + genre);
        System.out.println("Language: " + language);
        System.out.println("Pages: " + pages);
        System.out.println("Published Year: " + publishedYear);
        System.out.println("Price: " + price);
        System.out.println("Is Available: " + isAvailable);
        System.out.println("Total Books created: " + count);
    }
}