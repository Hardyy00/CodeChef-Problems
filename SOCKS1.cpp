#include <iostream>
using namespace std;
int main(){
    int a,b,c;
    cin >> a >> b >> c;
    
    string answer = "NO";
    
    if(a==b || b==c || c==a)
        answer = "YES";
        
    cout << answer << endl;
    
    return 0;
}