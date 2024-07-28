#include <stdio.h>
#include <ctype.h>
#include <stdbool.h>
#include <string.h>

void processString(const char *s, char *processed, size_t size)
{
    int i, j = 0;
    int len = strlen(s);

    for (i = 0; i < len && j < size - 1; i++)
    {
        if (isalnum((unsigned char)s[i]))
        {
            processed[j++] = tolower((unsigned char)s[i]);
        }
    }
    processed[j] = '\0';
}

bool isPalindrome(const char *s)
{
    if (!s)
    {
        return true;
    }

    size_t len = strlen(s);

    char processed[len + 1];
    processString(s, processed, len + 1);

    int left = 0;
    int right = strlen(processed) - 1;

    while (left < right)
    {
        if (processed[left] != processed[right])
        {
            return false;
        }
        left++;
        right--;
    }

    return true;
}
