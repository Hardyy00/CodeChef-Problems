#include <iostream>
using namespace std;
int main(){
    int t;
    cin >> t;
    while(t--){
        int x;
        
        cin >> x;
        int i = x%3==0 ? x/3 : (x/3) + 1;
        
        cout << (i*3) - x << endl;
        
    }
    
    return 0;
}