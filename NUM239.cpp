#include <iostream>
using namespace std;
int main()
{
    int t;
    cin >> t;
    while(t--)
    {
        int l,r;
        cin >> l >> r;
        int count =0;
        for(int i=l;i<=r;i++)
        {
            int c=i%10;
            if(c==2 or c==3 or c==9)
                count++;
        }
        cout << count << endl;
    }
    return 0;
}