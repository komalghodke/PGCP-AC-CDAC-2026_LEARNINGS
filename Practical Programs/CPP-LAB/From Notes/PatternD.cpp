#include <iostream>
using namespace std;

int main() {
    int n;
    cout << "Enter number of rows: ";
    cin >> n;

    int num = 1;       // number counter
    char c = 'a';      // letter counter

    for (int i = 1; i <= n; i++) {
        // spacing
        for (int s = n - i; s > 0; s--) {
            cout << "   "; // triple space for alignment
        }

        // decide whether row is numbers or letters
        if (i % 2 != 0) {
            // odd row → numbers
            for (int j = 1; j <= i; j++) {
                cout << num++ << "   ";
            }
        } else {
            // even row → letters
            for (int j = 1; j <= i; j++) {
                cout << c++ << "   ";
            }
        }
        cout << endl;
    }

    return 0;
}
