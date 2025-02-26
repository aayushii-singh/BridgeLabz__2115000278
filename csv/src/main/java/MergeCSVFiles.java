import com.opencsv.CSVReader;
import com.opencsv.CSVWriter;
import com.opencsv.exceptions.CsvException;
import java.io.*;
import java.nio.file.Paths;
import java.util.*;

public class MergeCSVFiles {
    public static void main(String[] args) {
        String file1Path = Paths.get("src", "main", "resources", "s1.csv").toString();
        String file2Path = Paths.get("src", "main", "resources", "s2.csv").toString();
        String outputFilePath = Paths.get("src", "main", "resources", "merged_students.csv").toString();

        Map<String, String[]> studentMap = new HashMap<>();

        try (CSVReader reader1 = new CSVReader(new FileReader(file1Path));
             CSVReader reader2 = new CSVReader(new FileReader(file2Path));
             CSVWriter writer = new CSVWriter(new FileWriter(outputFilePath))) {

            List<String[]> records1 = reader1.readAll();
            List<String[]> records2 = reader2.readAll();

            if (records1.size() <= 1 || records2.size() <= 1) {
                System.out.println("One or both files are empty.");
                return;
            }

            for (int i = 1; i < records1.size(); i++) {
                studentMap.put(records1.get(i)[0], records1.get(i));
            }

            List<String[]> mergedData = new ArrayList<>();
            mergedData.add(new String[]{"ID", "Name", "Age", "Marks", "Grade"});

            for (int i = 1; i < records2.size(); i++) {
                String id = records2.get(i)[0];
                if (studentMap.containsKey(id)) {
                    String[] student1 = studentMap.get(id);
                    String[] student2 = records2.get(i);
                    String[] mergedRow = {student1[0], student1[1], student1[2], student2[1], student2[2]};
                    mergedData.add(mergedRow);
                }
            }

            writer.writeAll(mergedData);
            System.out.println("Merged CSV file created successfully at: " + outputFilePath);

        } catch (IOException | CsvException e) {
            System.out.println("Error processing files: " + e.getMessage());
        }
    }
}
