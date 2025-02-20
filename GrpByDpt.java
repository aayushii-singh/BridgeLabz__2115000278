import java.util.*;
import java.util.stream.Collectors;

class Employee {
    String name, dept;
    public Employee(String name, String dept) {
        this.name = name;
        this.dept = dept;
    }
    public String toString() {
        return name;
    }
}

public class GrpByDpt {
    public static void main(String[] args) {
        List<Employee> employees = List.of(
            new Employee("Alice", "HR"),
            new Employee("Bob", "IT"),
            new Employee("Carol", "HR")
        );

        Map<String, List<Employee>> grouped = employees.stream()
            .collect(Collectors.groupingBy(e -> e.dept));

        System.out.println(grouped);
    }
}
