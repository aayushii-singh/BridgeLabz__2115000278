class Node {
    String title, director, rating;
    int year;
    Node next, prev;

    public Node(String title, String director, int year, String rating) {
        this.title = title;
        this.director = director;
        this.year = year;
        this.rating = rating;
        this.next = null;
        this.prev = null;
    }
}
class DLL {
    Node head, tail;

    public void addB(String title, String director, int year, String rating) {
        Node newNode = new Node(title, director, year, rating);
        if (head != null) {
            newNode.next = head;
            head.prev = newNode;
        }
        head = newNode;
        if (tail == null) tail = head;
    }

    public void addE(String title, String director, int year, String rating) {
        Node newNode = new Node(title, director, year, rating);
        if (head == null) {
            head = newNode;
            tail = newNode;
            return;
        }
        tail.next = newNode;
        newNode.prev = tail;
        tail = newNode;
    }

    public void addP(String title, String director, int year, String rating, int pos) {
        if (pos == 1) {
            addB(title, director, year, rating);
            return;
        }
        Node newNode = new Node(title, director, year, rating);
        Node temp = head;
        for (int i = 1; i < pos - 1 && temp != null; i++) {
            temp = temp.next;
        }
        if (temp == null) {
            System.out.println("Invalid Position!");
            return;
        }
        newNode.next = temp.next;
        if (temp.next != null) {
            temp.next.prev = newNode;
        }
        temp.next = newNode;
        newNode.prev = temp;
    }

    public void delB() {
        if (head == null) return;
        head = head.next;
        if (head != null) {
            head.prev = null;
        }
    }

    public void delE() {
        if (head == null) return;
        if (head.next == null) {
            head = null;
            return;
        }
        tail = tail.prev;
        tail.next = null;
    }

    public void delP(int pos) {
        if (head == null) return;
        if (pos == 1) {
            delB();
            return;
        }
        Node temp = head;
        for (int i = 1; i < pos - 1 && temp != null; i++) {
            temp = temp.next;
        }
        if (temp == null || temp.next == null) {
            System.out.println("Invalid Position!");
            return;
        }
        Node deleteNode = temp.next;
        temp.next = deleteNode.next;
        if (deleteNode.next != null) {
            deleteNode.next.prev = temp;
        }
    }

    public void searchD(String director) {
        Node temp = head;
        while (temp != null) {
            if (temp.director.equals(director)) {
                System.out.println("Found: " + temp.title);
                return;
            }
            temp = temp.next;
        }
        System.out.println("Not Found");
    }

    public void searchR(String rating) {
        Node temp = head;
        while (temp != null) {
            if (temp.rating.equals(rating)) {
                System.out.println("Found: " + temp.title);
                return;
            }
            temp = temp.next;
        }
        System.out.println("Not Found");
    }

    public void updateR(String title, String newRating) {
        Node temp = head;
        while (temp != null) {
            if (temp.title.equals(title)) {
                temp.rating = newRating;
                System.out.println("Updated rating for " + temp.title);
                return;
            }
            temp = temp.next;
        }
        System.out.println("Movie not found");
    }

    public void dispF() {
        Node temp = head;
        while (temp != null) {
            System.out.print(temp.title + " --> ");
            temp = temp.next;
        }
        System.out.println("Null");
    }

    public void dispB() {
        Node temp = tail;
        while (temp != null) {
            System.out.print(temp.title + " --> ");
            temp = temp.prev;
        }
        System.out.println("Null");
    }
}
class MovieMain{
    public static void main(String[] args) {
        DLL list = new DLL();

        list.addE("M1", "D1", 2020, "5");
        list.addE("M2", "D2", 2021, "4");
        list.addE("M3", "D1", 2022, "3");
        list.dispF();

        list.addB("M0", "D3", 2023, "5");
        list.dispF();

        list.addP("M4", "D2", 2024, "4", 2);
        list.dispF();

        list.searchD("D1");
        list.searchR("4");

        list.updateR("M2", "4.5");
        list.dispF();

        list.delB();
        list.dispF();

        list.delE();
        list.dispF();

        list.delP(2);
        list.dispF();

        list.dispB();
    }
}
