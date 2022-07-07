#include <iostream>
using namespace std;
int main()
{
    int t;
    cin >> t;
    int num;
    while(t--)
    {
        int i=0;
        cin >> num;
        while(num!=0)
        {
            int num1;
            num1=num%10;
            num/=10;
            if(num1==4)
                i++;
        }
        cout << i << endl;
        
    }
    
    return 0;
}