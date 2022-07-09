#include <iostream>
using namespace std;
int main()
{
    int t;
    cin >> t;
    while(t--)
    {
        int x,y,t;
        cin >> x >> y;
        t=y-x;
        if(t>=0)
            cout << t << endl;
        else
            cout << -t << endl;
            
        
    }
    return 0;
}
