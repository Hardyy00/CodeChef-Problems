#include <iostream>
using namespace std;
int main()
{
    int t;
    cin >> t;
    while(t--)
    {
        int r;
        cin>> r;
        if(r<1600)
            cout << 3 << endl;
        else if(r>=1600 and r<2000)
            cout << 2 << endl;
        else
            cout << 1 << endl;
    }
    return 0;
}