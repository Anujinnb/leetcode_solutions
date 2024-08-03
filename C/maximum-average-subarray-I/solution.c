#include <stdio.h>
#include <limits.h>

double findMaxAverage(int *nums, int numsSize, int k)
{
    double sum = 0;
    double average = INT_MIN;
    int left = 0;

    for (int right = 0; right < numsSize; right++)
    {
        sum += nums[right];

        if (right - left + 1 == k)
        {
            if (sum > average)
            {
                average = sum;
            }
            sum -= nums[left];
            left++;
        }
    }

    return average / k;
}
