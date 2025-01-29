import java.util.Scanner;

public class RemoveDuplicates {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String str = sc.nextLine();
        StringBuilder unique = new StringBuilder();
        for (char c : str.toCharArray()) {
            if (unique.indexOf(String.valueOf(c)) == -1) unique.append(c);
        }
        System.out.println("Modified String: " + unique);
       
    }
}
