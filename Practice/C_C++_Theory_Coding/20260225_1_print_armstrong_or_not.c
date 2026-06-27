#include <stdio.h>

int main()
{
    int num, originalNumber, lastDigit, sum = 0;

    printf("Enter number: ");
    scanf("%d", &num);

    originalNumber = num;

    while (num != 0)
    {
        lastDigit = num % 10;
        sum += (lastDigit * lastDigit * lastDigit);
        num = num / 10;
    }

    if (originalNumber == sum)
        printf("Armstrong");
    else
        printf("Not a armstrong");

    return 0;
}