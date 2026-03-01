#include <iostream>

using namespace std;

// ------- FUNCTION DECLARATION ------
void show();

int main()
{
    show();
    show();
    show();

    return 0;
}

// ------- FUNCTION DEFINITION ------
void show()
{
    // ------- Using STATIC to Declare ------
    static int x = 0;
    cout << x << endl;
    x++;
}