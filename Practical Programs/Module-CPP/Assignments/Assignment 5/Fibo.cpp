#include<iostream>
using namespace std;
int main() {
    {
    int N;
    cout << "Enter how many Fibonacci numbers: ";
    cin >> N;

    int a = 0, b = 1;   // first two Fibonacci numbers

    // print first N numbers
    for (int i = 1; i <= N; i++) {
        cout << a << " ";      // print current number
        int next = a + b;      // calculate next number
        a = b;                 // shift forward
        b = next;
    }

    return 0
}