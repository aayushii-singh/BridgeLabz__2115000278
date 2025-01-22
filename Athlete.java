import java.util.Scanner;
public class Athlete {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the length of side 1 (in meters): ");
        double side1 = sc.nextDouble();
        System.out.print("Enter the length of side 2 (in meters): ");
        double side2 = sc.nextDouble();
        System.out.print("Enter the length of side 3 (in meters): ");
        double side3 = sc.nextDouble();
        double perimeter = side1 + side2 + side3;
        double totalDistance = 5000;
        double rounds = totalDistance / perimeter;
        System.out.println("The total number of rounds the athlete will run to complete 5 km is " + rounds);
    }
}
