#include <stdio.h>

int main()
{
    int num, i = 3;
    int n1 = 0, n2 = 1, n3;

    printf("Enter number of terms: ");
    scanf("%d", &num);
    
    printf("Fibonacci series: ");
    printf("%d %d ", n1, n2);

    while (i <= num)
    {
        n3 = n1 + n2;
        printf("%d ", n3);
        n1 = n2;
        n2 = n3;
        i++;
    }

    return 0;
}