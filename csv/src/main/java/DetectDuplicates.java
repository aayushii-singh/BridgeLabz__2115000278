import com.opencsv.CSVReader;
import com.opencsv.exceptions.CsvException;
import java.io.FileReader;
import java.io.IOException;
import java.nio.file.Paths;
import java.util.*;

public class DetectDuplicates {
    public static void main(String[] args) {
        String filePath = Paths.get("src", "main", "resources", "s3.csv").toString();

        try (CSVReader reader = new CSVReader(new FileReader(filePath))) {
            List<String[]> records = reader.readAll();
            if (records.size() <= 1) {
                System.out.println("No student records found.");
                return;
            }

            Set<String> uniqueIds = new HashSet<>();
            List<String[]> duplicateRecords = new ArrayList<>();

            for (int i = 1; i < records.size(); i++) {
                String[] row = records.get(i);
                String id = row[0].trim();

                if (!uniqueIds.add(id)) {
                    duplicateRecords.add(row);
                }
            }

            if (duplicateRecords.isEmpty()) {
                System.out.println("No duplicate records found.");
            } else {
                System.out.println("Duplicate records:");
                for (String[] row : duplicateRecords) {
                    System.out.println("ID: " + row[0] + ", Name: " + row[1] + ", Age: " + row[2]);
                }
            }

        } catch (IOException | CsvException e) {
            System.out.println("Error reading file: " + e.getMessage());
        }
    }
}
