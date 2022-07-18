#include <iostream>
#include <cmath>
using namespace std;
int main(){
    int t;
    cin >> t;
    while(t--){
        int n;
        cin >> n ;

        int d = log10(n);
        
        cout << (n%10) + (n/(int)pow(10,d)) << "\n";
    }
    return 0;
}