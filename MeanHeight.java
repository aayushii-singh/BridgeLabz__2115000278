import java.util.Scanner;
public class MeanHeight {
    public static void main(String[] args) {
        double[] h = new double[11];
        double sum = 0;
        Scanner s = new Scanner(System.in);
        for (int i = 0; i < 11; i++) {
            h[i] = s.nextDouble();
            sum += h[i];
        }
        System.out.println("Mean = " + (sum / 11));
    }
}
