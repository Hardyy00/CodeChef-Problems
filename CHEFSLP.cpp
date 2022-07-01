#include <iostream>
using namespace std;
int main()
{
    int t;
    cin >> t;
    while(t--)
    {
        long long n,l,x;
        cin >> n >> l >> x;
        int r=n-l;
        if(l<=r)
            cout << l*x << endl;
        else
            cout << r*x << endl;
    }
    return 0;
}