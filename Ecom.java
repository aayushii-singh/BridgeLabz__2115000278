class Customer {
    private String name;

    public Customer(String name) {
        this.name = name;
    }

    public void placeOrder(Order order) {
        System.out.println(name + " placed an order.");
        order.displayProducts();
    }
}

class Order {
    private Product[] products;

    public Order(Product[] products) {
        this.products = products;
    }

    public void displayProducts() {
        System.out.println("Order contains the following products:");
        for (Product product : products) {
            System.out.println(product.getName());
        }
    }
}

class Product {
    private String name;

    public Product(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }
}

public class Ecom {
    public static void main(String[] args) {
        Product product1 = new Product("Shirt");
        Product product2 = new Product("Shoes");
        Order order = new Order(new Product[]{product1, product2});
        Customer customer = new Customer("Tom");

        customer.placeOrder(order);
    }
}
