#include <stdio.h>
#include "solution.h"

int main()
{
    int nums[] = {1, 12, -5, -6, 50, 3};
    int k = 4;
    int numsSize = sizeof(nums) / sizeof(nums[0]);

    double result = findMaxAverage(nums, numsSize, k);
    printf("Max Average: %f\n", result);

    return 0;
}
