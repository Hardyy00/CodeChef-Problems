#include <iostream>
using namespace std;
int main(){
    int t;
    cin >> t;
    
    while(t--){
        int a,b,c;
        
        cin >> a >> b >> c;
        
        string s = a+b+c == 180 ? "YES" : "NO";
        
        cout << s << endl;
    }
}