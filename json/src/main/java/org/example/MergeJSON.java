import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.node.ObjectNode;

public class MergeJSON {
    public static void main(String[] args) throws Exception {
        ObjectMapper objectMapper = new ObjectMapper();

        String json1 = "{ \"name\": \"John Doe\", \"age\": 25 }";
        JsonNode node1 = objectMapper.readTree(json1);

        String json2 = "{ \"email\": \"john@example.com\", \"city\": \"New York\" }";
        JsonNode node2 = objectMapper.readTree(json2);

        // Merge two JSON objects
        ObjectNode mergedJson = objectMapper.createObjectNode();
        mergedJson.setAll((ObjectNode) node1);
        mergedJson.setAll((ObjectNode) node2);

        System.out.println(objectMapper.writerWithDefaultPrettyPrinter().writeValueAsString(mergedJson));
    }
}
