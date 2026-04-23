#include<iostream>
using namespace std;
/* Assignment 3
    Q. Write a program to reverse the array elements.
 */
int main() {
    int n;
    cout<<"Enter Size of an Array: ";
    cin>>n;

    int arr[n];
    int even = 0, odd = 0;
    cout<<"Enter Elements of an Array: ";
    for(int i=0; i<n; i++) {
        cin>>arr[i];
    }

    cout<<"Before Reverse :"<<endl;
    for(int i=0; i<n; i++) {
        cout<<arr[i]<<"\t";
    }

    cout<<"\nAfter Reverse :"<<endl;
    for(int i=n-1; i>=0; i--) {
        cout<<arr[i]<<"\t";
    }

    return 0;
}