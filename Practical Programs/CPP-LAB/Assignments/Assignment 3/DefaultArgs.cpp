#include<iostream>
using namespace std;
/* Assignment 3
    Q. Write a function to calculate the sum of two numbers using default arguments.
    Example
    add(int a=10, int b=20)
    Call function with :
    add()
    add(50)
    add(10,20)
 */

int add(int a=10, int b=20) {
    cout<<"a: "<<a<<" b: "<<b<<endl;
    return a+b;
}
int main() {
    cout<<"add() "<<add()<<endl;
    cout<<"add(8) "<<add(8)<<endl;
    cout<<"add(90,63) "<<add(90,63)<<endl;
    return 0;
}