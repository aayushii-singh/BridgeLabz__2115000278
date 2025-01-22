import java.util.Scanner;
public class Income {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.print("Enter salary: ");
        double salary = sc.nextDouble();
        System.out.print("Enter bonus: ");
        double bonus = sc.nextDouble();
        double tIncome = salary + bonus;
        System.out.println("The salary is INR " + salary + " and bonus is INR " + bonus + ". Hence Total Income is INR " + tIncome);
    }
}

