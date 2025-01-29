import java.time.LocalDate;

public class DateCompare {
    public static void compareDates(LocalDate d1, LocalDate d2) {
        if (d1.isBefore(d2)) System.out.println("Before");
        if (d1.isAfter(d2)) System.out.println("After");
        if (d1.isEqual(d2)) System.out.println("Same");
    }

    public static void main(String[] args) {
        LocalDate d1 = LocalDate.of(2023, 1, 1);
        LocalDate d2 = LocalDate.of(2023, 1, 2);
        compareDates(d1, d2);
    }
}

