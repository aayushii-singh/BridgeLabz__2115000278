package org.example;

import com.fasterxml.jackson.databind.ObjectMapper;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class StudentJSON {
    public static void main(String[] args) {
        try {
            Map<String, Object> student = new HashMap<>();
            student.put("name", "John Doe");
            student.put("age", 20);
            student.put("subjects", Arrays.asList("Math", "Science", "English"));

            ObjectMapper objectMapper = new ObjectMapper();
            String json = objectMapper.writerWithDefaultPrettyPrinter().writeValueAsString(student);

            System.out.println(json);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
