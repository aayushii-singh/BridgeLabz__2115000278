import java.util.*;
import java.time.*;

class P implements Comparable<P> {
    String num, name, type;
    LocalDate exp;
    double amt;

    public P(String num, String name, LocalDate exp, String type, double amt) {
        this.num = num;
        this.name = name;
        this.exp = exp;
        this.type = type;
        this.amt = amt;
    }

    public int compareTo(P o) {
        return this.exp.compareTo(o.exp);
    }

    public String toString() {
        return num + ", " + name + ", " + exp + ", " + type + ", " + amt;
    }
}

public class Ipm {
    Set<P> pSet = new TreeSet<>();

    public void add(P p) {
        pSet.add(p);
    }

    public void show() {
        pSet.forEach(System.out::println);
    }

    public static void main(String[] args) {
        Ipm m = new Ipm();
        m.add(new P("P1", "John", LocalDate.of(2024, 3, 15), "Health", 5000));
        m.add(new P("P2", "Jane", LocalDate.of(2024, 2, 20), "Auto", 3000));
        m.show();
    }
}
