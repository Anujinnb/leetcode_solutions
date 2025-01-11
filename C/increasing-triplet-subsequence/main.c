#include <stdio.h>
#include "solution.h"

int main(void)
{
    int nums[] = {20, 100, 10, 12, 5, 13};
    int numsSize = sizeof(nums) / sizeof(nums[0]);

    if (increasingTriplet(nums, numsSize))
    {
        printf("True\n");
    }
    else
    {
        printf("False\n");
    }

    return 0;
}
