#include<iostream>
using namespace std;
/* Assignment 3 
Q. Write a program to find the sum of all elements of an array.
 */
int main() {
    int n;
    cout<<"Enter Size of an Array: ";
    cin>>n;

    int arr[n];
    cout<<"Enter Elements of an Array: ";
    for(int i=0; i<n; i++) {
        cin>>arr[i];
    }
    
    int largest =  arr[0];

    cout<<"Entered Elements are: ";
    for(int i=0; i<n; i++) {
        cout<<arr[i]<<"\t";
        if(arr[i]>largest) {
            largest = arr[i];
        }
    }

    cout<<"\nLargest Element from Array is: "<<largest;
    return 0;
}