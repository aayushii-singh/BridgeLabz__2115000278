import com.opencsv.CSVReader;
import com.opencsv.exceptions.CsvException;
import java.io.FileReader;
import java.io.IOException;
import java.nio.file.Paths;
import java.util.List;
import java.util.regex.Pattern;

public class ValidateCSVData {
    public static void main(String[] args) {
        String filePath = Paths.get("src", "main", "resources", "employee.csv").toString();

        String emailRegex = "^[A-Za-z0-9+_.-]+@[A-Za-z0-9.-]+$";
        String phoneRegex = "^[0-9]{10}$";
        Pattern emailPattern = Pattern.compile(emailRegex);
        Pattern phonePattern = Pattern.compile(phoneRegex);

        try (CSVReader reader = new CSVReader(new FileReader(filePath))) {
            List<String[]> records = reader.readAll();
            if (records.size() <= 1) {
                System.out.println("No employee records found.");
                return;
            }

            boolean hasErrors = false;
            System.out.println("Checking for invalid records...");

            for (int i = 1; i < records.size(); i++) {
                String[] row = records.get(i);
                String email = row[3].trim();
                String phone = row[4].trim();

                boolean isEmailValid = emailPattern.matcher(email).matches();
                boolean isPhoneValid = phonePattern.matcher(phone).matches();

                if (!isEmailValid || !isPhoneValid) {
                    hasErrors = true;
                    System.out.println("Invalid Record Found: ID: " + row[0] + ", Name: " + row[1]);
                    if (!isEmailValid) {
                        System.out.println(" -> Invalid Email: " + email);
                    }
                    if (!isPhoneValid) {
                        System.out.println(" -> Invalid Phone Number: " + phone);
                    }
                }
            }

            if (!hasErrors) {
                System.out.println("All records are valid.");
            }

        } catch (IOException | CsvException e) {
            System.out.println("Error reading file: " + e.getMessage());
        }
    }
}
