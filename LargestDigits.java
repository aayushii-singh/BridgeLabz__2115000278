import java.util.Scanner;
public class LargestDigits {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] d = new int[10];
        int idx = 0, l = 0, sl = 0;
        while (n > 0) {
            d[idx++] = n % 10;
            n /= 10;
        }
        for (int i = 0; i < idx; i++) {
            if (d[i] > l) {
                sl = l;
                l = d[i];
            } else if (d[i] > sl) {
                sl = d[i];
            }
        }

        System.out.println("Largest: " + l);
        System.out.println("Second Largest: " + sl);
    }
}
