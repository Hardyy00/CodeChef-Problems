#include <iostream>
using namespace std;
int main()
{
    int t;
    cin >> t;
    while(t--)
    {
        long long a,b;
        cin >> a >> b;
        if(a<=b)
            cout << b << " " << a+b << endl;
        else
            cout << a << " " << a+b << endl; 
    }
    return 0;
}