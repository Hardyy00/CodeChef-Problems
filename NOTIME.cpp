#include <iostream>
using namespace std;
int main()
{
    int n,h,x;
    cin >> n >> h >> x;
    int y=h-x;
    int flag=0;
    while(n--)
    {
        int t;
        cin >> t;
        if(t>=y)
            {
                flag=1;
                break;
            }
    }
    if(flag==1)
        cout << "YES" << endl;
    else
        cout << "NO" << endl;
        return 0;
}