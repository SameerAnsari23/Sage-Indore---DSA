#include <bits/stdc++.h>
using namespace std;

// Check palindrome using recursion 
bool palindrome(int arr[], int i, int j) {
    if (i >= j) return true;

    if (arr[i] != arr[j]) return false;
    return palindrome(arr, i+1, j-1);
}

int main() {
    int arr[] = {1, 2, 3, 4, 5, 5};
    int n = sizeof(arr)/sizeof(arr[0]);
    cout << palindrome(arr, 0, n-1);

    return 0;
}
