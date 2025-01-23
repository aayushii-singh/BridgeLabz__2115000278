import java.util.Scanner;
public class BMI_W_H {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("weight in kg: ");
        double w = sc.nextDouble();
        System.out.print("height in cm: "); // Corrected the quotes here
        double hCm = sc.nextDouble();
        double hM = hCm / 100;
        double bmi = w / (hM * hM);
        System.out.println("Your BMI is: " + bmi);
        if (bmi < 18.5) {
            System.out.println("You are underweight.");
        } else if (bmi >= 18.5 && bmi < 24.9) {
            System.out.println("You have a normal weight.");
        } else if (bmi >= 25 && bmi < 29.9) {
            System.out.println("You are overweight.");
        } else {
            System.out.println("You are obese.");
        }
    }
}
