import com.opencsv.CSVReader;
import com.opencsv.exceptions.CsvException;
import java.io.FileReader;
import java.io.IOException;
import java.nio.file.Paths;
import java.util.Comparator;
import java.util.List;

public class SortEmployees {
    public static void main(String[] args) {
        String filePath = Paths.get("src", "main", "resources", "employees.csv").toString();

        try (CSVReader reader = new CSVReader(new FileReader(filePath))) {
            List<String[]> records = reader.readAll();
            if (records.size() <= 1) {
                System.out.println("No employee records found.");
                return;
            }

            records.remove(0);

            records.sort(Comparator.comparingInt(row -> -Integer.parseInt(row[3].trim())));

            System.out.println("Top 5 Highest-Paid Employees:");
            for (int i = 0; i < Math.min(5, records.size()); i++) {
                String[] row = records.get(i);
                System.out.println("ID: " + row[0] + ", Name: " + row[1] + ", Department: " + row[2] + ", Salary: $" + row[3]);
            }

        } catch (IOException | CsvException | NumberFormatException e) {
            System.out.println("Error reading file: " + e.getMessage());
        }
    }
}
