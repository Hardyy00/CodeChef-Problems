#include <iostream>
using namespace std;
int main(){
    int t;
    cin >> t;
    while(t--){
        int x,y;
        cin >> x >> y;
        int max = x>y ? x : y;
        int min = x + y - max;
        
        int a = max % 10 ==0 ? max / 10 : (max+10)/10; 
        int b = min % 10 ==0 ? min / 10 : (min+10)/10; 
        
        cout << a-b << endl;
    }
    return 0;
}