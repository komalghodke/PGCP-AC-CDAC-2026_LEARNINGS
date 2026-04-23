#include <iostream>
using namespace std;

/*
Q.3. Create a menu-driven program. 
Menu: 
1.Check Balance 
2. Deposit Money 
3. Withdraw Money 
4. Exit */

int main() {
    int choice;
    double balance = 0;

    do {
        cout << "\n--- Menu ---\n";
        cout << "1. Check Balance\n";
        cout << "2. Deposit Money\n";
        cout << "3. Withdraw Money\n";
        cout << "4. Exit\n";
        cout << "Enter your choice: ";
        cin >> choice;

        switch (choice) {
            case 1:
                cout << "Balance = " << balance << endl;
                break;

            case 2: {
                double deposit;
                cout << "Enter amount: ";
                cin >> deposit;
                balance += deposit;
                cout << "Deposited successfully.\n";
                break;
            }

            case 3: {
                double withdraw;
                cout << "Enter amount: ";
                cin >> withdraw;
                if (withdraw <= balance) {
                    balance -= withdraw;
                    cout << "Withdrawn successfully.\n";
                } else {
                    cout << "Not enough balance!\n";
                }
                break;
            }

            case 4:
                cout << "Goodbye!\n";
                break;

            default:
                cout << "Invalid choice.\n";
        }
    } while (choice != 4);

    return 0;
}
