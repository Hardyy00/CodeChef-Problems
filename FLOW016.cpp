#include <iostream>
using namespace std;
int main(){
    int t;
    cin >> t;
    while(t--){
        
        long long a,b;
        cin >> a >> b;
        
        long long lcm,gcd;
        long long i,j;
        a> b ? i=a : i=b;
        j = a+b-i;
        while(i%j){
            long long a = i;
            i=j;
            j=(a%j);
        }
        gcd = j; 
        lcm = (a*b)/gcd;
        cout << gcd << " " <<lcm << endl;
        
    }
    
    return 0;
}