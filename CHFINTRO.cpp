#include <iostream>
using namespace std;
int main()
{
    int n,r;
    cin >> n >> r;
    while(n--)
    {
        int num;
        cin >> num;
        if(num>=r)
            cout << "Good boi" << endl;
        else
            cout << "Bad boi" << endl;
    }
    return 0;
}