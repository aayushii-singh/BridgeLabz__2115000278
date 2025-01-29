import java.util.Scanner;
public class ReverseString{
 public static void main(String[] args) {
        String reversed = "";
        Scanner sc= new Scanner(System.in);
        System.out.println("enter string");
        String str= sc.nextLine();
        for (int i = str.length() - 1; i >= 0; i--) {
            reversed += str.charAt(i);
        }
         System.out.println("reversed string is");
        System.out.print(reversed);
    }
}

