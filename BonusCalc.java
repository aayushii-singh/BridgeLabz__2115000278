import java.util.Scanner;
public class BonusCalc {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double[] s = new double[10], y = new double[10], b = new double[10], ns = new double[10];
        double tb = 0, tos = 0, tns = 0;
        for (int i = 0; i < 10; i++) {
            s[i] = sc.nextDouble();
            y[i] = sc.nextDouble();
            b[i] = (y[i] > 5) ? s[i] * 0.05 : s[i] * 0.02;
            ns[i] = s[i] + b[i];
            tb += b[i];
            tos += s[i];
            tns += ns[i];
        }

        System.out.println("Total Bonus: " + tb);
        System.out.println("Total Old Salary: " + tos);
        System.out.println("Total New Salary: " + tns);
    }
}
