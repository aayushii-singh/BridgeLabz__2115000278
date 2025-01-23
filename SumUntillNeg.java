import java.util.Scanner;
class SumUntilNeg {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double total = 0.0;
        while (true) {
            double value = input.nextDouble();
            if (value <= 0) break;
            total += value;
        }
        System.out.println("Total sum: " + total);

    }
}
