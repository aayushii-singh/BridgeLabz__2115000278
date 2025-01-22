import java.util.Scanner;
public class BasicCalc {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter first number:");
        double num1 = sc.nextDouble();
        System.out.println("Enter second number:");
        double num2 = sc.nextDouble();
        System.out.println("The addition, subtraction, multiplication, and division of 2 numbers " + num1 + " and " + num2 +
                           " is " + (num1 + num2) + ", " + (num1 - num2) + ", " + (num1 * num2) + ", and " + (num1 / num2));
    }
}
