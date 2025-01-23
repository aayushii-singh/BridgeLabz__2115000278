import java.util.Scanner;
public class ArmstrongNum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int n = sc.nextInt();
        int sum = 0;
        int orgN = n;
        while (orgN != 0) {
            int digit = orgN % 10;
            sum += digit * digit * digit;
            orgN /= 10;
        }
        if (n == sum) {
            System.out.println(n+ " is an Armstrong number.");
        } else {
            System.out.println(n+ " is not an Armstrong number.");
        }
       
    }
}
