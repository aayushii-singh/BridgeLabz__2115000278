import com.fasterxml.jackson.databind.ObjectMapper;
import java.io.File;
import java.io.IOException;
import java.util.Arrays;
import java.util.List;
 class UserListToJson {
    public static void main(String[] args) {
        List<User> users = Arrays.asList(
                new User("Ayushi", 28),
                new User("Ashu", 22),
                new User("Ravi", 30)
        );

        String jsonFilePath = "src/main/resources/users_data.json";
        File file = new File(jsonFilePath);

        try {
            file.getParentFile().mkdirs();

            ObjectMapper objectMapper = new ObjectMapper();
            objectMapper.writeValue(file, users);
            System.out.println("User list converted to JSON array successfully.");
        } catch (IOException e) {
            System.out.println("Error converting user list to JSON array: " + e.getMessage());
        }
    }
}
