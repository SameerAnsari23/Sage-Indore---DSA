class Solution {
    public List<Integer> spiralOrder(int[][] matrix) {

        int sr = 0, er = matrix.length - 1;
        int sc = 0, ec = matrix[0].length - 1;

        List<Integer> arr = new ArrayList<>();

        while (sr <= er && sc <= ec) {

            // top row
            for (int col = sc; col <= ec; col++) {
                arr.add(matrix[sr][col]);
            }
            sr++;

            // right column
            for (int row = sr; row <= er; row++) {
                arr.add(matrix[row][ec]);
            }
            ec--;

            // bottom row
            if (sr <= er) {
                for (int col = ec; col >= sc; col--) {
                    arr.add(matrix[er][col]);
                }
                er--;
            }

            // left column
            if (sc <= ec) {
                for (int row = er; row >= sr; row--) {
                    arr.add(matrix[row][sc]);
                }
                sc++;
            }
        }

        return arr;
    }
}
