#include <iostream>
using namespace std;
int main()
{
    int t;
    cin >> t;
    while(t--)
    {
        int x,m,d;
        cin >> x >> m >> d;
        if(m*x <=d+x)
            cout << m*x << endl;
        else
            cout << d+x << endl;
    }
    return 0;
}