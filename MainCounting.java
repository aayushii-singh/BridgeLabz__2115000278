class Code {
    public static void countingSort(int[] arr) {
        int max = 18, min = 10, range = max - min + 1;
        int[] count = new int[range];

        for (int num : arr) {
            count[num - min]++;
        }

        int index = 0;
        for (int i = 0; i < range; i++) {
            while (count[i] > 0) {
                arr[index++] = i + min;
                count[i]--;
            }
        }
    }
}

public class MainCounting {
    public static void main(String[] args) {
        int[] ages = {12, 15, 11, 18, 14, 10, 16};
        Code.countingSort(ages);

        for (int age : ages) {
            System.out.print(age + " ");
        }
    }
}
