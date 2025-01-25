import java.util.Scanner;
public class MulTables {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] t = new int[4];
        for (int i = 0; i < t.length; i++) {
            t[i] = n * (i + 6);
        }
        for (int i = 0; i < t.length; i++) {
            System.out.println(n + " * " + (i + 6) + " = " + t[i]);
        }
    }
}
