import com.opencsv.CSVWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.nio.file.Paths;

public class WriteEmployees {
    public static void main(String[] args) {
        String filePath = Paths.get("src", "main", "resources", "employeesData.csv").toString();

        try (CSVWriter writer = new CSVWriter(new FileWriter(filePath))) {
            String[] header = {"ID", "Name", "Department", "Salary"};
            String[] emp1 = {"101", "Ayu", "HR", "50000"};
            String[] emp2 = {"102", "Dev", "IT", "60000"};
            String[] emp3 = {"103", "Ashu", "Finance", "55000"};
            String[] emp4 = {"104", "Ravi", "Marketing", "52000"};
            String[] emp5 = {"105", "Anu", "IT", "58000"};

            writer.writeNext(header);
            writer.writeNext(emp1);
            writer.writeNext(emp2);
            writer.writeNext(emp3);
            writer.writeNext(emp4);
            writer.writeNext(emp5);

            System.out.println("Employee data written successfully.");

        } catch (IOException e) {
            System.out.println("Error writing file: " + e.getMessage());
        }
    }
}
