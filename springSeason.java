import java.util.Scanner;
class SpringSeason {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int month = sc.nextInt();
        int day = sc.nextInt();
        System.out.println((month == 3 && day >= 20) || (month > 3 && month < 6) || (month == 6 && day <= 20) ? "It's a Spring Season" : "Not a Spring Season");

    }
}
