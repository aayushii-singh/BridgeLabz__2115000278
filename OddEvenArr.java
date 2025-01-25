import java.util.Scanner;
public class OddEvenArr {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        if (n <= 0) {
            System.out.println("Invalid number");
            return;
        }
        int[] o = new int[n / 2 + 1], e = new int[n / 2 + 1];
        int oi = 0, ei = 0;
        for (int i = 1; i <= n; i++) {
            if (i % 2 == 0) e[ei++] = i;
            else o[oi++] = i;
        }
        System.out.println("Odd: ");
        for (int i = 0; i < oi; i++) System.out.print(o[i] + " ");
        System.out.println("\nEven: ");
        for (int i = 0; i < ei; i++) System.out.print(e[i] + " ");
    }
}
