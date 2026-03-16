class Solution {
    public void rotate(int[][] matrix) {
        int m = matrix.length;
        int n = matrix[0].length;

        for (int row = 0; row < m; row++) {
            for (int col = 0; col < row; col++) {
                int temp = matrix[row][col];
                matrix[row][col] = matrix[col][row];
                matrix[col][row] = temp;
                // swap(matrix[row][col], matrix[col][row]);
            }
        }
  
        for (int row = 0; row < n; row++) {

            int left = 0;
            int right = n - 1;

            while (left < right) {
                int temp = matrix[row][left];
                matrix[row][left] = matrix[row][right];
                matrix[row][right] = temp;

                left++;
                right--;
            }
        }

    }
}
