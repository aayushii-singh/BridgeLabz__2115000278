import java.util.Scanner;
public class Factors {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int mf = 10;
        int[] f = new int[mf];
        int fi = 0;
        for (int i = 1; i <= n; i++) {
            if (n % i == 0) {
                if (fi == mf) {
                    mf *= 2;
                    int[] t = new int[mf];
                    System.arraycopy(f, 0, t, 0, f.length);
                    f = t;
                }
                f[fi++] = i;
            }
        }
    }
}