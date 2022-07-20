#include <iostream>
using namespace std;
int main(){
    int t;
    cin >> t;
    while(t--){
        int x,y;
        cin >> x >> y;
        
        string s = y>=x && y<=(200+x) ? "YES" : "NO";
        
        cout << s <<"\n";
    }
    
    return 0;
}