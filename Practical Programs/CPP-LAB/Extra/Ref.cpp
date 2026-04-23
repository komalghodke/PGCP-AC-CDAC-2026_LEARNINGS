#include<iostream>
using namespace std;
/*PRACTICE*/
class Ref  {
    public:
    int a = 10;
    int &b = a;
    
    double d = 99.7;    
    double &r = d;    

    void display() {
    cout<<"Value of a : "<<a<<endl;
    cout<<"Value of a reference : "<<b<<endl;
    cout<<"Value of d : "<<d<<endl;
    cout<<"Value of d reference :"<<r<<endl;
    }
};
int main() {
    Ref r;
    r.display();
    int c = 10;
    int &c1 = c;
    cout<<"Value of c is:"<<c<<endl;
    cout<<"Value of c reference is:"<<c1<<endl;
    return 0;
}