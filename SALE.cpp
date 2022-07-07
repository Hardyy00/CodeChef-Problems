#include <iostream>
using namespace std;
int main()
{
    int t;
    cin >> t;
    while(t--)
    {
        int a,b,c;
        cin >> a >> b  >> c;
        int min;
        if(a<=b && a<=c)
            min =a;
        else if(b<=a && b <=c)
            min =b;
        else if(c<=a and c<=b)
            min = c;
            
        cout << a+b+c-min << endl;
    }
    return 0;
}