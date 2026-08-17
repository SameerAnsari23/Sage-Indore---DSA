// you will learn how to avoid duplicate answers. 
class Solution {
public:

    void solve(vector<int>& nums, int idx, vector<vector<int>>& ans) {
        if (idx >= nums.size()) {
            ans.push_back(nums);
            return;
        }

        unordered_set<int>st;
        for (int i = idx; i < nums.size(); i++) {
            if (st.count(nums[i])) continue;
            st.insert(nums[i]);
            
            swap(nums[idx], nums[i]);
            solve(nums, idx+1, ans);
            swap(nums[i], nums[idx]);
        }
    }
    vector<vector<int>> permuteUnique(vector<int>& nums) {
        vector<vector<int>>ans;
        solve(nums, 0, ans);
        return ans;
    }
};
