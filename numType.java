import java.util.Scanner;
class numType {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        System.out.println(n > 0 ? "Positive" : n < 0 ? "Negative" : "Zero");
    }
}