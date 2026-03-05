#include<iostream>
using namespace std;
void swap(int, int);
void swap(int p, int q) {
    int temp;
    temp = p;
    p = q;
    q = temp;
    cout<<"After swapping value of P is: "<<p<<"q is: "<<q<<"endl";
}
int main() {
    int a,b;
    cout<<"Enter the value of a and b: ";
    cin>>a>>b;
    cout<<"Value before swapping a: "<<a<<" b: "<<b<<endl;
    swap(a,b);
    cout<<"Value after swapping a: "<<a<<" b: "<<b<<endl;
    return 0;
}