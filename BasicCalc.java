import java.util.Scanner;

public class BasicCalc {
    public static double add(double a, double b) {
        return a + b;
    }

    public static double subtract(double a, double b) {
        return a - b;
    }

    public static double multiply(double a, double b) {
        return a * b;
    }

    public static double divide(double a, double b) {
        return a / b;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double num1, num2;
        char operator;

        System.out.println("Enter first number: ");
        num1 = sc.nextDouble();
        System.out.println("Enter second number: ");
        num2 = sc.nextDouble();

        System.out.println("Enter operator (+, -, *, /): ");
        operator = sc.next().charAt(0);

        if (operator == '+') {
            System.out.println(add(num1, num2));
        } else if (operator == '-') {
            System.out.println(subtract(num1, num2));
        } else if (operator == '*') {
            System.out.println(multiply(num1, num2));
        } else if (operator == '/') {
            System.out.println(divide(num1, num2));
        }
    }
}
