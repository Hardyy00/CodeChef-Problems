#include <iostream>
using namespace std;
int main()
{
    int t;
    cin >> t;
    while (t--)
    {
        int n,x,k;
        cin >> n >> x >> k;
        if(k/x <= n )
            cout << k/x << endl;
        else 
            cout <<  n << endl;
    }
    return 0;
}