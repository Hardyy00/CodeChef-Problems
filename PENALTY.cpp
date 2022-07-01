#include <iostream>
using namespace std;
int main()
{
    int t;
    cin >> t;
    while(t--)
    {
        int f=0,s=0;
        for(int i=1;i<=10;i++)
        {
            int num;
            cin >> num;
            if(i%2==0)
                {
                    if(num==1)
                        s++;
                }
            else 
                if(num==1)
                        f++;
        }
        if(f>s)
            cout << 1 << endl;
        else if(s>f)
            cout << 2 << endl;
        else
            cout << 0 << endl;
    }
    return 0;
}