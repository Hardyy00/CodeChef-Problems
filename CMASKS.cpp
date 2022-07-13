#include <iostream>
using namespace std;
int main()
{
    int t;
    cin >> t;
    while(t--)
    {
        int x,y;
        cin >> x >> y;
        if(y*10<=x*100)
            cout << "CLOTH" << endl;
        else
            cout << "DISPOSABLE" << endl;
    }
    return 0;
}