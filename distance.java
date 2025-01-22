import java.util.Scanner;
public class distance{
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter distance in feet:");
        double disInFeet = sc.nextDouble();
        double disInYards = disInFeet / 3;
        double disInMiles = disInYards / 1760;
        System.out.println("The distance in feet is " + disInFeet + ", in yards is " + disInYards + ", and in miles is " + disInMiles);
    }
}
