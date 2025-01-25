import java.util.Scanner;
public class ReverseNum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] d = new int[10];
        int idx = 0;

        while (n > 0) {
            d[idx++] = n % 10;
            n /= 10;
        }
        for (int i = idx - 1; i >= 0; i--) {
            System.out.print(d[i] + " ");
        }
    }
}
