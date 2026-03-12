#include <iostream>
using namespace std;
/*
Q.2. Count how many digits are present in the number. 
Input: 
12345 
Output: 
Number of digits = 5
*/

int main() {
    int num;
    cout << "Enter a number: "; //12345
    cin >> num;

    int count = 0;
    int temp = num;

    if (temp == 0) {
        count = 1;
    } else {
        while (temp != 0) {
            temp = temp / 10;  
            count++;
        }
    }
    cout << "Number of digits = " << count << endl;
    return 0;
}