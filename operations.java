import java.util.Scanner;
public class operations {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter  a: ");
        int a = sc.nextInt();
        System.out.print("Enter  b: ");
        int b = sc.nextInt();
        System.out.print("Enter  c: ");
        int c = sc.nextInt();
        int result1 = a + b * c;
        int result2 = a * b + c;
        int result3 = c + a / b;
        System.out.println("The results of Int Operations are " + result1 + ", " + result2 + ", and " + result3);
    }
}
