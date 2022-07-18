#include <iostream>
using namespace std;
int main(){
    
    int n;
    cin >> n;
    
    int lucky=0,unlucky=0;
    
    while(n--){
        int num;
        cin >> num;
        
        num%2 == 0 ? lucky+=1 : unlucky+=1;
    }
    
    string s = lucky > unlucky ? "READY FOR BATTLE" : "NOT READY" ;
    
    cout << s << endl;
    
    return 0;
}