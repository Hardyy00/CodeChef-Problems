#include <iostream>
using namespace std;
int main()
{
    int t;
    cin >> t;
    while(t--)
    {
        int x,y,n;
        cin >> x >> y;
        n=y/x;
        if(x*n==y)
            cout << n-1 << endl;
        else
            cout << n << endl;
        
        
    }
    return 0;
}