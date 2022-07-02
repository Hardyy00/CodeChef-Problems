#include <iostream>
using namespace std;
int main()
{
    int t;
    cin >> t;
    while(t--)
    {
        int x,y,x1,y1,d;
        cin >> x >> y
            >> x1 >> y1 
            >> d;
        int food = x/x1,water = y/y1;
        int min;
        if(food<water)
            min = food;
        else
            min = water;
        if(min>=d)
            cout << "YES" << endl;
        else
            cout << "NO" << endl;
    }
    return 0;
}