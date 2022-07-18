#include <iostream>
using namespace std;
int main(){
    int n,k;
    cin >> n >> k;
    int count =0;
    while(n--){
        int num;
        cin >> num;
        
        if(num % k == 0)
            count +=1;
    }
    
    cout << count << endl;
    
    return 0;
}