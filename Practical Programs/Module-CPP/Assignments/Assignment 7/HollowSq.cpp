#include <iostream>
using namespace std;

/*
Q.4. WAP to print Hollow Square Pattern. 
Take integer value n from user. If n = 4, then output:
* * * *
*     *
*     *
* * * *
*/
class HollowSquare {
    int n;
public:
    void input() {
        cout << "Enter n: ";
        cin >> n;
    }
    void print() {
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= n; j++) {
                if (i == 1 || i == n || j == 1 || j == n)
                    cout << "* ";
                else
                    cout << "  ";
            }
            cout << endl;
        }
    }
};

int main() {
    HollowSquare h;
    h.input();
    h.print();
}