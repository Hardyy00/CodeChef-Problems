#include <iostream>
using namespace std;
 int main(){
     int t;
      cin >> t;
       while(t--){
           char alph;
           cin >> alph;
           
           string s;
           
           if(alph == 'B' || alph == 'b')
                s = "BattleShip";
            else if(alph == 'C' || alph == 'c')
                s = "Cruiser";
            else if(alph == 'D' or alph == 'd')
                s = "Destroyer";
            else
                s = "Frigate";
                
            cout << s << endl;
       }
       
       return 0;
 }