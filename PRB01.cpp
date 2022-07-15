#include <iostream>
using namespace std;
int main(){
    int t;
    cin >> t;
    
    while(t--){
        long long n;
        cin >> n;
        
        long long i=2;
        bool isPrime = true;
        if(n== 0 || n==1){
            isPrime = false;
        }else{
            while(i<=n/2){
                if(n%i==0){
                    isPrime= false;
                    break;
                }
                i++;
            }
        }
        if(isPrime)
            cout << "yes" << endl;
        else
            cout << "no" << endl;
    }
    
    return 0;
}