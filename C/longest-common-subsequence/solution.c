#include <stdio.h>
#include <string.h>
#include <stdlib.h>

#define MAX(a, b) (((a) > (b)) ? (a) : (b))

int longestCommonSubsequence(char *text1, char *text2)
{
    int m = strlen(text1);
    int n = strlen(text2);

    int **dp = (int **)malloc((m + 1) * sizeof(int *));
    for (int i = 0; i <= m; i++)
    {
        dp[i] = (int *)calloc(n + 1, sizeof(int));
    }

    for (int i = m - 1; i >= 0; i--)
    {
        for (int j = n - 1; j >= 0; j--)
        {
            if (text1[i] == text2[j])
            {
                dp[i][j] = 1 + dp[i + 1][j + 1];
            }
            else
            {
                dp[i][j] = MAX(dp[i + 1][j], dp[i][j + 1]);
            }
        }
    }

    int result = dp[0][0];

    for (int i = 0; i <= m; i++)
    {
        free(dp[i]);
    }
    free(dp);

    return result;
}