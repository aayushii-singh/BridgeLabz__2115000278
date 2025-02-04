class Patient {
    static String hospitalName = "City Hospital";
    static int totalPatients = 0;
    final String patientID;
    String name;
    int age;
    String ailment;

    public Patient(String name, int age, String ailment, String patientID) {
        this.name = name;
        this.age = age;
        this.ailment = ailment;
        this.patientID = patientID;
        totalPatients++;
    }

    public static int getTotalPatients() {
        return totalPatients;
    }

    public void displayPatientDetails() {
        if (this instanceof Patient) {
            System.out.println("Name: " + name);
            System.out.println("Age: " + age);
            System.out.println("Ailment: " + ailment);
            System.out.println("Patient ID: " + patientID);
        }
    }

    public static void main(String[] args) {
        Patient patient1 = new Patient("Ayu", 25, "Fever", "P123");
        Patient patient2 = new Patient("Dev", 30, "Cough", "P124");
        patient1.displayPatientDetails();
        patient2.displayPatientDetails();
        System.out.println("Total Patients: " + Patient.getTotalPatients());
    }
}
