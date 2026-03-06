#include<stdio.h>
int main()
{
    int num,rem,sum,orgnum;
    int count=0;
    for(num=1;num<=999;num++)
    {
    orgnum=num;
    sum=0;
   while(orgnum!=0)
	{
		rem=orgnum%10; // 3
		
		sum=sum+rem*rem*rem;// 27

        orgnum=orgnum/10; //15
	}

	  if(sum==num)     
        {
            printf("%d ",num);
            count++;
        }

    }
    printf("\n\nTotal Armstrong numbers = %d", count);
return 0;
}