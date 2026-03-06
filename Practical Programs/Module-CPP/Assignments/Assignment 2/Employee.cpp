#include<iostream>
using namespace std;

string companyName = "My Company";

class Employee {
    int empId;
    string name;
    int salary;
    static int totalEmployees;

public:
    Employee(int e, string nm, int sal) {
        empId = e;
        name = nm;
        salary = sal;
        totalEmployees++;
    }

    void display() {
        cout << "Company: " << companyName << "\n";
        cout << "Employee ID: " << empId << "\n";
        cout << "Name: " << name << "\n";
        cout << "Salary: " << salary << "\n\n";
    }

    static int showTotalEmployees() {
        return totalEmployees;
    }
};

int Employee::totalEmployees = 0;

int main() {
    Employee e1(1, "Komal", 50000);
    Employee e2(2, "Gk", 60000);
    Employee e3(3, "kg", 55000);
    Employee e4(4, "kunal", 70000);
    Employee e5(5, "km", 65000);

    e1.display();
    e2.display();
    e3.display();
    e4.display();
    e5.display();

    cout << "Total Employees Created: " << Employee::showTotalEmployees() << endl;
    return 0;
}