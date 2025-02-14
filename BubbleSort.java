import java.util.*;
public class BubbleSort {
    public static void main(String[] args) {
        int[] arr = {49,50,34,41,39,25,36,22,18,15};
        int n = arr.length;
        for (int i = 0; i < n - 1; i++) {
            boolean swapped=false;
            for (int j = 0; j < n - i - 1; j++) {
                if (arr[j] > arr[j + 1]) {
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                    swapped=true;
                }
            }
            if(!swapped)break;
        }
        System.out.println("Student marks sorted ");
        for(int i=0;i<n;i++){
            System.out.print(arr[i] + " ");
        }
    }
}

