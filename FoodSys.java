abstract class FoodItem {
    private String itemName;
    private double price;
    private int quantity;

    public FoodItem(String itemName, double price, int quantity) {
        this.itemName = itemName;
        this.price = price;
        this.quantity = quantity;
    }

    public String getItemName() {
        return itemName;
    }

    public double getPrice() {
        return price;
    }

    public int getQuantity() {
        return quantity;
    }

    public String getItemDetails() {
        return itemName + " - Price: " + price + " Quantity: " + quantity;
    }

    public abstract double calculateTotalPrice();
}

class VegItem extends FoodItem {
    public VegItem(String itemName, double price, int quantity) {
        super(itemName, price, quantity);
    }

    public double calculateTotalPrice() {
        return getPrice() * getQuantity();
    }
}

class NonVegItem extends FoodItem {
    public NonVegItem(String itemName, double price, int quantity) {
        super(itemName, price, quantity);
    }

    public double calculateTotalPrice() {
        return (getPrice() * getQuantity()) + 20;
    }
}

interface Discountable {
    void applyDiscount();
    String getDiscountDetails();
}

class Discount implements Discountable {
    public void applyDiscount() {
        System.out.println("Discount Applied");
    }

    public String getDiscountDetails() {
        return "10% Discount";
    }
}

public class FoodSys {
    public static void main(String[] args) {
        FoodItem[] order = { new VegItem("Dosa", 50, 2), new VegItem("Idli", 30, 3) };
        Discountable discount = new Discount();

        for (FoodItem item : order) {
            System.out.println(item.getItemDetails() + ", Total Price: " + item.calculateTotalPrice());
        }
        discount.applyDiscount();
        System.out.println(discount.getDiscountDetails());
    }
}
