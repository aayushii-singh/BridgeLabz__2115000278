import org.everit.json.schema.Schema;
import org.everit.json.schema.loader.SchemaLoader;
import org.json.JSONObject;
import org.json.JSONTokener;

public class ValidateEmailJson {
    public static void main(String[] args) {
        String jsonData = "{ \"email\": \"test@example.com\" }";
        String jsonSchema = "{ \"type\": \"object\", \"properties\": { \"email\": { \"type\": \"string\", \"format\": \"email\" } }, \"required\": [\"email\"] }";

        try {
            JSONObject jsonObject = new JSONObject(jsonData);
            JSONObject schemaObject = new JSONObject(new JSONTokener(jsonSchema));
            Schema schema = SchemaLoader.load(schemaObject);

            schema.validate(jsonObject);

            System.out.println("Email is valid.");
        } catch (Exception e) {
            System.out.println("Invalid email: " + e.getMessage());
        }
    }
}