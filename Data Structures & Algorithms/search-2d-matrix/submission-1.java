class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {
        int ROWS = matrix.length;
        int COLUMS = matrix[0].length;

        int l = 0;
        int r = ROWS * COLUMS - 1;
        while (l <= r) {
            int mid = l + (r - l) / 2;
            int row = mid / COLUMS;
            int col = mid % COLUMS;
            if (matrix[row][col] == target) {
                return true;
            } else if (matrix[row][col] < target) {
                l = mid + 1;
            } else {
                r = mid - 1;
            }
        }
        return false;
    }
}
