#include <iostream>
using namespace std;
int main()
{
    int t;
    cin >> t;
    while(t--)
    {
        int x,y,z,t;
        cin >> x >> y >> z;
        t=z-(y/x);
        if(t<0)
            cout << 0 << endl;
        else
            cout << t << endl;
        
    }
    return 0;
}