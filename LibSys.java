abstract class LibraryItem {
    private String itemId, title, author;
    public LibraryItem(String itemId, String title, String author) { 
        this.itemId = itemId; this.title = title; this.author = author; 
    }
    public String getItemDetails() { return "ID: " + itemId + ", Title: " + title + ", Author: " + author; }
    public abstract int getLoanDuration();
}

class Book extends LibraryItem {
    public Book(String itemId, String title, String author) { super(itemId, title, author); }
    public int getLoanDuration() { return 14; }
}

class Magazine extends LibraryItem {
    public Magazine(String itemId, String title, String author) { super(itemId, title, author); }
    public int getLoanDuration() { return 7; }
}

class DVD extends LibraryItem {
    public DVD(String itemId, String title, String author) { super(itemId, title, author); }
    public int getLoanDuration() { return 5; }
}

interface Reservable {
    void reserveItem();
    boolean checkAvailability();
}

class BookReservable implements Reservable {
    public void reserveItem() { System.out.println("Book Reserved"); }
    public boolean checkAvailability() { return true; }
}

class MagazineReservable implements Reservable {
    public void reserveItem() { System.out.println("Magazine Reserved"); }
    public boolean checkAvailability() { return false; }
}

class DVDReservable implements Reservable {
    public void reserveItem() { System.out.println("DVD Reserved"); }
    public boolean checkAvailability() { return true; }
}

public class LibSys {
    public static void main(String[] args) {
        LibraryItem[] items = { new Book("1", "Java Basics", "Ayushi"), new Magazine("2", "Tech World", "Ashu"), new DVD("3", "Inception", "Ayushi") };
        Reservable[] reservables = { new BookReservable(), new MagazineReservable(), new DVDReservable() };

        for (int i = 0; i < items.length; i++) {
            System.out.println(items[i].getItemDetails() + ", Loan Duration: " + items[i].getLoanDuration());
            reservables[i].reserveItem();
            System.out.println("Available: " + reservables[i].checkAvailability());
        }
    }
}
