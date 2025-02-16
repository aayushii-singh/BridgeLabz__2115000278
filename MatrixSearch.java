public class MatrixSearch {
    public static void main(String[] args) {
        int[][] matrix = {
            {1, 3, 5, 7},
            {10, 11, 16, 20},
            {23, 30, 34, 60}
        };
        int target = 3;
        int rows = matrix.length, cols = matrix[0].length;
        int left = 0, right = rows * cols - 1;
        boolean found = false;
        while (left <= right) {
            int mid = (left + right) / 2;
            int r = mid / cols, c = mid % cols;
            if (matrix[r][c] == target) {
                found = true;
                break;
            } else if (matrix[r][c] < target) {
                left = mid + 1;
            } else {
                right = mid - 1;
            }
        }
        System.out.println(found);
    }
}
