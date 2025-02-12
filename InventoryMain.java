class Item {
    String name;
    int id, qty;
    double price;
    Item next;

    public Item(String name, int id, int qty, double price) {
        this.name = name;
        this.id = id;
        this.qty = qty;
        this.price = price;
        this.next = null;
    }
}

class Inventory {
    Item head;

    public void addB(String name, int id, int qty, double price) {
        Item newItem = new Item(name, id, qty, price);
        newItem.next = head;
        head = newItem;
    }

    public void addE(String name, int id, int qty, double price) {
        Item newItem = new Item(name, id, qty, price);
        if (head == null) {
            head = newItem;
            return;
        }
        Item temp = head;
        while (temp.next != null) temp = temp.next;
        temp.next = newItem;
    }

    public void addP(String name, int id, int qty, double price, int pos) {
        Item newItem = new Item(name, id, qty, price);
        if (pos == 1) {
            addB(name, id, qty, price);
            return;
        }
        Item temp = head;
        for (int i = 1; i < pos - 1 && temp != null; i++) temp = temp.next;
        if (temp != null) {
            newItem.next = temp.next;
            temp.next = newItem;
        }
    }

    public void del(int id) {
        if (head == null) return;
        if (head.id == id) {
            head = head.next;
            return;
        }
        Item temp = head;
        while (temp.next != null && temp.next.id != id) temp = temp.next;
        if (temp.next != null) temp.next = temp.next.next;
    }

    public void update(int id, int newQty) {
        Item temp = head;
        while (temp != null) {
            if (temp.id == id) {
                temp.qty = newQty;
                return;
            }
            temp = temp.next;
        }
    }

    public double totalValue() {
        double total = 0;
        Item temp = head;
        while (temp != null) {
            total += temp.price * temp.qty;
            temp = temp.next;
        }
        return total;
    }

    public void sortByName() {
        head = mergeSort(head, true);
    }

    public void sortByPrice() {
        head = mergeSort(head, false);
    }

    private Item mergeSort(Item head, boolean byName) {
        if (head == null || head.next == null) return head;
        Item mid = getMid(head);
        Item left = head, right = mid.next;
        mid.next = null;

        left = mergeSort(left, byName);
        right = mergeSort(right, byName);

        return merge(left, right, byName);
    }

    private Item merge(Item left, Item right, boolean byName) {
        if (left == null) return right;
        if (right == null) return left;
        Item result;

        if (byName ? left.name.compareToIgnoreCase(right.name) <= 0 : left.price <= right.price) {
            result = left;
            result.next = merge(left.next, right, byName);
        } else {
            result = right;
            result.next = merge(left, right.next, byName);
        }
        return result;
    }

    private Item getMid(Item head) {
        Item slow = head, fast = head.next;
        while (fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;
        }
        return slow;
    }

    public void display() {
        Item temp = head;
        while (temp != null) {
            System.out.println(temp.id + " | " + temp.name + " | Qty: " + temp.qty + " | Price: " + temp.price);
            temp = temp.next;
        }
    }

}
public class  InventoryMain{
    public static void main(String[] args) {
        Inventory inv = new Inventory();

        inv.addB("Laptop", 101, 5, 50000);
        inv.addE("Mouse", 102, 10, 1500);
        inv.addP("Keyboard", 103, 8, 2500, 2);

        inv.display();

        inv.update(102, 15);
        inv.del(103);

        System.out.println("total" +inv.totalValue());

        inv.sortByName();
        inv.display();

        inv.sortByPrice();
        inv.display();
    }
}
