#define MAX(a, b) ((a) > (b) ? (a) : (b))

int lengthOfLIS(int *nums, int numsSize)
{
    int dp[numsSize];
    int maxLength = 1;

    for (int i = 0; i < numsSize; i++)
    {
        dp[i] = 1;
    }

    for (int i = 0; i < numsSize; i++)
    {
        for (int j = 0; j < i; j++)
        {
            if (nums[i] > nums[j])
            {
                dp[i] = MAX(dp[i], dp[j] + 1);
            }
        }

        maxLength = MAX(maxLength, dp[i]);
    }

    return maxLength;
}