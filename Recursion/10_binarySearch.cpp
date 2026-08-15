#include <bits/stdc++.h>
using namespace std;

// Binary Search using recursion
bool binarySearch(int arr[], int s, int e, int tar) {
    if (s >= e) return false;

    int mid = s + (e-s)/2;

    if (arr[mid] == tar) return true;
    else if (arr[mid] > tar) return binarySearch(arr, s, mid-1, tar);
    else return binarySearch(arr, mid + 1, e, tar);
}

int main() {
    int arr[] = {1, 2, 3, 4, 5, 5};
    int n = sizeof(arr)/sizeof(arr[0]);
    cout << binarySearch(arr, 0, n-1, 5);

    return 0;
}
