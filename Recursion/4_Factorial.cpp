#include <bits/stdc++.h>
using namespace std;

// Factorial 
int fact(int n) {
    if (n <= 1) return 1;

    return n * fact(n-1); 
} 

int main() {
    cout << fact(30);
  
    return 0;
}
