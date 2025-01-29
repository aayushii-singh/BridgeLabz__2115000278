import java.util.Random;
import java.util.Scanner;

public class GuessGame {
    public static int generateGuess() {
        Random rand = new Random();
        return rand.nextInt(100) + 1;
    }

    public static String getFeedback(int guess, int target) {
        if (guess < target) return "low";
        if (guess > target) return "high";
        return "correct";
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int target = sc.nextInt();
        String feedback;
        int guess;
        do {
            guess = generateGuess();
            feedback = getFeedback(guess, target);
            System.out.println("Guess: " + guess + " Feedback: " + feedback);
        } while (!feedback.equals("correct"));
    }
}
