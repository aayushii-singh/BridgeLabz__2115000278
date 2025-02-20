import java.util.*;

public class BinaryNoQueue {
    public static List<String> generateBinaryNumbers(int N) {
        List<String> result = new ArrayList<>();
        Queue<String> queue = new LinkedList<>();
        queue.add("1");

        for (int i = 0; i < N; i++) {
            String front = queue.poll();
            result.add(front);
            queue.add(front + "0");
            queue.add(front + "1");
        }
        return result;
    }

    public static void main(String[] args) {
        int N = 5;
        System.out.println(generateBinaryNumbers(N));
    }
}
