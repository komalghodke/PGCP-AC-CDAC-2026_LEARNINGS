#include <iostream>  
using namespace std;  
class B;//forward declaraction
class FrndDemo1
{
  int a;
  public:
    void geta()
    {
      cout<<"enter value of a\n";
      cin>>a;
    }
    friend void big(FrndDemo1&, B&);
};
 class B
{
  int b;
  public:
    void getb()
    {
      cout<<"enter value of b\n";
      cin>>b;
    }
    friend void big(FrndDemo1&, B&);
};

void big(FrndDemo1& x,B& y)
{
  if(x.a>y.b)
  cout<<x.a<<"is greater";
  if(x.a<y.b)
  cout<<y.b<<"is greater";
  else
  cout<<"both are equal";
}
int main()
{
  FrndDemo1 aobj;
  B bobj;
  aobj.geta();
  bobj.getb();
  big(aobj,bobj);  
}