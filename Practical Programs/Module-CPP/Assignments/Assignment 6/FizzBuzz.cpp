#include <iostream>
using namespace std;

/*
Q.1. Given an integer N, print numbers from 1 to N.
But:
- If a number is divisible by 3, print Fizz
- If divisible by 5, print Buzz
- If divisible by both 3 and 5, print FizzBuzz
- Otherwise print the number.

Example:
Input: 15
Output:
1
2
Fizz
4
Buzz
Fizz
7
8
Fizz
Buzz
11
Fizz
13
14
FizzBuzz
*/
int main() {
    int N;
    cout << "Enter N: ";
    cin >> N;

    for (int i = 1; i <= N; i++) {
        if (i % 3 == 0 && i % 5 == 0)
            cout << "FizzBuzz" << endl;
        else if (i % 3 == 0)
            cout << "Fizz" << endl;
        else if (i % 5 == 0)
            cout << "Buzz" << endl;
        else
            cout << i << endl;
    }

    return 0;
}
