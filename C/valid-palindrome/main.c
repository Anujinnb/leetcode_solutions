#include <stdio.h>
#include "solution.h"

int main()
{
    char str[] = "A man, a plan, a canal: Panama";

    if (isPalindrome(str))
    {
        printf("The string is a palindrome.\n");
    }
    else
    {
        printf("The string is not a palindrome.\n");
    }

    return 0;
}
