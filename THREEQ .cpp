#include <iostream>
using namespace std;
int main()
{
    int t;
    cin >> t;
    while(t--)
    {
        int ys(0),ns(0);
        for(int i=1;i<=3;i++)
            {
                int num;
                cin >> num;
                if(num==1)
                    ys++;
                else
                    ns++;
                    
            }
        int yh(0),nh(0);
        for(int i=0;i<3;i++)
            {
                int num;
                cin >> num;
                if(num==1)
                    yh++;
                else
                    nh++;
            }
        if(ys==yh && ns==nh)
            cout << "Pass" << endl;
        else
            cout << "Fail" << endl;
        
    }
    return 0;
}