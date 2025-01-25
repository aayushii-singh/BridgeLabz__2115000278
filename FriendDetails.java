import java.util.Scanner;
public class FriendDetails {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] a = new int[3], h = new int[3];
        int minA = Integer.MAX_VALUE, maxH = 0;

        for (int i = 0; i < 3; i++) {
            a[i] = sc.nextInt();
            h[i] = sc.nextInt();
            if (a[i] < minA) minA = a[i];
            if (h[i] > maxH) maxH = h[i];
        }

        System.out.println("Youngest Age: " + minA);
        System.out.println("Tallest Height: " + maxH);
    }
}
