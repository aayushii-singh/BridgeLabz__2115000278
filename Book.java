class Book{
    private static String libraryName = "City Library";
    private final String isbn;
    private String title, author;
    
    public Book(String title, String author, String isbn) {
        this.title = title;
        this.author = author;
        this.isbn = isbn;
    }
    
    public static void displayLibraryName() {
        System.out.println("Library: " + libraryName);
    }
    
    public void displayBookDetails() {
        if (this instanceof Book) {
            System.out.println("Title: " + title + ", Author: " + author + ", ISBN: " + isbn);
        }
    }
    
    public static void main(String[] args) {
        displayLibraryName();
        Book book1 = new Book("Java Basics", "John Doe", "12345");
        Book book2 = new Book("Python Guide", "Jane Doe", "67890");
        book1.displayBookDetails();
        book2.displayBookDetails();
    }
}
