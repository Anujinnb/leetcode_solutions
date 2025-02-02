// main.c
#include <stdio.h>
#include "solution.h"

int main()
{
    int n;
    printf("Enter a number: ");
    scanf("%d", &n);
    printf("Fibonacci(%d) = %d\n", n, fib(n));
    return 0;
}
