#include <iostream>
using namespace std;
int main()
{
    int t;
    cin >> t;
    while(t--)
    {
        int am,bm,cm,z,a,b,c,tm;
        cin >> am >> bm >> cm >> tm 
            >> a >> b >> c;
        if(a>=am and b>=bm and c>=cm and (a+b+c)>=tm)
            cout << "YES" << endl;
        else
            cout << "NO" << endl;
        
    }
    return 0;
}