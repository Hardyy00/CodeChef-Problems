#include <iostream>
using namespace std;
int main()
{
    int t;
    cin >> t;
    while(t--)
    {
        int n;
        cin >> n;
        int w,sw;
        w=3*(n-1);
        sw = ((n-1)/2)*3;
        cout << w-sw << endl;
    }
    return 0;
}