class Company {
    private String name;
    private Department[] departments;

    public Company(String name, Department[] departments) {
        this.name = name;
        this.departments = departments;
    }

    public void display() {
        System.out.println("Company: " + name);
        for (Department dept : departments) {
            dept.display();
        }
    }
}

class Department {
    private String name;
    private Employee[] employees;

    public Department(String name, Employee[] employees) {
        this.name = name;
        this.employees = employees;
    }

    public void display() {
        System.out.println("Department: " + name);
        for (Employee emp : employees) {
            emp.display();
        }
    }
}

class Employee {
    private String name;

    public Employee(String name) {
        this.name = name;
    }

    public void display() {
        System.out.println("Employee: " + name);
    }
}

public class Maiin {
    public static void main(String[] args) {
        Employee[] salesEmployees = {new Employee("Raj"), new Employee("Amit")};
        Employee[] supportEmployees = {new Employee("Sara")};

        Department[] departments = {
            new Department("Sales", salesEmployees),
            new Department("Support", supportEmployees)
        };

        Company company = new Company("ABC Pvt Ltd", departments);
        company.display();
    }
}
