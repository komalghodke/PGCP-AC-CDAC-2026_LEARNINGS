#include<iostream>
using namespace std;
class Item {
    public:
    static int x;
    int number;
    public:
    void getdata(int a){
        number = a;
        number++;
        x++;
    }
    void getCount() {
        x=10;
        cout<<"value of x is: "<<x<<endl;
    }
    void getCount1() {
        x++;
        cout<<"Value of number is: "<<number<<endl;
        cout<<"Value of x is: "<<x<<endl;
    }
};
int number = 9;
int Item::x;
int main() {
    Item a;
    a.getCount();
    a.getdata(100);
    a.getCount1();
    cout<<"Number is:"<<number<<endl;
    cout<<"Number is:"<<a.number<<endl;
}