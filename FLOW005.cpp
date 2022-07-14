#include <iostream>
using namespace std;
int main(){
    int t;
    cin >> t;
    
    while(t--){
        long long n;
        cin >> n;
        
        int notes = 0;
        
        notes += n/100;
        n %= 100;
        
        notes += n/50;
        n %= 50;
        
        notes += n/10;
        n %= 10;
        
        notes += n/5;
        n %= 5;
        
        notes += n/2;
        n %= 2;
        
        notes += n;
        
        cout << notes << endl;
        
    }
    
    return 0;
}