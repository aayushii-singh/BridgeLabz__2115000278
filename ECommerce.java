abstract class Product {
    private int id;
    private String name;
    private double price;

    public Product(int id, String name, double price) {
        this.id = id;
        this.name = name;
        this.price = price;
    }

    public abstract double calculateDiscount();

    public double getPrice() {
        return price;
    }
}

class Phone extends Product {
    public Phone(int id, String name, double price) {
        super(id, name, price);
    }

    public double calculateDiscount() {
        return getPrice() * 0.1;
    }
}

class Shirt extends Product {
    public Shirt(int id, String name, double price) {
        super(id, name, price);
    }

    public double calculateDiscount() {
        return getPrice() * 0.2;
    }
}

class Rice extends Product {
    public Rice(int id, String name, double price) {
        super(id, name, price);
    }

    public double calculateDiscount() {
        return getPrice() * 0.05;
    }
}

interface Taxable {
    double calculateTax();
}

class PhoneTax implements Taxable {
    public double calculateTax() {
        return 50;
    }
}

class ShirtTax implements Taxable {
    public double calculateTax() {
        return 10;
    }
}

class RiceTax implements Taxable {
    public double calculateTax() {
        return 5;
    }
}

public class ECommerce {
    public static void main(String[] args) {
        Product p1 = new Phone(1, "Phone", 500);
        Product p2 = new Shirt(2, "Shirt", 30);
        Product p3 = new Rice(3, "Rice", 20);

        Taxable t1 = new PhoneTax();
        Taxable t2 = new ShirtTax();
        Taxable t3 = new RiceTax();

        Product[] products = { p1, p2, p3 };
        Taxable[] taxes = { t1, t2, t3 };

        for (int i = 0; i < products.length; i++) {
            double finalPrice = products[i].getPrice() + taxes[i].calculateTax() - products[i].calculateDiscount();
            System.out.println("Final Price: " + finalPrice);
        }
    }
}
