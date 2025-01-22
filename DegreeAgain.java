import java.util.Scanner;
public class DegreeAgain {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter temp in Fahrenheit: ");
        double f = sc.nextDouble();
        double c = (f - 32) * 5 / 9;
        System.out.println("The " + f + " Fahrenheit is " + c + " Celsius.");
    }
}
