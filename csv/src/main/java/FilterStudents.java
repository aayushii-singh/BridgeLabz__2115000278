import com.opencsv.CSVReader;
import com.opencsv.exceptions.CsvException;
import java.io.FileReader;
import java.io.IOException;
import java.nio.file.Paths;
import java.util.List;

public class FilterStudents {
    public static void main(String[] args) {
        String filePath = Paths.get("src", "main", "resources", "studentlist.csv").toString();

        try (CSVReader reader = new CSVReader(new FileReader(filePath))) {
            List<String[]> records = reader.readAll();
            if (records.size() <= 1) {
                System.out.println("No student records found.");
                return;
            }

            System.out.println("Students who scored more than 80 marks:");
            for (int i = 1; i < records.size(); i++) {
                String[] row = records.get(i);
                if (row.length < 3 || row[0].trim().isEmpty() || row[1].trim().isEmpty() || row[2].trim().isEmpty()) {
                    continue;
                }

                try {
                    int marks = Integer.parseInt(row[2].trim());
                    if (marks > 80) {
                        System.out.println("ID: " + row[0] + ", Name: " + row[1] + ", Marks: " + row[2]);
                    }
                } catch (NumberFormatException e) {
                    System.out.println("Skipping invalid marks format in row " + (i + 1));
                }
            }
        } catch (IOException | CsvException e) {
            System.out.println("Error reading file: " + e.getMessage());
        }
    }
}
