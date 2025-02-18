import java.util.*;

abstract class WarehouseItem {
    String name;
    WarehouseItem(String name) { this.name = name; }
    abstract void display();
}

class Electronics extends WarehouseItem {
    Electronics(String name) { super(name); }
    void display() { System.out.println("Electronics: " + name); }
}

class Groceries extends WarehouseItem {
    Groceries(String name) { super(name); }
    void display() { System.out.println("Groceries: " + name); }
}

class Furniture extends WarehouseItem {
    Furniture(String name) { super(name); }
    void display() { System.out.println("Furniture: " + name); }
}

class Storage<T extends WarehouseItem> {
    private List<T> items = new ArrayList<>();
    void addItem(T item) { items.add(item); }
    List<T> getItems() { return items; }
}

class WarehouseUtility {
    static void displayItems(List<? extends WarehouseItem> items) {
        for (WarehouseItem item : items) item.display();
    }
}

public class WarehouseSystem {
    public static void main(String[] args) {
        Storage<Electronics> electronicsStorage = new Storage<>();
        Storage<Groceries> groceriesStorage = new Storage<>();
        Storage<Furniture> furnitureStorage = new Storage<>();

        electronicsStorage.addItem(new Electronics("Laptop"));
        groceriesStorage.addItem(new Groceries("Apple"));
        furnitureStorage.addItem(new Furniture("Table"));

        WarehouseUtility.displayItems(electronicsStorage.getItems());
        WarehouseUtility.displayItems(groceriesStorage.getItems());
        WarehouseUtility.displayItems(furnitureStorage.getItems());
    }
}


