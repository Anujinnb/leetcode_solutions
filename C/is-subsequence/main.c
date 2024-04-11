#include <stdio.h>
#include "solution.h"

// Test function
void test_isSubsequence()
{
    char s1[] = "abc";
    char t1[] = "ahbgdc";
    char s2[] = "axc";
    char t2[] = "ahbgdc";
    char s3[] = "abc";
    char t3[] = "ahbgd";
    char s4[] = "";
    char t4[] = "abc";

    // Test case 1: s1 is a subsequence of t1
    if (isSubsequence(s1, t1))
    {
        printf("Test case 1 Passed!\n");
    }
    else
    {
        printf("Test case 1 Failed!\n");
    }

    // Test case 2: s2 is not a subsequence of t2
    if (!isSubsequence(s2, t2))
    {
        printf("Test case 2 Passed!\n");
    }
    else
    {
        printf("Test case 2 Failed!\n");
    }

    // Test case 3: s3 is not a subsequence of t3
    if (!isSubsequence(s3, t3))
    {
        printf("Test case 3 Passed!\n");
    }
    else
    {
        printf("Test case 3 Failed!\n");
    }

    // Test case 4: Empty string s4 is a subsequence of any string
    if (isSubsequence(s4, t4))
    {
        printf("Test case 4 Passed!\n");
    }
    else
    {
        printf("Test case 4 Failed!\n");
    }
}

int main()
{
    test_isSubsequence();
    return 0;
}
