import java.util.Scanner;
public class TwoD_OneD {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int r = s.nextInt(), c = s.nextInt();
        int[][] m = new int[r][c];
        for (int i = 0; i < r; i++)
            for (int j = 0; j < c; j++)
                m[i][j] = s.nextInt();
        int[] a = new int[r * c];
        int idx = 0;
        for (int i = 0; i < r; i++)
            for (int j = 0; j < c; j++)
                a[idx++] = m[i][j];
        for (int x : a) System.out.print(x + " ");
    }
}
