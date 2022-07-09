#include <iostream>
using namespace std;
int main()
{
    int t;
    cin >> t ;
    while(t--)
    {
        int x;
        cin >> x;
        switch(x%3)
        {
            case 0 :
                cout << "NORMAL" << endl;
                break;
            case 1 :
                cout << "HUGE" << endl;
                break;
            case 2 :
                cout << "SMALL" << endl;
        }
    }
    return 0;
}