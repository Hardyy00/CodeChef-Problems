#include <iostream>
using namespace std;
int main()
{
    int t;
    cin >> t;
    while(t--)
    {
        long long n;
        cin >> n;
        
        if(n<=4)
            cout << n << endl;
        else
            cout << (n/5)*4 + (n%5) << endl;
    }
    return 0;
}