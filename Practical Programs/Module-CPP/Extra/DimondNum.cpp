#include<iostream>
using namespace std;
int main(){
    int n;
    cout<<"Enter a number: ";
    cin>>n;

    for(int i=1; i<=n; i++) {
        for(int s= n-i; s>0; s--) {
            cout<<" ";
        }
        for(int j=1; j<=i; j++) {
            cout<<j;
        }
        for(int j=i-1; j>0; j--) {
            cout<<j;
        }
        cout<<endl;
    }
    for(int i = n-1; i>=1; i--) {
        for(int s=n-i; s>0; s--) {
            cout<<" ";
        }
        for(int j=1; j<=i; j++) {
            cout<<j;
        }
        for(int j=i-1; j>0; j--) {
            cout<<j;
        }
        cout<<endl;
    }
    return 0;
}