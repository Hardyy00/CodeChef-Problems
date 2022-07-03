#include <iostream>
using namespace std;
int main()
{
    int t;
    cin >> t;
    while(t--)
    {
        int z,y,a,b,c;
        cin >>z>>y>>a>>b>>c;
        if(z-y-a-b-c>=0)
            cout << "YES" << endl;
        else
            cout << "NO" << endl; 
    }
    return 0;
}