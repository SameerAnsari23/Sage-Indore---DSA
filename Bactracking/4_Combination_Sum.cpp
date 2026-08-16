class Solution {
public:
    void solve(vector<int>& candidates, int idx, int tar, vector<int>& op, vector<vector<int>>& ans) {
        // Success case: target is met
        if (tar == 0) {
            ans.push_back(op);
            return; 
        }

        // Failure case: out of bounds
        if (idx == candidates.size()) {
            return;
        }

        
        if (candidates[idx] <= tar) {
            op.push_back(candidates[idx]);
            solve(candidates, idx, tar-candidates[idx], op, ans);
            op.pop_back();
        }

        // if current idx value is greater than tar then move on to next idx
        solve(candidates, idx+1, tar, op, ans);
    }
    vector<vector<int>> combinationSum(vector<int>& candidates, int target) {
        vector<vector<int>>ans;
        vector<int>op;
        solve(candidates, 0, target, op, ans);
        return ans;
    }
};
