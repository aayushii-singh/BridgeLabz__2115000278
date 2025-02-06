class Student {
    private String name;

    public Student(String name) {
        this.name = name;
    }

    public void enrollCourse(Course course) {
        System.out.println(name + " enrolled in " + course.getName());
    }
}

class Professor {
    private String name;

    public Professor(String name) {
        this.name = name;
    }

    public void assignCourse(Course course) {
        System.out.println(name + " is teaching " + course.getName());
    }
}

class Course {
    private String name;

    public Course(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }
}

public class Mng {
    public static void main(String[] args) {
        Student student1 = new Student("Alice");
        Professor professor1 = new Professor("Mr. Lee");
        Course course1 = new Course("Math 101");

        student1.enrollCourse(course1);
        professor1.assignCourse(course1);
    }
}
