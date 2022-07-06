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
        int s[n];
        for(int i=0;i<n;i++)
            cin >> s[i] ;
        int count=0,num;
        for(int i=0;i<n;i++)
            {
                cin >> num;
                if(num==s[i])
                    count++;
            }
        cout << count << endl;
        
    }
    return 0;
}