class Student {
    private static String universityName = "GLA University";
    private static int totalStudents = 0;
    private final int rollNumber;
    private String name;
    private String grade;
    
    public Student(String name, int rollNumber, String grade) {
        this.name = name;
        this.rollNumber = rollNumber;
        this.grade = grade;
        totalStudents++;
    }
    
    public static void displayTotalStudents() {
        System.out.println("Total Students Enrolled: " + totalStudents);
    }
    
    public void displayStudentDetails() {
        if (this instanceof Student) {
            System.out.println("Name: " + name + ", Roll Number: " + rollNumber + ", Grade: " + grade);
        }
    }
    public static void main(String[] args) {
        Student s1 = new Student("Ayu", 201, "A");
        Student s2 = new Student("Dev", 202, "B");
        s1.displayStudentDetails();
        s2.displayStudentDetails();
        displayTotalStudents();
    }
}
