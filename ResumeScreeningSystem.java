import java.util.*;

abstract class JobRole {
    abstract String reviewResume();
}

class SoftwareEngineer extends JobRole {
    String reviewResume() { return "Software Engineer"; }
}

class DataScientist extends JobRole {
    String reviewResume() { return "Data Scientist"; }
}

class ProductManager extends JobRole {
    String reviewResume() { return "Product Manager"; }
}

class Resume<T extends JobRole> {
    private T jobRole;
    Resume(T jobRole) { this.jobRole = jobRole; }
    void processResume() { System.out.println(jobRole.reviewResume()); }
}

class ResumeScreening {
    static void screenResumes(List<? extends JobRole> resumes) {
        resumes.forEach(resume -> System.out.println(resume.reviewResume()));
    }
}

public class ResumeScreeningSystem {
    public static void main(String[] args) {
        new Resume<>(new SoftwareEngineer()).processResume();
        new Resume<>(new DataScientist()).processResume();
        new Resume<>(new ProductManager()).processResume();

        ResumeScreening.screenResumes(Arrays.asList(new SoftwareEngineer(), new DataScientist(), new ProductManager()));
    }
}
