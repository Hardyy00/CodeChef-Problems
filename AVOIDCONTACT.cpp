#include <iostream>
using namespace std;
int main()
{
    int t;
    cin >> t;
    while(t--)
    {
        int x,y;
        cin >> x >>y;
        int n = x-y;
        if(n==0)
            cout << (2*y)-1 << endl;
        else
            cout << n+2*y << endl;
            }
            return 0;
}