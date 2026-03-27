#include <iostream>
using namespace std;

/*
Q.2. WAP to find Factorial of a Number. 
Create class FindFactorial and functions to:
1. Accept a number from user
2. Calculate factorial using loop
3. Display result
*/
class FindFactorial {
    int n;
public:
    void input() {
        cout << "Enter a number: ";
        cin >> n;
    }
    int calculate() {
        int fact = 1;
        for (int i = 1; i <= n; i++) fact *= i;
        return fact;
    }
    void display() {
        cout << "Factorial = " << calculate();
    }
};

int main() {
    FindFactorial f;
    f.input();
    f.display();
}