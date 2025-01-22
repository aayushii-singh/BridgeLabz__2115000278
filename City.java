import java.util.Scanner;
public class City {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter your name: ");
        String name = sc.nextLine();
        System.out.print("Enter the city you are traveling from: ");
        String fromCity = sc.nextLine();
        System.out.print("Enter the city you are traveling via: ");
        String viaCity = sc.nextLine();
        System.out.print("Enter your final destination city: ");
        String toCity = sc.nextLine();
        System.out.print("Enter the distance from " + fromCity + " to " + viaCity + " (in miles): ");
        double fromToVia = sc.nextDouble();
        System.out.print("Enter the distance from " + viaCity + " to " + toCity + " (in miles): ");
        double viaToFinalCity = sc.nextDouble();
        System.out.print("Enter the time taken for the journey (in hours): ");
        double timeTaken = sc.nextDouble();
        double totalDistance = fromToVia + viaToFinalCity;
        System.out.println("The total travel details for " + name + ":");
        System.out.println("From: " + fromCity + " to: " + viaCity + " to: " + toCity);
        System.out.println("The total distance covered is " + totalDistance + " miles.");
        System.out.println("The total time taken is " + timeTaken + " hours.");
    }
}
