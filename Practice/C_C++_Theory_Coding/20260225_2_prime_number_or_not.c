#include <stdio.h>

int main()
{
    int num, i = 2;

    printf("Enter number: ");
    scanf("%d", &num);

    while (i < num)
    {
        if (num % i == 0)
            break;
        i++;
    }

    if (i == num)
        printf("Prime");
    else
        printf("Not a prime");
        
    return 0;
}