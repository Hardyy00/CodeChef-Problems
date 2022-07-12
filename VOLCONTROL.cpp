#include <iostream>
using namespace std;
int main()
{
    int t;
    cin >> t;
    while(t--)
    {
        int x ,y,min;
        cin >> x >> y;
        min=y-x;
        if(min>=0)
            cout << min << endl;
        else
            cout << -min << endl;
        
    }
    return 0;
}