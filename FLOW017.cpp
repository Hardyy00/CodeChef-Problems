#include <iostream>
using namespace std;
int main(){
    int t;
    cin >> t;
    while(t--){
        int a,b,c;
        cin >> a >> b >> c;
        
        int max = a>b && a > c ? a : ((b> a && b > c )? b : c);
        int min = a<b && a < c ? a : ((b <a && b < c) ? b : c); 
        
        cout << a+b+c - max - min << endl;
    }
    
    return 0;
}