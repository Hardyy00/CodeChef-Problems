#include <iostream>
using namespace std;
int main(){
    int n1,n2;
    cin >> n1 >> n2;
    
    int answer = n1 > n2 ? (n1-n2) : (n1+n2);
    
    cout << answer << endl;
    
    return 0;
}