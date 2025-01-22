import java.util.Scanner;
public class handshake {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("No of students:");
        int no_OfStudents = sc.nextInt();
        int handshakes = (no_OfStudents * (no_OfStudents- 1)) / 2;
        System.out.println("Displaying Result:\nThe maximum number of handshakes among " + no_OfStudents + " students is " + handshakes);
    }
}
