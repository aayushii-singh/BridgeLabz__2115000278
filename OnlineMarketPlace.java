import java.util.*;

abstract class Product {
    String name;
    double price;
    
    Product(String name, double price) {
        this.name = name;
        this.price = price;
    }
    
    void applyDiscount(double percentage) {
        price -= price * (percentage / 100);
    }
    
    abstract void display();
}

class Book extends Product {
    Book(String name, double price) { super(name, price); }
    void display() { System.out.println("Book: " + name + ", Price: $" + price); }
}

class Clothing extends Product {
    Clothing(String name, double price) { super(name, price); }
    void display() { System.out.println("Clothing: " + name + ", Price: $" + price); }
}

class Gadget extends Product {
    Gadget(String name, double price) { super(name, price); }
    void display() { System.out.println("Gadget: " + name + ", Price: $" + price); }
}

class ProductCatalog<T extends Product> {
    private List<T> products = new ArrayList<>();
    
    void addProduct(T product) { products.add(product); }
    List<T> getProducts() { return products; }
}

class MarketplaceUtility {
    static <T extends Product> void applyDiscount(T product, double percentage) {
        product.applyDiscount(percentage);
    }
    
    static void displayCatalog(List<? extends Product> products) {
        for (Product product : products) product.display();
    }
}

public class OnlineMarketPlace {
    public static void main(String[] args) {
        ProductCatalog<Book> bookCatalog = new ProductCatalog<>();
        ProductCatalog<Clothing> clothingCatalog = new ProductCatalog<>();
        ProductCatalog<Gadget> gadgetCatalog = new ProductCatalog<>();

        Book book = new Book("Java Programming", 50);
        Clothing clothing = new Clothing("T-Shirt", 20);
        Gadget gadget = new Gadget("Smartphone", 300);

        bookCatalog.addProduct(book);
        clothingCatalog.addProduct(clothing);
        gadgetCatalog.addProduct(gadget);

        MarketplaceUtility.applyDiscount(book, 10);
        MarketplaceUtility.applyDiscount(clothing, 5);
        MarketplaceUtility.applyDiscount(gadget, 15);

        MarketplaceUtility.displayCatalog(bookCatalog.getProducts());
        MarketplaceUtility.displayCatalog(clothingCatalog.getProducts());
        MarketplaceUtility.displayCatalog(gadgetCatalog.getProducts());
    }
}
