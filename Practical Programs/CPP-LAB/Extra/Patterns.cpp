#include <iostream>
using namespace std;
/* Assignment 2
    Q. WAP to print Floyd’s Triangle.
*/      

int main() {
    int rows, num = 1;
    cout << "Enter number of rows: ";
    cin >> rows;
    for(int i =1; i<=rows; i++) {
        for(int j=1; j<=rows; j++){
            cout<<j<<" ";
            num++;
        }
        cout<<endl;
    }

    for(int i =1; i<=rows; i++) {
        for(int j=1; j<i; j++){
            cout<<j<<" ";
            num++;
        }
        cout<<endl;
    }

    cout<<endl;

    for(int i =1; i<=rows; i++) {
        for(int j=1; j<=i; j++){
            cout<<j<<" ";
            num++;
        }
        cout<<endl;
    }

    cout<<endl;

    for(int i =1; i<=rows; i++) {
        for(int j=1; j<=i; j++){
            cout<<i<<" ";
            num++;
        }
        cout<<endl;
    }

    cout<<endl;

    for(int i =1; i<=rows; i++) {
        for(int j=1; j<=i; j++){
            cout<<i<<" ";
            num++;
        }
        cout<<endl;
    }


    return 0;
}