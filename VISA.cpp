#include <iostream>
using namespace std;
int main()
{
    int t;
    cin >>t ;
    while(t--)
    {
        int x1,x2,y1,y2,z1,z2;
        cin >> x1 >> x2 >> y1 >> y2 >> z1 >> z2;
        if(x2>=x1 and y2>=y1 and z2<=z1)
            cout << "Yes" << endl;
        else
            cout << "No" << endl;
    }
    return 0;
}