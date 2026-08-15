#include <bits/stdc++.h>
using namespace std;

// Sum of first N natural number 
int sum(int n, int s) {
    if (n <= 0) return s;

    s = s + n;
    return sum(n-1, s);
}

int main() {
    cout << sum(3, 0);
    
    return 0;
}
