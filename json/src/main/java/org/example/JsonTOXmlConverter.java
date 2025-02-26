import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.json.JSONObject;
import org.json.XML;
import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;

 class JsonToXmlConverter {
    public static void main(String[] args) {
        String jsonFilePath = "src/main/resources/d2.json";
        String xmlFilePath = "src/main/resources/d2.xml";

        try {
            String jsonContent = new String(Files.readAllBytes(Paths.get(jsonFilePath)));
            JSONObject jsonObject = new JSONObject(jsonContent);
            String xmlContent = XML.toString(jsonObject);

            Files.write(Paths.get(xmlFilePath), xmlContent.getBytes());
            System.out.println("JSON converted to XML successfully.");
        } catch (IOException e) {
            System.out.println("Error converting JSON to XML: " + e.getMessage());
        }
    }
}