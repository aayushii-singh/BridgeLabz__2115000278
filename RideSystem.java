abstract class Vehicle {
    private String vehicleId, driverName;
    protected double ratePerKm;

    public Vehicle(String vehicleId, String driverName, double ratePerKm) {
        this.vehicleId = vehicleId; this.driverName = driverName; this.ratePerKm = ratePerKm;
    }

    public String getVehicleDetails() {
        return "Vehicle ID: " + vehicleId + ", Driver: " + driverName;
    }

    public abstract double calculateFare(double distance);
}

class Car extends Vehicle {
    public Car(String vehicleId, String driverName, double ratePerKm) {
        super(vehicleId, driverName, ratePerKm);
    }

    public double calculateFare(double distance) {
        return distance * ratePerKm;
    }
}

class Bike extends Vehicle {
    public Bike(String vehicleId, String driverName, double ratePerKm) {
        super(vehicleId, driverName, ratePerKm);
    }

    public double calculateFare(double distance) {
        return distance * ratePerKm;
    }
}

class Auto extends Vehicle {
    public Auto(String vehicleId, String driverName, double ratePerKm) {
        super(vehicleId, driverName, ratePerKm);
    }

    public double calculateFare(double distance) {
        return distance * ratePerKm;
    }
}

interface GPS {
    String getCurrentLocation();
    void updateLocation(String location);
}

class VehicleGPS implements GPS {
    private String location;

    public String getCurrentLocation() {
        return location;
    }

    public void updateLocation(String location) {
        this.location = location;
    }
}

public class RideSystem {
    public static void main(String[] args) {
        Vehicle[] vehicles = { new Car("V001", "Ayushi", 10), new Bike("V002", "Ashutosh", 5), new Auto("V003", "Ravi", 8) };
        GPS gps = new VehicleGPS();

        for (Vehicle vehicle : vehicles) {
            System.out.println(vehicle.getVehicleDetails() + ", Fare for 10 km: " + vehicle.calculateFare(10));
        }

        gps.updateLocation("Sector 15");
        System.out.println("Current location: " + gps.getCurrentLocation());
    }
}
