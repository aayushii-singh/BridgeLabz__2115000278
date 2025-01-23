import java.util.Scanner;
class Factorial {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        if (n >= 0) {
            int factorial = 1, i = 1;
            while (i <= n) {
                factorial *= i;
                i++;
            }
            System.out.println("Factorial: " + factorial);
        } else {
            System.out.println("Invalid input");
        }
    }
}
