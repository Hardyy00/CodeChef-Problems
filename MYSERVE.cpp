#include <iostream>
using namespace std;
int main(){
    int t;
    cin >> t;
    while(t--){
        int p,q;
        cin >> p >> q;
        
        int num = (p+q)%4;
        
        string answer = (num == 0 || num == 1) ? "Alice" : "Bob";
        
        cout << answer << endl;
    }
    
    return 0;
}