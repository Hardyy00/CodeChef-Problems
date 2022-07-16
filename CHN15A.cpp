#include <iostream>
using namespace std;
int main(){
    int t;
    cin >> t;
    while(t--){
        int n,k;
        cin >> n >> k;
        int count = 0;
        while(n--){
            int num;
            
            cin >> num ;
            if((num + k)%7== 0){
                count++;
            }
        }
        cout << count << endl;
    }
    
    return 0;
}