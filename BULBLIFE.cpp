#include <iostream>
using namespace std;
int main()
{
    int t;
    cin >> t;
    while(t--)
    {
        int n,x,sum=0;
        cin >> n >> x;
        for(int i=1;i<n;i++)
            {
                int num;
                cin >> num;
                sum+=num;
            }
        int life = n*x - sum;
        if(life <=0)
            cout << 0 << endl;
        else
            cout << life << endl;
    }
    return 0;
}