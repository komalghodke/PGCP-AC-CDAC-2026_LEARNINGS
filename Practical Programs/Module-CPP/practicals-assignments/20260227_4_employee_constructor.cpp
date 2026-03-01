#include <iostream>

using namespace std;

class Employee
{
    int id, salary;

public:
    // ------- NO-ARGUMENT CONSTRUCTOR -------
    Employee()
    {
        cout << "No arg constructor has run.\n";
        id = 0001;
        salary = 18000;
    }

    // ------- PARAMETERIZED CONSTRUCTOR -------
    Employee(int employeeId, int employeeSalary)
    {
        cout << "Parameter constructor has run.\n";
        id = employeeId;
        salary = employeeSalary;
    }

    // ------- FACILITY FUNCTIONS -------
    void accept()
    {
        cout << "Enter employee id and salary: ";
        cin >> id >> salary;
    }

    void display()
    {
        cout << "Empolyee's id is " << id << " and salary is " << salary << endl;
    }

    // ------- GETTERS & SETTERS -------

    // ------- SETTER FUNCTION for ID -------
    void setId(int i)
    {
        id = i;
    }

    // ------- GETTER FUNCTION for ID -------
    int getId()
    {
        return id;
    }

    // ------- SETTER FUNCTION for Salary -------
    void setSalary(int s)
    {
        salary = s;
    }

    // ------- SETTER FUNCTION for Salary -------
    int getSalary()
    {
        return salary;
    }
};

int main()
{
    // ------- Object executing No-arg constructor -------
    Employee e1;
    
    e1.display();
    e1.accept();
    e1.display();
    
    // ------- Object executing parameterized constructor -------
    Employee e2(0007, 100000);
    e2.display();

    return 0;
}