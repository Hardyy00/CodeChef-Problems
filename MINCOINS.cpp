#include <iostream>
using namespace std;
int main()
{
    int t;
    cin >>t ;
    while(t--)
    {
        long long x,ten,five,amount;
        cin >> x;
        ten=x/10;
        five = (x-ten*10)/5;
        amount = ten*10 + five*5;
        if(amount > 0)
            {
               if(x%amount == 0)
                    cout << ten+five << endl;
                else
                    cout << -1 << endl;
            }
        else
            cout << -1 << endl;
    }
    return 0;
}