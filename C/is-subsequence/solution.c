#include <string.h>
#include "solution.h"

bool isSubsequence(char *s, char *t)
{
    int i = 0;
    int j = 0;

    while (i < strlen(s) && j < strlen(t))
    {
        if (t[j] == s[i])
        {
            i++;
            j++;
        }
        else
        {
            j++;
        }
    }

    if (i == strlen(s))
    {
        return true;
    }

    return false;
}