#include <iostream>
using namespace std;
int main(){
    int t;
    cin >> t;
    while(t--){
        int x,y,z;
        cin >> x >> y >> z;
        
        int money = x%y==0 ? (x/y)*z : ((x/y) + 1)*z ;
        
        cout << money << endl;
    }
    
    return 0;
}