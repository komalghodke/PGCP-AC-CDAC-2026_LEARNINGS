#include <iostream>
#include <map>
#include <fstream>
using namespace std;

/*
Q.5. Create a menu driven program for Student Record System. 
Use map to store rollNo and name. Menu options:
1. Add Record
2. Display Records
3. Save to File
4. Exit
*/
class StudentRecord {
    map<int, string> records;
public:
    void addRecord() {
        int roll; string name;
        cout << "Enter roll no and name: ";
        cin >> roll >> name;
        records[roll] = name;
    }
    void displayRecords() {
        for (auto &p : records)
            cout << p.first << " " << p.second << endl;
    }
    void saveToFile() {
        ofstream fout("students.txt");
        for (auto &p : records)
            fout << p.first << " " << p.second << endl;
        fout.close();
        cout << "Saved to file.\n";
    }
    void menu() {
        int choice;
        do {
            cout << "\n1.Add 2.Display 3.Save 4.Exit\nChoice: ";
            cin >> choice;
            if (choice == 1) addRecord();
            else if (choice == 2) displayRecords();
            else if (choice == 3) saveToFile();
        } while (choice != 4);
    }
};

int main() {
    StudentRecord s;
    s.menu();
}