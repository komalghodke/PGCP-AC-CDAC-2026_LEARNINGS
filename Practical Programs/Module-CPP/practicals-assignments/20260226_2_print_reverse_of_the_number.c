#include <stdio.h>

int main()
{
    int n, lastDigit, reverse = 0;

    printf("Enter number: ");
    scanf("%d", &n);

    while (n != 0)
    {
        lastDigit = n % 10;
        reverse = reverse * 10 + lastDigit;
        n /= 10;
    }

    printf("Reversed number: %d.", reverse);

    return 0;
}