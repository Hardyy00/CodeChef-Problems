#include <iostream>
using namespace std;
int main(){
    int t;
    cin >> t;
    while(t--){
        int x;
        cin >> x;
        
        string s= x<=30 ? "NO" : "YES";
        
        cout << s << "\n";
    }
    
    return 0;
}