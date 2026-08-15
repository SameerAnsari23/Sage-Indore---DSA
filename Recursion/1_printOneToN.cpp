#include <bits/stdc++.h>
using namespace std;

// Print 1 -> N
void printN(int n) {
    if (n <= 0) return;

    printN(n-1);
    cout << n << ' ';
}

int main() {
    printN(5);
  
    return 0;
}
