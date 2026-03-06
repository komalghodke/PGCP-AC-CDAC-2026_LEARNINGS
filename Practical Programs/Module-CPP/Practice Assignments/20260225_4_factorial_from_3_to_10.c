#include <stdio.h>

int main()
{
    int i, j;

    for (i = 3; i < 11; i++)
    {
        int fact = 1;
        for (j = 1; j <= i; j++)
        {
            fact *= j;
        }
        printf("Factorial of %d is %d.\n", i, fact);
    }
    
    return 0;
}