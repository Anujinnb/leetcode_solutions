#include "solution.h"

int main()
{
    char text1[] = "abcde";
    char text2[] = "ace";
    printf("LCS length: %d\n", longestCommonSubsequence(text1, text2));
    return 0;
}
