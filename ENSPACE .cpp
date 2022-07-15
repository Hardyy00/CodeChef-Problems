#include <iostream>
using namespace std;
int main(){
    int t;
    cin >> t;
    while(t--){
        int n,x,y;
        cin >> n >> x >> y;
        
        string answer = (x+2*y) <= n ? "YES" : "NO";
        
        cout << answer << endl;
        
        
    }
    
    return 0;
}