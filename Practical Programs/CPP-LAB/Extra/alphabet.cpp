#include<iostream>
using namespace std;
int main()
{
    int row;
    row=5;

    for(int i=0;i<row;+i++)
    {
        for(int j=0;j<(row-i);j++)
        {
            char ch = 'A' + j;
            cout<<" ch "<<" ";
        }
        cout<<endl;
    }
    return 0;
}