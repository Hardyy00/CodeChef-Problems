#include <iostream>
using namespace std;
int main(){
    int t;
    cin >> t;
    
    while(t--){
        int x,y;
        cin >> x >> y;
        
        int way1 = 1500 - (2*x) - (4*(x+y));
        int way2 = 1500 - (4*y) - (2*(x+y));
       
        if(way1 > way2){
            cout << way1 << endl;
        }else{
            cout << way2 << endl;
        }
    }
    
    return 0;
}