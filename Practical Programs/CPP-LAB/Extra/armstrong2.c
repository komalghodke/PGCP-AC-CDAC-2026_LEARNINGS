#include<stdio.h>

int main()
{
    int num, rem, sum, orgnum;

    for(num = 1; num <= 999; num++)
    {
        orgnum = num;
        sum = 0;

        while(orgnum != 0)
        {
            rem = orgnum % 10;
            sum = sum + rem * rem * rem;
            orgnum = orgnum / 10;
        }

        if(sum == num)
        {
            printf("%d ", num);
        }
    }

    return 0;
}