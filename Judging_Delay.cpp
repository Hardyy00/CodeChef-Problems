#include  <iostream>
using namespace std;
int main()
{
    int t;
    cin >> t;
    while(t--)
    {
    int n;
    cin >> n;
    int c=0;
    while(n--)
    {
        int s,j;
        cin >> s >> j;
        if((j-s)>5)
            c++;
    }
    cout << c << endl;
    }
    return 0;
}