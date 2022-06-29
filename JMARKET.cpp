#include <iostream>
using namespace std;
int main()
{
    int t;
    cin >> t;
    while(t--)
    {
        int x,a,b,c;
        cin >>x >> a >> b >> c;
        int min;
        if(a<=b and a<=c)
            min = a;
        else if(b<=a and b <=c)
            min = b;
        else if(c<=a and c<=b)
            min = c;
            
        int max;
        if(a>=b and a>=c)
            max = a;
        else if(b>=a and b>=c)
            max = b ;
        else if(c>=a and c>=b)
            max = c;
        int min2 = a+b+c-max-min;
        cout << (x-1)*min + min2 << endl;
    }
    return 0;
}