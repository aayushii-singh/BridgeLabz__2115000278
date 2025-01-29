import java.util.Scanner;

public class CompareStrg {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter first string: ");
        String str1 = sc.nextLine();
        System.out.print("Enter second string: ");
        String str2 = sc.nextLine();
        System.out.println(str1.compareTo(str2) < 0 ? str1 + " comes before " + str2 :
                str1.compareTo(str2) > 0 ? str1 + " comes after " + str2 :
                        "Both strings are equal");
     
    }
}
