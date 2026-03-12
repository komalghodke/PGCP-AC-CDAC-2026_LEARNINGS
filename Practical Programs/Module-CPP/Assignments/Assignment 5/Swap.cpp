#include<iostream>
using namespace std;
//Q.5. Write a program to swap two numbers without using a third variable.
int main() {
    int a, b;
    cout<<"Enter a and b:";
    cin>>a>>b;
    cout<<"Before Swap: a="<<a<<" b="<<b<<endl;
    
    a = a+b;
    b = a-b;
    a = a-b;
    cout<<"After Swap: a="<<a<<" b="<<b<<endl;
}