#include <iostream>
using namespace std;

enum Day {
    MON=1, TUE, WED, THU, FRI, SAT, SUN
};

int main() {
    Day today = FRI;

    if (today == 5) {
        cout << "Weekend is near!";
    }

    return 0;
}
