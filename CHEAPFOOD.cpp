#include <iostream>
using namespace  std;
int main()
{
    int t;
    cin >> t;
    while(t--)
    {
        int x;
        float dis;
        cin >> x ;
        dis = (x*10) / float(100);
        if(dis >= 100 )
            cout << dis << endl;
        else
            cout << 100 << endl;
    }
    return 0;
}