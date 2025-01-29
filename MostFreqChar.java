import java.util.Scanner;

public class MostFreqChar {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String str = sc.nextLine();
        int[] freq = new int[256];
        for (char c : str.toCharArray()) freq[c]++;
        char mostFrequent = str.charAt(0);
        for (char c : str.toCharArray()) {
            if (freq[c] > freq[mostFrequent]) mostFrequent = c;
        }
        System.out.println("Most Frequent Character: " + mostFrequent);
  
    }
}
