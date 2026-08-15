#include <bits/stdc++.h>
using namespace std;

// Find maximum element
int maxEle(int arr[], int i, int n, int maxi) {
    if (i > n) return maxi;

    maxi = max(maxi, arr[i]);
    return maxEle(arr, i+1, n, maxi);
}

int main() {
    int arr[] = {1, 2, 13, 4, 5, 5};
    int n = sizeof(arr)/sizeof(arr[0]);
    cout << maxEle(arr, 0, n-1, INT_MIN);

    return 0;
}
