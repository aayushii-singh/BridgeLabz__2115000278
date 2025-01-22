import java.util.Scanner;
public class Chocolate {  
  public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int no_OfChocolates = sc.nextInt();
        int no_OfChildren = sc.nextInt();
        int chocolatesPerChild = no_OfChocolates  / no_OfChildren;
        int remainingChocolates =no_OfChocolates  % no_OfChildren;
        System.out.println("The number of chocolates each child gets is " + chocolatesPerChild + " and the number of remaining chocolates are " + remainingChocolates);
    }
}
