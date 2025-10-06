int *sortedSquares(int *nums, int numsSize, int *returnSize)
{
    int *result = (int *)malloc(numsSize * sizeof(int));
    int left = 0;
    int right = numsSize - 1;
    int i;

    for (i = numsSize - 1; i >= 0; i--)
    {
        if (abs(nums[left]) > abs(nums[right]))
        {
            result[i] = nums[left] * nums[left];
            left++;
        }
        else
        {
            result[i] = nums[right] * nums[right];
            right--;
        }
    }

    *returnSize = numsSize;
    return result;
}