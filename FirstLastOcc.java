public class FirstLastOcc {
    public static void main(String[] args) {
        int[] arr = {1,2,2,2,3,4,5};
        int target = 2;
        int first = -1, last = -1;
        int l = 0, r = arr.length - 1;
        while(l <= r) {
            int mid = (l + r) / 2;
            if(arr[mid] < target) l = mid + 1;
            else if(arr[mid] > target) r = mid - 1;
            else {
                first = mid;
                r = mid - 1;
            }
        }
        l = 0;
        r = arr.length - 1;
        while(l <= r) {
            int mid = (l + r) / 2;
            if(arr[mid] < target) l = mid + 1;
            else if(arr[mid] > target) r = mid - 1;
            else {
                last = mid;
                l = mid + 1;
            }
        }
        System.out.println(first == -1 ? -1 : first + " " + last);
    }
}
