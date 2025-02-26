import com.opencsv.CSVReader;
import com.opencsv.exceptions.CsvException;
import java.io.FileReader;
import java.io.IOException;
import java.nio.file.Paths;
import java.util.List;

public class CountCSVRows {
    public static void main(String[] args) {
        String filePath = Paths.get("src", "main", "resources", "employees.csv").toString();

        try (CSVReader reader = new CSVReader(new FileReader(filePath))) {
            List<String[]> records = reader.readAll();
            if (records.size() <= 1) {
                System.out.println("No records found in the CSV file.");
            } else {
                int rowCount = records.size() - 1;
                System.out.println("Total number of records: " + rowCount);
            }
        } catch (IOException | CsvException e) {
            System.out.println("Error reading file: " + e.getMessage());
        }
    }
}
