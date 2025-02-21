import java.io.*;
import java.util.*;

class Employee implements Serializable {
    int id;
    String name, department;
    double salary;

    public Employee(int id, String name, String dept, double salary) {
        this.id = id;
        this.name = name;
        this.department = dept;
        this.salary = salary;
    }

    public String toString() {
        return id + " | " + name + " | " + department + " | $" + salary;
    }
}

public class Employeeee {
    public static void main(String[] args) {
        String file = "employees.dat";
        List<Employee> employees = Arrays.asList(
            new Employee(1, "Ayushi", "IT", 50000),
            new Employee(2, "Rahul", "HR", 45000)
        );

        saveEmployees(file, employees);
        loadEmployees(file);
    }

    static void saveEmployees(String file, List<Employee> employees) {
        try (ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream(file))) {
            oos.writeObject(employees);
            System.out.println("Employees saved!");
        } catch (IOException e) {
            System.out.println("Error: " + e.getMessage());
        }
    }

    static void loadEmployees(String file) {
        try (ObjectInputStream ois = new ObjectInputStream(new FileInputStream(file))) {
            List<Employee> employees = (List<Employee>) ois.readObject();
            employees.forEach(System.out::println);
        } catch (IOException | ClassNotFoundException e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
}
