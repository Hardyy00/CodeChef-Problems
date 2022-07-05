#include <iostream>
#include <cmath>
using namespace std;
int main()
{
    int t;
    cin >> t;
    while(t--)
    {
        float b,ls,rs_min,rs_max;
        cin >> b >> ls;
        rs_min = sqrt(abs(b*b - ls*ls));
        rs_max = sqrt(b*b + ls*ls);
        cout <<rs_min << " "<< rs_max << endl;
    }
    return 0;
}