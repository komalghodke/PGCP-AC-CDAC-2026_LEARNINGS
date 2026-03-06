#include<iostream>
using namespace std;
class Account
{
    int accNo, balance;
    public:
    void accept(){
        cout<<"accept value for accNo. & balance \n";
        cin>> accNo >> balance;
    }
    void display(){
        cout <<"account no. is "<<  accNo  <<" \n "<< "balance is "<< balance <<endl;
    }
    void withDraw(int amt){
        if(amt < balance){
            balance = balance-amt;
            cout << "Remaining balance is " <<balance;
        }
        else
        {
            cout << "insufficient balance. Please ask your company to make your salary \n"; 
        }
    }
    int deposit(int amt)
    {
        int acc;
        cout << "enter aacount number \n";
        cin >> acc;
        if(acc == accNo){
            balance = balance + amt;
        }
        else
            cout<< " This is not your acc.";
            
        return balance;
        
    }
};

int main()
{
    Account a1;
    a1.accept();
    a1.display();
    a1.withDraw(200);
    int b1= a1.deposit(5000);
    cout<< "Your balance is now "<< b1 << endl;
    return 0;
}