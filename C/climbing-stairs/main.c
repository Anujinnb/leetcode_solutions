#include <stdio.h>
#include "solution.h"

int main()
{
    int n;
    printf("Enter the number of stairs: ");
    scanf("%d", &n);

    int ways = climbStairs(n);
    printf("Number of ways to climb %d stairs: %d\n", n, ways);

    return 0;
}