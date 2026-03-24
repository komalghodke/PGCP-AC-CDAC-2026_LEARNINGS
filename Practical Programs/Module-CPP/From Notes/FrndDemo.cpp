#include <iostream>  
using namespace std;  
class FrndDemo
{
  int f;
  public:
    int getf();
    friend void xyz(FrndDemo&);
};
int FrndDemo::getf()
{
  cout<<"enter the value of F: \n";
  cin>>this->f;
  return f;
}
void xyz(FrndDemo& f1obj)
{
  cout<<"friend function is accessing private class data  "<<f1obj.f<<endl;
  
}
int main()
{
  FrndDemo fobj;
  fobj.getf();
  xyz(fobj);
}