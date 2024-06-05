#include <stdio.h>
#include <stdlib.h>
#include "solution.h"

int main()
{
    int n = 15;
    int returnSize;
    char **result = fizzBuzz(n, &returnSize);

    for (int i = 0; i < returnSize; i++)
    {
        printf("%s\n", result[i]);
        if (i % 3 != 0 && i % 5 != 0)
        {
            free(result[i]);
        }
    }

    free(result);
    return 0;
}