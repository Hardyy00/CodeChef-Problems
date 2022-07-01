#include <iostream>
using namespace std;
int main()
{
    int t;
    cin >> t;
    while(t--)
    {
        int h,x,y,c;
        cin >> h >> x >> y >>c;
        if(h*(x+(y/2)) <=c)
            cout << "YES" << endl;
        else
            cout << "NO" << endl;
    }
    return 0;
}