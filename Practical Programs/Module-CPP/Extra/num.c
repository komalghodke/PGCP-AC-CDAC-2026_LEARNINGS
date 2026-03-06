#include<stdio.h>
int main()
{
    int num=1234, rem, sum=0;
    while(num != 0){
        rem = num%10; //4
        
        sum = sum + rem; //4
        num = num/10; //123
    }
    printf("%d", sum);
}