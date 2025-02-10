abstract class Patient {
    private String patientId, name;
    private int age;

    public Patient(String patientId, String name, int age) {
        this.patientId = patientId; this.name = name; this.age = age;
    }

    public String getPatientDetails() {
        return name + " (ID: " + patientId + ", Age: " + age + ")";
    }

    public abstract double calculateBill();
}

class InPatient extends Patient {
    public InPatient(String patientId, String name, int age) {
        super(patientId, name, age);
    }

    public double calculateBill() {
        return 5000;
    }
}

class OutPatient extends Patient {
    public OutPatient(String patientId, String name, int age) {
        super(patientId, name, age);
    }

    public double calculateBill() {
        return 2000;
    }
}

interface MedicalRecord {
    void addRecord(String record);
    void viewRecords();
}

class PatientRecord implements MedicalRecord {
    private String record;

    public void addRecord(String record) {
        this.record = record;
    }

    public void viewRecords() {
        System.out.println("Medical Record: " + record);
    }
}

public class HospitalMng {
    public static void main(String[] args) {
        Patient[] patients = { new InPatient("1", "Ayushi", 23), new OutPatient("2", "Ashutosh", 22) };
        MedicalRecord record = new PatientRecord();

        for (Patient patient : patients) {
            System.out.println(patient.getPatientDetails() + ", Bill: " + patient.calculateBill());
        }

        record.addRecord("Diagnosis: Flu");
        record.viewRecords();
    }
}
