#include <stdio.h>

int main()
{
    int i, j;

    for (i = 1; i <= 5; i++)
    {
        for (j = 1; j <= i; j++)
        {
            if (j % 2 == 1)
                printf("1 ");
            else
                printf("0 ");
        }
        printf("\n");
    }
    
    return 0;
}