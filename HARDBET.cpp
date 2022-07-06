#include <iostream>
using namespace std;
int main()
{
    int t;
    cin >> t;
    while(t--)
    {
        int sa,sb,sc;
        cin >> sa >> sb >> sc;
        if(sc<sa and sc < sb)
            cout << "Alice" << endl;
        else if(sb<sa and sb < sc)
            cout << "Bob" << endl;
        else
            cout << "Draw" << endl;
    }
    return 0;
}