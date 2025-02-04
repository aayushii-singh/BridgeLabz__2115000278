class Vehicle {
    static double registrationFee = 500.0;
    final String registrationNumber;
    String ownerName;
    String vehicleType;

    public Vehicle(String ownerName, String vehicleType, String registrationNumber) {
        this.ownerName = ownerName;
        this.vehicleType = vehicleType;
        this.registrationNumber = registrationNumber;
    }

    public static void updateRegistrationFee(double newFee) {
        registrationFee = newFee;
    }

    public void displayRegistrationDetails() {
        System.out.println("Owner: " + ownerName);
        System.out.println("Type: " + vehicleType);
        System.out.println("Reg. No: " + registrationNumber);
        System.out.println("Fee: " + registrationFee);
    }

    public static void main(String[] args) {
        Vehicle vehicle = new Vehicle("John", "Car", "AB123");
        vehicle.displayRegistrationDetails();
        Vehicle.updateRegistrationFee(600.0);
        vehicle.displayRegistrationDetails();
    }
}
