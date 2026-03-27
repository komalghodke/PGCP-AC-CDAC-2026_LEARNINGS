#include <iostream>
#include <string>
using namespace std;

/*
1) Given a string str with repeated characters, the task is to rearrange the characters in a string  
Such a that no two adjacent characters are same. If it is possible than print YES else print NO. 
Input: str=”GGGG” 
Output: NO 
Input : str=”BBBAA” 
Output: YES
*/

int main() {
    string str;
    cout << "Enter string: ";
    cin >> str;

    int n = str.length();
    int maxFreq = 0;

    for (int i = 0; i < n; i++) {
        int count = 0;
        for (int j = 0; j < n; j++) {
            if (str[i] == str[j]) {
                count++;
            }
        }
        if (count > maxFreq) {
            maxFreq = count;
        }
    }

    if (maxFreq > (n + 1) / 2) {
        cout << "NO";
    } else {
        cout << "YES";
    }

    return 0;
}