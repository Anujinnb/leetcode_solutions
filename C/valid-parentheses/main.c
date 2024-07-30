#include <stdio.h>
#include "solution.h"

int main()
{
    char s[] = "{[()]}";
    if (isValid(s))
    {
        printf("Valid\n");
    }
    else
    {
        printf("Invalid\n");
    }
    return 0;
}
