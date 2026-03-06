#include<iostream>
using namespace std;
/*  Assignment 3
    Q. Write overloaded functions to find area of:
    -Square
    -Rectangle
    Example:
    area(int side)
    area(int length, int breadth)
*/
int area(int side) {
    return side*side;
}
int area(int length, int breadth) {
    return length*breadth;
}
int main() {
    cout<<"Area of Square is: "<<area(5)<<endl;
    cout<<"Area of Square is: "<<area(5,6)<<endl;
    return 0;
}