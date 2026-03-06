#include<iostream>
using namespace std;
void swap(int, int);
void swap(int p, int q) {
    int temp;
    temp = p;
    p = q;
    q = temp;
	cout<<"after swapping value of p and q\n";
	cout<<"value of p = "<<p<<"value of q = "<<q<<endl;
}
int main() {
    int a, b, z;
    cout<<"Enter a and b: "<<endl;;
    cin>>a>>b;
    cout<<"Values before swapping: a= "<<a<<" b= "<<b<<endl;
    swap(a,b);
    cout<<"Values after swapping: a= "<<a<<" b= "<<b<<endl;
    return 0;
}