#include <iostream>
using namespace std;
int main(){
    int t;
    cin >> t;
    
    while(t--){
        int na,nb,nc;
        cin >> na >> nb >> nc;
        
        string s = (na > nb + nc) || (nb > na + nc) || (nc > na + nb) ? "YES" : "NO";
        
        cout << s << endl;
    }
    
    return 0;
}