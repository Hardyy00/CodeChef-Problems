#include <iostream>
using namespace std;
int main(){
    int t;
    cin >> t;
    while(t--){
        long long x , y;
        cin >> x >> y;
        
        if(x<=y)
            cout << y-x << endl;
        else{
           
           if((x-y)%2 ==0)
                cout << (x-y)/2 << endl;
            else
                cout << 2+((x-y)/2) << endl;
            
        }
    }
    
    return 0;
}