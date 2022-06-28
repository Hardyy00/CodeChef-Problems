#include <iostream>
using namespace std;
int main()
{
    int n;
    cin >> n;
    while(n--)
    {
        int i=5,sum=0;
        while(i--)
        {
            int num;
            cin >> num;
            sum+=num;
        }
        switch(sum)
        {
            case 0 :
                cout << "Beginner" << endl;
                break;
            case 1 :
                cout << "Junior Developer" << endl;
                break;;
            case 2 :
                cout << "Middle Developer" << endl;
                break;
            case 3 :
                cout << "Senior Developer" << endl;
                break;
            case 4 :
                cout << "Hacker" << endl;
                break;
            case 5 :
                cout << "Jeff Dean" << endl;
        }
    } 
   
}