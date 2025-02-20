import java.util.*;

class ShoppingCart {
    private Map<String, Integer> priceMap = new HashMap<>();
    private Map<String, Integer> cartOrderMap = new LinkedHashMap<>();
    private TreeMap<Integer, List<String>> sortedPriceMap = new TreeMap<>();

    public void addProduct(String product, int price) {
        priceMap.put(product, price);
        cartOrderMap.put(product, price);
        
        sortedPriceMap.putIfAbsent(price, new ArrayList<>());
        sortedPriceMap.get(price).add(product);
    }

    public void displayCartOrder() {
        System.out.println("Cart Items in Order of Addition:");
        for (Map.Entry<String, Integer> entry : cartOrderMap.entrySet()) {
            System.out.println(entry.getKey() + " -> $" + entry.getValue());
        }
    }

    public void displaySortedByPrice() {
        System.out.println("Cart Items Sorted by Price:");
        for (Map.Entry<Integer, List<String>> entry : sortedPriceMap.entrySet()) {
            for (String product : entry.getValue()) {
                System.out.println(product + " -> $" + entry.getKey());
            }
        }
    }

    public void displayFinalCart() {
        System.out.println("Final Cart Items:");
        for (Map.Entry<String, Integer> entry : priceMap.entrySet()) {
            System.out.println(entry.getKey() + " -> $" + entry.getValue());
        }
    }
}

public class ShoppingCartApp {
    public static void main(String[] args) {
        ShoppingCart cart = new ShoppingCart();

        cart.addProduct("Laptop", 1000);
        cart.addProduct("Mouse", 50);
        cart.addProduct("Keyboard", 80);
        cart.addProduct("Monitor", 300);

        System.out.println();
        cart.displayCartOrder();

        System.out.println();
        cart.displaySortedByPrice();

        System.out.println();
        cart.displayFinalCart();
    }
}
