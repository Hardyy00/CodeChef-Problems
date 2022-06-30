#include <iostream>
using namespace std;
int main()
{
    int t;
    cin >> t;
    while(t--)
    {
        int n;
        cin >> n;
        int h=(n/7);
        if(n%7==6)
            h++;
        
        cout <<  h << endl;
    }
    return 0;
}