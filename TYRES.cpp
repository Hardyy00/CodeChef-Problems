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
        int car = n/4 , bike = (n-car*4)/2;
        if(bike!=0)
            cout <<"YES" << endl;
        else
            cout << "NO" << endl;
    }
    return 0;
}