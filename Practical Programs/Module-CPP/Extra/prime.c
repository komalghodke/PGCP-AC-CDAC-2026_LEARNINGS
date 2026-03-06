#include<stdio.h>
int main()
{
    int num=8, i;
    for(i=2;i<=num;i++){
        if(num%i==0)
          {printf("%d this is prime no", num);}
       else{
        printf("This is not prime number");
       }
    }
    
}