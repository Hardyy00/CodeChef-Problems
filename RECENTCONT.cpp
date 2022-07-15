#include <iostream>
using namespace std;
int main(){
    int t;
    cin >> t;
    
    while(t--){
        int n;
        cin >> n;
        
        int start=0;
        int ltime = 0;
        
        while(n--){
            string s;
            cin >> s;
            
            s == "START38" ? start++ : ltime++;
        }
        
        cout << start << " " << ltime << endl;
    }
    
    return 0;
}