#include <iostream>
using namespace std;
int main()
{
    int t;
    cin >> t;
    while(t--)
    {
        int n,num,i=0;
        cin >> n;
        while(n--)
        {
            cin >> num ;
            if(num >=10 and num <=60)
                i++;
        }
        cout << i << endl;
    }
    return 0;
}