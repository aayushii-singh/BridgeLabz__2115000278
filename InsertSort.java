class Code {
    public static void InsertionSort(int[] arr) {
        for (int i = 1; i < arr.length; i++) {
            int key = arr[i];
            int j = i - 1;
            while (j >= 0 && arr[j] > key) {
                arr[j + 1] = arr[j];
                j--;
            }
            arr[j + 1] = key;
        }
    }
}

public class InsertSort {
    public static void main(String[] args) {
        int[] arr = {102, 305, 204, 501, 403};
        Code.InsertionSort(arr);
        for (int num : arr) {
            System.out.print(num + " ");
        }
    }
}
