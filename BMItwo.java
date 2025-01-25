import java.util.Scanner;
public class BMItwo{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        double[][] pData = new double[n][3];
        String[] status = new String[n];
        for (int i = 0; i < n; i++) {
            pData[i][0] = sc.nextDouble();
            pData[i][1] = sc.nextDouble();
            pData[i][2] = pData[i][1] / (pData[i][0] * pData[i][0]);
            if (pData[i][2] < 18.5) status[i] = "Underweight";
            else if (pData[i][2] < 24.9) status[i] = "Normal";
            else if (pData[i][2] < 29.9) status[i] = "Overweight";
            else status[i] = "Obese";
        }
        for (int i = 0; i < n; i++) {
            System.out.println(pData[i][0] + " " + pData[i][1] + " " + pData[i][2] + " " + status[i]);
        }
    }
}
