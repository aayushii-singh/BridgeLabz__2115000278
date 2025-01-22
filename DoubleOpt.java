import java.util.Scanner;
public class DoubleOpt {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter  a: ");
        double a = sc.nextDouble();
        System.out.print("Enter  b: ");
        double b = sc.nextDouble();
        System.out.print("Enter  c: ");
        double c = sc.nextDouble();
        double r1 = a + b * c;
        double r2 = a * b + c;
        double r3 = c + a / b;
        System.out.println("The results of Double Operations are " + r1 + ", " + r2 + ", and " + r3);
    }
}
