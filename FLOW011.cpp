#include <iostream>
#include <iomanip>
using namespace std;
int main(){
    int t;
    cin >> t;
    
    while(t--){
        long double basicSalary;
        cin >> basicSalary;
        
        long double grossSalary;
        
        if(basicSalary < 1500.00){
            grossSalary = basicSalary + (basicSalary * 0.1) + (basicSalary * 0.9);
        }else{
            grossSalary = basicSalary + 500 + (basicSalary * 0.98); 
        }
        
        cout << fixed << setprecision(2) <<grossSalary << endl;
    }
    
    return 0;
}