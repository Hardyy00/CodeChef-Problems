#include <iostream>
using namespace std;
int main()
{
    int t;
    cin >> t;
    while(t--)
    {
        int h,x;
        cin>> x >>h;
        if(x>=h)
            cout << "YES" << endl;
        else
            cout << "NO" << endl;
    }
    return 0;
}