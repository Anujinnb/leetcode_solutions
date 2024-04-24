int pivotIndex(int *nums, int numsSize)
{
    int sum = 0;
    int left_sum = 0;
    int right_sum = 0;
    int left = 0;

    for (int i = 0; i < numsSize; i++)
    {
        sum += nums[i];
    }

    for (int i = 0; i < numsSize; i++)
    {
        if (i == 0)
        {
            left = 0;
        }
        else
        {
            left = nums[i - 1];
        }

        left_sum += left;
        right_sum = sum - nums[i] - left_sum;

        if (left_sum == right_sum)
        {
            return i;
        }
    }

    return -1;
}