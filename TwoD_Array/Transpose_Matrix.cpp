class Solution {
public:
    vector<vector<int>> transpose(vector<vector<int>>& matrix) {
        int m = matrix.size();
        int n = matrix[0].size();
      
        vector<vector<int>> res(n, vector<int>(m));
        for (int row = 0; row < m; row++) {
            for (int col = 0; col < n; col++) {
                res[col][row] = matrix[row][col];
            }
        }
        return res;
    }
};
