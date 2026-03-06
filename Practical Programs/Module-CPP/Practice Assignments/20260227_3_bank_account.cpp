#include <iostream>

using namespace std;

class BankAccount
{
    int accountNumber, currentBalance;

public:
    void accept()
    {
        cout << "\nEnter account number and amount to deposit: ";
        cin >> accountNumber >> currentBalance;
    }

    void display()
    {
        cout << "Your account number is " << accountNumber << " and current balance is " << currentBalance;
    }

    void withDraw(int amount)
    {
        if (amount < currentBalance)
        {
            currentBalance -= amount;
            cout << "\nYour remaining balance is " << currentBalance;
        }
        else
        {
            cout << "\nOops! Insufficient balance :(";
        }
    }

    void deposit(int amount)
    {
        int accNo;
        cout << "\nEnter your account number: ";
        cin >> accNo;
        if (accountNumber == accNo)
        {
            currentBalance += amount;
            cout << "Amount deposited! Your cuurent balance is " << currentBalance;
        }
        else
        {
            cout << "Wrong account number! Transaction failed.";
        }
    }
};

int main()
{
    BankAccount a1;

    cout << "Size of a1 is " << sizeof(a1);
    a1.accept();
    a1.display();

    a1.withDraw(347);

    a1.withDraw(3800);

    a1.deposit(10000);
    return 0;
}