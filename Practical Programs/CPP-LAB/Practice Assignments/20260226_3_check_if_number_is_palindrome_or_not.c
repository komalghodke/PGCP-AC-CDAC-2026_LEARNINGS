#include <stdio.h>

int main()
{
    int num = 121;
    int originalNum, lastDigit, reverse = 0;

    // Handle base case
    if (num <= 0)
    {
        printf("Palindrome can't be calculated for negative or zero numbers.");
        return 0;
    }

    originalNum = num;

    // Reverse the number
    while (num > 0)
    {
        lastDigit = num % 10;
        reverse = reverse * 10 + lastDigit;
        num /= 10;
    }

    if (originalNum == reverse)
        printf("%d is a palindrome.\n", originalNum);
    else
        printf("%d is not a palindrome.\n", originalNum);

    return 0;
}