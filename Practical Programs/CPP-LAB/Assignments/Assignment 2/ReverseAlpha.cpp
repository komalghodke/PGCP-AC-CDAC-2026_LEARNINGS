#include <iostream>
using namespace std;
/* Assignment 2
    Q.
    WAP to print Reverse Alphabet Pattern

    A B C D E
    A B C D
    A B C
    A B
    A
*/

int main() {
    int n;
    cout << "Enter number of rows: ";
    cin >> n;

    for (int i = n; i >= 1; i--) {
        char ch = 'A';
        for (int j = 1; j <= i; j++) {
            cout << ch << " ";
            ch++;
        }
        cout << endl;
    }
    return 0;
}