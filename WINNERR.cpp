#include <iostream>
using namespace std;
int main(){
    int t;
    cin >> t;
    while(t--){
        int pa,pb,qa,qb;
        
        cin >> pa >> pb >> qa >> qb;
        
        int max_a,max_b;
        max_a = pa > pb ? pa : pb;
        max_b = qa > qb ? qa : qb;
        
        string s =   (max_a == max_b) ? "TIE" : ((max_a < max_b) ? "P" : "Q"); ;
         
        cout << s << endl;
    }
    
    return 0;
}