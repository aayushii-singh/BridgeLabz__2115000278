import java.util.Scanner;

public class TempConverter {
    public static double fahrenheitToCelsius(double fahrenheit) {
        return (fahrenheit - 32) * 5 / 9;
    }

    public static double celsiusToFahrenheit(double celsius) {
        return (celsius * 9 / 5) + 32;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double temp;
        char choice;

        System.out.println("Enter temperature value: ");
        temp = sc.nextDouble();

        System.out.println("Convert to (C)elsius or (F)ahrenheit? ");
        choice = sc.next().charAt(0);

        if (choice == 'C' || choice == 'c') {
            System.out.println(fahrenheitToCelsius(temp) + " Celsius");
        } else if (choice == 'F' || choice == 'f') {
            System.out.println(celsiusToFahrenheit(temp) + " Fahrenheit");
        }
    }
}
