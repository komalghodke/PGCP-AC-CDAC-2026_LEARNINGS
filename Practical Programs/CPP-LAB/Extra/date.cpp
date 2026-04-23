#include<iostream>
using namespace std;
class MyDate
{
    private:
    int day, month, year;
    public:
    void accept()
    {
        cout<< "\n accept day month year\n";
        cin >> day >> month >> year;
    }    
    void display(){
        cout << " date is " <<day << " / " << month << " / " << year << endl;
    }
    void setDate(int d){
        cout << "Setter function is called \n";
        day = d;
    }
    void setMonth(int m){
        cout << "setter function for month called\n";
        month=m;
    }
    int getMonth(){
        return month;
    }
    int getDay(){
        return day;
    }
    int getYear(){
        return year;
    }
};

int main()
    {
        MyDate D1;
        cout << "size of object is" << sizeof(D1);
        D1.accept();
        D1.display();
        D1.setDate(27);
        D1.display();
        D1.setMonth(3);
        D1.display();
        int m = D1.getMonth();
        cout << "current month is"  << m << endl;
        int d = D1.getDay();
        cout << "current day is " << d << endl;
        int y = D1.getYear();
        cout << "current year is "  << y  << endl;
        return 0;
    }