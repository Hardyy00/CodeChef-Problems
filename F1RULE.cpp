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
        int z = (107*x)/100.0;
        if(y<=z)
            cout << "YES" << endl;
        else
            cout << "NO" << endl;
    }
    return 0;
}