class Solution {
public:
    void solve(vector<int>& candidates, int idx, int tar, vector<int>& op, vector<vector<int>>& ans) {
        if (tar == 0) {
            ans.push_back(op);
            return;
        }

        if (idx == candidates.size()) return;

        for (int i = idx; i < candidates.size(); i++) {
            if (i > idx && candidates[i] == candidates[i-1]) continue;
            if (candidates[i] > tar) break;

            op.push_back(candidates[i]);
            solve(candidates, i+1, tar-candidates[i], op, ans);
            op.pop_back();
        }

    }

    vector<vector<int>> combinationSum2(vector<int>& candidates, int target) {
        vector<vector<int>>ans;
        vector<int>op;
        sort(candidates.begin(), candidates.end());
        solve(candidates, 0, target, op, ans);

        return ans;
    }
};
