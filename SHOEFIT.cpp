#include <iostream>
using namespace std;
int main()
{
    int t;
    cin >> t;
    while(t--)
    {
        int l=0,r=0;
        for(int i=0;i<3;i++)
            {
                int num;
                cin >> num;
                if(num==0)
                    l++;
                else
                    r++;
            }
            if(r>=1 and l>=1)
                cout << 1 << endl;
            else
                cout << 0 << endl;
        
    }
    return 0;
}