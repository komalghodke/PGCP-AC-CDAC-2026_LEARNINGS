#include<stdio.h>
int main()
{
	int num,rem,sum=0,orgnum;
	printf("Enter No.");
	scanf("%d",&num);
	
	orgnum=num;
	while(num!=0)
	{
		rem=num%10;
		num=num/10;
		sum=sum+rem*rem*rem;
	}
	  if(sum==orgnum)
	  {
		  printf("It is Armstrong");
	  }
	  else
		  printf("It is not Armstrong");
}