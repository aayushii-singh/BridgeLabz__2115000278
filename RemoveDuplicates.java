import java.util.HashSet;

public class RemoveDuplicates {
    public static void main(String[] args) {
        String input = "hello";
        HashSet<Character> set = new HashSet<>();
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < input.length(); i++) {
            char ch = input.charAt(i);
            if (!set.contains(ch)) {
                set.add(ch);
                sb.append(ch);
            }
        }
        System.out.println(sb.toString());
    }
}
