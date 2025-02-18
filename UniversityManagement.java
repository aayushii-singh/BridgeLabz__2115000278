
import java.util.*;

abstract class CourseType {
    String courseName;
    
    CourseType(String courseName) {
        this.courseName = courseName;
    }
    
    abstract void display();
}

class ExamCourse extends CourseType {
    ExamCourse(String courseName) { super(courseName); }
    void display() { System.out.println("Exam-Based Course: " + courseName); }
}

class AssignmentCourse extends CourseType {
    AssignmentCourse(String courseName) { super(courseName); }
    void display() { System.out.println("Assignment-Based Course: " + courseName); }
}

class ResearchCourse extends CourseType {
    ResearchCourse(String courseName) { super(courseName); }
    void display() { System.out.println("Research-Based Course: " + courseName); }
}

class Course<T extends CourseType> {
    private List<T> courses = new ArrayList<>();
    
    void addCourse(T course) { courses.add(course); }
    List<T> getCourses() { return courses; }
}

class University {
    static void displayCourses(List<? extends CourseType> courses) {
        for (CourseType course : courses) course.display();
    }
}

public class UniversityManagement {
    public static void main(String[] args) {
        Course<ExamCourse> examCourses = new Course<>();
        Course<AssignmentCourse> assignmentCourses = new Course<>();
        Course<ResearchCourse> researchCourses = new Course<>();

        ExamCourse math = new ExamCourse("Maths");
        AssignmentCourse cs = new AssignmentCourse("CS");
        ResearchCourse ai = new ResearchCourse("AI");

        examCourses.addCourse(math);
        assignmentCourses.addCourse(cs);
        researchCourses.addCourse(ai);

        University.displayCourses(examCourses.getCourses());
        University.displayCourses(assignmentCourses.getCourses());
        University.displayCourses(researchCourses.getCourses());
    }
}

