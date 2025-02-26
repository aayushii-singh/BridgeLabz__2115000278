import com.opencsv.CSVReader;
import com.opencsv.exceptions.CsvValidationException;
import java.io.FileReader;
import java.io.IOException;
import java.nio.file.Paths;

public class ReadLargeCSV {
    public static void main(String[] args) {
        String filePath = Paths.get("src", "main", "resources", "largefile.csv").toString();

        try (CSVReader reader = new CSVReader(new FileReader(filePath))) {
            String[] nextLine;
            int batchSize = 100;
            int count = 0;
            int batchCount = 0;


            reader.readNext();

            while ((nextLine = reader.readNext()) != null) {
                count++;

                if (count % batchSize == 0) {
                    batchCount++;
                    System.out.println("Processed " + (batchCount * batchSize) + " records...");
                }
            }

            System.out.println("Total records processed: " + count);

        } catch (IOException | CsvValidationException e) {
            System.out.println("Error reading file: " + e.getMessage());
        }
    }
}
