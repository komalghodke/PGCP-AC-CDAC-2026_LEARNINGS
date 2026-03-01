#include <stdio.h>

int main()
{
    // ------- Easy way -------
    // int m1, m2, m3, m4, m5;
    // int sum;
    // float average;

    // printf("Enter marks of 5 subjects: ");
    // scanf("%d %d %d %d %d", &m1, &m2, &m3, &m4, &m5);

    // sum = m1 + m2 + m3 + m4 + m5;

    // average = (float)sum / 5;

    // printf("Average of marks of 5 subjects is %f", average);

    // ------- Using arrays -------
    int marks[5];
    int i, sum = 0;
    float average;

    printf("Enter marks of 5 subjects: ");

    for (i = 0; i < 5; i++)
    {
        scanf("%d", &marks[i]);
        sum += marks[i];
    }
    average = (float)sum / 5;

    printf("Average of marks of 5 subjects is %f\n", average);
    printf("Average of marks of 5 subjects is %.2f", average);

    return 0;
}