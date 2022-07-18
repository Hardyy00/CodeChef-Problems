#include <iostream>
using namespace std;
int main(){
    int t;
    cin >> t;
    while(t--){
        int w,x,y,z;
        cin >> w >> x >> y >> z;
        
        string s = (w+y*z)<=x ? ((w+y*z)<x ? "unfilled" : "filled") : "overflow";
        
        cout << s << endl;
    }
    
    return 0;
}