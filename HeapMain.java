class Code {
    public static void heapSort(int[] arr) {
        int n = arr.length;
        for (int i = n / 2 - 1; i >= 0; i--)
            heapify(arr, n, i);
        for (int i = n - 1; i > 0; i--) {
            swap(arr, 0, i);
            heapify(arr, i, 0);
        }
    }
    private static void heapify(int[] arr, int n, int i) {
        while (true) {
            int left = 2 * i + 1, right = 2 * i + 2, largest = i;
            if (left < n && arr[left] > arr[largest]) largest = left;
            if (right < n && arr[right] > arr[largest]) largest = right;
            if (largest == i) break;
            swap(arr, i, largest);
            i = largest;
        }
    }

    private static void swap(int[] arr, int i, int j) {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }
}
public class HeapMain {
    public static void main(String[] args) {
        int[] salaries = {50000, 70000, 60000, 80000, 55000};
        Code.heapSort(salaries);
        for (int salary : salaries)
            System.out.print(salary + " ");
    }
}
