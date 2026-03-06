#include<iostream>
using namespace std;
/* Assignment 3
    Q. Write a C++ program to count even and odd numbers in an array.
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
        if(arr[i]%2==0) {
            even++;
        }
        else {
            odd++;
        }
    }
    cout<<"\nCount of Even Numbers is: "<<even<<"\nCount of Odd Numbers is:"<<odd;
    return 0;
}