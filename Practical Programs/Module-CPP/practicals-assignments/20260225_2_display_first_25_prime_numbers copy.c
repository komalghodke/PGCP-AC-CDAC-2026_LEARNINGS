#include <stdio.h>

int main()
{
    int count = 0;
    int num = 2;  
    int i, isPrime;

    printf("First 25 Prime Numbers: ");

    while (count < 25)
    {
        isPrime = 1; // Assume number is prime

        // Check divisibility from 2 to num/2
        for (i = 2; i <= num / 2; i++)
        {
            if (num % i == 0)
            {
                isPrime = 0; // Not prime
                break;
            }
        }

        // If prime, print and increase count
        if (isPrime == 1)
        {
            printf("%d ", num);
            count++;
        }

        num++;
    }

    return 0;
}