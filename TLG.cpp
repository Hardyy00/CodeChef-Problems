#include <iostream>
using namespace std;
int main(){
    int n,sum1 = 0 , sum2 = 0;
    int diff , player,max = 0;
    int a , b;
    cin >> n;
    for(int i=0;i<n;i++){
        cin >> a >> b;
        sum1 += a;
        sum2 += b;
    
        
        diff = sum1 > sum2 ? sum1 - sum2 : sum2 - sum1;
        if(sum1 > sum2 && max < diff){
            max = diff;
            player = 1;
        }
        
        else if(sum2 > sum1 && max < diff){
            max = diff;
            player = 2;
        }
    }
    
    cout << player << " " << max ;
    
    return 0;
}