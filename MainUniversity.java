class University {
    private String name;
    private Department[] departments;

    public University(String name, Department[] departments) {
        this.name = name;
        this.departments = departments;
    }

    public void displayDepartments() {
        System.out.println("University: " + name);
        for (Department department : departments) {
            department.display();
        }
    }
}

class Department {
    private String name;
    private Faculty[] faculties;

    public Department(String name, Faculty[] faculties) {
        this.name = name;
        this.faculties = faculties;
    }

    public void display() {
        System.out.println("Department: " + name);
        for (Faculty faculty : faculties) {
            System.out.println("Faculty: " + faculty.getName());
        }
    }
}

class Faculty {
    private String name;

    public Faculty(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }
}

public class MainUniversity {
    public static void main(String[] args) {
        Faculty faculty1 = new Faculty("Dr. Sharma");
        Faculty faculty2 = new Faculty("Dr. Verma");

        Department department1 = new Department("Computer Science", new Faculty[]{faculty1});
        Department department2 = new Department("Mathematics", new Faculty[]{faculty2});

        University university = new University("GLA University", new Department[]{department1, department2});
        university.displayDepartments();
    }
}
