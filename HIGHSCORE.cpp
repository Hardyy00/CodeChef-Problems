#include <iostream>
using namespace std;
int main(){
    int t;
    cin >> t;
    while(t--){
        int n;
        cin >> n;
        
        int num;
        cin >> num;
        int max=num;
        
        for(int i=0;i<3;i++){
            cin >> num;
            if(max < num){
                max = num;
            }
        }
        cout << max << endl;
    }
    
    return 0;
}