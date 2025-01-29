import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class DateFormat {
    public static void showDate() {
        LocalDate date = LocalDate.now();
        DateTimeFormatter fmt1 = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        DateTimeFormatter fmt2 = DateTimeFormatter.ofPattern("yyyy-MM-dd");
        DateTimeFormatter fmt3 = DateTimeFormatter.ofPattern("EEE, MMM dd, yyyy");

        System.out.println(date.format(fmt1));
        System.out.println(date.format(fmt2));
        System.out.println(date.format(fmt3));
    }

    public static void main(String[] args) {
        showDate();
    }
}



