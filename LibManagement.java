class BkNode {
    String title, author, genre;
    int id;
    boolean avail;
    BkNode next, prev;

    public BkNode(String title, String author, String genre, int id, boolean avail) {
        this.title = title;
        this.author = author;
        this.genre = genre;
        this.id = id;
        this.avail = avail;
        this.next = this.prev = null;
    }
}

class Lib {
    BkNode head;

    public void addB(String title, String author, String genre, int id, boolean avail) {
        BkNode newNode = new BkNode(title, author, genre, id, avail);
        if (head != null) {
            newNode.next = head;
            head.prev = newNode;
        }
        head = newNode;
    }

    public void addE(String title, String author, String genre, int id, boolean avail) {
        BkNode newNode = new BkNode(title, author, genre, id, avail);
        if (head == null) {
            head = newNode;
            return;
        }
        BkNode temp = head;
        while (temp.next != null) temp = temp.next;
        temp.next = newNode;
        newNode.prev = temp;
    }

    public void addP(String title, String author, String genre, int id, boolean avail, int pos) {
        if (pos == 1) {
            addB(title, author, genre, id, avail);
            return;
        }
        BkNode newNode = new BkNode(title, author, genre, id, avail);
        BkNode temp = head;
        for (int i = 1; i < pos - 1 && temp != null; i++) temp = temp.next;
        if (temp == null) { System.out.println("Invalid Position!"); return; }
        newNode.next = temp.next;
        if (temp.next != null) temp.next.prev = newNode;
        temp.next = newNode;
        newNode.prev = temp;
    }

    public void delB() {
        if (head == null) { System.out.println("Empty!"); return; }
        head = head.next;
        if (head != null) head.prev = null;
    }

    public void delE() {
        if (head == null) { System.out.println("Empty!"); return; }
        if (head.next == null) { head = null; return; }
        BkNode temp = head;
        while (temp.next != null) temp = temp.next;
        temp.prev.next = null;
    }

    public void delS(int id) {
        if (head == null) { System.out.println("Empty!"); return; }
        if (head.id == id) { delB(); return; }
        BkNode temp = head;
        while (temp != null && temp.id != id) temp = temp.next;
        if (temp == null) { System.out.println("Not found!"); return; }
        if (temp.next != null) temp.next.prev = temp.prev;
        if (temp.prev != null) temp.prev.next = temp.next;
    }

    public boolean search(String title, String author) {
        BkNode temp = head;
        while (temp != null) {
            if (temp.title.equalsIgnoreCase(title) || temp.author.equalsIgnoreCase(author)) {
                System.out.println(temp.title + " by " + temp.author);
                return true;
            }
            temp = temp.next;
        }
        System.out.println("Not found!");
        return false;
    }

    public void modify(int id, boolean avail) {
        BkNode temp = head;
        while (temp != null) {
            if (temp.id == id) {
                temp.avail = avail;
                System.out.println("Updated ID " + id + " to " + (avail ? "Available" : "Not Available"));
                return;
            }
            temp = temp.next;
        }
        System.out.println("Not found!");
    }

    public int count() {
        int count = 0;
        BkNode temp = head;
        while (temp != null) {
            count++;
            temp = temp.next;
        }
        return count;
    }

    public void displayF() {
        BkNode temp = head;
        while (temp != null) {
            System.out.println(temp.title + " | " + temp.id);
            temp = temp.next;
        }
    }

    public void displayB() {
        if (head == null) { System.out.println("Empty!"); return; }
        BkNode temp = head;
        while (temp.next != null) temp = temp.next;
        while (temp != null) {
            System.out.println(temp.title + " | " + temp.id);
            temp = temp.prev;
        }
    }
}

public class LibManagement {
    public static void main(String[] args) {
        Lib lib = new Lib();

        lib.addE("b", "a", "e", 101, true);
        lib.addE("1984", "c", "d", 102, true);
        lib.addE("f", "g", "h", 103, true);

        lib.displayF();

        lib.addB("i", "j", "k", 104, true);
        lib.displayF();

        lib.addP("m", "n", "o", 105, true, 3);
        lib.displayF();

        lib.search("1984", "p");
        lib.modify(102, false);
        lib.displayF();

        System.out.println("Total: " + lib.count());

        lib.delB();
        lib.displayF();

        lib.delE();
        lib.displayF();

        lib.delS(101);
        lib.displayF();

        lib.displayB();
    }
}
