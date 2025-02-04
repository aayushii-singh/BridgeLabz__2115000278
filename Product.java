class Product {
    private static double discount = 10.0;
    private final int productID;
    private String productName;
    private double price;
    
    public Product(int productID, String productName, double price) {
        this.productID = productID;
        this.productName = productName;
        this.price = price;
    }
    
    public static void updateDiscount(double newDiscount) {
        discount = newDiscount;
    }
    
    public void displayProduct() {
        if (this instanceof Product) {
            System.out.println("Product: " + productName + ", ID: " + productID + ", Price: " + price + ", Discount: " + discount + "%");
        }
    }
    
    public static void main(String[] args) {
        Product p1 = new Product(1, "Laptop", 750.0);
        Product p2 = new Product(2, "Phone", 500.0);
        p1.displayProduct();
        p2.displayProduct();
        updateDiscount(15.0);
        p1.displayProduct();
        p2.displayProduct();
    }
}
