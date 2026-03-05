#include <iostream>

using namespace std;

class Employee
{
    int id, salary;
    const string companyName = "Tata Consultancy Services Private Ltd";

    // ------- STATIC VARIABLE -------
    static int employeeCount;

public:
    Employee()
    {
        cout << "No arg constructor has run.\n";
        id = 0001;
        salary = 18000;

        employeeCount++; // Increment count
    }

    Employee(int employeeId, int employeeSalary)
    {
        cout << "Parameter constructor has run.\n";
        id = employeeId;
        salary = employeeSalary;

        employeeCount++; // Increment count
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

    string getCompanyName() const
    {
        return companyName;
    }

    // ------- STATIC MEMBER FUNCTION -------
    static int getEmployeeCount()
    {
        return employeeCount;
    }
};

// ------- STATIC VARIABLE DECLARATION (Memory Allocation) -------
// (Mandatory outside class)
int Employee::employeeCount; // By default, initialized with value 0 (zero);

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

    // -------- USING STATIC FUNCTION (Recommended way) --------
    cout << "\nTotal Employees Created: " << Employee::getEmployeeCount() << endl;
    
    // -------- USING STATIC FUNCTION (also possible) --------
    // cout << "\nTotal Employees Created: " << e1.getEmployeeCount() << endl;
    // cout << "\nTotal Employees Created: " << e2.getEmployeeCount() << endl;
    // cout << "\nTotal Employees Created: " << e3.getEmployeeCount() << endl;

    return 0;
}