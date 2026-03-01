#include <iostream>

using namespace std;

class Complex
{
    int real, imaginary;

public:
    void accept()
    {
        cout << "\nEnter real and imaginary numbers: ";
        cin >> real >> imaginary;
    }

    void display()
    {
        cout << "Complex number is " << real << "+" << imaginary << "i" << endl;
    }

    void setReal(int r)
    {
        cout << "setReal() function has run.\n";
        real = r;
    }

    int getReal()
    {
        cout << "getReal() function has run.\n";
        return real;
    }

    void setImaginary(int i)
    {
        cout << "setImaginary() function has run.\n";
        imaginary = i;
    }

    int getImaginary()
    {
        cout << "getImaginary() function has run.\n";
        return imaginary;
    }
};

int main()
{
    Complex c1;

    cout << "Size of c1 is " << sizeof(c1);
    c1.accept();
    c1.display();

    c1.setReal(18);
    int r = c1.getReal();
    cout << "Real number is " << r << endl;
    c1.display();

    c1.setImaginary(9);
    int i = c1.getImaginary();
    cout << "Imaginary number is " << i << endl;
    c1.display();

    return 0;
}