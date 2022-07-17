#include <iostream>
using namespace std;
int main(){
    int t;
    cin >> t;
    while(t--){
        int x,y;
        cin >> x >> y;
        int answer = (y-x) % 8 ==0 ? (y-x)/8 : ((y-x)/8) + 1 ;
        
        cout << answer << endl;
    }
    
    return 0;
}