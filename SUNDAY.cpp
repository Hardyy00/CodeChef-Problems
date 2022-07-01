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
        int holidays = (30/7)*2;
        while(n--)
        {
            int num;
            cin >> num;
            if(num%7==0 || num%7==6);
            else
                holidays++;
            
        }
        cout << holidays << endl;
    }
    return 0;
}