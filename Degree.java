import java.util.Scanner;
public class Degree {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter temp in Celsius: ");
        double c = sc.nextDouble();
        double f = (c * 9 / 5) + 32;
        System.out.println("The " + c + " Celsius is " + f + " Fahrenheit.");
    }
}
