import java.util.*;

class P {
    int id, bt, pri, rt;
    P next;
    P(int id, int bt, int pri) {
        this.id = id;
        this.bt = bt;
        this.rt = bt;
        this.pri = pri;
    }
}

class RoundRobin {
    P head = null, tail = null;
    void insert(int id, int bt, int pri) {
        P p = new P(id, bt, pri);
        if (head == null) head = tail = p;
        else { tail.next = p; tail = p; }
        tail.next = head;
    }
    
    void delete(int id) {
        if (head == null) return;
        P cur = head, prev = null;
        do {
            if (cur.id == id) {
                if (cur == head) head = head.next;
                if (cur == tail) tail = prev;
                if (prev != null) prev.next = cur.next;
                return;
            }
            prev = cur;
            cur = cur.next;
        } while (cur != head);
    }
    
    void execute(int tq) {
        int t = 0, sum = 0, n = 0;
        P cur = head;
        while (cur != null) {
            System.out.println("Executing P" + cur.id);
            if (cur.rt > tq) { t += tq; cur.rt -= tq; }
            else { t += cur.rt; sum += (t - cur.bt); cur.rt = 0; delete(cur.id); n++; }
            cur = cur.next;
            if (cur == null || cur == head) break;
        }
        System.out.println("Avg WT: " + (sum / (double) n));
    }
    
    void display() {
        if (head == null) return;
        P cur = head;
        do {
            System.out.println("P" + cur.id + " BT:" + cur.bt + " PRI:" + cur.pri);
            cur = cur.next;
        } while (cur != head);
    }
}

public class Main {
    public static void main(String[] args) {
        RoundRobin rr = new RoundRobin();
        rr.insert(1, 5, 2);
        rr.insert(2, 3, 1);
        rr.insert(3, 8, 3);
        rr.insert(4, 6, 2);
        rr.display();
        rr.execute(2);
    }
}

