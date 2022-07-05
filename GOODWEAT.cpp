#include <iostream>
using namespace std;
int main()
{
    int t;
    cin >> t;
    while(t--){
    int sun=0,rain=0;
    for(int i=1;i<=7;i++)
    {
        int num;
        cin >> num;
        if(num==1)
            sun++;
        else
            rain++;
    }
    if(sun>rain)
        cout << "YES" << endl;
    else
        cout << "NO" << endl;
    }
}