abstract class Vehicle {
    private double rate;
    public Vehicle(double rate) { this.rate = rate; }
    public abstract double calculateRentalCost(int days);
    public double getRate()
    { return rate; }
}

class Car extends Vehicle {
    public Car(double rate) { super(rate); }
    public double calculateRentalCost(int days) {
        return getRate() * days; }
}

class Bike extends Vehicle {
    public Bike(double rate) { super(rate); }
    public double calculateRentalCost(int days) { return getRate() * days; }
}

class Truck extends Vehicle {
    public Truck(double rate) { super(rate); }
    public double calculateRentalCost(int days) { return getRate() * days * 1.5; }
}

interface Insurable {
    double calculateInsurance();
}

class CarInsurance implements Insurable {
    public double calculateInsurance() { return 100; }
}

class BikeInsurance implements Insurable {
    public double calculateInsurance() { return 50; }
}

class TruckInsurance implements Insurable {
    public double calculateInsurance() {
        return 200; }
}

public class RentalSystem {
    public static void main(String[] args) {
        Vehicle[] vehicles = { new Car(50), new Bike(30), new Truck(100) };
        Insurable[] insurances = { new CarInsurance(), new BikeInsurance(), new TruckInsurance() };

        for (int i = 0; i < vehicles.length; i++) {
            System.out.println("Rental: " + vehicles[i].calculateRentalCost(5) + ", Insurance: " + insurances[i].calculateInsurance());
        }
    }
}
