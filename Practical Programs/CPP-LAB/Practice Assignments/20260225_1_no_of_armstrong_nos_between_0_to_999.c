#include <stdio.h>

int main()
{
    int i, count = 0;
    int originalNumber, lastDigit, sum;

    printf("Armstrong numbers between 0 and 999: ");

    for (i = 0; i < 1000; i++)
    {
        originalNumber = i;
        sum = 0;

        while (originalNumber != 0)
        {
            lastDigit = originalNumber % 10;
            sum += (lastDigit * lastDigit * lastDigit);
            originalNumber /= 10;
        }

        if (i == 0)
            sum = 0;

        if (sum == i)
        {
            printf("%d ", i);
            count++;
        }
    }

    printf("\nTotal Armstrong numbers between 0 to 999 are %d.", count);

    return 0;
}