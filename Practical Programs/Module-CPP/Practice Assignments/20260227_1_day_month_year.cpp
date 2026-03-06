#include <iostream>

using namespace std;

class MyDate
{
    int date, month, year;

public:
    void accept()
    {
        cout << "\nEnter date, month and year: ";
        cin >> date >> month >> year;
    }

    void display()
    {
        cout << "Date is " << date << "/" << month << "/" << year << endl;
    }

    int getDate()
    {
        cout << "getDate() function has run.\n";
        return date;
    }

    void setDate(int d)
    {
        cout << "setDate() function has run.\n";
        date = d;
    }

    int getMonth()
    {
        cout << "getMonth() function has run.\n";
        return month;
    }

    void setMonth(int m)
    {
        cout << "setMonth() function has run.\n";
        month = m;
    }

    int getYear()
    {
        cout << "getYear() function has run.\n";
        return year;
    }

    void setYear(int y)
    {
        cout << "setMonth() function has run.\n";
        year = y;
    }
};

int main()
{
    MyDate m1;

    cout<<"Size of object m1 is "<<sizeof(m1);
    m1.accept();
    m1.display();

    m1.setDate(27);
    int d = m1.getDate();
    cout<<"Date is "<<d<<endl;
    m1.display();
    
    m1.setMonth(12);
    int m = m1.getMonth();
    cout<<"Month is "<<m<<endl;
    m1.display();
    
    m1.setYear(2007);
    int y = m1.getYear();
    cout<<"Year is "<<y<<endl;
    m1.display();
    
    return 0;
}