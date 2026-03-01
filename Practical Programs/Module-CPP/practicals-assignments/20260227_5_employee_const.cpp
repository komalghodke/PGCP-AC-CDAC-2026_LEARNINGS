#include <iostream>

using namespace std;

class Employee
{
    int id, salary;

    // ------- CONST VARIABLE -------
    const string companyName = "Tata Consultancy Services Private Ltd";

public:
    Employee()
    {
        cout << "No arg constructor has run.\n";
        id = 0001;
        salary = 18000;
    }

    Employee(int employeeId, int employeeSalary)
    {
        cout << "Parameter constructor has run.\n";
        id = employeeId;
        salary = employeeSalary;
    }

    void accept()
    {
        cout << "Enter employee id and salary: ";
        cin >> id >> salary;
    }

    void display() const
    {
        cout << "Empolyee's id is " << id << ", salary is " << salary << " and company name is " << companyName << endl;
    }

    void setId(int i)
    {
        id = i;
    }

    int getId() const
    {
        return id;
    }

    void setSalary(int s)
    {
        salary = s;
    }

    int getSalary() const
    {
        return salary;
    }

    // ------- A const member must not have a setter. -------
    // void setCompanyName(string cName)
    // {
    //     // companyName = cName;     // ERROR: Compile-time error (Const variables cannot be reassigned.)
    // }

    // ------- CONST MEMBER FUNCTION -------
    string getCompanyName() const
    {
        return companyName;
    }
};

int main()
{
    Employee e1;

    e1.display();
    e1.accept();
    e1.display();

    Employee e2(0007, 100000);

    string cName = e2.getCompanyName();
    cout << "e2 Employee's company name is " << cName << endl;
    e2.display();

    const Employee e3(10, 50000);

    cout << "e3 Employee's company name is " << e3.getCompanyName() << endl;
    e3.display();
    // e3.accept();   // ERROR: Compile-time error (non-const function cannot be accessed)

    /*

    Key concepts:
        1. Objects created using const keyword can only access const functions.
        2. Objects created without using const keyword can only access const functions as well as non-const functions.
        3. A const member must not have a setter function.

    */
    return 0;
}