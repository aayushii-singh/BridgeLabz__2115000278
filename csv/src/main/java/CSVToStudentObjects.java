import com.opencsv.CSVReader;
import com.opencsv.exceptions.CsvException;
import java.io.FileReader;
import java.io.IOException;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;

class Student {
    private String id;
    private String name;
    private int marks;

    public Student(String id, String name, int marks) {
        this.id = id;
        this.name = name;
        this.marks = marks;
    }

    @Override
    public String toString() {
        return "Student{ID=" + id + ", Name='" + name + "', Marks=" + marks + "}";
    }
}

public class CSVToStudentObjects {
    public static void main(String[] args) {
        String filePath = Paths.get("src", "main", "resources", "students.csv").toString();
        List<Student> studentList = new ArrayList<>();

        try (CSVReader reader = new CSVReader(new FileReader(filePath))) {
            List<String[]> records = reader.readAll();
            if (records.size() <= 1) {
                System.out.println("No student records found.");
                return;
            }

            for (int i = 1; i < records.size(); i++) {
                String[] row = records.get(i);
                if (row.length >= 3) {
                    try {
                        Student student = new Student(row[0].trim(), row[1].trim(), Integer.parseInt(row[2].trim()));
                        studentList.add(student);
                    } catch (NumberFormatException e) {
                        System.out.println("Skipping invalid record: " + String.join(", ", row));
                    }
                } else {
                    System.out.println("Skipping incomplete record: " + String.join(", ", row));
                }
            }

            System.out.println("Students List:");
            for (Student student : studentList) {
                System.out.println(student);
            }

        } catch (IOException | CsvException e) {
            System.out.println("Error reading file: " + e.getMessage());
        }
    }
}
