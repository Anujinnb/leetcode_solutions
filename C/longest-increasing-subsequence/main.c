#include <stdio.h>
#include "solution.h"

int main()
{
    int nums[] = {10, 9, 2, 5, 3, 7, 101, 18};
    int numsSize = sizeof(nums) / sizeof(nums[0]);

    int result = lengthOfLIS(nums, numsSize);
    printf("Length of Longest Increasing Subsequence: %d\n", result);

    return 0;
}
