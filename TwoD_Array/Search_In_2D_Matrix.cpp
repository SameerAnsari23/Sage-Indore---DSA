class Solution {
    public boolean binarySearch(int[] nums, int target) {
        int low = 0;
        int high = nums.length - 1;

        while (low <= high) {

            int mid = (low + high) / 2;

            if (nums[mid] == target)
                return true;

            else if (target > nums[mid])
                low = mid + 1;

            else
                high = mid - 1;
        }

        return false;
    }



    public boolean searchMatrix(int[][] matrix, int target) {
        int n = matrix.length;
        int m = matrix[0].length;

        // -------- Brute Force --------
        for (int row = 0; row < n; row++) {
            for (int col = 0; col < m; col++) {

                if (matrix[row][col] == target) {
                    return true;
                }
            }
        }


        // -------- Better Approach --------
        for (int i = 0; i < n; i++) {

            if (matrix[i][0] <= target && target <= matrix[i][m - 1]) {
                return binarySearch(matrix[i], target);
            }
        }


        // -------- Optimal Approach --------
        int s = 0;
        int e = n * m - 1;
        while (s <= e) {
            int mid = s + (e - s) / 2;

            int row = mid / m;
            int col = mid % m;

            if (matrix[row][col] == target)
                return true;

            else if (matrix[row][col] < target)
                s = mid + 1;

            else
                e = mid - 1;
        }

        return false;
    }
}
