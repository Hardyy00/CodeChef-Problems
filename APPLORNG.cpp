#include <iostream>
using namespace std;
int main(){
    int x;
    cin >> x;
    
    int a , b;
    cin >> a >> b;
    
    string s = x-a-b>=0? "Yes" : "No" ;
    
    cout << s << "\n";
    
    return 0;
    
}