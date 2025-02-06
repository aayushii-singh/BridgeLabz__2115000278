class Hospital {
    private String name;

    public Hospital(String name) {
        this.name = name;
    }

    public void display() {
        System.out.println("Hospital: " + name);
    }
}

class Doctor {
    private String name;

    public Doctor(String name) {
        this.name = name;
    }

    public void consult(Patient patient) {
        System.out.println("Doctor: " + name + " is consulting with " + patient.getName());
    }
}

class Patient {
    private String name;

    public Patient(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }
}

public class HospitalMain {
    public static void main(String[] args) {
        Hospital hospital = new Hospital("City Hospital");
        Doctor doctor1 = new Doctor("Dr ashu");
        Patient patient1 = new Patient("ayu");

        hospital.display();
        doctor1.consult(patient1);
    }
}
