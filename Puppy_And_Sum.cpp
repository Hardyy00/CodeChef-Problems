#include <iostream>
using namespace std;
int main()
{
    int t;
    cin >> t;
    while(t--)
    {
        int d,n;
        cin >> d >> n;
        int sum=0;
        for(int i=1;i<=d;i++)
        {
            sum= (n*(n+1))/2;
            n=sum;
        }
    
        cout << sum << endl;
    }
    return 0;
}