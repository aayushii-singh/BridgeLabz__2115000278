import com.opencsv.CSVReader;
import com.opencsv.CSVWriter;
import com.opencsv.exceptions.CsvException;
import java.io.*;
import java.nio.file.Paths;
import java.util.List;

public class UpdateSalary {
    public static void main(String[] args) {
        String inputFilePath = Paths.get("src", "main", "resources", "employees.csv").toString();
        String outputFilePath = Paths.get("src", "main", "resources", "updated_employees.csv").toString();

        try (CSVReader reader = new CSVReader(new FileReader(inputFilePath));
             CSVWriter writer = new CSVWriter(new FileWriter(outputFilePath))) {

            List<String[]> records = reader.readAll();
            if (records.size() <= 1) {
                System.out.println("No employee records found.");
                return;
            }

            for (int i = 0; i < records.size(); i++) {
                String[] row = records.get(i);
                if (i == 0 || row.length < 4) {
                    writer.writeNext(row);
                    continue;
                }

                if (row[2].trim().equalsIgnoreCase("IT")) {
                    double salary = Double.parseDouble(row[3].trim());
                    salary *= 1.10;
                    row[3] = String.format("%.2f", salary);
                }
                writer.writeNext(row);
            }

            System.out.println("Salary update completed. Check 'updated_employees.csv'.");

        } catch (IOException | CsvException | NumberFormatException e) {
            System.out.println("Error processing file: " + e.getMessage());
        }
    }
}
