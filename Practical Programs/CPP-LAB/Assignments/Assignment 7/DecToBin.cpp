#include <iostream>
using namespace std;

/*
Q.3. WAP for Decimal to Binary Conversion. 
Create class DecimalToBinary and functions to:
1. Convert decimal number to binary
2. Display binary equivalent
*/
class DecimalToBinary {
    int num;
public:
    void input() {
        cout << "Enter decimal number: ";
        cin >> num;
    }
    void convert() {
        int bin[32], i = 0, n = num;
        while (n > 0) {
            bin[i++] = n % 2;
            n /= 2;
        }
        cout << "Binary: ";
        for (int j = i - 1; j >= 0; j--) cout << bin[j];
    }
};

int main() {
    DecimalToBinary d;
    d.input();
    d.convert();
}