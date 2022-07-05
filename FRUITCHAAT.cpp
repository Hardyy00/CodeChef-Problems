#include <iostream>
using namespace std;
int main()
{
    int t;
    cin >> t;
    while(t--)
    {
        int x,y;
        cin >> x >> y;
        int ban = x/2,apple = y;
        if(ban>apple)
            cout << apple << endl;
        else
            cout << ban << endl;
    }
    return 0;
}