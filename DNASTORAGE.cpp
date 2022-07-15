#include <iostream>
using namespace std;
int main(){
    int t;
    cin >> t;
    
    while(t--){
        int n;
        cin >> n;
        
        string binary;
        cin >> binary ;
        
        string s = "";
        
        for(int i=0;i<n-1;i++){
            if(binary[i]=='0'){
                if(binary[i+1]=='0')
                    s += "A";
                else
                    s += "T";
            }else{
                if(binary[i+1] == '0')
                    s+= "C";
                else
                    s += "G";
            }
            i++;
        }
        cout << s << endl;
    }
    return 0;
}