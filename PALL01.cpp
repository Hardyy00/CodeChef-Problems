#include <iostream>
using namespace std;
int main(){
    int t;
    cin >> t;
    
    while(t--){
        long long n;
        cin >> n ;
        long long copy = n;
        
        long long sum = 0;
        
        while(copy != 0){
            sum = sum * 10 + (copy % 10);
            copy /= 10;
        }
        
        if(n == sum)
            cout << "wins" << endl;
        else
            cout << "loses" << endl;
        
    }
    
    return 0;
}