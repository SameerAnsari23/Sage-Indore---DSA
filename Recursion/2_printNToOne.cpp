#include <bits/stdc++.h>
using namespace std;

//Print N -> 1
void Nprint(int n) {
    if (n <= 0) return;

    cout << n << ' ';
    Nprint(n-1);
}

int main() {
    Nprint(5);
  
    return 0;
}
