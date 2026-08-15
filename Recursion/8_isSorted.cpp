#include <bits/stdc++.h>
using namespace std;

// Check if an array is sorted 
bool isSorted(int arr[], int i, int n) {
    if (i > n) return true;

    if (arr[i] < arr[i-1]) return false;
    return isSorted(arr, i+1, n);
}

int main() {
    int arr[] = {1, 2, 3, 4, 5, 5};
    int n = sizeof(arr)/sizeof(arr[0]);
    cout << isSorted(arr, 1, n-1);

    return 0;
}
