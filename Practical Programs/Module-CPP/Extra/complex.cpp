#include<iostream>
using namespace std;
class Complex
{
    int real, img;
    public:
    void accept(){
        cout << " \n  accept the value for real and imaginary \n";
        cin >> real  >> img;
        }
    void display(){
        cout << " complex number is "<< real << "+" << img << "i" <<endl;
    }
    void setReal(int r){
        cout << "setter function is called \n";
        real = r;
    }
    void setImg(int i){
        cout << "setter function for imaginary value is called ";
        img = i;
    }
    int getReal(){
        return real;
    }
    int getImg(){
        return img;
    }
};
int main(){
    Complex C1;
    cout<< "size of C1 is "  << sizeof(C1) ;
    C1.accept();
    C1.display();
    C1.setReal(10);
    C1.display();
    C1.setImg(50);
    C1.display();
    int r = C1.getReal();
    cout << "value of real is " << r << endl;
    int i = C1.getImg();
    cout << "value of imaginary is " << i << endl;
}