#include <iostream>
using namespace std;
int main(){
    int t;
    cin >> t;
    
    while(t--){
        int n;
        cin >> n;
        
        int degree = 0;
        
        for(int i=0;i<n;i++){
            int num;
            cin >> num;
            if(num  != 0){
                degree = i;
            }
        }
        
        
        cout << degree  << endl;
    }
    
    return 0;
}