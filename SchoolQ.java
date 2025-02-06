class School {
    private String name;
    private Student[] students;

    public School(String name, Student[] students) {
        this.name = name;
        this.students = students;
    }

    public void displayStudents() {
        for (Student student : students) {
            System.out.println(student.getName());
        }
    }
}

class Student {
    private String name;
    private Course[] courses;

    public Student(String name, Course[] courses) {
        this.name = name;
        this.courses = courses;
    }

    public String getName() {
        return name;
    }

    public void displayCourses() {
        System.out.println(name + " is enrolled in:");
        for (Course course : courses) {
            System.out.println(course.getName());
        }
    }
}

class Course {
    private String name;
    private Student[] students;

    public Course(String name, Student[] students) {
        this.name = name;
        this.students = students;
    }

    public String getName() {
        return name;
    }

    public void displayStudents() {
        System.out.println("Students enrolled in " + name + ":");
        for (Student student : students) {
            System.out.println(student.getName());
        }
    }
}

public class SchoolQ{
    public static void main(String[] args) {
        Course course1 = new Course("Math", new Student[2]);
        Course course2 = new Course("Science", new Student[2]);

        Student student1 = new Student("Alice", new Course[]{course1, course2});
        Student student2 = new Student("Bob", new Course[]{course1});

        School school = new School("XYZ School", new Student[]{student1, student2});

        student1.displayCourses();
        student2.displayCourses();
        course1.displayStudents();
        course2.displayStudents();
    }
}
