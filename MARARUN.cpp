#include <iostream>
using namespace std;
int main()
{
    int t;
    cin >> t;
    while(t--)
    {
        int D,d,a,b,c;
        cin >> D >> d >> a 
            >> b >> c;
        int k = d*D;
        if(k<10)
            cout << 0 << endl;
        else if(k>=10 and k<21 )
            cout << a << endl;
        else if(k>=21 and k<42)
            cout << b << endl;
        else
            cout << c << endl;
    }
    return 0;
}