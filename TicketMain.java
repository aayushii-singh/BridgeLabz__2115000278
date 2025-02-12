class Ticket {
    int id;
    String cName, mName, sNo, bTime;
    Ticket next;

    public Ticket(int id, String cName, String mName, String sNo, String bTime) {
        this.id = id;
        this.cName = cName;
        this.mName = mName;
        this.sNo = sNo;
        this.bTime = bTime;
        this.next = null;
    }
}

class TicketSystem {
    Ticket head;

    public TicketSystem() {
        head = null;
    }

    public void addTicket(int id, String cName, String mName, String sNo, String bTime) {
        Ticket newTicket = new Ticket(id, cName, mName, sNo, bTime);
        if (head == null) {
            head = newTicket;
            newTicket.next = head;
        } else {
            Ticket temp = head;
            while (temp.next != head) {
                temp = temp.next;
            }
            temp.next = newTicket;
            newTicket.next = head;
        }
    }

    public void removeTicket(int id) {
        if (head == null) return;
        Ticket temp = head;
        if (head.id == id) {
            if (head.next == head) {
                head = null;
            } else {
                while (temp.next != head) {
                    temp = temp.next;
                }
                temp.next = head.next;
                head = head.next;
            }
            return;
        }
        while (temp.next != head && temp.next.id != id) {
            temp = temp.next;
        }
        if (temp.next != head) {
            temp.next = temp.next.next;
        }
    }

    public void displayTickets() {
        if (head == null) return;
        Ticket temp = head;
        do {
            System.out.println("Ticket ID: " + temp.id + ", Name: " + temp.cName + ", Movie: " + temp.mName +
                    ", Seat: " + temp.sNo + ", Time: " + temp.bTime);
            temp = temp.next;
        } while (temp != head);
    }

    public void searchTicket(String query) {
        if (head == null) return;
        Ticket temp = head;
        do {
            if (temp.cName.equalsIgnoreCase(query) || temp.mName.equalsIgnoreCase(query)) {
                System.out.println("Ticket found: " + temp.id + ", " + temp.cName + ", " + temp.mName);
                return;
            }
            temp = temp.next;
        } while (temp != head);
        System.out.println("Ticket not found.");
    }

    public void countTickets() {
        if (head == null) {
            System.out.println("Total tickets: 0");
            return;
        }
        Ticket temp = head;
        int count = 0;
        do {
            count++;
            temp = temp.next;
        } while (temp != head);
        System.out.println("Total tickets: " + count);
    }
}

public class TicketMain {
    public static void main(String[] args) {
        TicketSystem ts = new TicketSystem();
        ts.addTicket(1, "Ayu", "Avatar", "A1", "10:00 AM");
        ts.addTicket(2, "Ayushi", "Avatar", "A2", "10:30 AM");
        ts.addTicket(3, "Dev", "Endgame", "B1", "12:00 PM");

        ts.displayTickets();
        ts.searchTicket("Ayu");
        ts.removeTicket(2);
        ts.displayTickets();
        ts.countTickets();
    }
}
