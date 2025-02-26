import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.ObjectMapper;

import java.io.InputStream;

public class ReadJSON {
    public static void main(String[] args) throws Exception {
        ObjectMapper objectMapper = new ObjectMapper();
        InputStream inputStream = ReadJSON.class.getClassLoader().getResourceAsStream("data.json");

        if (inputStream == null) {
            System.out.println("File not found in resources!");
            return;
        }

        JsonNode rootNode = objectMapper.readTree(inputStream);
        System.out.println("Name: " + rootNode.get("name").asText());
        System.out.println("Email: " + rootNode.get("email").asText());
    }
}
