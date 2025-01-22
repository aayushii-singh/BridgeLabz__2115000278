import java.util.Scanner;
public class convert {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter height in cm:");
        double heightCm = sc.nextDouble();
        double heightInches = heightCm / 2.54;
        int feet = (int) (heightInches / 12);
        double inches = heightInches % 12;
        System.out.println("Your Height in cm is " + heightCm + " while in feet is " + feet + " and inches is " + inches);
    }
}
