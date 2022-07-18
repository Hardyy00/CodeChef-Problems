#include <iostream>
#include <iomanip>
using namespace std;
int main(){
    int  x;
    double y ;
    cin >> x >> y;
    
    double answer = x%5==0 && (y-x-0.50>=0) ? y-x-0.50 : y;
    
    cout << fixed <<setprecision(2) << answer;
    
    return 0;
}