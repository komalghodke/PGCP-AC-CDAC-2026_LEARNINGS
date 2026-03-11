#include <iostream>
using namespace std;

class Calculator
{
    int num1, num2;

public:
    void getData()
    {
        cout << "Enter num1 and Num2" << endl;
        cin >> num1 >> num2;
    }

    void add()
    {
        cout << "Addition: " << num1 + num2 << endl;
    }

    void sub()
    {
        cout << "Substraction: " << num1 - num2 << endl;
    }

    void mul()
    {
        cout << "Multiplication: " << num1 * num2 << endl;
    }

    void div()
    {
        cout << "Division: " << num1 / num2 << endl;
    }

    void square()
    {
        cout << "Square of " << num1 << " : " << num1 * num1 << endl;
        cout << "Square of " << num2 << " : " << num2 * num2 << endl
             << endl;
    }
};
int main()
{

    Calculator c;
    c.getData();
    c.add();
    c.sub();
    c.mul();
    c.div();
    c.square();
}