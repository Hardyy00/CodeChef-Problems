#include <iostream>
using namespace std;
int main()
{
    int t;
    cin >> t;
    while(t--)
    {
        long long x,y;
        cin >> x >> y;
        if(x!=0 and x==y)
            cout << "YES" << endl;
        else
            cout << "NO" << endl;
    }
    return 0;
}