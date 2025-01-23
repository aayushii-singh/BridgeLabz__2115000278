import java.util.Scanner;

public class YoungestFrnds {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Age of Amar: ");
        int ageAmar = sc.nextInt();

        System.out.print("Height of Amar (in cm): ");
        int heightAmar = sc.nextInt();

        System.out.print("Age of Akbar: ");
        int ageAkbar = sc.nextInt();

        System.out.print("Height of Akbar (in cm): ");
        int heightAkbar = sc.nextInt();

        System.out.print("Age of Anthony: ");
        int ageAnthony = sc.nextInt();

        System.out.print("Height of Anthony (in cm): ");
        int heightAnthony = sc.nextInt();

        int youngestAge = Math.min(ageAmar, Math.min(ageAkbar, ageAnthony));
        String youngestFriend = "";

        if (youngestAge == ageAmar) {
            youngestFriend = "Amar";
        } else if (youngestAge == ageAkbar) {
            youngestFriend = "Akbar";
        } else {
            youngestFriend = "Anthony";
        }

        int tallestHeight = Math.max(heightAmar, Math.max(heightAkbar, heightAnthony));
        String tallestFriend = "";

        if (tallestHeight == heightAmar) {
            tallestFriend = "Amar";
        } else if (tallestHeight == heightAkbar) {
            tallestFriend = "Akbar";
        } else {
            tallestFriend = "Anthony";
        }

        System.out.println("The youngest friend is: " + youngestFriend);
        System.out.println("The tallest friend is: " + tallestFriend);
    }
}
