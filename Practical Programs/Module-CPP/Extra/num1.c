#include<stdio.h>
int main(){
    int num=1234, sum=0, rem;

    while(num !=0){
        rem= num % 10; //4
        num = num/10;
        sum = sum * 10 + rem ;
    }
    printf("%d", sum);
}