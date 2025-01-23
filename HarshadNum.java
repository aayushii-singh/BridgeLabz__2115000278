
import java.util.Scanner;
public class HarshadNum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int num = sc.nextInt();
        int sum = 0;
        int orgNum = num;
        while (num != 0) {
            sum += num % 10;
            num /= 10;
        }
        if (orgNum % sum == 0) {
            System.out.println(orgNum+ " is a Harshad Number.");
        } else {
            System.out.println(orgNum + " is not a Harshad Number.");
        }
    }
}

