#include <iostream>
using namespace std;

/*
Q.2. Find Second Largest Number
Given N numbers, find the second largest number.

Example:
Input:
5
10 4 8 20 15
Output:
15
*/

int main() {
    int N;
    cout << "Enter number of elements: ";
    cin >> N;

    int arr[100];
    cout << "Enter " << N << " numbers: ";
    for (int i = 0; i < N; i++) {
        cin >> arr[i];
    }

    int largest = arr[0], second = -1;
    for (int i = 1; i < N; i++) {
        if (arr[i] > largest) {
            second = largest;
            largest = arr[i];
        } else if (arr[i] > second && arr[i] != largest) {
            second = arr[i];
        }
    }

    cout << "Second Largest = " << second << endl;

    return 0;
}