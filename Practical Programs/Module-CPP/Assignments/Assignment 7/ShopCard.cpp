#include <iostream>
#include <vector>
using namespace std;

/*
Q.6. Create a menu driven program for Shopping Cart System. 
Create class Item with data members itemId, itemName, price. 
Use vector to store items. Menu options:
1. Add Item
2. Display Items
3. Calculate Total Bill
4. Exit
Throw exception if price is invalid or negative.
*/
class Item {
public:
    int itemId;
    string itemName;
    double price;
};

class ShoppingCart {
    vector<Item> cart;
public:
    void addItem() {
        Item it;
        cout << "Enter id, name, price: ";
        cin >> it.itemId >> it.itemName >> it.price;
        if (it.price < 0) throw invalid_argument("Invalid price!");
        cart.push_back(it);
    }
    void displayItems() {
        for (auto &it : cart)
            cout << it.itemId << " " << it.itemName << " " << it.price << endl;
    }
    void totalBill() {
        double sum = 0;
        for (auto &it : cart) sum += it.price;
        cout << "Total Bill = " << sum << endl;
    }
    void menu() {
        int choice;
        do {
            cout << "\n1.Add 2.Display 3.Total 4.Exit\nChoice: ";
            cin >> choice;
            try {
                if (choice == 1) addItem();
                else if (choice == 2) displayItems();
                else if (choice == 3) totalBill();
            } catch (exception &e) {
                cout << e.what() << endl;
            }
        } while (choice != 4);
    }
};

int main() {
    ShoppingCart s;
    s.menu();
}
