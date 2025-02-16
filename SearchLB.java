import java.util.Arrays;
public class SearchLB {
    public static void main(String[] args) {
        int[] arr = {3,4,-1,1};
        int n = arr.length;
        boolean[] mark = new boolean[n+1];
        for (int i = 0; i < n; i++) {
            if (arr[i] > 0 && arr[i] <= n)
                mark[arr[i]] = true;
        }
        int missing = n + 1;
        for (int i = 1; i <= n; i++) {
            if (!mark[i]) { missing = i; break; }
        }
        System.out.println(missing);
        
        int target = 4;
        int[] sorted = arr.clone();
        Arrays.sort(sorted);
        int left = 0, right = sorted.length - 1, idx = -1;
        while (left <= right) {
            int mid = (left + right) / 2;
            if (sorted[mid] == target) { idx = mid; break; }
            if (sorted[mid] < target)
                left = mid + 1;
            else
                right = mid - 1;
        }
        System.out.println(idx);
    }
}
