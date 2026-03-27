#include <iostream>
using namespace std;

int main() {
    int rows = 5;   // total rows in pyramid
    char ch = 'a';  // starting letter
    int num = 1;    // starting number

    for (int i = 1; i <= rows; i++) {
        // print spaces for pyramid shape
        for (int s = rows; s > i; s--) {
            cout << "   ";
        }

        // odd rows → letters, even rows → numbers
        if (i % 2 != 0) {
            for (int j = 1; j <= i; j++) {
                cout << ch << "   ";
                ch++;
            }
        } else {
            for (int j = 1; j <= i; j++) {
                cout << num << "   ";
                num++;
            }
        }
        cout << endl;
    }
    return 0;
}