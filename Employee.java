class Employee {
    private static String companyName = "Tech Corp";
    private static int totalEmployees = 0;
    private final int id;
    private String name, designation;
    
    public Employee(String name, int id, String designation) {
        this.name = name;
        this.id = id;
        this.designation = designation;
        totalEmployees++;
    }
    
    public static void displayTotalEmployees() {
        System.out.println("Total Employees: " + totalEmployees);
    }
    
    public void displayEmployeeDetails() {
        if (this instanceof Employee) {
            System.out.println("Name: " + name + ", ID: " + id + ", Designation: " + designation);
        }
    }
    
    public static void main(String[] args) {
        Employee emp1 = new Employee("Alice", 101, "Developer");
        Employee emp2 = new Employee("Bob", 102, "Manager");
        emp1.displayEmployeeDetails();
        emp2.displayEmployeeDetails();
        displayTotalEmployees();
    }
}
