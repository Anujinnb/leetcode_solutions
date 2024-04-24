#include <stdio.h>

// Function declaration
int pivotIndex(int *nums, int numsSize);

int main()
{
    int nums[] = {1, 7, 3, 6, 5, 6};
    int numsSize = sizeof(nums) / sizeof(nums[0]);
    int result = pivotIndex(nums, numsSize);

    if (result != -1)
    {
        printf("Pivot index: %d\n", result);
    }
    else
    {
        printf("No pivot index found.\n");
    }

    return 0;
}