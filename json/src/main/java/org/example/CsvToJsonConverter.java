import com.fasterxml.jackson.databind.ObjectMapper;
import com.opencsv.CSVReader;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.*;

class CsvToJsonConverter {
    public static void main(String[] args) {
        String d1 = "src/main/resources/d1.csv";
        String d2 = "src/main/resources/d2.json";

        try (CSVReader reader = new CSVReader(new FileReader(d1))) {
            List<String[]> records = reader.readAll();
            List<Map<String, String>> jsonList = new ArrayList<>();

            String[] headers = records.get(0);
            for (int i = 1; i < records.size(); i++) {
                Map<String, String> jsonObject = new HashMap<>();
                for (int j = 0; j < headers.length; j++) {
                    jsonObject.put(headers[j], records.get(i)[j]);
                }
                jsonList.add(jsonObject);
            }

            ObjectMapper objectMapper = new ObjectMapper();
            objectMapper.writeValue(new FileWriter(d2), jsonList);
            System.out.println("CSV converted to JSON successfully.");
        } catch (IOException e) {
            System.out.println("Error converting CSV to JSON: " + e.getMessage());
        }
    }
}
