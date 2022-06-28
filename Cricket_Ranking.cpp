#include <iostream>
using namespace std;
int main()
{
    int t;
    cin>> t;
    while(t--)
    {
        long long r1,w1,c1;
        cin >> r1 >> w1 >> c1;
        long long r2,w2,c2;
        cin >> r2 >>w2 >> c2;
        if((r1>r2 and c1>c2) or(r1>r2 and w1>w2) or (w1>w2 and c1>c2))
            cout << "A" << endl;
        else
            cout << "B" << endl;
    }
    return 0;
}