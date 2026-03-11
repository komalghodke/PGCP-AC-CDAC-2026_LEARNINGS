#include <iostream>
using namespace std;
class Book
{
    int bookid, price;
    string title, author;

public:
    void input()
    {
        cout << "Enter bookid, price, title, author: ";
        cin >> bookid >> price >> title >> author;
    }
    void display()
    {
        cout << "BookId: " << bookid << " | price: " << price
             << " | title: " << title << " | author: " << author;
    }
};
;
int main()
{
    Book b, b1, b2, b3;
    b.input();
    b1.input();
    b2.input();
    b3.input();
    cout<<endl;
    b.display();
    cout<<endl;
    b1.display();
    cout<<endl;
    b2.display();
    cout<<endl;
    b3.display();
}