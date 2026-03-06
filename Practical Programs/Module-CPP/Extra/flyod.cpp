#include<iostream>
using namespace std;
int main()
{
    int row=5, col;

    for(row=0;row<=5;row++)
    {
        for(col=0;col<=row;col++)
        {
            cout<<" * ";
        }
        cout<<endl;
    }
}