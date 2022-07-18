#include <iostream>
using namespace std;
int main(){
    int i=4;
    int count = 0;
    while(i--){
        int num;
        cin >> num;
        
        if(num>=10)
            count++;
    }
    
    cout << count << endl;
    
    return 0;
}