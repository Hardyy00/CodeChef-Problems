#include <iostream>
using namespace std;
int main(){
    int t;
    cin >> t;
    
    while(t--){
        int d , x, y ,z;
        cin >> d >> x >> y >> z;
        
        int first = x* 7;
        int second = (y*d) + (z*(7-d));
        
        if(first > second)
            cout << first << endl;
        else
            cout << second << endl;
    }
    
    return 0;
}