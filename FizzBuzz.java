import java.util.Scanner;
public class FizzBuzz {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        String[] r = new String[n + 1];
        for (int i = 0; i <= n; i++) {
            if (i % 3 == 0 && i % 5 == 0) r[i] = "FizzBuzz";
            else if (i % 3 == 0) r[i] = "Fizz";
            else if (i % 5 == 0) r[i] = "Buzz";
            else r[i] = String.valueOf(i);
        }
        for (int i = 0; i <= n; i++)
            System.out.println("Pos " + i + " = " + r[i]);
    }
}
