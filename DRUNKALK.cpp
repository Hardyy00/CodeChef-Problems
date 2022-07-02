#include <iostream>
using namespace std;
int main()
{
    int t;
    cin >> t;
    while(t--)
    {
        int k;
        cin >> k;
        cout << k*3 + (k/2)*-4 << endl;
    }
    return 0;
}