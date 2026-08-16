// This teaches, how to carry state through recursion.

#include <bits/stdc++.h>
using namespace std;

void Subset(const vector<int>& s, int i, vector<int>& ans, int sum, vector<int>& op) {
    // Base Case: If we have considered all elements
    if (i >= s.size()) {
        ans.push_back(sum);
        return;
    }

    int ele = s[i];

    // Choice 1: Include the current element
    sum += ele;
    op.push_back(ele);
    Subset(s, i + 1, ans, sum, op);

    // Backtracking Step: Undo the inclusion
    op.pop_back(); 
    sum -= ele;

    // Choice 2: Exclude the current element
    Subset(s, i + 1, ans, sum, op);
}

int main() {
    vector<int> s = {2, 3}; // Example input array
    vector<int> ans;       // Will store all subset sums
    vector<int> op;        // Tracks current subset path
    
    // Start recursion from index 0 with initial sum 0
    Subset(s, 0, ans, 0, op);

    // Print the results
    cout << "Subset sums are: ";
    for (int x : ans) {
        cout << x << " ";
    }
    cout << endl;

    return 0;
}
