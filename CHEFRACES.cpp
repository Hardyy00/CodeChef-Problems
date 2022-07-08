#include <iostream>
using namespace std;
int main()
{
    int t;
    cin >> t ;
    while(t--)
    {
        int x ,y,a ,b,g=0;
        cin >> x >> y >> a >> b;
        if(x!=a and x!=b)
            g++;
        if(y!=a and y!=b )
            g++;
        
        cout << g << endl;
        
    }
    return 0;
}