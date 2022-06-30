#include <iostream>
using namespace std;
int main()
{
    int t;
    cin >> t;
    while(t--)
    {
        int n,k;
        cin >> n >> k;
        int loss =0;
        while(n--)
        {
            int num;
            cin >> num;
            if(num>k)
                loss +=num-k;
        }
        cout << loss << endl;
    }
    return 0;
}
