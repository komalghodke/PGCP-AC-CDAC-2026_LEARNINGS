#include<iostream>
using namespace std;
/* Assignment 3:
  Q. WAP to find the sum of all elements of an array.
*/
int main() {
    int n;
    cout<<"Enter Size of an Array:"<<endl;
    cin>>n;

    int arr[n], sum=0;

    cout<<"Enter Elements of an Array:"<<endl;
    for(int i=0; i<n; i++) {
        cin>>arr[i];
    }

    cout<<"Elements of entered array are:"<<endl;
    for(int i=0; i<n; i++) {
        cout<<arr[i]<<"\t";
        sum += arr[i];
    }
    cout<<"Sum of array: "<<sum;

    return 0;
}