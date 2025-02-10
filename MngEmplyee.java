abstract class Employee {
    private int id;
    private String name;
    private double salary;

    public Employee(int id, String name, double salary) {
        this.id = id;
        this.name = name;
        this.salary = salary;
    }

    public abstract double calculateSalary();

    public void displayDetails() {
        System.out.println("ID: " + id + ", Name: " + name + ", Salary: " + calculateSalary());
    }

    public double getSalary() {
        return salary;
    }
}

class FullTimeEmployee extends Employee {
    public FullTimeEmployee(int id, String name, double salary) {
        super(id, name, salary);
    }

    public double calculateSalary() {
        return getSalary();
    }
}

class PartTimeEmployee extends Employee {
    private int hours;

    public PartTimeEmployee(int id, String name, double salary, int hours) {
        super(id, name, salary);
        this.hours = hours;
    }

    public double calculateSalary() {
        return getSalary() * hours;
    }
}

interface Department {
    void assignDepartment(String dept);
    String getDepartmentDetails();
}

class ITDept implements Department {
    private String dept = "IT";

    public void assignDepartment(String dept) {
        this.dept = dept;
    }

    public String getDepartmentDetails() {
        return "Department: " + dept;
    }
}

public class MngEmplyee {
    public static void main(String[] args) {
        Employee e1 = new FullTimeEmployee(1, "Ayu", 5000);
        Employee e2 = new PartTimeEmployee(2, "Don", 20, 80);
        e1.displayDetails();
        e2.displayDetails();

        ITDept dept = new ITDept();
        System.out.println(dept.getDepartmentDetails());
    }
}
