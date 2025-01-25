import java.util.Scanner;
public class BMIone {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        double[] h = new double[n], w = new double[n], bmi = new double[n];
        String[] status = new String[n];
        for (int i = 0; i < n; i++) {
            h[i] = sc.nextDouble();
            w[i] = sc.nextDouble();
            bmi[i] = w[i] / (h[i] * h[i]);
            if (bmi[i] < 18.5) status[i] = "Underweight";
            else if (bmi[i] < 24.9) status[i] = "Normal";
            else if (bmi[i] < 29.9) status[i] = "Overweight";
            else status[i] = "Obese";
        }
        for (int i = 0; i < n; i++) {
            System.out.println(h[i] + " " + w[i] + " " + bmi[i] + " " + status[i]);
        }
    }
}
