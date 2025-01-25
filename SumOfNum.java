import java.util.Scanner;
public class SumOfNum {
    public static void main(String[] args) {
        double[] a = new double[10];
        double sum = 0;
        Scanner s = new Scanner(System.in);
        int i = 0;
        while (i < 10) {
            double x = s.nextDouble();
            if (x <= 0) break;
            a[i++] = x;
        }
        for (int j = 0; j < i; j++) sum += a[j];
        System.out.println("Sum = " + sum);
    }
}
