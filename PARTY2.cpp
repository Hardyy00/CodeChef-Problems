#include <iostream>
using namespace std;
int main(){
    int t;
    cin >> t;
    while(t--){
        int n,x,k;
        
        cin >> n >> x >> k;
        
        string s = k>=(n*x) ? "YES" : "NO";
        
        cout << s << "\n";
    }
    
    return 0;
}