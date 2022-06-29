#include <iostream>
using namespace std;
int main()
{
    int t;
    cin >> t;
    while(t--)
    {
        long long d;
        string str;
        cin >> d >> str;
        int f(0);
        if(str == "0")
            {
                cout << "NO" << endl;
                break;
            }
        for(int i=0;i<d;i++)
        {
            if(str[i]=='0' or str[i]=='5')
                {
                    f=1;
                    break;
                }
        }
        if(f==1)
            cout << "YES" << endl;
        else
            cout << "NO" << endl;
    }
    return 0;
}