public class LinearSearchNegative {
    public static void main(String[] args) {
        int[] arr = {3, 4, -2, 1, -5, 6};
        int index = -1;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] < 0) {
                index = i;
                break;
            }
        }
        System.out.println(index);
    }
}
