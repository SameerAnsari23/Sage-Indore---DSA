#include <bits/stdc++.h>
using namespace std;

void Subsequence(string s, int i, string ans) {
    if (i >= s.length()) {
        cout << ans << ' ';
        return;
    }

    // Using recursion
    // Subsequence(s, i+1, ans + s[i]);   // Choice 1: Include the current character
    // Subsequence(s, i+1, ans);          // Choice 2: Exclude the current character


    // using backtracking
    ans += s[i];
    Subsequence(s, i+1, ans);
    ans.pop_back();
    Subsequence(s, i+1, ans);
}


int main() {
    string s = "abc";
    string ans = "";
    Subsequence(s, 0, ans);


    // We can also try Leetcode - 78 (Subsets)
    return 0;
}
