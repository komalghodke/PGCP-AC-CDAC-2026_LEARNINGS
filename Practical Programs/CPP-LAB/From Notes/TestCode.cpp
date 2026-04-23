#include<iostream>
using namespace std;
class TestCode {

};
int main() {
    int x = 10;
    int *p = &x;
    cout<<"Value of x is: "<<x<<endl;
    cout<<"Value of *p is: "<<*p<<endl;
    cout<<"Address of x is &x: "<<&x<<endl;
    cout<<"Value of &p: "<<&p<<endl;
    cout<<"Value of p: "<<p<<endl;
    return 0;
}