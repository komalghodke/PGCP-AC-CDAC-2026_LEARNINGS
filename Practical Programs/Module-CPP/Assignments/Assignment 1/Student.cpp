#include <iostream>
#include <string>
using namespace std;
/* Assignment 1
Q. Write a student class and use it in your program. Store the data of 10 students and display the data according to their roll numbers, dates of birth, and total marks.

Implement concepts such as : 
-Classes and Objects
-Constructors
-Parameterized constructors
*/

class Student {
    int rollNo;
    string name, dob;
    int marks;

public:
    Student(int r, string n, string d, int m) {
        rollNo = r;
        name = n;
        dob = d;
        marks = m;
    }

    void display() {
        cout << rollNo << "\t" << name << "\t" << dob << "\t" << marks << endl;
    }

    int getRollNo() {
         return rollNo;
    }
    string getDOB() {
        return dob;
    }
    int getMarks() {
        return marks;
    }
};

int main() {
    Student s[3] = {
        Student(101,"Komal","12/05/2004",450),
        Student(102,"KG","23/07/2003",480),
        Student(103,"GK","01/01/2005",420)
    };

    cout << "\nBy Roll Number:\n";
    for(int i=0;i<3;i++) {
        s[i].display();
    }

    cout << "\nBy DOB:\n";
    for(int i=0;i<3;i++) {
        s[i].display();
    }

    cout << "\nBy Marks:\n";
    for(int i=0;i<3;i++) {
        s[i].display();
    }
    return 0;
}