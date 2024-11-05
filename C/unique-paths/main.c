#include <stdio.h>
#include "solution.h"

int main()
{
    int m = 3, n = 7; // Example grid size
    int result = uniquePaths(m, n);
    printf("Number of unique paths for a %dx%d grid: %d\n", m, n, result);
    return 0;
}
