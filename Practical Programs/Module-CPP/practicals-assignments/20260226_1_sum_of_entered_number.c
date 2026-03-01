#include <stdio.h>

int main()
{
    int n, i, lastDigit, sum = 0;

    printf("Enter number: ");
    scanf("%d", &n);

    for(i = n; i >= 0; i++)
    {
        lastDigit = n % 10;
        sum += lastDigit;
        n /= 10;
    }

    printf("Sum is %d.", sum);
    
    return 0;
}