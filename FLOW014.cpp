#include <iostream>
using namespace std;
int main(){
    int t;
    cin >> t;
    
    while(t--){
        double hard , carb;
        double ten;
        
        cin >> hard >> carb >> ten;
        
        int grade = 5;
        
        if(hard > 50 && carb < 0.7 && ten > 5600)
            grade = 10;
        else if(hard > 50 && carb < 0.7)
            grade = 9;
        else if(carb < 0.7 && ten > 5600)
            grade = 8;
        else if(hard > 50 && ten > 5600)
            grade = 7;
        else if( hard > 50 || carb < 0.7 || ten > 5600)
            grade = 6;
            
        cout << grade << endl; 
    }
    
    return 0;
}