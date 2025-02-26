import com.fasterxml.jackson.databind.ObjectMapper;
import java.io.File;
import java.io.IOException;
import java.util.Arrays;
import java.util.List;

class User {
    public String name;
    public int age;

    public User(String name, int age) {
        this.name = name;
        this.age = age;
    }
}

public class ListToJsonArray {
    public static void main(String[] args) {
        List<User> users = Arrays.asList(
                new User("Alice", 28),
                new User("Bob", 22),
                new User("Charlie", 30)
        );

        String jsonFilePath = "src/main/resources/users.json";

        try {
            ObjectMapper objectMapper = new ObjectMapper();
            objectMapper.writeValue(new File(jsonFilePath), users);

            System.out.println("List converted to JSON array successfully.");
        } catch (IOException e) {
            System.out.println("Error converting list to JSON array: " + e.getMessage());
        }
    }
}