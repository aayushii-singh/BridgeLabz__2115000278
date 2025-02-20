import java.util.*;

public class Reverse {
    public static <T> void reverse(List<T> list) {
        int left = 0, right = list.size() - 1;
        while (left < right) {
            T temp = list.get(left);
            list.set(left, list.get(right));
            list.set(right, temp);
            left++;
            right--;
        }
    }

    public static void main(String[] args) {
        List<Integer> arrlist = new ArrayList<>(Arrays.asList(1, 2, 3, 4, 5));
        reverse(arrlist);
        System.out.println("Reversed ArrayList: " + arrlist);

        List<Integer> llist = new LinkedList<>(Arrays.asList(1, 2, 3, 4, 5));
        reverse(llist);
        System.out.println("Reversed LinkedList: " + llist);
    }
}
