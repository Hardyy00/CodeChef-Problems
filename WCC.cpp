#include <iostream>
using namespace std;
int main()
{
    int t;
    cin >> t;
    while(t--)
    {
        int x;
        string s ;
        cin >> x >> s;
        int c=0,n=0;
        for(int i=0;i<14;i++)
        {
            if(s[i]=='C')
                c++;
            if(s[i]=='N')
                n++;
            else{
                c++;
                n++;
            }
        }
        if(c>n)
            cout << 60*x << endl;
        else if(n>c)
            cout << 40*x << endl;
        else
            cout << 55*x << endl;
    }
    return 0;
}