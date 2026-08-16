class Solution {
public:
    void solve(string digits, string op, string mp[], int idx, vector<string>& ans) {
        if (idx >= digits.length()) {
            ans.push_back(op);
            return;
        }

        int val = digits[idx] - '0';
        string s = mp[val];
        for (int i = 0; i < s.length(); i++) {
            op.push_back(s[i]);
            solve(digits, op, mp, idx+1, ans);
            op.pop_back();
        }
    }

    vector<string> letterCombinations(string digits) {
        vector<string> ans;
        string op;
        if(digits.length() == 0) return ans;
        string mp[10] = {"", "", "abc", "def", "ghi", "jkl", "mno", "pqrs", "tuv", "wxyz"};
        solve(digits, op, mp, 0, ans);
        return ans;
    }
};
