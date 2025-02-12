class Node {
    int rollNo;
    String name;
    int age;
    String grade;
    Node next;

    public Node(int rollNo, String name, int age, String grade) {
        this.rollNo = rollNo;
        this.name = name;
        this.age = age;
        this.grade = grade;
        this.next = null;
    }
}

class StudentList {
    Node head;

    public void addB(int rollNo, String name, int age, String grade) {
        Node newNode = new Node(rollNo, name, age, grade);
        newNode.next = head;
        head = newNode;
    }

    public void addE(int rollNo, String name, int age, String grade) {
        Node newNode = new Node(rollNo, name, age, grade);
        if (head == null) {
            head = newNode;
            return;
        }
        Node last = head;
        while (last.next != null) {
            last = last.next;
        }
        last.next = newNode;
    }

    public void addP(int rollNo, String name, int age, String grade, int position) {
        if (position == 1) {
            addB(rollNo, name, age, grade);
            return;
        }
        Node newNode = new Node(rollNo, name, age, grade);
        Node temp = head;
        for (int i = 1; i < position - 1 && temp != null; i++) {
            temp = temp.next;
        }
        if (temp == null) {
            System.out.println("Invalid Position!");
            return;
        }
        newNode.next = temp.next;
        temp.next = newNode;
    }

    public void delR(int rollNo) {
        if (head == null) {
            System.out.println("List is empty!");
            return;
        }
        if (head.rollNo == rollNo) {
            head = head.next;
            return;
        }
        Node temp = head;
        while (temp.next != null && temp.next.rollNo != rollNo) {
            temp = temp.next;
        }
        if (temp.next == null) {
            System.out.println("Roll Number not found!");
            return;
        }
        temp.next = temp.next.next;
    }

    public void searchR(int rollNo) {
        Node temp = head;
        while (temp != null) {
            if (temp.rollNo == rollNo) {
                System.out.println("Found: " + temp.name);
                return;
            }
            temp = temp.next;
        }
        System.out.println("Not Found");
    }

    public void updateG(int rollNo, String newGrade) {
        Node temp = head;
        while (temp != null) {
            if (temp.rollNo == rollNo) {
                temp.grade = newGrade;
                System.out.println("Updated grade for " + temp.name);
                return;
            }
            temp = temp.next;
        }
        System.out.println("Roll Number not found!");
    }

    public void display() {
        Node curr = head;
        while (curr != null) {
            System.out.print(curr.name + " (" + curr.rollNo + ") --> ");
            curr = curr.next;
        }
        System.out.println("Null");
    }

}
public class StudentMain{
    public static void main(String[] args) {
        StudentList list = new StudentList();

        list.addE(1, "Ayu", 20, "A");
        list.addE(2, "Dev", 22, "B");
        list.addE(3, "Ashu", 21, "A");
        list.addE(4, "Ravi", 23, "C");
        list.addE(5, "Sahil", 24, "B");
        list.display();

        list.addB(6, "Karan", 25, "A");
        list.display();

        list.addP(7, "Rohit", 22, "B", 3);
        list.display();

        list.searchR(3);
        list.searchR(6);

        list.updateG(4, "A+");
        list.display();

        list.delR(1);
        list.display();
    }
}