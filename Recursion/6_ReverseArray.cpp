#include <bits/stdc++.h>
using namespace std;

// Reverse an array using recursion
void rev(int arr[], int i, int j) {
    if (i >= j) return;
    swap(arr[i], arr[j]);
    rev(arr, i+1, j-1);
}

int main() {
    int arr[] = {1, 2, 3, 4, 5, 6};
    int n = sizeof(arr)/sizeof(arr[0]);
    // cout << n;
    rev(arr, 0, n-1);
    for (int i = 0; i < n; i++) {
        cout << arr[i] << " ";
    }

    return 0;
}
