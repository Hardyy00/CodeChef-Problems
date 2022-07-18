#include <iostream>
using namespace std;
int main(){
    int t;
    cin >> t;
    while(t--){
        int n;
        cin >> n;
        int count =0;
        while(n--){
            int num;
            cin >> num;
            if(num>=1000)
                count+=1;
        }
        
        cout << count << endl;
    }
    
    return 0;
}